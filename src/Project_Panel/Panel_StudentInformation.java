
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


public class Panel_StudentInformation extends javax.swing.JPanel {

    //Variaable for Database Connection
    
    Connection con;
    PreparedStatement prepstmnt = null;
    ResultSet res = null;
    
    String Gender;
    
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy"); //save
     
    String date="";
    java.util.Date now= new java.util.Date();
    
    public Panel_StudentInformation() {
        initComponents();
        
        
        StdudentBirthDate.setDate(now);
        //Database Connection Code call
        try {
            con = DBConnectioncode.DBConnectioncode();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Panel_StudentInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try{
            String sqlSrch = "Select distinct(session) AS Session from Session ORDER BY session ASC";
            prepstmnt=con.prepareStatement(sqlSrch);
            res=prepstmnt.executeQuery();
            while(res.next())
            {
               
                String ses=res.getString("session");
               combostudentSession.addItem(ses);
               jComboBoxSession.addItem(ses);
              
            }
           
        }catch(SQLException e)
        {
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel22 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        student_Name = new javax.swing.JTextField();
        student_Roll = new javax.swing.JTextField();
        studentRegNO = new javax.swing.JTextField();
        jRadioMale = new javax.swing.JRadioButton();
        jRadioFemale = new javax.swing.JRadioButton();
        comboStudentSemester = new javax.swing.JComboBox();
        combostudentSession = new javax.swing.JComboBox();
        jPanel24 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studentProvidhan = new javax.swing.JTextField();
        ComboStudentBlood = new javax.swing.JComboBox();
        CombostuReligion = new javax.swing.JComboBox();
        StdudentBirthDate = new com.toedter.calendar.JDateChooser();
        StudentMobile = new javax.swing.JTextField();
        studentEmail = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        txtimagepath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        labelimage = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxSession = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        SearchStudent = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        FatherName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        FathersNID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FatherOccupation = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        FathersMobile = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        MothersName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        MothersNID = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        MothersOccupation = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mothersmobile = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        parmanentAddr = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        presentAddress = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Roll :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Reg. No :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Session :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Semester :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender :");

        student_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        student_Roll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        studentRegNO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        buttonGroup1.add(jRadioMale);
        jRadioMale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioMale.setText("Male");
        jRadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioFemale);
        jRadioFemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioFemale.setText("Female");
        jRadioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFemaleActionPerformed(evt);
            }
        });

        comboStudentSemester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboStudentSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester", "EX- Semester" }));
        comboStudentSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStudentSemesterActionPerformed(evt);
            }
        });

        combostudentSession.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combostudentSession.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(student_Roll, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(studentRegNO, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(combostudentSession, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(comboStudentSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioFemale)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(student_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel22Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboStudentSemester, combostudentSession, studentRegNO, student_Name, student_Roll});

        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_Roll, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentRegNO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combostudentSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboStudentSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioMale)
                    .addComponent(jRadioFemale))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Blood Group :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Providhan :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("E-mail :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Mobile No :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Religion :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Birth Date :");

        studentProvidhan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ComboStudentBlood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ComboStudentBlood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A Positive(A+)", "A Negative(A-)", "AB Positive(AB+)", "AB Negative(AB-)", "B Positive(B+)", "B Negative(B-)", "O Positive(O+)", "O Negative(O-)" }));

        CombostuReligion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CombostuReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Islam", "Hinduism", "Buddhism", "Christianity" }));

        StdudentBirthDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        StudentMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        studentEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboStudentBlood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CombostuReligion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StdudentBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StudentMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentProvidhan, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboStudentBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(StdudentBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CombostuReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentProvidhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtimagepath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtimagepathKeyReleased(evt);
            }
        });
        jPanel32.add(txtimagepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 175, 140, 29));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/mail-attachment.png"))); // NOI18N
        jButton1.setText("Attach ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 217, 140, -1));

        jDesktopPane2.setLayer(labelimage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelimage, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelimage, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        jPanel32.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 140));

        jPanel30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Session :");

        jComboBoxSession.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSession.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Roll :");

        SearchStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/search.gif"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/SearchBox.png"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSession, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchStudent)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addContainerGap())))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(SearchStudent)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Father's Name :");

        FatherName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("NID :");

        FathersNID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Occupation :");

        FatherOccupation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Mobile No :");

        FathersMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel18.setText("Mother's Name :");

        MothersName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("NID :");

        MothersNID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Occupation :");

        MothersOccupation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Mobile No :");

        mothersmobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MothersName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(FatherName))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FathersNID, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(MothersNID))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(FatherOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(MothersOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FathersMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(mothersmobile))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FathersNID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FatherOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FathersMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MothersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MothersNID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MothersOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothersmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Permanent Address :");

        parmanentAddr.setColumns(20);
        parmanentAddr.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        parmanentAddr.setRows(5);
        jScrollPane1.setViewportView(parmanentAddr);

        presentAddress.setColumns(20);
        presentAddress.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        presentAddress.setRows(5);
        jScrollPane2.setViewportView(presentAddress);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Present Address :");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/save2.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Trash-can16.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Update.png"))); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/user-male-add.png"))); // NOI18N
        jButton5.setText("Add New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/view.gif"))); // NOI18N
        jButton6.setText("Preview");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Print.png"))); // NOI18N
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/refresh.png"))); // NOI18N
        jButton8.setText("Refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton2)
                .addGap(10, 10, 10)
                .addComponent(jButton3)
                .addGap(10, 10, 10)
                .addComponent(Update)
                .addGap(10, 10, 10)
                .addComponent(jButton5)
                .addGap(10, 10, 10)
                .addComponent(jButton6)
                .addGap(10, 10, 10)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Location.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       int test = 1;
        try {

            //String SearchRoll = SearchStudent.getText();
            String sqlSrch = "SELECT * FROM  student_information WHERE Stu_Roll='"+SearchStudent.getText()+"' AND Stu_Session= '"+jComboBoxSession.getSelectedItem().toString()+"'";
            prepstmnt = con.prepareStatement(sqlSrch);
            res = prepstmnt.executeQuery();
            
            while (res.next()) {
                
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                
                String gndr = res.getString("Gender");
                
                if ("Male".equals(gndr)) {
                    jRadioMale.setSelected(true);
                    jRadioFemale.setSelected(false);
                } else {
                    jRadioMale.setSelected(false);
                    jRadioFemale.setSelected(true); 
                }
                String bldgrp = res.getString("Blood_Grp");
                Date dt=res.getDate("BirthDate");
                String religion = res.getString("Religion");
                String contactno = res.getString("Mobile");
                String email = res.getString("Email");
                String providhan = res.getString("Providhan");
                
                String FathersName = res.getString("Fathers_Name");
                String FatherNID = res.getString("FatherNID");
                String FatherOcc = res.getString("Father_Occupaion");
                String FatherMobile = res.getString("Father_mobile");
                
                String Mothername = res.getString("Mothers_Name");
                String MotherNID = res.getString("MotherNID");
                String MotherOCC = res.getString("Mother_Occupation");
                String MotherMobile = res.getString("Mother_mobile");
                
                String ParmanentAddr = res.getString("parmanent_Addr");
                String PresentAddr = res.getString("present_Addr");
               
                
                
                student_Name.setText(name);
                student_Roll.setText(roll);
                studentRegNO.setText(regno);
                combostudentSession.setSelectedItem(session);
                comboStudentSemester.setSelectedItem(semester);
               
                ComboStudentBlood.setSelectedItem(bldgrp);
                StdudentBirthDate.setDate(dt);
                CombostuReligion.setSelectedItem(religion);
                StudentMobile.setText(contactno);
                studentEmail.setText(email);
                studentProvidhan.setText(providhan);
                
                FatherName.setText(FathersName);
                FathersNID.setText(FatherNID);
                FatherOccupation.setText(FatherOcc);
                FathersMobile.setText(FatherMobile);
                
                MothersName.setText(Mothername);
                MothersNID.setText(MotherNID);
                MothersOccupation.setText(MotherOCC);
                mothersmobile.setText(MotherMobile);
                parmanentAddr.setText(ParmanentAddr);
                presentAddress.setText(PresentAddr);
            
              
                
                test = 0;
                break;
            }

            if (test == 1) {
                JOptionPane.showMessageDialog(this, "Data Not Found");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       java.sql.Date StuBirthDate= new java.sql.Date(StdudentBirthDate.getDate().getTime());
        
     
        try {

            String sqlQry = "INSERT into student_information(Stu_Name,Stu_Roll,Stu_RegNo,Stu_Session,Stu_semester,Gender,Blood_Grp,BirthDate,Religion,Mobile,Email,Providhan,Fathers_Name,FatherNID,Father_Occupaion,Father_mobile,Mothers_Name,MotherNID,Mother_Occupation,Mother_mobile,parmanent_Addr,present_Addr) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            prepstmnt = con.prepareStatement(sqlQry);
            

            prepstmnt.setString(1, student_Name.getText());
            prepstmnt.setString(2, student_Roll.getText());
            prepstmnt.setString(3, studentRegNO.getText());
            prepstmnt.setString(4, (String) combostudentSession.getSelectedItem());
            prepstmnt.setString(5, (String) comboStudentSemester.getSelectedItem());
            prepstmnt.setString(6, Gender);
            prepstmnt.setString(7, (String) ComboStudentBlood.getSelectedItem());
            prepstmnt.setDate(8, StuBirthDate);
            prepstmnt.setString(9,(String) CombostuReligion.getSelectedItem());
            prepstmnt.setString(10, StudentMobile.getText());
            prepstmnt.setString(11, studentEmail.getText());
            prepstmnt.setString(12, studentProvidhan.getText());
            prepstmnt.setString(13, FatherName.getText());
            prepstmnt.setString(14, FathersNID.getText());
            prepstmnt.setString(15, FatherOccupation.getText());
            prepstmnt.setString(16, FathersMobile.getText());
            prepstmnt.setString(17, MothersName.getText());
            prepstmnt.setString(18, MothersNID.getText());
            prepstmnt.setString(19, MothersOccupation.getText());
            prepstmnt.setString(20, mothersmobile.getText());
            prepstmnt.setString(21, parmanentAddr.getText());
            prepstmnt.setString(22, presentAddress.getText());
            
            int i = prepstmnt.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Data Saved!");
            }

        } catch (SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
                    
        }
       
         Refresh();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMaleActionPerformed
        Gender = "Male";
    }//GEN-LAST:event_jRadioMaleActionPerformed

    private void jRadioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFemaleActionPerformed
       Gender = "Female";
    }//GEN-LAST:event_jRadioFemaleActionPerformed

    private void SearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentActionPerformed
        
       int test = 1;
        try {

            //String SearchRoll = SearchStudent.getText();
            String sqlSrch = "SELECT * FROM  student_information WHERE Stu_Roll='"+SearchStudent.getText()+"' AND Stu_Session= '"+jComboBoxSession.getSelectedItem().toString()+"'";
            prepstmnt = con.prepareStatement(sqlSrch);
            res = prepstmnt.executeQuery();
            
            while (res.next()) {
                
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                
                String gndr = res.getString("Gender");
                
                if ("Male".equals(gndr)) {
                    jRadioMale.setSelected(true);
                    jRadioFemale.setSelected(false);
                } else {
                    jRadioMale.setSelected(false);
                    jRadioFemale.setSelected(true); 
                }
                String bldgrp = res.getString("Blood_Grp");
                Date dt=res.getDate("BirthDate");
                String religion = res.getString("Religion");
                String contactno = res.getString("Mobile");
                String email = res.getString("Email");
                String providhan = res.getString("Providhan");
                
                String FathersName = res.getString("Fathers_Name");
                String FatherNID = res.getString("FatherNID");
                String FatherOcc = res.getString("Father_Occupaion");
                String FatherMobile = res.getString("Father_mobile");
                
                String Mothername = res.getString("Mothers_Name");
                String MotherNID = res.getString("MotherNID");
                String MotherOCC = res.getString("Mother_Occupation");
                String MotherMobile = res.getString("Mother_mobile");
                
                String ParmanentAddr = res.getString("parmanent_Addr");
                String PresentAddr = res.getString("present_Addr");
               
                
                
                student_Name.setText(name);
                student_Roll.setText(roll);
                studentRegNO.setText(regno);
                combostudentSession.setSelectedItem(session);
                comboStudentSemester.setSelectedItem(semester);
               
                ComboStudentBlood.setSelectedItem(bldgrp);
                StdudentBirthDate.setDate(dt);
                CombostuReligion.setSelectedItem(religion);
                StudentMobile.setText(contactno);
                studentEmail.setText(email);
                studentProvidhan.setText(providhan);
                
                FatherName.setText(FathersName);
                FathersNID.setText(FatherNID);
                FatherOccupation.setText(FatherOcc);
                FathersMobile.setText(FatherMobile);
                
                MothersName.setText(Mothername);
                MothersNID.setText(MotherNID);
                MothersOccupation.setText(MotherOCC);
                mothersmobile.setText(MotherMobile);
                parmanentAddr.setText(ParmanentAddr);
                presentAddress.setText(PresentAddr);
            
              
                
                test = 0;
                break;
            }

            if (test == 1) {
                JOptionPane.showMessageDialog(this, "Data Not Found");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchStudentActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
         java.sql.Date update= new java.sql.Date(StdudentBirthDate.getDate().getTime());
        
        

        if (jRadioMale.isSelected()) {
            Gender = "Male";
        } else if (jRadioFemale.isSelected()) {
           Gender = "Female";
        }
        
         try {

            String sqlQry = "UPDATE  student_information SET Stu_Name=?,Stu_RegNo=?,Stu_Session=?,Stu_semester=?,Gender=?,Blood_Grp=?,BirthDate=?,Religion=?,Mobile=?,Email=?,Providhan=?,Fathers_Name=?,FatherNID=?,Father_Occupaion=?,Father_mobile=?,Mothers_Name=?,MotherNID=?,Mother_Occupation=?,Mother_mobile=?,parmanent_Addr=?,present_Addr=? WHERE Stu_Roll=?";
            prepstmnt = con.prepareStatement(sqlQry);

          
            
            prepstmnt.setString(1, student_Name.getText());
            prepstmnt.setString(2, studentRegNO.getText());
            prepstmnt.setString(3, (String) combostudentSession.getSelectedItem());
            prepstmnt.setString(4, (String) comboStudentSemester.getSelectedItem());
            prepstmnt.setString(5, Gender);
            prepstmnt.setString(6, (String) ComboStudentBlood.getSelectedItem());
            prepstmnt.setDate(7, update);
            prepstmnt.setString(8,(String) CombostuReligion.getSelectedItem());
            prepstmnt.setString(9, StudentMobile.getText());
            prepstmnt.setString(10, studentEmail.getText());
            prepstmnt.setString(11, studentProvidhan.getText());
            prepstmnt.setString(12, FatherName.getText());
            prepstmnt.setString(13, FathersNID.getText());
            prepstmnt.setString(14, FatherOccupation.getText());
            prepstmnt.setString(15, FathersMobile.getText());
            prepstmnt.setString(16, MothersName.getText());
            prepstmnt.setString(17, MothersNID.getText());
            prepstmnt.setString(18, MothersOccupation.getText());
            prepstmnt.setString(19, mothersmobile.getText());
            prepstmnt.setString(20, parmanentAddr.getText());
            prepstmnt.setString(21, presentAddress.getText());
            prepstmnt.setString(22, student_Roll.getText());

            
            int i = prepstmnt.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Data Updated!");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
           Refresh();
    }//GEN-LAST:event_UpdateActionPerformed

    public void Refresh()
    {
        student_Name.setText("");
        student_Roll.setText("");
        studentRegNO.setText("");
        combostudentSession.setSelectedItem("Select");
        comboStudentSemester.setSelectedItem("Select");
        buttonGroup1.clearSelection();
        ComboStudentBlood.setSelectedItem("Select");
        StdudentBirthDate.setDate(now);
        CombostuReligion.setSelectedItem("Select");
        StudentMobile.setText("");
        studentEmail.setText("");
        studentProvidhan.setText("");
        FatherName.setText("");
        FathersNID.setText("");
        FatherOccupation.setText("");
        FathersMobile.setText("");
        MothersName.setText("");
        MothersNID.setText("");
        MothersOccupation.setText("");
        mothersmobile.setText("");
        parmanentAddr.setText("");
        presentAddress.setText("");
        SearchStudent.setText("");
        jComboBoxSession.setSelectedItem("Select");
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Refresh();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        
        Refresh();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        int msg = JOptionPane.YES_NO_OPTION;

        int result = JOptionPane.showConfirmDialog(null, "Are u Sure?", "Confirm ? ", msg);

        if (result == 0) {
            try {
                String sqlQry = "DELETE from  student_information where Stu_Roll=?";

                prepstmnt = con.prepareStatement(sqlQry);

                prepstmnt.setString(1, student_Roll.getText());

                int i = prepstmnt.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(this, "Deleted Sucessfully!");
                }
            } catch (SQLException | HeadlessException e) {

            }
            
        student_Name.setText("");
        student_Roll.setText("");
        studentRegNO.setText("");
        combostudentSession.setSelectedItem("Select");
        comboStudentSemester.setSelectedItem("Select");
        buttonGroup1.clearSelection();
        ComboStudentBlood.setSelectedItem("Select");
        StdudentBirthDate.setDate(now);
        CombostuReligion.setSelectedItem("Select");
        StudentMobile.setText("");
        studentEmail.setText("");
        studentProvidhan.setText("");
        FatherName.setText("");
        FathersNID.setText("");
        FatherOccupation.setText("");
        FathersMobile.setText("");
        MothersName.setText("");
        MothersNID.setText("");
        MothersOccupation.setText("");
        mothersmobile.setText("");
        parmanentAddr.setText("");
        presentAddress.setText("");
        SearchStudent.setText("");
        
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboStudentSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStudentSemesterActionPerformed
     /*   
       Object semester=comboStudentSemester.getSelectedItem();
       
       if(semester=="1st Semester")
       {
           java.sql.Date StuBirthDate= new java.sql.Date(StdudentBirthDate.getDate().getTime());
        
     
        try {

            String sqlQry = "INSERT into student_information(Stu_Name,Stu_Roll,Stu_RegNo,Stu_Session,Stu_semester,Gender,Blood_Grp,BirthDate,Religion,Mobile,Email,Providhan,Fathers_Name,FatherNID,Father_Occupaion,Father_mobile,Mothers_Name,MotherNID,Mother_Occupation,Mother_mobile,parmanent_Addr,present_Addr) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            prepstmnt = con.prepareStatement(sqlQry);

            prepstmnt.setString(1, student_Name.getText());
            prepstmnt.setString(2, student_Roll.getText());
            prepstmnt.setString(3, studentRegNO.getText());
            prepstmnt.setString(4, (String) combostudentSession.getSelectedItem());
            prepstmnt.setString(5, (String) comboStudentSemester.getSelectedItem());
            prepstmnt.setString(6, Gender);
            prepstmnt.setString(7, (String) ComboStudentBlood.getSelectedItem());
            prepstmnt.setDate(8, StuBirthDate);
            prepstmnt.setString(9,(String) CombostuReligion.getSelectedItem());
            prepstmnt.setString(10, StudentMobile.getText());
            prepstmnt.setString(11, studentEmail.getText());
            prepstmnt.setString(12, studentProvidhan.getText());
            prepstmnt.setString(13, FatherName.getText());
            prepstmnt.setString(14, FathersNID.getText());
            prepstmnt.setString(15, FatherOccupation.getText());
            prepstmnt.setString(16, FathersMobile.getText());
            prepstmnt.setString(17, MothersName.getText());
            prepstmnt.setString(18, MothersNID.getText());
            prepstmnt.setString(19, MothersOccupation.getText());
            prepstmnt.setString(20, mothersmobile.getText());
            prepstmnt.setString(21, parmanentAddr.getText());
            prepstmnt.setString(22, presentAddress.getText());
            
            
            int i = prepstmnt.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Data Saved!");
            }

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
                    
        }
           try{
                String sqlQry = "INSERT into  first_semester(Stu_Name,Stu_Roll,Stu_RegNo,Stu_Session,Stu_semester,Providhan) values (?,?,?,?,?,?)";

                prepstmnt = con.prepareStatement(sqlQry);
                prepstmnt.setString(1, student_Name.getText());
                prepstmnt.setString(2, student_Roll.getText());
                prepstmnt.setString(3, studentRegNO.getText());
                prepstmnt.setString(4, (String) combostudentSession.getSelectedItem());
                prepstmnt.setString(5, (String) comboStudentSemester.getSelectedItem());
                prepstmnt.setString(6, studentProvidhan.getText());
                
             
                        
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e);
                   
           }
       }
       */
    }//GEN-LAST:event_comboStudentSemesterActionPerformed

    private void txtimagepathKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimagepathKeyReleased
        int test = 1;
        try {

            //String SearchRoll = SearchStudent.getText();
            String sqlSrch = "SELECT * FROM  student_information WHERE Stu_Roll='"+SearchStudent.getText()+"' AND Stu_Session= '"+jComboBoxSession.getSelectedItem().toString()+"'";
            prepstmnt = con.prepareStatement(sqlSrch);
            res = prepstmnt.executeQuery();
            
            while (res.next()) {
                
                String name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String regno = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                
                String gndr = res.getString("Gender");
                
                if ("Male".equals(gndr)) {
                    jRadioMale.setSelected(true);
                    jRadioFemale.setSelected(false);
                } else {
                    jRadioMale.setSelected(false);
                    jRadioFemale.setSelected(true); 
                }
                String bldgrp = res.getString("Blood_Grp");
                Date dt=res.getDate("BirthDate");
                String religion = res.getString("Religion");
                String contactno = res.getString("Mobile");
                String email = res.getString("Email");
                String providhan = res.getString("Providhan");
                
                String FathersName = res.getString("Fathers_Name");
                String FatherNID = res.getString("FatherNID");
                String FatherOcc = res.getString("Father_Occupaion");
                String FatherMobile = res.getString("Father_mobile");
                
                String Mothername = res.getString("Mothers_Name");
                String MotherNID = res.getString("MotherNID");
                String MotherOCC = res.getString("Mother_Occupation");
                String MotherMobile = res.getString("Mother_mobile");
                
                String ParmanentAddr = res.getString("parmanent_Addr");
                String PresentAddr = res.getString("present_Addr");
               
                
                
                student_Name.setText(name);
                student_Roll.setText(roll);
                studentRegNO.setText(regno);
                combostudentSession.setSelectedItem(session);
                comboStudentSemester.setSelectedItem(semester);
               
                ComboStudentBlood.setSelectedItem(bldgrp);
                StdudentBirthDate.setDate(dt);
                CombostuReligion.setSelectedItem(religion);
                StudentMobile.setText(contactno);
                studentEmail.setText(email);
                studentProvidhan.setText(providhan);
                
                FatherName.setText(FathersName);
                FathersNID.setText(FatherNID);
                FatherOccupation.setText(FatherOcc);
                FathersMobile.setText(FatherMobile);
                
                MothersName.setText(Mothername);
                MothersNID.setText(MotherNID);
                MothersOccupation.setText(MotherOCC);
                mothersmobile.setText(MotherMobile);
                parmanentAddr.setText(ParmanentAddr);
                presentAddress.setText(PresentAddr);
            
              
                
                test = 0;
                break;
            }

            if (test == 1) {
                JOptionPane.showMessageDialog(this, "Data Not Found");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtimagepathKeyReleased

    
    
    
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
            
            String sqlSrch = "SELECT * FROM  student_information WHERE Stu_Roll='"+SearchStudent.getText()+"' AND Stu_Session= '"+jComboBoxSession.getSelectedItem().toString()+"'";
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
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        try {
            print_student_information();
        } catch (SQLException | BadElementException | IOException ex) {
            Logger.getLogger(Panel_StudentInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (Desktop.isDesktopSupported()) {
            try {
                File myfile = new File("Studentinformation.pdf");

                Desktop.getDesktop().open(myfile);
            } catch (IOException e17) {
                // JOptionPane.showMessageDialog(null, e17.toString());
            }
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            print_student_information();
        } catch (SQLException | BadElementException | IOException ex) {
            Logger.getLogger(Panel_StudentInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (Desktop.isDesktopSupported()) {
            try {
                File myfile = new File("Studentinformation.pdf");

                Desktop.getDesktop().open(myfile);
            } catch (IOException e17) {
                // JOptionPane.showMessageDialog(null, e17.toString());
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboStudentBlood;
    private javax.swing.JComboBox CombostuReligion;
    private javax.swing.JTextField FatherName;
    private javax.swing.JTextField FatherOccupation;
    private javax.swing.JTextField FathersMobile;
    private javax.swing.JTextField FathersNID;
    private javax.swing.JTextField MothersNID;
    private javax.swing.JTextField MothersName;
    private javax.swing.JTextField MothersOccupation;
    private javax.swing.JTextField SearchStudent;
    private com.toedter.calendar.JDateChooser StdudentBirthDate;
    private javax.swing.JTextField StudentMobile;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboStudentSemester;
    private javax.swing.JComboBox combostudentSession;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBoxSession;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JRadioButton jRadioFemale;
    private javax.swing.JRadioButton jRadioMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelimage;
    private javax.swing.JTextField mothersmobile;
    private javax.swing.JTextArea parmanentAddr;
    private javax.swing.JTextArea presentAddress;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JTextField studentProvidhan;
    private javax.swing.JTextField studentRegNO;
    private javax.swing.JTextField student_Name;
    private javax.swing.JTextField student_Roll;
    private javax.swing.JTextField txtimagepath;
    // End of variables declaration//GEN-END:variables
}
