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
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.gym.pos.DB.DBConnection;
import lk.gym.pos.Model.ScheduleDetailsModel;
import lk.gym.pos.Model.ScheduleModel;

/**
 *
 * @author DILSHAN
 */
public class ScheduleController {

   
  

   

   private static void addSDetail(ScheduleDetailsModel SD) throws ClassNotFoundException, SQLException {
     PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into schedule_details Values(?,?,?,?)");
        stm.setObject(1, SD.getSchedule_id());
        stm.setObject(2, SD.getNo());
        stm.setObject(3, SD.getExercise());
        stm.setObject(4, SD.getFerquency());
        stm.executeUpdate();
        
   
    }

    public static ArrayList<ScheduleModel> getAllSchedule() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Schedule");
        ArrayList<ScheduleModel> ScheduleList=new ArrayList<>();
        while(rst.next()){
            ScheduleModel schedule=new ScheduleModel();
            
            schedule.setSchedule_id(rst.getString(1));
            schedule.setInstructor_id(rst.getString(2));
            schedule.setInstructor_name(rst.getString(3));
            schedule.setMember_id(rst.getString(4));
            schedule.setMember_name(rst.getString(5));
            schedule.setDate(rst.getString(6));
             ScheduleList.add(schedule);
        }
        return ScheduleList;
    }

   

    public static ArrayList<ScheduleDetailsModel> getScheduleDetails(String id) throws ClassNotFoundException, SQLException {
     
      Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=connection.prepareStatement("Select * From Schedule_details where schedule_id=?");
        pstm.setObject(1,id);
        ResultSet rst = pstm.executeQuery();
        
        ArrayList<ScheduleDetailsModel> ScheduleDetailsList=new ArrayList<>();
        while(rst.next()){
            ScheduleDetailsModel sd=new ScheduleDetailsModel();
            
            sd.setNo(rst.getString(2));
            sd.setExercise(rst.getString(3));
            sd.setFerquency(rst.getString(4));
            
            ScheduleDetailsList.add(sd);
        }
        return ScheduleDetailsList;
        
    }
    

   

    public String generateId() throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        
        String sql="SELECT schedule_id FROM schedule ORDER BY schedule_id DESC LIMIT 1;";
        PreparedStatement pstm=con.prepareStatement(sql);
        ResultSet rst=pstm.executeQuery();
        
        if (rst.next()) {
            String ScheduleId = rst.getString(1);
            ScheduleId = ScheduleId.split("[A-Z]")[1];
            ScheduleId = (Integer.parseInt( ScheduleId) + 1) + "";
            return "S0" +  ScheduleId;
            
        }
        else {
            return "S01";
        }
    }

   public  static boolean addSchedule(ScheduleModel s) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
       String sql="INSERT INTO Schedule VALUES(?,?,?,?,?,?);";
       PreparedStatement pstm=con.prepareStatement(sql);
       
       pstm.setObject(1,s.getSchedule_id());
       pstm.setObject(2, s.getInstructor_id());
       pstm.setObject(3, s.getInstructor_name());
       pstm.setObject(4, s.getMember_id());
       pstm.setObject(5, s.getMember_name());
       pstm.setObject(6, s.getDate());
       
      
       boolean isAdded= pstm.executeUpdate()>0;
       if (isAdded) {
                boolean addAllDetails = ScheduleController.addScheduleDetails(s.getScheduleDetailList());
                return addAllDetails ;
       }
       return false ;
       
   }

    public static  boolean addScheduleDetails(ArrayList<ScheduleDetailsModel> scheduleDetailList) {
        for (ScheduleDetailsModel SD : scheduleDetailList) {
            try {
                ScheduleController.addSDetail(SD);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
        
        return true;
    }

    public List<ScheduleModel> searchAllSchedule(String text) throws ClassNotFoundException, SQLException {
       Connection con = DBConnection.getInstance().getConnection(); 
       String sql = "SELECT * FROM Schedule WHERE schedule_id LIKE ? || instructor_id LIKE ? || instructor_name LIKE ? || member_id LIKE ? || member_name LIKE ? || Date LIKE ?  ";  
       PreparedStatement pstm = con.prepareStatement(sql);
       String temp="%"+text+"%";
       
        pstm.setObject(1, temp);
        pstm.setObject(2, temp);
        pstm.setObject(3, temp);
        pstm.setObject(4, temp);
        pstm.setObject(5, temp);
        pstm.setObject(6, temp);
       
        
         ResultSet set = pstm.executeQuery();
         
        List<ScheduleModel> list= new ArrayList<>();
        
        while (set.next()) {    
           
            list.add(new ScheduleModel(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6)
                    
                    
                    

            ));
        }
        return list;
    }

    public boolean deleteSchedule(String id) throws ClassNotFoundException, SQLException {
       
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("Delete  FROM Schedule WHERE schedule_id=?");
        pstm.setObject(1, id);
        pstm.executeUpdate();
        pstm=con.prepareStatement("Delete  FROM Schedule_details WHERE schedule_id=?");
        pstm.setObject(1, id);
        
        pstm.executeUpdate();
        return true;
    }

 

    

    

   

   

    

}
