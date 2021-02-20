/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Window;

import DatabaseConnection.DBConnectioncode;
import Login_Window.Login;
import Project_Panel.Main_Window;
import Project_Panel.Panel_AboutUs;
import Project_Panel.Panel_Administrator;
import Project_Panel.Panel_Document;
import Project_Panel.Panel_Drop;
import Project_Panel.Panel_GiveResult;
import Project_Panel.Panel_ResultProcess;
import Project_Panel.Panel_StudentInformation;
import Project_Panel.Panel_TeacherInformation;
import Project_Panel.Panel_ViewResult;
import Project_Panel.Panel_ViewSemester;
import Project_Panel.Panel_ViewStudentInfo;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Amin Kaiser
 */
public class Main_Project_Window extends javax.swing.JFrame {

    //Variaable for Database Connection
    
    Connection con;
    PreparedStatement prepstmnt = null;
    ResultSet res = null;
    
    
    public Main_Project_Window() {
        initComponents();
        //WideScreen();
        
        Main_Window P1 = new Main_Window();
        P1.setSize(1350, 651);
        P1.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P1, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
        
        
        //Database Connection Code
        
        try {
            con = DBConnectioncode.DBConnectioncode();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main_Project_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UsernameSearch();
    }
    
     public void UsernameSearch()
    {
         try{
           
            String sqlSrch = "Select * from temp";
            prepstmnt=con.prepareStatement(sqlSrch);
            res=prepstmnt.executeQuery();
            while(res.next())
            {
               
                String Name=res.getString("username");
                jMenuItem5.setText("Log Out "+Name);
                
               
            }
           
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    public void WideScreen()
    {
      setExtendedState(Main_Project_Window.MAXIMIZED_BOTH);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        Principle_Panel = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuStudentinfo = new javax.swing.JMenuItem();
        jMenuTeacherinfo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemGiveResult = new javax.swing.JMenuItem();
        jMenuItemDrop = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItemViewStudentinfo = new javax.swing.JMenuItem();
        jMenuItemViewResult = new javax.swing.JMenuItem();
        jMenuItemSemesterStudent = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItemDocument = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuResultProcessing = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItemAdduser = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuGohome = new javax.swing.JMenuItem();
        jMenuAboutDeveloper = new javax.swing.JMenu();
        jMenuStudentinfo1 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIMS");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        javax.swing.GroupLayout Principle_PanelLayout = new javax.swing.GroupLayout(Principle_Panel);
        Principle_Panel.setLayout(Principle_PanelLayout);
        Principle_PanelLayout.setHorizontalGroup(
            Principle_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        Principle_PanelLayout.setVerticalGroup(
            Principle_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );

        jMenuBar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 7, true));
        jMenuBar2.setAlignmentX(1.0F);
        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu4.setBorder(null);
        jMenu4.setText("File");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setIconTextGap(15);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/folder-open.png"))); // NOI18N
        jMenuItem1.setText("Open");
        jMenuItem1.setIconTextGap(5);
        jMenu4.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/save.png"))); // NOI18N
        jMenuItem2.setText("Save");
        jMenuItem2.setIconTextGap(5);
        jMenu4.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/delete.png"))); // NOI18N
        jMenuItem3.setText("Delete");
        jMenuItem3.setIconTextGap(5);
        jMenu4.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/exit_hover.gif"))); // NOI18N
        jMenuItem4.setText("Exit");
        jMenuItem4.setIconTextGap(5);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Information");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setIconTextGap(15);

        jMenuStudentinfo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuStudentinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/info.gif"))); // NOI18N
        jMenuStudentinfo.setText("Student Information");
        jMenuStudentinfo.setIconTextGap(5);
        jMenuStudentinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuStudentinfoActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuStudentinfo);

        jMenuTeacherinfo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuTeacherinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/info.gif"))); // NOI18N
        jMenuTeacherinfo.setText("Teacher Information");
        jMenuTeacherinfo.setIconTextGap(5);
        jMenuTeacherinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTeacherinfoActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuTeacherinfo);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Result");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu6.setIconTextGap(15);

        jMenuItemGiveResult.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemGiveResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/Arrow2 Up.png"))); // NOI18N
        jMenuItemGiveResult.setText("Give Result & Promote");
        jMenuItemGiveResult.setIconTextGap(5);
        jMenuItemGiveResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGiveResultActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemGiveResult);

        jMenuItemDrop.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemDrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/Arrow2 Down.png"))); // NOI18N
        jMenuItemDrop.setText("Drop Student");
        jMenuItemDrop.setIconTextGap(5);
        jMenuItemDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDropActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemDrop);

        jMenuBar2.add(jMenu6);

        jMenu12.setText("View");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu12.setIconTextGap(15);

        jMenuItemViewStudentinfo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemViewStudentinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/user_student.png"))); // NOI18N
        jMenuItemViewStudentinfo.setText("Student Information");
        jMenuItemViewStudentinfo.setIconTextGap(5);
        jMenuItemViewStudentinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewStudentinfoActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItemViewStudentinfo);

        jMenuItemViewResult.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemViewResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/Curation_bar_icon_info_16x16.png"))); // NOI18N
        jMenuItemViewResult.setText("Student Result");
        jMenuItemViewResult.setIconTextGap(5);
        jMenuItemViewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewResultActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItemViewResult);

        jMenuItemSemesterStudent.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemSemesterStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/view_16x16.gif"))); // NOI18N
        jMenuItemSemesterStudent.setText("Semester Student");
        jMenuItemSemesterStudent.setIconTextGap(5);
        jMenuItemSemesterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSemesterStudentActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItemSemesterStudent);

        jMenuBar2.add(jMenu12);

        jMenu7.setText("Document");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu7.setIconTextGap(15);

        jMenuItemDocument.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/document.png"))); // NOI18N
        jMenuItemDocument.setText("Document Information");
        jMenuItemDocument.setIconTextGap(5);
        jMenuItemDocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDocumentActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemDocument);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Result Processor");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu8.setIconTextGap(15);
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuResultProcessing.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuResultProcessing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/process.png"))); // NOI18N
        jMenuResultProcessing.setText("Result Processing");
        jMenuResultProcessing.setIconTextGap(5);
        jMenuResultProcessing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuResultProcessingActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuResultProcessing);

        jMenuBar2.add(jMenu8);

        jMenu9.setText("Administrator");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu9.setIconTextGap(15);

        jMenuItemAdduser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItemAdduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/add-user-icon.png"))); // NOI18N
        jMenuItemAdduser.setText("Add User & Session");
        jMenuItemAdduser.setIconTextGap(5);
        jMenuItemAdduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdduserActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemAdduser);

        jMenuBar2.add(jMenu9);

        jMenu10.setText("Navigate");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu10.setIconTextGap(15);

        jMenuGohome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuGohome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/home-icon.png"))); // NOI18N
        jMenuGohome.setText("Go To Home");
        jMenuGohome.setIconTextGap(5);
        jMenuGohome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGohomeActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuGohome);

        jMenuBar2.add(jMenu10);

        jMenuAboutDeveloper.setText("About Us");
        jMenuAboutDeveloper.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuAboutDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuAboutDeveloper.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuAboutDeveloper.setIconTextGap(15);
        jMenuAboutDeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutDeveloperMouseClicked(evt);
            }
        });

        jMenuStudentinfo1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuStudentinfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/information_white.png"))); // NOI18N
        jMenuStudentinfo1.setText("About Developer");
        jMenuStudentinfo1.setIconTextGap(5);
        jMenuStudentinfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuStudentinfo1ActionPerformed(evt);
            }
        });
        jMenuAboutDeveloper.add(jMenuStudentinfo1);

        jMenuBar2.add(jMenuAboutDeveloper);

        jMenu13.setText("Log Out");
        jMenu13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu13.setIconTextGap(15);
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/Logoff.jpg"))); // NOI18N
        jMenuItem5.setText("Log Out");
        jMenuItem5.setIconTextGap(5);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem5);

        jMenuBar2.add(jMenu13);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principle_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principle_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuAboutDeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutDeveloperMouseClicked
        
    }//GEN-LAST:event_jMenuAboutDeveloperMouseClicked

    private void jMenuGohomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGohomeActionPerformed
        Main_Window P1 = new Main_Window();
        P1.setSize(1350,651);
        P1.setLocation(0,0);
        
       Principle_Panel.removeAll();
       Principle_Panel.add(P1, BorderLayout.CENTER);
       Principle_Panel.revalidate();
       Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuGohomeActionPerformed

    private void jMenuStudentinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuStudentinfoActionPerformed
        Panel_StudentInformation P2 = new Panel_StudentInformation();
        P2.setSize(1350, 651);
        P2.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P2, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuStudentinfoActionPerformed

    private void jMenuTeacherinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTeacherinfoActionPerformed
        Panel_TeacherInformation P3 = new Panel_TeacherInformation();
        P3.setSize(1350, 651);
        P3.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P3, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuTeacherinfoActionPerformed

    private void jMenuItemDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDocumentActionPerformed
        Panel_Document P4 = new Panel_Document();
        P4.setSize(1350, 651);
        P4.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P4, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemDocumentActionPerformed

    private void jMenuItemAdduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdduserActionPerformed
        Panel_Administrator P5 = new Panel_Administrator();
        P5.setSize(1350, 651);
        P5.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P5, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemAdduserActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuResultProcessingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuResultProcessingActionPerformed
        Panel_ResultProcess P6 = new Panel_ResultProcess();
        P6.setSize(1350, 651);
        P6.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P6, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuResultProcessingActionPerformed

    private void jMenuItemSemesterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSemesterStudentActionPerformed
        Panel_ViewSemester P7 = new Panel_ViewSemester();
        P7.setSize(1350, 651);
        P7.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P7, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemSemesterStudentActionPerformed

    private void jMenuItemViewStudentinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewStudentinfoActionPerformed
        Panel_ViewStudentInfo P8 = new Panel_ViewStudentInfo();
        P8.setSize(1350, 651);
        P8.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P8, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemViewStudentinfoActionPerformed

    private void jMenuItemViewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewResultActionPerformed
        Panel_ViewResult P9 = new Panel_ViewResult();
        P9.setSize(1350, 651);
        P9.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P9, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemViewResultActionPerformed

    private void jMenuItemGiveResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGiveResultActionPerformed
        Panel_GiveResult P10 = new Panel_GiveResult();
        P10.setSize(1350, 651);
        P10.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P10, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemGiveResultActionPerformed

    private void jMenuItemDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDropActionPerformed
        Panel_Drop P12 = new Panel_Drop();
        P12.setSize(1350, 651);
        P12.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P12, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuItemDropActionPerformed

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenuStudentinfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuStudentinfo1ActionPerformed
        Panel_AboutUs P13 = new Panel_AboutUs();
        P13.setSize(1350, 651);
        P13.setLocation(0, 0);

        Principle_Panel.removeAll();
        Principle_Panel.add(P13, BorderLayout.CENTER);
        Principle_Panel.revalidate();
        Principle_Panel.repaint();
    }//GEN-LAST:event_jMenuStudentinfo1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Login lg = new Login();
        
        lg.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
                if ("Meatl".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Project_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Project_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Project_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Project_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Project_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principle_Panel;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenu jMenuAboutDeveloper;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuGohome;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemAdduser;
    private javax.swing.JMenuItem jMenuItemDocument;
    private javax.swing.JMenuItem jMenuItemDrop;
    private javax.swing.JMenuItem jMenuItemGiveResult;
    private javax.swing.JMenuItem jMenuItemSemesterStudent;
    private javax.swing.JMenuItem jMenuItemViewResult;
    private javax.swing.JMenuItem jMenuItemViewStudentinfo;
    private javax.swing.JMenuItem jMenuResultProcessing;
    private javax.swing.JMenuItem jMenuStudentinfo;
    private javax.swing.JMenuItem jMenuStudentinfo1;
    private javax.swing.JMenuItem jMenuTeacherinfo;
    // End of variables declaration//GEN-END:variables
}
