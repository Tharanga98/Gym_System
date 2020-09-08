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
public class PackageModel {
    
    
   private String package_id ,package_name,Date ,duration,discription;
    private Double amount;

    public PackageModel() {
    }

    public PackageModel(String package_id, String package_name, String Date, String duration, String discription, Double amount) {
        this.package_id = package_id;
        this.package_name = package_name;
        this.Date = Date;
        this.duration = duration;
        this.discription = discription;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PackageModel{" + "package_id=" + getPackage_id() + ", package_name=" + getPackage_name() + ", Date=" + getDate() + ", duration=" + getDuration() + ", discription=" + getDiscription() + ", amount=" + getAmount() + '}';
    }

    /**
     * @return the package_id
     */
    public String getPackage_id() {
        return package_id;
    }

    /**
     * @param package_id the package_id to set
     */
    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    /**
     * @return the package_name
     */
    public String getPackage_name() {
        return package_name;
    }

    /**
     * @param package_name the package_name to set
     */
    public void setPackage_name(String package_name) {
        this.package_name = package_name;
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
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    
    
}
