/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Panel;

import DatabaseConnection.DBConnectioncode;
import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amin Kaiser
 */
public class Panel_ViewStudentInfo extends javax.swing.JPanel {

    //Variaable for Database Connection
    
    Connection con;
    PreparedStatement prepstmnt = null;
    ResultSet res = null;
    
    public Panel_ViewStudentInfo() {
        initComponents();
        
        
         //Database Connection Code call
        try {
            con = DBConnectioncode.DBConnectioncode();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Panel_ViewStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            String sqlSrch = "Select distinct(session) AS Session from Session ORDER BY session ASC";
            prepstmnt=con.prepareStatement(sqlSrch);
            res=prepstmnt.executeQuery();
            while(res.next())
            {
               
                String ses=res.getString("session");
               jComboBoxSession.addItem(ses);
               jComboBoxSessionsearch.addItem(ses);
              
            }
           
        }catch(SQLException e)
        {
        }
        
        
        ShowTable();
        
    }
    
    
    public final void ShowTable()
    {
         try{
            DefaultTableModel tb = (DefaultTableModel)jTableViewStudent.getModel();
            String sqlSearch = "SELECT * FROM student_information ORDER BY Stu_semester ASC ";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            while(res.next())
            {
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                String FathersName = res.getString("Fathers_Name");
                String Mothername = res.getString("Mothers_Name");
                String contactno = res.getString("Mobile");
               
                
                
                tb.addRow(new Object[]{name,roll,regno,session,semester,FathersName,Mothername,contactno});
                
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel80 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldRoll = new javax.swing.JTextField();
        jTextFieldReg = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jComboBoxSession = new javax.swing.JComboBox();
        jComboBoxSemester = new javax.swing.JComboBox();
        jTextFieldFatherName = new javax.swing.JTextField();
        jTextFieldMotherName = new javax.swing.JTextField();
        jTextFieldMobile = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel83 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBoxSessionsearch = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jTextFieldRollNo = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jPanel82 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableViewStudent = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();

        jPanel80.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Name :");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Roll :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("Reg. No :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("Semester :");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldRoll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setText("Session :");

        jComboBoxSession.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSession.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jComboBoxSemester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester", "EX- Semester" }));

        jTextFieldFatherName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldMotherName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setText("Mobile :");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel55.setText("Mother's Name :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel56.setText("Father's Name :");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jComboBoxSession, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel81.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Print.png"))); // NOI18N
        jButton24.setText("Print");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/refresh.png"))); // NOI18N
        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/view.gif"))); // NOI18N
        jButton20.setText("Preview");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton20)
                .addGap(18, 18, 18)
                .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRefresh)
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel83.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Session :");

        jComboBoxSessionsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSessionsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Roll :");

        jTextFieldRollNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/search.gif"))); // NOI18N
        jButton26.setText("Search");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxSessionsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextFieldRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel83Layout.createSequentialGroup()
                        .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSessionsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldRollNo))
                .addContainerGap())
        );

        jPanel82.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableViewStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   Name", "   Roll", "   Reg. No ", "   Session", "   Semester", "   Father's Name", "   Mother's Name ", "   Mobile"
            }
        ));
        jTableViewStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableViewStudentMouseClicked(evt);
            }
        });
        jTableViewStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableViewStudentKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableViewStudentKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTableViewStudent);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE))
                    .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableViewStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableViewStudentMouseClicked
       try{
            int row = jTableViewStudent.getSelectedRow();
            String Table_Click = (jTableViewStudent.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM student_information WHERE Stu_Name ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                String FathersName = res.getString("Fathers_Name");
                String Mothername = res.getString("Mothers_Name");
                String contactno = res.getString("Mobile");
                
                
                jTextFieldName.setText(name);
                jTextFieldRoll.setText(roll);
                jTextFieldReg.setText(regno);
                jComboBoxSession.setSelectedItem(session);
                jComboBoxSemester.setSelectedItem(semester);
                jTextFieldFatherName.setText(FathersName);
                jTextFieldMotherName.setText(Mothername);
                jTextFieldMobile.setText(contactno);
                
               
            }
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTableViewStudentMouseClicked

    private void jTableViewStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableViewStudentKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            try{
            int row = jTableViewStudent.getSelectedRow();
            String Table_Click = (jTableViewStudent.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM student_information WHERE Stu_Name ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                String FathersName = res.getString("Fathers_Name");
                String Mothername = res.getString("Mothers_Name");
                String contactno = res.getString("Mobile");
                
                
                jTextFieldName.setText(name);
                jTextFieldRoll.setText(roll);
                jTextFieldReg.setText(regno);
                jComboBoxSession.setSelectedItem(session);
                jComboBoxSemester.setSelectedItem(semester);
                jTextFieldFatherName.setText(FathersName);
                jTextFieldMotherName.setText(Mothername);
                jTextFieldMobile.setText(contactno);
                
               
            }
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
    }//GEN-LAST:event_jTableViewStudentKeyReleased

    private void jTableViewStudentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableViewStudentKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            try{
            int row = jTableViewStudent.getSelectedRow();
            String Table_Click = (jTableViewStudent.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM student_information WHERE Stu_Name ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                String FathersName = res.getString("Fathers_Name");
                String Mothername = res.getString("Mothers_Name");
                String contactno = res.getString("Mobile");
                
                
                jTextFieldName.setText(name);
                jTextFieldRoll.setText(roll);
                jTextFieldReg.setText(regno);
                jComboBoxSession.setSelectedItem(session);
                jComboBoxSemester.setSelectedItem(semester);
                jTextFieldFatherName.setText(FathersName);
                jTextFieldMotherName.setText(Mothername);
                jTextFieldMobile.setText(contactno);
                
               
            }
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jTableViewStudentKeyPressed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        //Refresh();
        try{
            DefaultTableModel tb = (DefaultTableModel)jTableViewStudent.getModel();
         int row=jTableViewStudent.getRowCount();
         for(int i=row-1;i>=0;i--)
         {
            tb.removeRow(i);
         }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            DefaultTableModel tb = (DefaultTableModel)jTableViewStudent.getModel();
            String sqlSearch = "SELECT * FROM student_information where Stu_Name like '%"+jTextFieldSearch.getText()+"%' OR Stu_Roll like '%"+jTextFieldSearch.getText()+"%' ORDER BY Stu_semester ASC";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            while(res.next())
            {
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                String FathersName = res.getString("Fathers_Name");
                String Mothername = res.getString("Mothers_Name");
                String contactno = res.getString("Mobile");
               
                
                
                tb.addRow(new Object[]{name,roll,regno,session,semester,FathersName,Mothername,contactno});
                
            }
            
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int test = 1;
        try {

            //String SearchRoll = SearchStudent.getText();
            String sqlSrch = "SELECT * FROM  student_information WHERE Stu_Roll='"+jTextFieldRollNo.getText()+"' AND Stu_Session= '"+jComboBoxSessionsearch.getSelectedItem().toString()+"'";
            prepstmnt = con.prepareStatement(sqlSrch);
            res = prepstmnt.executeQuery();
            
            while (res.next()) {
                
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                String FathersName = res.getString("Fathers_Name");
                String Mothername = res.getString("Mothers_Name");
                String contactno = res.getString("Mobile");
                
                
                
                jTextFieldName.setText(name);
                jTextFieldRoll.setText(roll);
                jTextFieldReg.setText(regno);
                jComboBoxSession.setSelectedItem(session);
                jComboBoxSemester.setSelectedItem(semester);
                jTextFieldFatherName.setText(FathersName);
                jTextFieldMotherName.setText(Mothername);
                jTextFieldMobile.setText(contactno);
                
            
              
                
                test = 0;
                break;
            }

            if (test == 1) {
                JOptionPane.showMessageDialog(this, "Data Not Found");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
                jTextFieldName.setText("");
                jTextFieldRoll.setText("");
                jTextFieldReg.setText("");
                jComboBoxSession.setSelectedItem("Select");
                jComboBoxSemester.setSelectedItem("Select");
                jTextFieldFatherName.setText("");
                jTextFieldMotherName.setText("");
                jTextFieldMobile.setText("");
                jTextFieldSearch.setText("");
                jComboBoxSessionsearch.setSelectedItem("Select");
                jTextFieldRollNo.setText("");
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    
    void print_student_information() throws SQLException, BadElementException, IOException {
         
          // con = Connect.ConnectDB();
        Document document = new Document(PageSize.A4.rotate());
       // Document document = new Document(PageSize.A4);
        Font ff1 = new Font(Font.BOLD, 13);
        ff1.setStyle(Font.UNDERLINE);
        ff1.setColor(Color.BLACK);
        ff1.setStyle(Font.BOLD);
        
        Font ff5 = new Font(Font.BOLD, 18);
        ff5.setStyle(Font.UNDERLINE);
        ff5.setColor(Color.BLACK);
        ff5.setStyle(Font.BOLD);
        Font ff3 = new Font(Font.NORMAL, 11);
        ff3.setStyle(Font.COURIER);
        ff3.setColor(Color.BLACK);
        Font ff4 = new Font(Font.BOLD, 10);
        ff4.setStyle(Font.NORMAL);
        ff4.setColor(Color.BLACK);

        

        Paragraph paragraph3 = new Paragraph("\n");         
        paragraph3.setAlignment(Element.ALIGN_CENTER);
       

        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Studentinformation.pdf"));

            document.open();

            PdfContentByte cb = writer.getDirectContent();

            PdfPTable table = new PdfPTable(2);

            PdfPCell cell5 = new PdfPCell();

           
            String name="",roll="",regno="",session="",semester="",gndr="",bldgrp="",religion="",contactno="",email="",providhan="";
           String FathersName="",FatherNID="",FatherOcc="",FatherMobile="";
           String Mothername="",MotherNID="",MotherOCC="",MotherMobile="";
           String ParmanentAddr="",PresentAddr="";
           Date dt =null;
           
            try {

            //String Rsearch=txtReport.getText();
            
            String sqlSrch = "SELECT * FROM  student_information WHERE Stu_Roll='"+jTextFieldRoll.getText()+"' AND Stu_Session= '"+jComboBoxSession.getSelectedItem().toString()+"'";
            prepstmnt = con.prepareStatement(sqlSrch);
            res = prepstmnt.executeQuery();
            
            while (res.next()) {
                
                name = res.getString("Stu_Name");
                roll = res.getString("Stu_Roll");
                regno = res.getString("Stu_RegNo");
                session = res.getString("Stu_Session");
                semester = res.getString("Stu_semester"); 
                gndr = res.getString("Gender");
                bldgrp = res.getString("Blood_Grp");
               dt=res.getDate("BirthDate");
                religion = res.getString("Religion");
                contactno = res.getString("Mobile");
                email = res.getString("Email");
                providhan = res.getString("Providhan");
                
                FathersName = res.getString("Fathers_Name");
                FatherNID = res.getString("FatherNID");
                FatherOcc = res.getString("Father_Occupaion");
                FatherMobile = res.getString("Father_mobile");
                
               Mothername = res.getString("Mothers_Name");
                 MotherNID = res.getString("MotherNID");
                MotherOCC = res.getString("Mother_Occupation");
               MotherMobile = res.getString("Mother_mobile");
                
                ParmanentAddr = res.getString("parmanent_Addr");
                PresentAddr = res.getString("present_Addr");

               
             
                
               
                
            }
            }catch(SQLException e){
                
            }
            
           
            Paragraph Title = new Paragraph("Chittagong Polytechnic Institute", new Font(Font.BOLD, 40, Font.BOLD,Color.DARK_GRAY));
            Title.setAlignment(Element.ALIGN_CENTER);
            document.add(Title);
            Paragraph Subtitle = new Paragraph("Nasirabad, Chittagong - 4209", new Font(Font.BOLD, 20, Font.BOLD,Color.DARK_GRAY));
            Subtitle.setAlignment(Element.ALIGN_CENTER);
            document.add(Subtitle);

            Paragraph mainparagraph = new Paragraph("Student Information", new Font(Font.BOLD, 30, Font.BOLD,Color.DARK_GRAY));
            mainparagraph.setAlignment(Element.ALIGN_CENTER);
            
            
            

     
            
            PdfPTable my_report_table1 = new PdfPTable(2);
            //left side
            PdfPCell table_cell1 = new PdfPCell();
            my_report_table1.setWidthPercentage(100);

            table_cell1 = new PdfPCell(new Phrase(" ", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell1.setBorder(com.lowagie.text.Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table1.addCell(table_cell1);

            //right side
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
            java.util.Date printDate = new java.util.Date();
            dateFormat.format(printDate);
           
            table_cell1 = new PdfPCell(new Phrase("Print Date & Time :  " + dateFormat.format(printDate), new Font(Font.NORMAL, 11, Font.BOLD)));
            table_cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            //table_cell6.setBorder(Rectangle.NO_BORDER);
            
            table_cell1.setBorder(com.lowagie.text.Rectangle.NO_BORDER);
            my_report_table1.addCell(table_cell1);
            
            
            
            
            
            
            
            PdfPTable my_report_table2 = new PdfPTable(1);
            //left side
            PdfPCell table_cell2 = new PdfPCell();
            my_report_table2.setWidthPercentage(100);

            table_cell2 = new PdfPCell(new Phrase("Student Name : " + name, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell2.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table2.addCell(table_cell2);
            
            
            
            PdfPTable my_report_table3 = new PdfPTable(1);
            //left side
            PdfPCell table_cell3 = new PdfPCell();
            my_report_table3.setWidthPercentage(100);

            table_cell3 = new PdfPCell(new Phrase("Student Roll : " + roll, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell3.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell3.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table3.addCell(table_cell3);
            
            
            
            PdfPTable my_report_table4 = new PdfPTable(1);
            //left side
            PdfPCell table_cell4 = new PdfPCell();
            my_report_table4.setWidthPercentage(100);

            table_cell4 = new PdfPCell(new Phrase("Registration No : " + regno, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell4.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell4.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table4.addCell(table_cell4);
            
            
            
            PdfPTable my_report_table11 = new PdfPTable(1);
            //left side
            PdfPCell table_cell11 = new PdfPCell();
            my_report_table11.setWidthPercentage(100);

            table_cell11 = new PdfPCell(new Phrase("Session : " + session, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell11.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell11.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table11.addCell(table_cell11);
            
            
            
            
            
             PdfPTable my_report_table100 = new PdfPTable(1);
            //left side
            PdfPCell table_cell100 = new PdfPCell();
            my_report_table100.setWidthPercentage(100);

            table_cell100 = new PdfPCell(new Phrase("Gender : " + gndr, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell100.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell100.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table100.addCell(table_cell100);
            
            
            
            
            PdfPTable my_report_table101 = new PdfPTable(1);
            //left side
            PdfPCell table_cell101 = new PdfPCell();
            my_report_table101.setWidthPercentage(100);

            table_cell101 = new PdfPCell(new Phrase("Providhan : " +providhan, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell101.setBorder(Rectangle.NO_BORDER);
            my_report_table101.addCell(table_cell101);
            
            
            
            PdfPTable my_report_table20 = new PdfPTable(1);
            //left side
            PdfPCell table_cell20 = new PdfPCell();
            my_report_table20.setWidthPercentage(100);

            table_cell20 = new PdfPCell(new Phrase(" ", new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell20.setBorder(Rectangle.NO_BORDER);
            my_report_table20.addCell(table_cell20);
            
            

            
            
            
            PdfPTable my_report_table102 = new PdfPTable(2);
            //left side
            PdfPCell table_cell102 = new PdfPCell();
            my_report_table102.setWidthPercentage(100);

            table_cell102 = new PdfPCell(new Phrase("Mobile : " +contactno, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell102.setBorder(Rectangle.NO_BORDER);
            my_report_table102.addCell(table_cell102);
            
            
            
            
            
            
            table_cell102 = new PdfPCell(new Phrase("E-mail  : " +email, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell102.setBorder(Rectangle.NO_BORDER);
            my_report_table102.addCell(table_cell102);
            
            
            PdfPTable my_report_table103 = new PdfPTable(2);
            //left side
            PdfPCell table_cell103 = new PdfPCell();
            my_report_table103.setWidthPercentage(100);

            table_cell103 = new PdfPCell(new Phrase("Date Of Birth : " +dt, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell103.setBorder(Rectangle.NO_BORDER);
            my_report_table103.addCell(table_cell103);
            
            
            
            
            
            
            table_cell103 = new PdfPCell(new Phrase("Religion  : " +religion, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell103.setBorder(Rectangle.NO_BORDER);
            my_report_table103.addCell(table_cell103);
            
            
          
            PdfPTable my_report_table201 = new PdfPTable(1);
            //left side
            PdfPCell table_cell201 = new PdfPCell();
            my_report_table201.setWidthPercentage(100);

            table_cell201 = new PdfPCell(new Phrase(" ", new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell201.setBorder(Rectangle.NO_BORDER);
            my_report_table201.addCell(table_cell20);
            
            
            
            
            
            PdfPTable my_report_table104 = new PdfPTable(2);
            //left side
            PdfPCell table_cell104 = new PdfPCell();
            my_report_table104.setWidthPercentage(100);
            
            
            
            table_cell104 = new PdfPCell(new Phrase("Father's Name: " +FathersName, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell104.setBorder(Rectangle.NO_BORDER);
            my_report_table104.addCell(table_cell104);
            
            
            
            
            
            
            table_cell104 = new PdfPCell(new Phrase("Father's Contact No  : " +FatherMobile, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell104.setBorder(Rectangle.NO_BORDER);
            my_report_table104.addCell(table_cell104);
            
            
            PdfPTable my_report_table105 = new PdfPTable(2);
            //left side
            PdfPCell table_cell105 = new PdfPCell();
            my_report_table105.setWidthPercentage(100);

            table_cell105 = new PdfPCell(new Phrase("Mother's Name: " +Mothername, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell105.setBorder(Rectangle.NO_BORDER);
            my_report_table105.addCell(table_cell105);
            
            
            
            
            
            
            table_cell105 = new PdfPCell(new Phrase("Mother's Contact No  : " +MotherMobile, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell105.setBorder(Rectangle.NO_BORDER);
            my_report_table105.addCell(table_cell105);
            
            
            
            
            
            
            PdfPTable my_report_table106 = new PdfPTable(1);
            //left side
            PdfPCell table_cell106 = new PdfPCell();
            my_report_table106.setWidthPercentage(100);

            table_cell106 = new PdfPCell(new Phrase("Permanent Address : " +ParmanentAddr, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell106.setBorder(Rectangle.NO_BORDER);
            my_report_table106.addCell(table_cell106);
            
             PdfPTable my_report_table107 = new PdfPTable(1);
            //left side
            PdfPCell table_cell107 = new PdfPCell();
            my_report_table107.setWidthPercentage(100);

            table_cell107 = new PdfPCell(new Phrase("Present Address : " +PresentAddr, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell107.setBorder(Rectangle.NO_BORDER);
            my_report_table107.addCell(table_cell107);
            
            
            
            
            
//left side
/*
            PdfPCell table_cell10 = new PdfPCell();
            my_report_table1.setWidthPercentage(100);

            table_cell10 = new PdfPCell(new Phrase("Roll : " +roll, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell1.setBorder(1);
            

            table_cell10.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table1.addCell(table_cell10);

            //right side

            table_cell10 = new PdfPCell(new Phrase("Registration No : " +regno, new Font(Font.NORMAL, 15, Font.BOLD)));
            //table_cell10.setHorizontalAlignment(Element.ALIGN_LEFT);
            

            table_cell10.setBorder(Rectangle.NO_BORDER);
            my_report_table1.addCell(table_cell10);
            
            //////

            PdfPTable my_report_table2 = new PdfPTable(2);
            PdfPCell table_cell2 = new PdfPCell();

            table_cell2 = new PdfPCell(new Phrase("\n Basic Salary : " + BS + "\n\n", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            //table_cell2.setBorder(Rectangle.NO_BORDER);
            table_cell2.setBorder(Rectangle.BOX);
            my_report_table2.addCell(table_cell2);

            table_cell2 = new PdfPCell(new Phrase("\n MA : " + MA + "\n\n", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            // table_cell2.setBorder(Rectangle.NO_BORDER);
            table_cell2.setBorder(Rectangle.BOX);
            my_report_table2.addCell(table_cell2);
            
            

            PdfPTable my_report_table9 = new PdfPTable(2);
            PdfPCell table_cell9 = new PdfPCell();

            table_cell9 = new PdfPCell(new Phrase("\n House Rent : " + HR + "\n\n", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell9.setHorizontalAlignment(Element.ALIGN_LEFT);
            //table_cell5.setBorder(Rectangle.NO_BORDER);
            table_cell2.setBorder(Rectangle.BOX);
            my_report_table5.addCell(table_cell5);

            table_cell9 = new PdfPCell(new Phrase("\n Transport : " + TA + "\n\n", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell9.setHorizontalAlignment(Element.ALIGN_LEFT);
            //table_cell5.setBorder(Rectangle.NO_BORDER);
            table_cell9.setBorder(Rectangle.BOX);
            my_report_table9.addCell(table_cell9);

            PdfPTable my_report_table6 = new PdfPTable(2);
            PdfPCell table_cell6 = new PdfPCell();

            table_cell6 = new PdfPCell(new Phrase("\n Total Salary : " + GS + "\n\n", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell6.setHorizontalAlignment(Element.ALIGN_LEFT);
            //table_cell6.setBorder(Rectangle.NO_BORDER);
            table_cell2.setBorder(Rectangle.BOX);
            my_report_table6.addCell(table_cell6);

            table_cell6 = new PdfPCell(new Phrase("\n\n", new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell6.setHorizontalAlignment(Element.ALIGN_LEFT);
            //table_cell6.setBorder(Rectangle.NO_BORDER);
            table_cell2.setBorder(Rectangle.BOX);
            my_report_table6.addCell(table_cell6);

           */

            document.add(mainparagraph);
            document.add(paragraph3);
            document.add(my_report_table1);
            document.add(paragraph3);
            document.add(paragraph3);
            document.add(my_report_table2);
            document.add(my_report_table3);
            document.add(my_report_table4);
            document.add(my_report_table11);
            
           
            document.add(my_report_table100);
            document.add(my_report_table101);
            document.add(my_report_table20);
            document.add(my_report_table102);
            document.add(my_report_table103);
            document.add(my_report_table201);
            document.add(my_report_table104);
            document.add(my_report_table105);
            
            document.add(new Paragraph(" "));
            
            document.add(my_report_table106);
            document.add(my_report_table107);
            
            document.add(paragraph3);
            //document.add(my_report_table5);
            document.add(paragraph3);
            //document.add(my_report_table6);
           

            // document.add(table);
        } catch (DocumentException | HeadlessException e56) {
            System.err.println(e56.getMessage());
        }

        document.close();

         
     }
    
    
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
         try {
            print_student_information();
        } catch (SQLException | BadElementException | IOException ex) {
            Logger.getLogger(Panel_ViewStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (Desktop.isDesktopSupported()) {
            try {
                File myfile = new File("Studentinformation.pdf");

                Desktop.getDesktop().open(myfile);
            } catch (IOException e17) {
                // JOptionPane.showMessageDialog(null, e17.toString());
            }
        }
        
        
    }//GEN-LAST:event_jButton24ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JComboBox jComboBoxSemester;
    private javax.swing.JComboBox jComboBoxSession;
    private javax.swing.JComboBox jComboBoxSessionsearch;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableViewStudent;
    private javax.swing.JTextField jTextFieldFatherName;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JTextField jTextFieldMotherName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldReg;
    private javax.swing.JTextField jTextFieldRoll;
    private javax.swing.JTextField jTextFieldRollNo;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
