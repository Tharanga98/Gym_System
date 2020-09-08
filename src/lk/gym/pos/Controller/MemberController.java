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
import lk.gym.pos.Model.MemberModel;


/**
 *
 * @author DILSHAN
 */
public class MemberController {

    public static ArrayList<MemberModel> getAllMember() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Member");
        ArrayList<MemberModel> MemberList=new ArrayList<>();
        while(rst.next()){
            MemberModel Member=new MemberModel();
            
            Member.setmId(rst.getString(1));
            Member.setName(rst.getString(2));
            Member.setAddress(rst.getString(3));
            Member.setContact(rst.getString(4));
            Member.setEmail(rst.getString(5));
            Member.setGender(rst.getString(6));
            Member.setDob(rst.getString(8));
            Member.setAge(rst.getString(9));
            Member.setDoj(rst.getString(7));
            Member.setHeight(rst.getDouble(10));
            Member.setWeight(rst.getDouble(11));
            Member.setImageName(rst.getString(12));
            Member.setImagePath(rst.getString(13));
            MemberList.add(Member);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return MemberList;
    }

    public String generateId() throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT member_id FROM member ORDER BY member_id DESC LIMIT 1;";
        PreparedStatement pstm=con.prepareStatement(sql);
        ResultSet rst=pstm.executeQuery();
        
        if (rst.next()) {
            String memberId = rst.getString(1);
            memberId = memberId.split("[A-Z]")[1];
             memberId = (Integer.parseInt( memberId) + 1) + "";
            return "M0" +  memberId;
            
        }
        else {
            return "M01";
        }
    }

    public static boolean saveMemberDetails(MemberModel m) throws SQLException, ClassNotFoundException {
       
        Connection con=DBConnection.getInstance().getConnection();
        String sql="INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm=con.prepareStatement(sql);
        
        
        pstm.setObject(1, m.getmId());                
        pstm.setObject(2,m.getName());
        pstm.setObject(3, m.getAddress());
        pstm.setObject(4, m.getContact());
        pstm.setObject(5, m.getEmail());
        pstm.setObject(6, m.getGender());
        pstm.setObject(7, m.getDoj());
        pstm.setObject(8, m.getDob());
        pstm.setObject(9, m.getAge());
        pstm.setObject(10,m.getHeight());
        pstm.setObject(11, m.getWeight());
        pstm.setObject(12, m.getImageName());
        pstm.setObject(13, m.getImagePath());
        
        return pstm.executeUpdate()>0;
    }

    public static MemberModel searchMember(String id) throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("SELECT * FROM member WHERE member_id=?;");
        pstm.setObject(1, id);
        ResultSet rst=pstm.executeQuery();
        if(rst.next()){
           return  new MemberModel(rst.getString("member_id"),rst.getString("member_name"),rst.getString("address"),rst.getString("contact_no"),rst.getString("e_mail"),rst.getString("gender"),rst.getString("date_of_join"),rst.getString("date_of_birth"),rst.getString(10),rst.getDouble("height"),rst.getDouble("weight"),rst.getString("imageName"),rst.getString("imagePath"));
                 
            }
        return null;
    }

    public boolean deleteMember(String id) throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("DELETE FROM MEMBER WHERE member_id=?;");
        pstm.setString(1, id);
        return pstm.executeUpdate()>0;
    }

    public boolean updateMemberDetails(MemberModel m) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        String sql="Update Member set    member_name=?,address=?,contact_no=?,e_mail=?,gender=?,date_of_join=?,date_of_birth=?,age=?,height=?,weight=?,imageName=?,imagePath=? where member_id=?;";
        
        PreparedStatement pstm=con.prepareStatement(sql);
        
        
        
        pstm.setObject(1,m.getName());
        pstm.setObject(2, m.getAddress());
        pstm.setObject(3, m.getContact());
        pstm.setObject(4, m.getEmail());
        pstm.setObject(5, m.getGender());
        pstm.setObject(6, m.getDoj());
        pstm.setObject(7, m.getDob());
        pstm.setObject(8, m.getAge());
        pstm.setObject(9,m.getHeight());
        pstm.setObject(10, m.getWeight());
        pstm.setObject(11, m.getImageName());
        pstm.setObject(12, m.getImagePath());
        pstm.setObject(13, m.getmId());
        return pstm.executeUpdate()>0; 
    }

    public ArrayList<MemberModel> allMemberId() throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT * FROM Member";
        Statement stm=con.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
            ArrayList<MemberModel> allMembers=new ArrayList<>();
            while(rst.next()){
            MemberModel  member=new MemberModel();
            member.setmId(rst.getString(1));
            
            
            allMembers.add(member);
            }
            return allMembers;
            
    }

    public MemberModel getMemberName(String memberId) throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM Member WHERE member_id=?;";
        
        PreparedStatement pstm=con.prepareStatement(sql);
        pstm.setString(1,memberId);
        ResultSet rst=pstm.executeQuery();
        
         if(rst.next()){
            MemberModel m=new MemberModel();
            m.setName(rst.getString(2));
            return m;
         }else{
             return null;
         }
    }

    public List<MemberModel> searchAllMember(String text) throws ClassNotFoundException, SQLException {
       Connection con = DBConnection.getInstance().getConnection(); 
       String sql = "SELECT * FROM MEMBER WHERE member_id LIKE ? || member_name LIKE ? || address LIKE ? || contact_no LIKE ? || e_mail LIKE ? || gender LIKE ? || date_of_join LIKE ? || date_of_birth LIKE ? || age LIKE ? || height LIKE ? || weight LIKE ? || imageName LIKE ? || imagePath LIKE ? "; 
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
         
        List<MemberModel> list= new ArrayList<>();
        
        while (set.next()) {    
           
            list.add(new MemberModel(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9),
                    
                    set.getDouble(10),
                    set.getDouble(11),
                    set.getString(12),
                    set.getString(13)
                    
                    

            ));
        }
        return list;
    }

    

    
    
   

   
    
}
