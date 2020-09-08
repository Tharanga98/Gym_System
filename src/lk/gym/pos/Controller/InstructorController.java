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
import lk.gym.pos.Model.InstructorModel;

/**
 *
 * @author DILSHAN
 */
public class InstructorController {

    public static ArrayList<InstructorModel> getAllInstructor() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Instructor");
        ArrayList<InstructorModel> instructorList=new ArrayList<>();
        while(rst.next()){
            InstructorModel instructor=new InstructorModel();
            
            instructor.setId(rst.getString(1));
            instructor.setName(rst.getString(2));
            instructor.setAddress(rst.getString(3));
            instructor.setContact(rst.getInt(4));
            instructor.setEmail(rst.getString(5));
            instructor.setGender(rst.getString(6));
            instructor.setDob(rst.getString(7));
            instructor.setAge(rst.getInt(8));
            instructor.setDoj(rst.getString(9));
            instructor.setSalary(rst.getString(10));
            instructor.setImageName(rst.getString(11));
            instructor.setImagePath(rst.getString(12));
            instructorList.add(instructor);
            //customerList.add(new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary")));
        }
        return instructorList;
    
    }
    
     public String generateId() throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT instructor_id FROM Instructor ORDER BY instructor_id DESC LIMIT 1;";
        PreparedStatement pstm=con.prepareStatement(sql);
        ResultSet rst=pstm.executeQuery();
        
        if (rst.next()) {
            String instructorId = rst.getString(1);
            instructorId = instructorId.split("[A-Z]")[1];
            instructorId = (Integer.parseInt(instructorId) + 1) + "";
            return "G" + instructorId;
        } else {
            return "G1";
        }
    }

    public boolean saveInstructor(InstructorModel x) throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("INSERT INTO instructor VALUES(?,?,?,?,?,?,?,?,?,?,?,?);");
        pstm.setObject(1, x.getId());
        pstm.setObject(2,x.getName());
        pstm.setObject(3,x.getAddress());
        pstm.setObject(4,x.getContact());
        pstm.setObject(5,x.getEmail());
        pstm.setObject(6,x.getGender());
        pstm.setObject(7,x.getDob());
        pstm.setObject(8,x.getAge());
        pstm.setObject(9,x.getDoj());
        pstm.setObject(10,x.getSalary());
        pstm.setObject(11,x.getImageName());
        pstm.setObject(12,x.getImagePath());
        
        return pstm.executeUpdate()>0;
    }

   
    public InstructorModel searchInstructor(String InstructorId) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("SELECT * FROM instructor WHERE instructor_id=?;");
        pstm.setObject(1, InstructorId);
        ResultSet rst=pstm.executeQuery();
        
        if(rst.next()){
            //return  new InstructorModel(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getInt(7),rst.getString(8),rst.getInt(9),rst.getString(10),rst.getString(11),rst.getString(12));
             //return new InstructorModel(rst.getString(2));
            InstructorModel Ins=new InstructorModel();
            Ins.setName(rst.getString(2));
            return Ins;
        }else{
            return null;
        }
    
        
    }

    public boolean deleteInstructor(String id) throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("DELETE FROM instructor WHERE instructor_id=?;");
        pstm.setString(1, id);
        return pstm.executeUpdate()>0;
    }

    public boolean updateInstructor(InstructorModel x) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection.getInstance().getConnection();
        String sql="Update Instructor set instructor_name=?,address=?,contact_no=?,e_mail=?,gender=?,date_of_birth=?,age=?,date_of_join=?,salary=?,imageName=?,imagePath=? where instructor_id=?;";
        
        PreparedStatement pstm=con.prepareStatement(sql);
        
        
        pstm.setObject(12, x.getId());
        pstm.setObject(1,x.getName());
        pstm.setObject(2,x.getAddress());
        pstm.setObject(3,x.getContact());
        pstm.setObject(4,x.getEmail());
        pstm.setObject(5,x.getGender());
        pstm.setObject(6,x.getDob());
        pstm.setObject(7,x.getAge());
        pstm.setObject(8,x.getDoj());
        pstm.setObject(9,x.getSalary());
        pstm.setObject(10,x.getImageName());
        pstm.setObject(11,x.getImagePath());
        
        return pstm.executeUpdate()>0;
    }

    public List<InstructorModel> searchAllInstructor(String text) throws ClassNotFoundException, SQLException {
       Connection con = DBConnection.getInstance().getConnection(); 
       String sql = "SELECT * FROM INSTRUCTOR WHERE instructor_id LIKE ? || instructor_name LIKE ? || address LIKE ? || contact_no LIKE ? || e_mail LIKE ? || gender LIKE ? || date_of_birth LIKE ? || age LIKE ? || date_of_join LIKE ? || salary LIKE ? || imageName LIKE ? || imagePath LIKE ?"; 
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
        
         ResultSet set = pstm.executeQuery();
        
        List<InstructorModel> list= new ArrayList<>();
        
        while (set.next()) {    
           
            list.add(new InstructorModel(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(7),
                    set.getString(5),
                    set.getString(6),
                    set.getInt(4),
                    set.getString(9),
                    set.getInt(8),
                    set.getString(10),
                    set.getString(11),
                    set.getString(12)
                    //    public InstructorModel(String id, String name, String doj, String dob, String gender, String email, int contact, 
                    //String address, int age, String salary,String imageName,String imagePath ) {
                    

            ));
        }
        return list;
        
    }
}

