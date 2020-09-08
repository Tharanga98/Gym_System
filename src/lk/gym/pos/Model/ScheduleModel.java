/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.Model;

import java.util.ArrayList;

/**
 *
 * @author DILSHA
 */
public class ScheduleModel {
    
    private String schedule_id, member_id,member_name,instructor_id,instructor_name,Date;
    private ArrayList<ScheduleDetailsModel>ScheduleDetailList;

    public ScheduleModel() {
    }

    public ScheduleModel(String schedule_id, String member_id, String member_name, String instructor_id, String instructor_name, String Date, ArrayList<ScheduleDetailsModel> ScheduleDetailList) {
        this.schedule_id = schedule_id;
        this.member_id = member_id;
        this.member_name = member_name;
        this.instructor_id = instructor_id;
        this.instructor_name = instructor_name;
        this.Date = Date;
        this.ScheduleDetailList = ScheduleDetailList;
    }

    public ScheduleModel(String string, String string0, String string1, String string2, String string3, String string4) {
       this.schedule_id=string;
       this.instructor_id=string0;
       this.instructor_name=string1;
       this.member_id=string2;
       this.member_name=string3;
       this.Date=string4;
    }

    @Override
    public String toString() {
        return "ScheduleModel{" + "schedule_id=" + getSchedule_id() + ", member_id=" + getMember_id() + ", member_name=" + getMember_name() + ", instructor_id=" + getInstructor_id() + ", instructor_name=" + getInstructor_name() + ", Date=" + getDate() + ", ScheduleDetailList=" + getScheduleDetailList() + '}';
    }

    /**
     * @return the schedule_id
     */
    public String getSchedule_id() {
        return schedule_id;
    }

    /**
     * @param schedule_id the schedule_id to set
     */
    public void setSchedule_id(String schedule_id) {
        this.schedule_id = schedule_id;
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
     * @return the member_name
     */
    public String getMember_name() {
        return member_name;
    }

    /**
     * @param member_name the member_name to set
     */
    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    /**
     * @return the instructor_id
     */
    public String getInstructor_id() {
        return instructor_id;
    }

    /**
     * @param instructor_id the instructor_id to set
     */
    public void setInstructor_id(String instructor_id) {
        this.instructor_id = instructor_id;
    }

    /**
     * @return the instructor_name
     */
    public String getInstructor_name() {
        return instructor_name;
    }

    /**
     * @param instructor_name the instructor_name to set
     */
    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the ScheduleDetailList
     */
    public ArrayList<ScheduleDetailsModel> getScheduleDetailList() {
        return ScheduleDetailList;
    }

    /**
     * @param ScheduleDetailList the ScheduleDetailList to set
     */
    public void setScheduleDetailList(ArrayList<ScheduleDetailsModel> ScheduleDetailList) {
        this.ScheduleDetailList = ScheduleDetailList;
    }

   
    
    
}
