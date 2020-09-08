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
public class MemberModel {
    
  private String mId,name,address,contact,email,gender,doj,dob,age,imageName,imagePath;
   private Double height,weight;

    public MemberModel(String mId, String name, String address, String contact, String email, String gender, String doj, String dob, String age, Double height, Double weight, String imageName, String imagePath) {
        this.mId = mId;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.doj = doj;
        this.dob = dob;
        this.age = age;
        this.imageName = imageName;
        this.imagePath = imagePath;
        this.height = height;
        this.weight = weight;
    }

    public MemberModel() {
    }

    

    @Override
    public String toString() {
        return "MemberModel{" + "mId=" + getmId() + ", name=" + getName() + ", address=" + getAddress() + ", contact=" + getContact() + ", email=" + getEmail() + ", gender=" + getGender() + ", doj=" + getDoj() + ", dob=" + getDob() + ", age=" + getAge() + ", imageName=" + getImageName() + ", imagePath=" + getImagePath() + ", height=" + getHeight() + ", weight=" + getWeight() + '}';
    }

    /**
     * @return the mId
     */
    public String getmId() {
        return mId;
    }

    /**
     * @param mId the mId to set
     */
    public void setmId(String mId) {
        this.mId = mId;
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
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
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
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

   

    
    

    
   
   
}
