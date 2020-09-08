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
public class PaymentModel {
    
    
    private String payment_id,member_id,member_name,package_id,package_name,date,payment_method,account_number;
    private Double discount_prasantage,discount_amount,cash,balance,total_amount;

    public PaymentModel() {
    }

   
    public PaymentModel(String payment_id, String member_id, String member_name, String package_id, String package_name, Double discount_prasantage, Double discount_amount, String date, String payment_method, String account_number, Double cash, Double balance, Double total_amount) {
        this.payment_id = payment_id;
        this.member_id = member_id;
        this.member_name = member_name;
        this.package_id = package_id;
        this.package_name = package_name;
        this.date = date;
        this.payment_method = payment_method;
        this.discount_prasantage = discount_prasantage;
        this.discount_amount = discount_amount;
        this.account_number = account_number;
        this.cash = cash;
        this.balance = balance;
        this.total_amount = total_amount;
    }

    

    @Override
    public String toString() {
        return "PaymentModel{" + "payment_id=" + payment_id + ", member_id=" + member_id + ", member_name=" + member_name + ", package_id=" + package_id + ", package_name=" + package_name + ", date=" + date + ", payment_method=" + payment_method + ", discount_prasantage=" + discount_prasantage + ", discount_amount=" + discount_amount + ", account_number=" + account_number + ", cash=" + cash + ", balance=" + balance + ", total_amount=" + total_amount + '}';
    }
    
    /**
     * @return the payment_id
     */
    public String getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
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
     * @return the payment_method
     */
    public String getPayment_method() {
        return payment_method;
    }

    /**
     * @param payment_method the payment_method to set
     */
    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    /**
     * @return the discount_prasantage
     */
    public Double getDiscount_prasantage() {
        return discount_prasantage;
    }

    /**
     * @param discount_prasantage the discount_prasantage to set
     */
    public void setDiscount_prasantage(Double discount_prasantage) {
        this.discount_prasantage = discount_prasantage;
    }

    /**
     * @return the discount_amount
     */
    public Double getDiscount_amount() {
        return discount_amount;
    }

    /**
     * @param discount_amount the discount_amount to set
     */
    public void setDiscount_amount(Double discount_amount) {
        this.discount_amount = discount_amount;
    }

    /**
     * @return the account_number
     */
    public String getAccount_number() {
        return account_number;
    }

    /**
     * @param account_number the account_number to set
     */
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    /**
     * @return the cash
     */
    public Double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(Double cash) {
        this.cash = cash;
    }

    /**
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * @return the total_amount
     */
    public Double getTotal_amount() {
        return total_amount;
    }

    /**
     * @param total_amount the total_amount to set
     */
    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

   

  
       
   
}
