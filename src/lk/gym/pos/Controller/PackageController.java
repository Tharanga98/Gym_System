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
import lk.gym.pos.Model.PackageModel;

/**
 *
 * @author DILSHAN
 */
public class PackageController {

    public static ArrayList<PackageModel> getAllPackageDetails() throws ClassNotFoundException, SQLException {
       
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Package");
        ArrayList<PackageModel> PackageList=new ArrayList<>();
        while(rst.next()){
            PackageModel pk=new PackageModel();
            
            pk.setPackage_id(rst.getString(1));
            pk.setPackage_name(rst.getString(2));
            pk.setDate(rst.getString(3));
            pk.setDuration(rst.getString(4));
            pk.setDiscription(rst.getString(5));
            pk.setAmount(rst.getDouble(6));
            
            
            PackageList.add(pk);
            
        }
        return PackageList;
    }
    /// parana ewa
    public ArrayList<PackageModel> allPackageName() throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT * FROM PACKAGE;";
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
            ArrayList<PackageModel> allPackages=new ArrayList<>();
            
        while(rst.next()){
            PackageModel packages=new PackageModel();
            packages.setPackage_id(rst.getString(1));
            packages.setPackage_name(rst.getString(2));
            packages.setDuration(rst.getString(4));
            packages.setAmount(rst.getDouble(6));
            //packages.setDiscount(rst.getDouble(5));
            //packages.setDiscount_Ammount(rst.getDouble(6));
            //packages.setNew_ammount(rst.getDouble(7));
                
            allPackages.add(packages);
            
        }
        
        return allPackages;
        
        
    }

    public PackageModel searchPackageName(String text) throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM PACKAGE WHERE package_Name=?;";
        
        PreparedStatement pstm=con.prepareStatement(sql);
        pstm.setString(1,text);
        ResultSet rst=pstm.executeQuery();
        
        if(rst.next()){
            PackageModel packages=new PackageModel();
            packages.setPackage_id(rst.getString(1));
            packages.setPackage_name(rst.getString(2));
            packages.setDuration(rst.getString(4));
            packages.setAmount(rst.getDouble(6));
            
        return packages;    
        }else{
            return null;
        }
        
        
    }

    public String genarateId() throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT package_id FROM package ORDER BY package_id DESC LIMIT 1;";
        PreparedStatement pstm=con.prepareStatement(sql);
        ResultSet rst=pstm.executeQuery();
        
        if (rst.next()) {
            String packageId = rst.getString(1);
            packageId =packageId.split("[A-Z]")[1];
             packageId = (Integer.parseInt( packageId) + 1) + "";
            return "A00" + packageId;
            
        }
        else {
            return "A001";
        } 
    }
    
    
    //aluth yika
    public boolean savePackageDetails(PackageModel M) throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("INSERT INTO Package VALUES(?,?,?,?,?,?);");
        pstm.setObject(1, M.getPackage_id());
        pstm.setObject(2,M.getPackage_name());
        pstm.setObject(3,M.getDate());
        pstm.setObject(4,M.getDuration());
        pstm.setObject(5,M.getDiscription());
        pstm.setObject(6,M.getAmount());
        
        
        return pstm.executeUpdate()>0;
    }

    public boolean updatePackageDetails(PackageModel M) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        String sql="Update Package set package_name=?,Date=?,duration=?,discription=?,amount=? where package_id=?;";
        
        PreparedStatement pstm=con.prepareStatement(sql);
        
        pstm.setObject(1,M.getPackage_name());
        pstm.setObject(2,M.getDate());
        pstm.setObject(3,M.getDuration());
        pstm.setObject(4,M.getDiscription());
        pstm.setObject(5,M.getAmount());
        pstm.setObject(6,M.getPackage_id());
        
        return pstm.executeUpdate()>0;
    }

    public boolean deletePackage(String id) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("DELETE FROM package WHERE package_id=?;");
        pstm.setString(1, id);
        return pstm.executeUpdate()>0;
    }

    public List<PackageModel> searchAllPackage(String text) throws ClassNotFoundException, SQLException {
         Connection con = DBConnection.getInstance().getConnection(); 
       String sql = "SELECT * FROM package WHERE  package_id LIKE ? || package_name LIKE ? || Date LIKE ? || duration LIKE ? || discription LIKE ? || amount LIKE ? "; 
       PreparedStatement pstm = con.prepareStatement(sql);
       String temp="%"+text+"%";
       
        pstm.setObject(1, temp);
        pstm.setObject(2, temp);
        pstm.setObject(3, temp);
        pstm.setObject(4, temp);
        pstm.setObject(5, temp);
        pstm.setObject(6, temp);
        
        
         ResultSet set = pstm.executeQuery();
        
        List<PackageModel> list= new ArrayList<>();
        
        while (set.next()) {    
           
            list.add(new PackageModel(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getDouble(6)
                    
                    

            ));
        }
        return list;
    }

    

   

    
    
}
