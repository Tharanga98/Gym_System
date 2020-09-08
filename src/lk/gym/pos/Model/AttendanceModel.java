/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.Model;

/**
 *
 * @author DILSHAN
 */
public class AttendanceModel {
    
    private String member_id,date,arrival_time;

    public AttendanceModel() {
    }

    public AttendanceModel(String member_id, String date, String arrival_time) {
        this.member_id = member_id;
        this.date = date;
        this.arrival_time = arrival_time;
    }

    @Override
    public String toString() {
        return "AttendanceModel{" + "member_id=" + getMember_id() + ", date=" + getDate() + ", arrival_time=" + getArrival_time() + '}';
    }

    /**
     * @return the member_id
     */
    public String getMember_id() {
        return member_id;
    }

    /**
     * @param member_id the member_id to set
     */
    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the arrival_time
     */
    public String getArrival_time() {
        return arrival_time;
    }

    /**
     * @param arrival_time the arrival_time to set
     */
    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    
    
    
    
}
