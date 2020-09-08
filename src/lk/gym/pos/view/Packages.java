/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.gym.pos.Controller.PackageController;
import lk.gym.pos.Model.PackageModel;

/**
 *
 * @author DILSHAN
 */
public class Packages extends javax.swing.JFrame {

    /**
     * Creates new form Packages
     */
    public Packages() {
        initComponents();
        
        genaratePackageId();
       
        
         //date 
        Date date=new Date();
        String formatDate=formatDate(date);
        labDate.setText(formatDate);
        
        
        //tableLoad
        detailsRefrish();
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiscription = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        labId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        DELETE = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labDate = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        AddPackage = new javax.swing.JLabel();
        UPDATE = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labClose = new javax.swing.JLabel();
        MiniMize = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 20, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Description");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 160, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 30, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 130, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 30, 40));

        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 40));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(72, 84, 96));
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 90, 30));

        txtDiscription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDiscription.setForeground(new java.awt.Color(72, 84, 96));
        txtDiscription.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiscription.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        txtDiscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscriptionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDiscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 760, 40));

        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 30, 40));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(72, 84, 96));
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 270, 40));

        labId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labId.setForeground(new java.awt.Color(72, 84, 96));
        labId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(labId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 110, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Package Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(":");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 30, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Package Duration");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText(":");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 30, 40));

        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 30, 40));

        txtDuration.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(72, 84, 96));
        txtDuration.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDuration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });
        jPanel1.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 250, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(":");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 30, 40));

        DELETE.setBackground(new java.awt.Color(255, 255, 255));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 77, 77));
        DELETE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/button.png"))); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 77, 77), 2));
        DELETE.setOpaque(true);
        DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DELETEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DELETEMouseExited(evt);
            }
        });
        jPanel1.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 120, 140, 50));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(72, 84, 96));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("RS.");
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 50, 40));

        labDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labDate.setForeground(new java.awt.Color(72, 84, 96));
        labDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labDate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 130, 40));

        jLabel23.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 20, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Package Id");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 30, 40));

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PACKAGE ID", "PACKAGE NAME", "DURATION", "DATE", "DISCRIPTION", "AMOUNT"
            }
        ));
        TABLE.setRowHeight(25);
        TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1370, 280));

        AddPackage.setBackground(new java.awt.Color(255, 255, 255));
        AddPackage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddPackage.setForeground(new java.awt.Color(11, 232, 129));
        AddPackage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddPackage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/file.png"))); // NOI18N
        AddPackage.setText("ADD ");
        AddPackage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 232, 129), 2));
        AddPackage.setOpaque(true);
        AddPackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPackageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddPackageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddPackageMouseExited(evt);
            }
        });
        jPanel1.add(AddPackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 370, 140, 50));

        UPDATE.setBackground(new java.awt.Color(255, 255, 255));
        UPDATE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UPDATE.setForeground(new java.awt.Color(23, 192, 235));
        UPDATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/square.png"))); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 192, 235), 2));
        UPDATE.setOpaque(true);
        UPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UPDATEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UPDATEMouseExited(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 240, 140, 50));

        jPanel2.setBackground(new java.awt.Color(11, 232, 129));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PACKAGE DETAILS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/left_32px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

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

        MiniMize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiniMize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/subtract_32px.png"))); // NOI18N
        MiniMize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniMizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366)
                .addComponent(MiniMize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labClose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(labClose)
                    .addComponent(MiniMize))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        SearchBar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SearchBar.setForeground(new java.awt.Color(72, 84, 96));
        SearchBar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SearchBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        SearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchBarMouseExited(evt);
            }
        });
        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });
        SearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBarKeyReleased(evt);
            }
        });
        jPanel1.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 390, 40));

        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 10, 40));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/gym/pos/Image/search_40px.png"))); // NOI18N
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1370, 770));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDiscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscriptionActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void AddPackageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPackageMouseClicked
        try {
            // TODO add your handling code here:
            Double amount=Double.parseDouble(txtAmount.getText());
            PackageModel M=new PackageModel(labId.getText(),txtName.getText(),labDate.getText(),txtDuration.getText(),txtDiscription.getText(),amount);
            
            if(new PackageController().savePackageDetails(M)){
                JOptionPane.showMessageDialog(this,"Save");
                detailsRefrish();
                Clear();
                genaratePackageId();
                
            }else{
                JOptionPane.showMessageDialog(this,"try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Packages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddPackageMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        DashBord dash=new DashBord();dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

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

    private void MiniMizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMizeMouseClicked
        // TODO add your handling code here:
       this.setExtendedState(Packages.ICONIFIED);
    }//GEN-LAST:event_MiniMizeMouseClicked

    private void TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEMouseClicked
        // TODO add your handling code here:
        Clear();
        DefaultTableModel model=(DefaultTableModel) TABLE.getModel();
       int tsbleSelectedRow=TABLE.getSelectedRow();
       labId.setText(model.getValueAt(tsbleSelectedRow, 0).toString());
       txtName.setText(model.getValueAt(tsbleSelectedRow, 1).toString());
       labDate.setText(model.getValueAt(tsbleSelectedRow, 2).toString()); 
       txtDuration.setText(model.getValueAt(tsbleSelectedRow, 3).toString()); 
       txtDiscription.setText(model.getValueAt(tsbleSelectedRow, 4).toString()); 
       txtAmount.setText(model.getValueAt(tsbleSelectedRow, 5).toString()); 
       
    }//GEN-LAST:event_TABLEMouseClicked

    private void UPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseClicked
        try {
            // TODO add your handling code here:

            Double amount=Double.parseDouble(txtAmount.getText());
            PackageModel M=new PackageModel(labId.getText(),txtName.getText(),labDate.getText(),txtDuration.getText(),txtDiscription.getText(),amount);
            
            if(new PackageController().updatePackageDetails(M)){
                JOptionPane.showMessageDialog(this,"Update");
               
              
                detailsRefrish();
                 Clear();
                 genaratePackageId();
                
                
            }else{
                JOptionPane.showMessageDialog(this,"try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Packages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UPDATEMouseClicked

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
        try {
            // TODO add your handling code here:
            
            String id=labId.getText();           
            
            
            if(new PackageController().deletePackage(id)){
                JOptionPane.showMessageDialog(this,"Deleted");
                detailsRefrish();
            }else{
                JOptionPane.showMessageDialog(this,"try again");
                detailsRefrish();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Packages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DELETEMouseClicked

    private void SearchBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBarMouseEntered
        // TODO add your handling code here:
        SearchBar.setText(null);
    }//GEN-LAST:event_SearchBarMouseEntered

    private void SearchBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBarMouseExited
        // TODO add your handling code here:
        SearchBar.setText("Search...");
    }//GEN-LAST:event_SearchBarMouseExited

    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchBarActionPerformed

    private void SearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBarKeyReleased
       
        try {
            // TODO add your handling code here:
            DefaultTableModel dtm=(DefaultTableModel) TABLE.getModel();
            dtm.setRowCount(0);
            List<PackageModel> allDetails = new PackageController().searchAllPackage(SearchBar.getText());
            for(PackageModel temp: allDetails){
                dtm.addRow(new Object[]{
                    temp.getPackage_id(),
                    temp.getPackage_name(),
                    temp.getDate(),
                    temp.getDiscription(),
                    temp.getDiscription(),
                    temp.getAmount(),
                    
                });
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Packages.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }//GEN-LAST:event_SearchBarKeyReleased

    private void DELETEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseEntered
        // TODO add your handling code here:
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setBackground(new java.awt.Color(255, 77, 77));
        
    }//GEN-LAST:event_DELETEMouseEntered

    private void DELETEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseExited
        // TODO add your handling code here:
        DELETE.setForeground(new java.awt.Color(255, 77, 77));
        DELETE.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_DELETEMouseExited

    private void UPDATEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseEntered
        // TODO add your handling code here:
        UPDATE.setForeground(new java.awt.Color(255, 255, 255));
        UPDATE.setBackground(new java.awt.Color(23, 192, 235));
    }//GEN-LAST:event_UPDATEMouseEntered

    private void UPDATEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseExited
        // TODO add your handling code here:
        UPDATE.setForeground(new java.awt.Color(23, 192, 235));
        UPDATE.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_UPDATEMouseExited

    private void AddPackageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPackageMouseEntered
        // TODO add your handling code here:
        AddPackage.setForeground(new java.awt.Color(255, 255, 255));
       AddPackage.setBackground(new java.awt.Color(11, 232, 129));
    }//GEN-LAST:event_AddPackageMouseEntered

    private void AddPackageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPackageMouseExited
        // TODO add your handling code here:
       AddPackage.setForeground(new java.awt.Color(11, 232, 129));
        AddPackage.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_AddPackageMouseExited
    
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
            java.util.logging.Logger.getLogger(Packages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Packages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Packages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Packages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Packages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddPackage;
    private javax.swing.JLabel DELETE;
    private javax.swing.JLabel MiniMize;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JTable TABLE;
    private javax.swing.JLabel UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labClose;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labId;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDiscription;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void genaratePackageId() {
        
        try {
            String Id=new PackageController().genarateId();
            labId.setText(Id);
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Packages.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    
    }
     
     DefaultTableModel model;
     private void detailsRefrish() {
        try {
            //Clear();
            
            ArrayList<PackageModel> allPackages = PackageController.getAllPackageDetails();
            model=(DefaultTableModel) TABLE.getModel();
            model.setRowCount(0);
            for (PackageModel pk : allPackages) {
                
                Object[] rowData={pk.getPackage_id(),pk.getPackage_name(),pk.getDate(),pk.getDuration(),pk.getDiscription(),pk.getAmount()};
                
                model.addRow(rowData);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Packages.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     private void Clear(){
        labId.setText(null);
        txtName.setText(null);
        
        txtDuration.setText(null);
        txtDiscription.setText(null);
        txtAmount.setText(null);
     }
}
