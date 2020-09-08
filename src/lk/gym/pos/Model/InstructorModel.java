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
public class InstructorModel {
    
    private String id,name,address,email,gender,doj,dob,salary,imageName,imagePath;
    private int age,contact;

    public InstructorModel() {
    }

   
//id,name,doj,dob,gender,email,contact,address,age,salary,imageName,imagePath
    public InstructorModel(String id, String name, String doj, String dob, String gender, String email, int contact, String address, int age, String salary,String imageName,String imagePath ) {
         this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.doj = doj;
        this.dob = dob;
        this.salary = salary;
        this.age = age;
        this.imageName=imageName;
        this.imagePath=imagePath;
    }

    @Override
    public String toString() {
        return "InstructorModel{" + "id=" + getId() + ", name=" + getName() + ", address=" + getAddress() + ", email=" + getEmail() + ", gender=" + getGender() + ", doj=" + getDoj() + ", dob=" + getDob() + ", salary=" + getSalary() + ", imageName=" + getImageName() + ", imagePath=" + getImagePath() + ", age=" + getAge() + ", contact=" + getContact() + '}';
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the doj
     */
    public String getDoj() {
        return doj;
    }

    /**
     * @param doj the doj to set
     */
    public void setDoj(String doj) {
        this.doj = doj;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * @return the imageName
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * @param imageName the imageName to set
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    

   

   
    
}
