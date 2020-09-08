/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.gym.pos.DB.DBConnection;
import lk.gym.pos.Model.PaymentModel;

/**
 *
 * @author DILSHAN
 */
public class PaymentController {

    public static ArrayList<PaymentModel> getTodayPayment() throws SQLException, ClassNotFoundException {
      Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From payment");
        ArrayList<PaymentModel> PaymentList=new ArrayList<>();
        while(rst.next()){
            PaymentModel p=new PaymentModel();
            
            p.setPayment_id(rst.getString(1));
            p.setMember_id(rst.getString(2));
            p.setMember_name(rst.getString(3));
            p.setPackage_id(rst.getString(4));
            p.setPackage_name(rst.getString(5));
            p.setDiscount_prasantage(rst.getDouble(6));
            p.setDiscount_amount(rst.getDouble(7));
            p.setDate(rst.getString(8));
            p.setPayment_method(rst.getString(9));
            p.setAccount_number(rst.getString(10));
            p.setCash(rst.getDouble(11));
            p.setBalance(rst.getDouble(12));
            p.setTotal_amount(rst.getDouble(13));
            PaymentList.add(p);
           
        }
        return PaymentList;
    }

    public String generatePaymentId() throws SQLException, ClassNotFoundException {
         Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT payment_id FROM Payment ORDER BY payment_id DESC LIMIT 1;";
        PreparedStatement pstm=con.prepareStatement(sql);
        ResultSet rst=pstm.executeQuery();
        
        if (rst.next()) {
            String paymentId = rst.getString(1);
            paymentId = paymentId.split("[A-Z]")[1];
            paymentId = (Integer.parseInt( paymentId) + 1) + "";
            return "P00" +  paymentId;
        } else {
            return "P001";
        }
    }

    public boolean savePaymentDetails(PaymentModel p) throws ClassNotFoundException, SQLException {
      
        Connection con=DBConnection.getInstance().getConnection();
        
        String sql="insert into payment values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm=con.prepareStatement(sql);
       pstm.setObject(1,p.getPayment_id());
       pstm.setObject(2,p.getMember_id());
       pstm.setObject(3,p.getMember_name());
       pstm.setObject(4,p.getPackage_id());
       pstm.setObject(5,p.getPackage_name());
       pstm.setObject(6,p.getDiscount_prasantage());
       pstm.setObject(7,p.getDiscount_amount());
       pstm.setObject(8,p.getDate());
       pstm.setObject(9,p.getPayment_method());
       pstm.setObject(10,p.getAccount_number());
       pstm.setObject(11,p.getCash());
       pstm.setObject(12,p.getBalance());
       pstm.setObject(13,p.getTotal_amount());
       
       return pstm.executeUpdate()>0;
    }

    public List<PaymentModel> searchAllPayment(String text) throws SQLException,  ClassNotFoundException  {
        
            Connection con = DBConnection.getInstance().getConnection();
            String sql ="SELECT * FROM PAYMENT WHERE payment_id LIKE ? || member_id LIKE ? || member_name LIKE ? || package_id LIKE ? || package_name LIKE ? || discount_prasantage LIKE ? || discount_amount LIKE ? || date LIKE ? || payment_method LIKE ? || account_number LIKE ? || cash LIKE ? || balance LIKE ? || total_amount LIKE ? ";
            PreparedStatement pstm = con.prepareStatement(sql);
            String temp="%"+text+"%";
            
            pstm.setObject(1, temp);
            pstm.setObject(2, temp);
            pstm.setObject(3, temp);
            pstm.setObject(4, temp);
            pstm.setObject(5, temp);
            pstm.setObject(6, temp);
            pstm.setObject(7, temp);
            pstm.setObject(8, temp);
            pstm.setObject(9, temp);
            pstm.setObject(10, temp);
            pstm.setObject(11, temp);
            pstm.setObject(12, temp);
            pstm.setObject(13, temp);
            
            ResultSet set = pstm.executeQuery();
            
            List<PaymentModel> list= new ArrayList<>();
            
            while (set.next()) {
                
                list.add(new PaymentModel(
                        set.getString(1),
                        set.getString(2),
                        set.getString(3),
                        set.getString(4),
                        set.getString(5),
                        set.getDouble(6),
                        set.getDouble(7),
                        set.getString(8),
                        set.getString(9),
                        
                        set.getString(10),
                        set.getDouble(11),
                        set.getDouble(12),
                        set.getDouble(13)
                        
                        
                        
                ));
            }
            return list;
        }
    }

    

   
    

