/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Home.Home_Page;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Edit_StudentGroups extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String id = "";
    
    public Edit_StudentGroups() {
        initComponents();
        
        retrieveYearsem();
        retrieveProgramme();
        retrieveGid();
        retrieveSubGid();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtYearSem = new javax.swing.JTextField();
        jComboBoxYearSem = new javax.swing.JComboBox<>();
        btnupdYear = new javax.swing.JButton();
        btnAddYear = new javax.swing.JButton();
        btndltyear = new javax.swing.JButton();
        txtProgramme = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAddPro = new javax.swing.JButton();
        jComboBoxProgramme = new javax.swing.JComboBox<>();
        btndltPro = new javax.swing.JButton();
        btnupdPro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnAddsubGid = new javax.swing.JButton();
        txtSubgid = new javax.swing.JTextField();
        jComboBoxSubGid = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtgid = new javax.swing.JTextField();
        btnAddgid = new javax.swing.JButton();
        jComboBoxGid = new javax.swing.JComboBox<>();
        btnupdGid = new javax.swing.JButton();
        btndltGid = new javax.swing.JButton();
        btndltSubGid = new javax.swing.JButton();
        btnupdSubGid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 4));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setText("H");
        btnHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, 30, 30));

        btnBack.setText("B");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 30, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("ABC INSTITUTE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("TIMETABLE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(89, 89, 89))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 13, 500, 95));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255), 4));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Academic Year & Sem");

        jComboBoxYearSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        jComboBoxYearSem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxYearSemItemStateChanged(evt);
            }
        });
        jComboBoxYearSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxYearSemActionPerformed(evt);
            }
        });

        btnupdYear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnupdYear.setText("Update");
        btnupdYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdYearActionPerformed(evt);
            }
        });

        btnAddYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddYearActionPerformed(evt);
            }
        });

        btndltyear.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btndltyear.setText("Delete");
        btndltyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltyearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Programme");

        btnAddPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProActionPerformed(evt);
            }
        });

        jComboBoxProgramme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        jComboBoxProgramme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProgrammeItemStateChanged(evt);
            }
        });

        btndltPro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btndltPro.setText("Delete");
        btndltPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltProActionPerformed(evt);
            }
        });

        btnupdPro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnupdPro.setText("Update");
        btnupdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdProActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("SubGroup ID");

        btnAddsubGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddsubGidActionPerformed(evt);
            }
        });

        jComboBoxSubGid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        jComboBoxSubGid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSubGidItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Group ID");

        btnAddgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddgidActionPerformed(evt);
            }
        });

        jComboBoxGid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        jComboBoxGid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxGidItemStateChanged(evt);
            }
        });

        btnupdGid.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnupdGid.setText("Update");
        btnupdGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdGidActionPerformed(evt);
            }
        });

        btndltGid.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btndltGid.setText("Delete");
        btndltGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltGidActionPerformed(evt);
            }
        });

        btndltSubGid.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btndltSubGid.setText("Delete");
        btndltSubGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltSubGidActionPerformed(evt);
            }
        });

        btnupdSubGid.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnupdSubGid.setText("Update");
        btnupdSubGid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdSubGidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtYearSem)
                                .addComponent(jComboBoxYearSem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAddYear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(91, 91, 91))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btndltyear, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnupdYear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btndltGid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnupdGid)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtgid)
                            .addComponent(jComboBoxGid, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(btnAddgid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btndltPro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProgramme, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxProgramme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btndltSubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdSubGid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubgid)
                            .addComponent(jComboBoxSubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddsubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndltPro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYearSem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxYearSem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndltyear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubgid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddsubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndltSubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdSubGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddgid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndltGid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Add_Student().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddYearActionPerformed
        if(new DBclass().addYearSem(txtYearSem.getText())){
            JOptionPane.showMessageDialog(null, "Inserted Year and Semmester");
            retrieveYearsem();
            
            jComboBoxYearSem.setSelectedItem(txtYearSem.getText());
            txtYearSem.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Inserted Year and Semmester");
        }
    }//GEN-LAST:event_btnAddYearActionPerformed

    private void btnAddProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProActionPerformed
        if(new DBclass().addProgramme(txtProgramme.getText())){
            JOptionPane.showMessageDialog(null, "Inserted Programme");
            retrieveProgramme();
            
            jComboBoxProgramme.setSelectedItem(txtProgramme.getText());
            txtProgramme.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Inserted Programme");
        }
        
    }//GEN-LAST:event_btnAddProActionPerformed

    private void btnAddgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddgidActionPerformed
        if(new DBclass().addGId(txtgid.getText())){
            JOptionPane.showMessageDialog(null, "Inserted group ID");
            retrieveGid();
            
            jComboBoxGid.setSelectedItem(txtgid.getText());
            txtgid.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Inserted group ID");
        }
    }//GEN-LAST:event_btnAddgidActionPerformed

    private void btnAddsubGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddsubGidActionPerformed
        if(new DBclass().addSubGId(txtSubgid.getText())){
            JOptionPane.showMessageDialog(null, "Inserted Subgroup ID");
            retrieveSubGid();
            
            jComboBoxSubGid.setSelectedItem(txtSubgid.getText());
            txtSubgid.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Inserted Subgroup ID");
        }
       
    }//GEN-LAST:event_btnAddsubGidActionPerformed

    private void btndltyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltyearActionPerformed
        if(new DBclass().deleteYearSem(id)){
            JOptionPane.showMessageDialog(null, "Deleted Year and Semmester");
            retrieveYearsem();
            
            txtYearSem.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Deleted Year and Semmester");
        }
    }//GEN-LAST:event_btndltyearActionPerformed

    private void btnupdYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdYearActionPerformed
        if(new DBclass().updateYearSem(id, txtYearSem.getText())){
            JOptionPane.showMessageDialog(null, "Updated Year and Semmester");
            retrieveYearsem();
            
            jComboBoxYearSem.setSelectedItem(txtYearSem.getText());
            txtYearSem.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Updated Year and Semmester");
        }
    }//GEN-LAST:event_btnupdYearActionPerformed

    private void jComboBoxYearSemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxYearSemItemStateChanged
        id = jComboBoxYearSem.getSelectedItem().toString();
        txtYearSem.setText(id);
    }//GEN-LAST:event_jComboBoxYearSemItemStateChanged

    private void btndltProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltProActionPerformed
        if(new DBclass().deleteProgramme(id)){
            JOptionPane.showMessageDialog(null, "Deleted Programme");
            retrieveProgramme();
            
            txtProgramme.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Deleted Programme");
        }
    }//GEN-LAST:event_btndltProActionPerformed

    private void btnupdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdProActionPerformed
        if(new DBclass().updateProgramme(id, txtProgramme.getText())){
            JOptionPane.showMessageDialog(null, "Updated Programme");
            retrieveProgramme();
            
            jComboBoxProgramme.setSelectedItem(txtProgramme.getText());
            txtProgramme.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Updated Programme");
        }
    }//GEN-LAST:event_btnupdProActionPerformed

    private void jComboBoxProgrammeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProgrammeItemStateChanged
        id = jComboBoxProgramme.getSelectedItem().toString();
        txtProgramme.setText(id);
    }//GEN-LAST:event_jComboBoxProgrammeItemStateChanged

    private void btndltGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltGidActionPerformed
        if(new DBclass().deleteGId(id)){
            JOptionPane.showMessageDialog(null, "Deleted Group Id");
            retrieveGid();
            
            txtgid.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Deleted Group Id");
        }
    }//GEN-LAST:event_btndltGidActionPerformed

    private void btndltSubGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltSubGidActionPerformed
        if(new DBclass().deleteSubGId(id)){
            JOptionPane.showMessageDialog(null, "Deleted SubGroup Id");
            retrieveSubGid();
            
            txtSubgid.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Deleted SubGroup Id");
        }
    }//GEN-LAST:event_btndltSubGidActionPerformed

    private void jComboBoxGidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxGidItemStateChanged
        id = jComboBoxGid.getSelectedItem().toString();
        txtgid.setText(id);
    }//GEN-LAST:event_jComboBoxGidItemStateChanged

    private void jComboBoxSubGidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSubGidItemStateChanged
         id = jComboBoxSubGid.getSelectedItem().toString();
        txtSubgid.setText(id);
    }//GEN-LAST:event_jComboBoxSubGidItemStateChanged

    private void btnupdGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdGidActionPerformed
       if(new DBclass().updateGId(id, txtgid.getText())){
            JOptionPane.showMessageDialog(null, "Updated Group Id");
            retrieveGid();
            
            jComboBoxGid.setSelectedItem(txtgid.getText());
            txtgid.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Updated Group Id");
        }
    }//GEN-LAST:event_btnupdGidActionPerformed

    private void btnupdSubGidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdSubGidActionPerformed
        if(new DBclass().updateSubGId(id, txtSubgid.getText())){
            JOptionPane.showMessageDialog(null, "Updated SubGroup Id");
            retrieveSubGid();
            
            jComboBoxSubGid.setSelectedItem(txtSubgid.getText());
            txtSubgid.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Not Updated SubGroup Id");
        }
    }//GEN-LAST:event_btnupdSubGidActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Home_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jComboBoxYearSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxYearSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxYearSemActionPerformed
    
    private void retrieveYearsem(){
        DefaultComboBoxModel dm = new DBclass().retieveYearSem();
        jComboBoxYearSem.setModel(dm);
    }
    
    private void retrieveProgramme(){
        DefaultComboBoxModel dm = new DBclass().retieveProgramme();
        jComboBoxProgramme.setModel(dm);
    }
    
    private void retrieveGid(){
        DefaultComboBoxModel dm = new DBclass().retieveGId();
        jComboBoxGid.setModel(dm);
    }
    
    private void retrieveSubGid(){
        DefaultComboBoxModel dm = new DBclass().retieveSubGId();
        jComboBoxSubGid.setModel(dm);
    }
    
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
            java.util.logging.Logger.getLogger(Edit_StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_StudentGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_StudentGroups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPro;
    private javax.swing.JButton btnAddYear;
    private javax.swing.JButton btnAddgid;
    private javax.swing.JButton btnAddsubGid;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btndltGid;
    private javax.swing.JButton btndltPro;
    private javax.swing.JButton btndltSubGid;
    private javax.swing.JButton btndltyear;
    private javax.swing.JButton btnupdGid;
    private javax.swing.JButton btnupdPro;
    private javax.swing.JButton btnupdSubGid;
    private javax.swing.JButton btnupdYear;
    private javax.swing.JComboBox<String> jComboBoxGid;
    private javax.swing.JComboBox<String> jComboBoxProgramme;
    private javax.swing.JComboBox<String> jComboBoxSubGid;
    private javax.swing.JComboBox<String> jComboBoxYearSem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtProgramme;
    private javax.swing.JTextField txtSubgid;
    private javax.swing.JTextField txtYearSem;
    private javax.swing.JTextField txtgid;
    // End of variables declaration//GEN-END:variables
}
