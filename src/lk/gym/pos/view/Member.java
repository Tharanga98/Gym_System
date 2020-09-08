/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.view;

import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import lk.gym.pos.Controller.MemberController;

import lk.gym.pos.Model.MemberModel;


/**
 *
 * @author DILSHAN
 */
public class Member extends javax.swing.JFrame {

    /**
     * Creates new form Member
     */
    public Member() {
        initComponents();
        
        //date of join
        Date date=new Date();
        String formatDate=formatDate(date);
        txtJoinDate.setText(formatDate);
        
        //memberId
        generateMemberId();
        
      
    }
   
     String imageName,imagePath;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panal1 = new javax.swing.JPanel();
        tapPanal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDob = new com.toedter.calendar.JDateChooser();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RadioMale = new javax.swing.JRadioButton();
        RadioFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jea = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labId = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        addImage = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtJoinDate = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        getMembership = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tapPanal.setBackground(new java.awt.Color(255, 255, 255,210));
        tapPanal.setForeground(new java.awt.Color(47, 54, 64));
        tapPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Member Name");
        tapPanal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date Of Birth");
        tapPanal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 40));

        txtDob.setBackground(new java.awt.Color(255, 255, 255));
        txtDob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDob.setForeground(new java.awt.Color(47, 54, 64));
        txtDob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tapPanal.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 250, 40));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(47, 54, 64));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        tapPanal.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 650, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Weight");
        tapPanal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 100, 40));

        RadioMale.setBackground(new java.awt.Color(255, 255, 255,210));
        RadioMale.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        RadioMale.setText("Male");
        RadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMaleActionPerformed(evt);
            }
        });
        tapPanal.add(RadioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 112, -1));

        RadioFemale.setBackground(new java.awt.Color(255, 255, 255,210));
        RadioFemale.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        RadioFemale.setText("Female");
        RadioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFemaleActionPerformed(evt);
            }
        });
        tapPanal.add(RadioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 135, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Age");
        tapPanal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 110, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Gender");
        tapPanal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 100, 40));

        txtAge.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAge.setForeground(new java.awt.Color(47, 54, 64));
        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        tapPanal.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 90, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Member Id");
        tapPanal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Date Of Join");
        tapPanal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 160, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contact Number");
        tapPanal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 40));

        txtContact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtContact.setForeground(new java.awt.Color(47, 54, 64));
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        tapPanal.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 330, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        tapPanal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 40));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(47, 54, 64));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        tapPanal.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 800, 40));

        jea.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jea.setText("Email ");
        tapPanal.add(jea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 80, 40));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(47, 54, 64));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        tapPanal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 318, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Height");
        tapPanal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 130, 40));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Year");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel17.setOpaque(true);
        tapPanal.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 50, 40));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ft");
        tapPanal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 50, 40));

        labId.setBackground(new java.awt.Color(255, 255, 255));
        labId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labId.setForeground(new java.awt.Color(47, 54, 64));
        labId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labId.setOpaque(true);
        tapPanal.add(labId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 90, 40));

        imageLabel.setBackground(new java.awt.Color(236, 239, 241));
        imageLabel.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
        imageLabel.setForeground(new java.awt.Color(255, 204, 51));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/social.png"))); // NOI18N
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(116, 125, 140)));
        imageLabel.setOpaque(true);
        tapPanal.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 250, 310));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(47, 54, 64));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("94+");
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel26.setOpaque(true);
        tapPanal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 40, 40));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel27.setOpaque(true);
        tapPanal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 30, 40));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel28.setOpaque(true);
        tapPanal.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 30, 40));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel29.setOpaque(true);
        tapPanal.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 30, 40));

        addImage.setBackground(new java.awt.Color(255, 255, 255));
        addImage.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        addImage.setForeground(new java.awt.Color(11, 232, 129));
        addImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/landscape.png"))); // NOI18N
        addImage.setText(" add Image");
        addImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 232, 129), 2));
        addImage.setOpaque(true);
        addImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addImageMouseExited(evt);
            }
        });
        tapPanal.add(addImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 180, 50));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Kg");
        tapPanal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 50, 40));

        txtJoinDate.setBackground(new java.awt.Color(255, 255, 255));
        txtJoinDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtJoinDate.setForeground(new java.awt.Color(47, 54, 64));
        txtJoinDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJoinDate.setBorder(new javax.swing.border.MatteBorder(null));
        txtJoinDate.setOpaque(true);
        tapPanal.add(txtJoinDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 190, 40));

        txtHeight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(47, 54, 64));
        txtHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tapPanal.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 70, 40));

        txtWeight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(47, 54, 64));
        txtWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tapPanal.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 70, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(":");
        tapPanal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 30, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(":");
        tapPanal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 30, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(":");
        tapPanal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 30, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(":");
        tapPanal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 30, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(":");
        tapPanal.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 30, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText(":");
        tapPanal.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 30, 40));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(":");
        tapPanal.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 30, 40));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText(":");
        tapPanal.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 30, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText(":");
        tapPanal.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 30, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText(":");
        tapPanal.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 30, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText(":");
        tapPanal.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 30, 40));

        getMembership.setBackground(new java.awt.Color(255, 255, 255));
        getMembership.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getMembership.setForeground(new java.awt.Color(52, 231, 228));
        getMembership.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getMembership.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/membership.png"))); // NOI18N
        getMembership.setText("add Member");
        getMembership.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 231, 228), 3));
        getMembership.setOpaque(true);
        getMembership.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getMembershipMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getMembershipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                getMembershipMouseExited(evt);
            }
        });
        tapPanal.add(getMembership, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 610, 200, 60));

        panal1.add(tapPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 710));

        jPanel3.setBackground(new java.awt.Color(50, 255, 126));

        labClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/delete_32px.png"))); // NOI18N
        labClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labCloseMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEMBERSHIP FORM");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/subtract_32px.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/left_32px.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(282, 282, 282)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labClose)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labClose)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panal1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/540X542.png"))); // NOI18N
        image.setOpaque(true);
        panal1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1370, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1370, 770));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void labCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_labCloseMouseClicked

    private void labCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCloseMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_labCloseMouseEntered

    private void labCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCloseMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_labCloseMouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Payments.ICONIFIED);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        DashBord dash=new DashBord();dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void RadioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFemaleActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_RadioFemaleActionPerformed

    private void RadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMaleActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_RadioMaleActionPerformed

    private void getMembershipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMembershipMouseClicked
        try {
            // TODO add your handling code here:
            String mId=labId.getText();
            
            String name=txtName.getText();
            String doj=txtJoinDate.getText();
            
            SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
            String   dob=df.format(txtDob.getDate());
            
            String age=txtAge.getText();
            Double height=Double.parseDouble(txtHeight.getText());
            Double weight=Double.parseDouble(txtWeight.getText());
            String gender;
            if(RadioMale.isSelected()){
                gender="Male";
               
            }else if (RadioFemale.isSelected()){
                gender="Female";
                
            }else{
                gender="Other";
            }
            
            String contact=txtContact.getText();
            String address=txtAddress.getText();
            String email=txtEmail.getText();
            
            MemberModel m=new MemberModel(mId,name,address,contact,email,gender,doj,dob,age,height,weight,imageName,imagePath);
            
            if(new MemberController().saveMemberDetails(m)){
                JOptionPane.showMessageDialog(this,"saved");
            }else{
                JOptionPane.showMessageDialog(this,"Tryagain");
            }
            this.setVisible(false);
            new Payments().setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_getMembershipMouseClicked
       
    private void addImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addImageMouseClicked
        // TODO add your handling code here:
        
        //default image Location
        String currentDisplayPath="C:\\Users\\DILSHAN\\Desktop\\sample Image";
        JFileChooser imageFileChooser=new JFileChooser(currentDisplayPath);
        int imageChooser=imageFileChooser.showOpenDialog(null);
        imageFileChooser.setDialogTitle("Choose Image....");
        
        //only choose "png","jpg","jpeng" fils
        FileNameExtensionFilter fexf= new FileNameExtensionFilter("IMAGE","png","jpg","jpeg");
        imageFileChooser.setFileFilter(fexf);
        
        
        if(imageChooser==JFileChooser.APPROVE_OPTION){
            File imageFile=imageFileChooser.getSelectedFile();
            String imageFileName=imageFile.getName();
            String imageFilePath=imageFile.getAbsolutePath();
            //display image path and name view
                imageName=imageFileName;
                imagePath=imageFilePath;
            ImageIcon imageIcon=new ImageIcon(imageFilePath);
            //Resize image file to jlabel
            Image image=imageIcon.getImage().getScaledInstance(imageLabel.getWidth(),imageLabel.getHeight(),Image.SCALE_SMOOTH);
            
            ImageIcon resizeImageIcon=new ImageIcon(image);
            imageLabel.setIcon(resizeImageIcon);
             System.out.println(imageName+""+imagePath);
        }
        
        
    }//GEN-LAST:event_addImageMouseClicked

    private void addImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addImageMouseEntered
        // TODO add your handling code here:
       addImage.setBackground(new java.awt.Color(11, 232, 129));
       addImage.setForeground(new java.awt.Color(255, 255, 255));
      
    }//GEN-LAST:event_addImageMouseEntered

    private void addImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addImageMouseExited
        // TODO add your handling code here:
       addImage .setBackground(new java.awt.Color(255, 255, 255));
       addImage.setForeground(new java.awt.Color(11, 232, 129));
    }//GEN-LAST:event_addImageMouseExited

    private void getMembershipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMembershipMouseEntered
        // TODO add your handling code here:
         getMembership.setBackground(new java.awt.Color(52, 231, 228));
       getMembership.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_getMembershipMouseEntered

    private void getMembershipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMembershipMouseExited
        // TODO add your handling code here:
       getMembership.setBackground(new java.awt.Color(255, 255, 255));
       getMembership.setForeground(new java.awt.Color(52, 231, 228));
    }//GEN-LAST:event_getMembershipMouseExited
        //Double forCalculation;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioFemale;
    private javax.swing.JRadioButton RadioMale;
    private javax.swing.JLabel addImage;
    private javax.swing.JLabel getMembership;
    private javax.swing.JLabel image;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jea;
    private javax.swing.JLabel labClose;
    private javax.swing.JLabel labId;
    private javax.swing.JPanel panal1;
    private javax.swing.JPanel tapPanal;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JLabel txtJoinDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

   
        //date of join----formatDate
    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    
    }
 
    private void generateMemberId() {
        try {
            String MemberId=new MemberController().generateId();
            
          labId.setText(MemberId);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Instructor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    

    
    
    
    
    
}
