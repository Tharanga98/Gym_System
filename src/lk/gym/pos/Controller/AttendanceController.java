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
import lk.gym.pos.DB.DBConnection;
import lk.gym.pos.Model.AttendanceModel;

/**
 *
 * @author DILSHAN
 */
public class AttendanceController {

    public static ArrayList<AttendanceModel> getAttendance() throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From attendance");
        ArrayList<AttendanceModel> AttendanceList=new ArrayList<>();
        while(rst.next()){
            AttendanceModel a=new AttendanceModel();
            
            a.setMember_id(rst.getString(1));
            a.setDate(rst.getString(2));
            a.setArrival_time(rst.getString(3));
            
            AttendanceList.add(a);
        }
        return AttendanceList;
    }

    public boolean markAttandance(AttendanceModel a) throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        String sql="INSERT INTO attendance VALUES(?,?,?);";
        PreparedStatement pstm=con.prepareStatement(sql);
        
        
        pstm.setObject(1, a.getMember_id());                
        pstm.setObject(2,a.getDate());
        pstm.setObject(3, a.getArrival_time());
        
        return pstm.executeUpdate()>0;
        
    }
    
    
    
    
}
