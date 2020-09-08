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
public class ScheduleDetailsModel {
    
    private String schedule_id,No,Exercise, Ferquency;

    public ScheduleDetailsModel() {
    }

   public ScheduleDetailsModel(String schedule_id, String No, String Exercise, String Ferquency) {
        this.schedule_id = schedule_id;
        this.No = No;
        this.Exercise = Exercise;
        this.Ferquency = Ferquency;
    }

    /*public ScheduleDetailsModel(String No, String Exercise, String Ferquency) {
        this.No = No;
        this.Exercise = Exercise;
        this.Ferquency = Ferquency;
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
     * @return the No
     */
    public String getNo() {
        return No;
    }

    /**
     * @param No the No to set
     */
    public void setNo(String No) {
        this.No = No;
    }

    /**
     * @return the Exercise
     */
    public String getExercise() {
        return Exercise;
    }

    /**
     * @param Exercise the Exercise to set
     */
    public void setExercise(String Exercise) {
        this.Exercise = Exercise;
    }

    /**
     * @return the Ferquency
     */
    public String getFerquency() {
        return Ferquency;
    }

    /**
     * @param Ferquency the Ferquency to set
     */
    public void setFerquency(String Ferquency) {
        this.Ferquency = Ferquency;
    }

   

    
}
    