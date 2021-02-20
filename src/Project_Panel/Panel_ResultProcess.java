

package Project_Panel;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Panel_ResultProcess extends javax.swing.JPanel {

    
    public Panel_ResultProcess() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel43 = new javax.swing.JPanel();
        ComboSemester = new javax.swing.JComboBox();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        subject2name = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        subject3Name = new javax.swing.JLabel();
        subject4Name = new javax.swing.JLabel();
        subject5name = new javax.swing.JLabel();
        sub7Name = new javax.swing.JLabel();
        subject6Name = new javax.swing.JLabel();
        sub8Name = new javax.swing.JLabel();
        labelSubjectName = new javax.swing.JLabel();
        txt_SubjectCode1 = new javax.swing.JTextField();
        Subject2Code = new javax.swing.JTextField();
        subject3Code = new javax.swing.JTextField();
        subject4code = new javax.swing.JTextField();
        Subject5Code = new javax.swing.JTextField();
        subject6Code = new javax.swing.JTextField();
        sub7Code = new javax.swing.JTextField();
        sub8Code = new javax.swing.JTextField();
        subjectCredit1 = new javax.swing.JTextField();
        txtCreditSub2 = new javax.swing.JTextField();
        Subject3Credit = new javax.swing.JTextField();
        sub4credit = new javax.swing.JTextField();
        subject5Credit = new javax.swing.JTextField();
        sub6Credit = new javax.swing.JTextField();
        sub7Credit = new javax.swing.JTextField();
        sub8Credit = new javax.swing.JTextField();
        txtGpa1 = new javax.swing.JTextField();
        txtGpa2 = new javax.swing.JTextField();
        txtgpa3 = new javax.swing.JTextField();
        txtgpa4 = new javax.swing.JTextField();
        txtgpa5 = new javax.swing.JTextField();
        txtgpa6 = new javax.swing.JTextField();
        txtgpa7 = new javax.swing.JTextField();
        CGPA = new javax.swing.JTextField();
        txtgpa8 = new javax.swing.JTextField();

        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ComboSemester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ComboSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester" }));
        ComboSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSemesterActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel144.setText("Select Semester :");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel145.setText("Subject Name");

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel146.setText("Subject Code");

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel147.setText("Subject Credit");

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel148.setText("GPA");

        subject2name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject2name.setText("Subject 2");

        jLabel150.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel150.setText("CGPA");

        subject3Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject3Name.setText("Subject 3");

        subject4Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject4Name.setText("Subject 4");

        subject5name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject5name.setText("Subject 5");

        sub7Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sub7Name.setText("Subject 7");

        subject6Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject6Name.setText("Subject 6");

        sub8Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sub8Name.setText("Subject 8");

        labelSubjectName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSubjectName.setText("Subject 1");

        txt_SubjectCode1.setEditable(false);
        txt_SubjectCode1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Subject2Code.setEditable(false);
        Subject2Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        subject3Code.setEditable(false);
        subject3Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        subject4code.setEditable(false);
        subject4code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Subject5Code.setEditable(false);
        Subject5Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        subject6Code.setEditable(false);
        subject6Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sub7Code.setEditable(false);
        sub7Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sub8Code.setEditable(false);
        sub8Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        subjectCredit1.setEditable(false);
        subjectCredit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCreditSub2.setEditable(false);
        txtCreditSub2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Subject3Credit.setEditable(false);
        Subject3Credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sub4credit.setEditable(false);
        sub4credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        subject5Credit.setEditable(false);
        subject5Credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sub6Credit.setEditable(false);
        sub6Credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sub7Credit.setEditable(false);
        sub7Credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        sub8Credit.setEditable(false);
        sub8Credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtGpa1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGpa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGpa1KeyReleased(evt);
            }
        });

        txtGpa2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGpa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGpa2KeyReleased(evt);
            }
        });

        txtgpa3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtgpa3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgpa3KeyReleased(evt);
            }
        });

        txtgpa4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtgpa5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtgpa6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtgpa7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtgpa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgpa7ActionPerformed(evt);
            }
        });

        CGPA.setEditable(false);
        CGPA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtgpa8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtgpa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgpa8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel144)
                        .addGap(18, 18, 18)
                        .addComponent(ComboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subject4Name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subject4code, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(sub4credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(txtgpa4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(CGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(subject5name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Subject5Code, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(subject5Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(txtgpa5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(subject6Name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subject6Code, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(sub6Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(txtgpa6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subject2name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(labelSubjectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(Subject2Code, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(txtCreditSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(txtGpa2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(txt_SubjectCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subjectCredit1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(txtGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(sub7Name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sub7Code, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(sub7Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(sub8Name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sub8Code, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(sub8Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgpa8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgpa7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subject3Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(subject3Code, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Subject3Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(txtgpa3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel43Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelSubjectName, sub7Name, sub8Name, subject2name, subject3Name, subject4Name, subject5name, subject6Name});

        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel144))
                    .addComponent(ComboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectCredit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SubjectCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subject2name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Subject2Code, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCreditSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGpa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(CGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Subject3Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgpa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(subject3Code, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subject3Name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subject4Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subject4code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sub4credit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtgpa4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subject5name, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(Subject5Code)
                            .addComponent(subject5Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgpa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subject6Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel43Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(txtgpa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(sub6Credit, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(subject6Code)))
                .addGap(19, 19, 19)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sub7Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sub7Code, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel43Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(txtgpa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(sub7Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sub8Name, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(sub8Code)
                    .addComponent(sub8Credit)
                    .addComponent(txtgpa8))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel43Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelSubjectName, sub7Name, sub8Name, subject2name, subject3Name, subject5name, subject6Name});

        jPanel43Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Subject2Code, Subject3Credit, Subject5Code, sub4credit, sub6Credit, sub7Code, sub7Credit, sub8Code, sub8Credit, subject3Code, subject4code, subject5Credit, subject6Code, txtgpa3, txtgpa4, txtgpa5, txtgpa6, txtgpa7});

        jPanel43Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {subjectCredit1, txtGpa1, txtGpa2, txt_SubjectCode1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(182, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(64, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSemesterActionPerformed
        
        Object sem = ComboSemester.getSelectedItem();
        if(sem == "1st Semester")
        {
            labelSubjectName.setText("Engineering Drawing");
            txt_SubjectCode1.setText("1011");
            subjectCredit1.setText("2");
            
            subject2name.setText("English-1");
            Subject2Code.setText("5712");
            txtCreditSub2.setText("2");
            
            subject3Name.setText("Mathematics");
            subject3Code.setText("5911");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Chemistry");
            subject4code.setText("5913");
            sub4credit.setText("4");
            
            subject5name.setText("Computer Fundamental");
            Subject5Code.setText("6611");
            subject5Credit.setText("3");
            
            subject6Name.setText("Basic Electricity");
            subject6Code.setText("6711");
            sub6Credit.setText("4");
            
            sub7Name.setText("Basic Electronics");
            sub7Code.setText("6811");
            sub7Credit.setText("3");
            
            
           /* sub8Name.setText("Chemistry");
            sub8Code.setText("5987");
            sub8Credit.setText("4");
            
            */
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
        }
        
        else  if(sem=="2nd Semester")
                {
                     
            labelSubjectName.setText("English-2");
            txt_SubjectCode1.setText("5722");
            subjectCredit1.setText("3");
            
            subject2name.setText("Physical Education");
            Subject2Code.setText("5812");
            txtCreditSub2.setText("1");
            
            subject3Name.setText("Physics-1");
            subject3Code.setText("5912");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Mathematics-2");
            subject4code.setText("5921");
            sub4credit.setText("4");
            
            subject5name.setText("Computer Application-1");
            Subject5Code.setText("6621");
            subject5Credit.setText("2");
            
            subject6Name.setText("Bangla");
            subject6Code.setText("5711");
            sub6Credit.setText("3");
            
            sub7Name.setText("Electronic Device & Circuits-1");
            sub7Code.setText("6821");
            sub7Credit.setText("4");
            
            
           sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
           // Break();
           
             
            
                }
        
       
        
         else if (sem == "3rd Semester")
                    
         
                      {
                     
            labelSubjectName.setText("Programming Language-1");
            txt_SubjectCode1.setText("6622");
            subjectCredit1.setText("3");
            
            subject2name.setText("Computer Apps-2");
            Subject2Code.setText("6632");
            txtCreditSub2.setText("2");
            
            subject3Name.setText("Digital Electronics-1");
            subject3Code.setText("6841");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Industrial Electronics");
            subject4code.setText("6832");
            sub4credit.setText("3");
            
            subject5name.setText("Mathematics-3");
            Subject5Code.setText("5931");
            subject5Credit.setText("4");
            
            subject6Name.setText("Physics-2");
            subject6Code.setText("5922");
            sub6Credit.setText("4");
            
            sub7Name.setText("Social Science-1");
            sub7Code.setText("5811");
            sub7Credit.setText("2");
            
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
           /*sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
            
           */
                }
        
         else if (sem == "4th Semester")
                    
         
                      {
                     
            labelSubjectName.setText("Programming Language-2");
            txt_SubjectCode1.setText("6642");
            subjectCredit1.setText("4");
            
            subject2name.setText("CAD & Graphic Design");
            Subject2Code.setText("6645");
            txtCreditSub2.setText("2");
            
            subject3Name.setText("Digital Electronics-2");
            subject3Code.setText("6844");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Data Structure & Algorithm");
            subject4code.setText("6631");
            sub4credit.setText("3");
            
            subject5name.setText("Electrical Circuits & Machines");
            Subject5Code.setText("6745");
            subject5Credit.setText("3");
            
            subject6Name.setText("Discrete Mathematics");
            subject6Code.setText("5942");
            sub6Credit.setText("2");
            
            sub7Name.setText("Social Science-11");
            sub7Code.setText("5821");
            sub7Credit.setText("2");
            
            
           /*sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
            
           */
            
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
                }
        
        
              else if (sem == "5th Semester")
                    
         
                      {
                     
            labelSubjectName.setText("Microprocessor & Microcomputer-1");
            txt_SubjectCode1.setText("6651");
            subjectCredit1.setText("4");
            
            subject2name.setText("Computer Architecture");
            Subject2Code.setText("6652");
            txtCreditSub2.setText("4");
            
            subject3Name.setText("Programming Language-3");
            subject3Code.setText("6653");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Database Management System");
            subject4code.setText("6654");
            sub4credit.setText("4");
            
            subject5name.setText("Web Design");
            Subject5Code.setText("8551");
            subject5Credit.setText("2");
            
            subject6Name.setText("Book Keeping & Accounting");
            subject6Code.setText("5851");
            sub6Credit.setText("2");
            
            sub7Name.setText("Environmental Management");
            sub7Code.setText("5840");
            sub7Credit.setText("2");
            
            
           /*sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
            
           */
            
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
                }
        
              
              else if (sem == "6th Semester")
                    
         
                      {
                     
            labelSubjectName.setText("Microprocessor and Microcomputer-2");
            txt_SubjectCode1.setText("6661");
            subjectCredit1.setText("4");
            
            subject2name.setText("Computer Peripherals");
            Subject2Code.setText("6662");
            txtCreditSub2.setText("4");
            
            subject3Name.setText("Data Communication and Computer Network-1");
            subject3Code.setText("6663");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Computer System Software");
            subject4code.setText("6664");
            sub4credit.setText("3");
            
            subject5name.setText("Computer Servicing");
            Subject5Code.setText("6665");
            subject5Credit.setText("2");
            
            subject6Name.setText("Web Development");
            subject6Code.setText("8563");
            sub6Credit.setText("2");
            
            sub7Name.setText("Business organization & Communication");
            sub7Code.setText("5841");
            sub7Credit.setText("2");
            
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
           /*sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
            
           */
                }
        
        
         else if (sem == "7th Semester")
                    
         
                      {
                     
            labelSubjectName.setText("Embedded Systems & PLC");
            txt_SubjectCode1.setText("6671");
            subjectCredit1.setText("4");
            
            subject2name.setText("Multimedia and Graphics");
            Subject2Code.setText("8572");
            txtCreditSub2.setText("4");
            
            subject3Name.setText("System Analysis and Design");
            subject3Code.setText("6672");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Data Communication and Network-2");
            subject4code.setText("6673");
            sub4credit.setText("4");
            
            subject5name.setText("Computer Engineering Project");
            Subject5Code.setText("6674");
            subject5Credit.setText("2");
            
            subject6Name.setText("Industrial Management");
            subject6Code.setText("5852");
            sub6Credit.setText("2");
            
            sub7Name.setText("Entrepreneurship");
            sub7Code.setText("5853");
            sub7Credit.setText("2");
            
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
           /*sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
            
           */
                }
        
        
        
        
         else
                    
         
                      {
                     
            labelSubjectName.setText("Embedded Systems & PLC");
            txt_SubjectCode1.setText("6671");
            subjectCredit1.setText("4");
            
            subject2name.setText("Multimedia and Graphics");
            Subject2Code.setText("8572");
            txtCreditSub2.setText("4");
            
            subject3Name.setText("System Analysis and Design");
            subject3Code.setText("6672");
            Subject3Credit.setText("4");
            
            subject4Name.setText("Data Communication and Network-2");
            subject4code.setText("6673");
            sub4credit.setText("4");
            
            subject5name.setText("Computer Engineering Project");
            Subject5Code.setText("6674");
            subject5Credit.setText("2");
            
            subject6Name.setText("Industrial Management");
            subject6Code.setText("5852");
            sub6Credit.setText("2");
            
            sub7Name.setText("Entrepreneurship");
            sub7Code.setText("5853");
            sub7Credit.setText("2");
            
            
            sub8Name.setText("");
            sub8Code.setText("");
            sub8Credit.setText("");
            
            
           /*sub8Name.setText("Basic Workshop Practice");
            sub8Code.setText("7011");
            sub8Credit.setText("2");
            
           */
                }
        
        
        
    }//GEN-LAST:event_ComboSemesterActionPerformed

    private void txtgpa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgpa8ActionPerformed
        // 
        
        
        Double d1,d2,d3,d4,d5,d6,d7,d8,f1,f2,f3,f4,f5,f6,f7,f8;
        
        
        d1= Double.parseDouble(subjectCredit1.getText());
        d2=Double.parseDouble(txtCreditSub2.getText());
        d3=Double.parseDouble(Subject3Credit.getText());
        d4=Double.parseDouble(sub4credit.getText());
        d5=Double.parseDouble(subject5Credit.getText());
        d6=Double.parseDouble(sub6Credit.getText());
        d7=Double.parseDouble(sub7Credit.getText());
        d8=Double.parseDouble(sub8Credit.getText());
        f1=Double.parseDouble(txtGpa1.getText());
        f2=Double.parseDouble(txtGpa2.getText());
        f3=Double.parseDouble(txtgpa3.getText());
        f4= Double.parseDouble(txtgpa4.getText());
        f5=Double.parseDouble(txtgpa5.getText());
        f6=Double.parseDouble(txtgpa6.getText());
        f7=Double.parseDouble(txtgpa7.getText());
        f8=Double.parseDouble(txtgpa8.getText());
        
        
        
        
       try{
               DecimalFormat f=new DecimalFormat("##.00");
           double TotalCredit=((d1*f1)+(d2*f2)+(d3*f3)+(d4*f4)+(d5*f5)+
                              (d6*f6)+(d7*f7)+(d8*f8))/23;
      //String Total=Double.toString(TotalCredit);
       //CGPA.setText(Total);
    CGPA.setText(String.valueOf(f.format(TotalCredit)));
      
      }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, e);
      }
           
        

        
        
        
    }//GEN-LAST:event_txtgpa8ActionPerformed

    private void txtgpa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgpa7ActionPerformed
        // ////
        Object sem= ComboSemester.getSelectedItem();
       
       if(sem=="1st Semester")
       {
        
        Double d1,d2,d3,d4,d5,d6,d7,f1,f2,f3,f4,f5,f6,f7;
        
        
        d1= Double.parseDouble(subjectCredit1.getText());
        d2=Double.parseDouble(txtCreditSub2.getText());
        d3=Double.parseDouble(Subject3Credit.getText());
        d4=Double.parseDouble(sub4credit.getText());
        d5=Double.parseDouble(subject5Credit.getText());
        d6=Double.parseDouble(sub6Credit.getText());
        d7=Double.parseDouble(sub7Credit.getText());
        f1=Double.parseDouble(txtGpa1.getText());
        f2=Double.parseDouble(txtGpa2.getText());
        f3=Double.parseDouble(txtgpa3.getText());
        f4= Double.parseDouble(txtgpa4.getText());
        f5=Double.parseDouble(txtgpa5.getText());
        f6=Double.parseDouble(txtgpa6.getText());
        f7=Double.parseDouble(txtgpa7.getText());
        
        
        
        
       try{
               DecimalFormat f=new DecimalFormat("##.00");
           double TotalCredit=((d1*f1)+(d2*f2)+(d3*f3)+(d4*f4)+(d5*f5)+
                              (d6*f6)+(d7*f7))/22;
      //String Total=Double.toString(TotalCredit);
       //CGPA.setText(Total);
    CGPA.setText(String.valueOf(f.format(TotalCredit)));
      
      }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, e);
      }
           
      
       }
       
     
      else  if(sem=="3rd Semester")
       {
       Double d1,d2,d3,d4,d5,d6,d7,f1,f2,f3,f4,f5,f6,f7;
        
        
        d1= Double.parseDouble(subjectCredit1.getText());
        d2=Double.parseDouble(txtCreditSub2.getText());
        d3=Double.parseDouble(Subject3Credit.getText());
        d4=Double.parseDouble(sub4credit.getText());
        d5=Double.parseDouble(subject5Credit.getText());
        d6=Double.parseDouble(sub6Credit.getText());
        d7=Double.parseDouble(sub7Credit.getText());
        f1=Double.parseDouble(txtGpa1.getText());
        f2=Double.parseDouble(txtGpa2.getText());
        f3=Double.parseDouble(txtgpa3.getText());
        f4= Double.parseDouble(txtgpa4.getText());
        f5=Double.parseDouble(txtgpa5.getText());
        f6=Double.parseDouble(txtgpa6.getText());
        f7=Double.parseDouble(txtgpa7.getText());
        
        
        
        
       try{
               DecimalFormat f=new DecimalFormat("##.00");
           double TotalCredit=((d1*f1)+(d2*f2)+(d3*f3)+(d4*f4)+(d5*f5)+
                              (d6*f6)+(d7*f7))/22;
      //String Total=Double.toString(TotalCredit);
       //CGPA.setText(Total);
    CGPA.setText(String.valueOf(f.format(TotalCredit)));
      
      }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, e);
      }
           
       }
        else  if(sem=="4th Semester")
       {
        Double d1,d2,d3,d4,d5,d6,d7,f1,f2,f3,f4,f5,f6,f7;
        
        
        d1= Double.parseDouble(subjectCredit1.getText());
        d2=Double.parseDouble(txtCreditSub2.getText());
        d3=Double.parseDouble(Subject3Credit.getText());
        d4=Double.parseDouble(sub4credit.getText());
        d5=Double.parseDouble(subject5Credit.getText());
        d6=Double.parseDouble(sub6Credit.getText());
        d7=Double.parseDouble(sub7Credit.getText());
        f1=Double.parseDouble(txtGpa1.getText());
        f2=Double.parseDouble(txtGpa2.getText());
        f3=Double.parseDouble(txtgpa3.getText());
        f4= Double.parseDouble(txtgpa4.getText());
        f5=Double.parseDouble(txtgpa5.getText());
        f6=Double.parseDouble(txtgpa6.getText());
        f7=Double.parseDouble(txtgpa7.getText());
        
        
        
        
       try{
               DecimalFormat f=new DecimalFormat("##.00");
           double TotalCredit=((d1*f1)+(d2*f2)+(d3*f3)+(d4*f4)+(d5*f5)+
                              (d6*f6)+(d7*f7))/20;
      //String Total=Double.toString(TotalCredit);
       //CGPA.setText(Total);
    CGPA.setText(String.valueOf(f.format(TotalCredit)));
      
      }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, e);
      }
           
       }
       
        else  if(sem=="5th Semester")
       {
        float TotalCredit=(((Float.parseFloat(subjectCredit1.getText())*Float.parseFloat(txtGpa1.getText()))+
            (Float.parseFloat(txtCreditSub2.getText())*
                Float.parseFloat(txtGpa2.getText()))+(Float.parseFloat(Subject3Credit.getText())*
                Float.parseFloat(txtgpa3.getText()))+(Float.parseFloat(sub4credit.getText())*
                Float.parseFloat(txtgpa4.getText()))+(Float.parseFloat(subject5Credit.getText())*
                Float.parseFloat(txtgpa5.getText()))+(Float.parseFloat(sub6Credit.getText())*
                Float.parseFloat(txtgpa6.getText()))+(Float.parseFloat(sub7Credit.getText())*
                Float.parseFloat(txtgpa7.getText())))/22);
        
         String Total1=Float.toString(TotalCredit);
    CGPA.setText(Total1);
       }
       
        else  if(sem=="6th Semester")
       {
       Double d1,d2,d3,d4,d5,d6,d7,f1,f2,f3,f4,f5,f6,f7;
        
        
        d1= Double.parseDouble(subjectCredit1.getText());
        d2=Double.parseDouble(txtCreditSub2.getText());
        d3=Double.parseDouble(Subject3Credit.getText());
        d4=Double.parseDouble(sub4credit.getText());
        d5=Double.parseDouble(subject5Credit.getText());
        d6=Double.parseDouble(sub6Credit.getText());
        d7=Double.parseDouble(sub7Credit.getText());
        f1=Double.parseDouble(txtGpa1.getText());
        f2=Double.parseDouble(txtGpa2.getText());
        f3=Double.parseDouble(txtgpa3.getText());
        f4= Double.parseDouble(txtgpa4.getText());
        f5=Double.parseDouble(txtgpa5.getText());
        f6=Double.parseDouble(txtgpa6.getText());
        f7=Double.parseDouble(txtgpa7.getText());
        
        
        
        
       try{
               DecimalFormat f=new DecimalFormat("##.00");
           double TotalCredit=((d1*f1)+(d2*f2)+(d3*f3)+(d4*f4)+(d5*f5)+
                              (d6*f6)+(d7*f7))/21;
      //String Total=Double.toString(TotalCredit);
       //CGPA.setText(Total);
    CGPA.setText(String.valueOf(f.format(TotalCredit)));
      
      }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, e);
      }
           
       }
        else if(sem=="7th Semester")
       {
         Double d1,d2,d3,d4,d5,d6,d7,f1,f2,f3,f4,f5,f6,f7;
        
        
        d1= Double.parseDouble(subjectCredit1.getText());
        d2=Double.parseDouble(txtCreditSub2.getText());
        d3=Double.parseDouble(Subject3Credit.getText());
        d4=Double.parseDouble(sub4credit.getText());
        d5=Double.parseDouble(subject5Credit.getText());
        d6=Double.parseDouble(sub6Credit.getText());
        d7=Double.parseDouble(sub7Credit.getText());
        f1=Double.parseDouble(txtGpa1.getText());
        f2=Double.parseDouble(txtGpa2.getText());
        f3=Double.parseDouble(txtgpa3.getText());
        f4= Double.parseDouble(txtgpa4.getText());
        f5=Double.parseDouble(txtgpa5.getText());
        f6=Double.parseDouble(txtgpa6.getText());
        f7=Double.parseDouble(txtgpa7.getText());
        
        
        
        
       try{
               DecimalFormat f=new DecimalFormat("##.00");
           double TotalCredit=((d1*f1)+(d2*f2)+(d3*f3)+(d4*f4)+(d5*f5)+
                              (d6*f6)+(d7*f7))/22;
      //String Total=Double.toString(TotalCredit);
       //CGPA.setText(Total);
    CGPA.setText(String.valueOf(f.format(TotalCredit)));
      
      }catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, e);
      }
           
       }
    }//GEN-LAST:event_txtgpa7ActionPerformed

    private void txtGpa1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGpa1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtGpa1KeyReleased

    private void txtGpa2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGpa2KeyReleased
       
    }//GEN-LAST:event_txtGpa2KeyReleased

    private void txtgpa3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgpa3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgpa3KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CGPA;
    private javax.swing.JComboBox ComboSemester;
    private javax.swing.JTextField Subject2Code;
    private javax.swing.JTextField Subject3Credit;
    private javax.swing.JTextField Subject5Code;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JLabel labelSubjectName;
    private javax.swing.JTextField sub4credit;
    private javax.swing.JTextField sub6Credit;
    private javax.swing.JTextField sub7Code;
    private javax.swing.JTextField sub7Credit;
    private javax.swing.JLabel sub7Name;
    private javax.swing.JTextField sub8Code;
    private javax.swing.JTextField sub8Credit;
    private javax.swing.JLabel sub8Name;
    private javax.swing.JLabel subject2name;
    private javax.swing.JTextField subject3Code;
    private javax.swing.JLabel subject3Name;
    private javax.swing.JLabel subject4Name;
    private javax.swing.JTextField subject4code;
    private javax.swing.JTextField subject5Credit;
    private javax.swing.JLabel subject5name;
    private javax.swing.JTextField subject6Code;
    private javax.swing.JLabel subject6Name;
    private javax.swing.JTextField subjectCredit1;
    private javax.swing.JTextField txtCreditSub2;
    private javax.swing.JTextField txtGpa1;
    private javax.swing.JTextField txtGpa2;
    private javax.swing.JTextField txt_SubjectCode1;
    private javax.swing.JTextField txtgpa3;
    private javax.swing.JTextField txtgpa4;
    private javax.swing.JTextField txtgpa5;
    private javax.swing.JTextField txtgpa6;
    private javax.swing.JTextField txtgpa7;
    private javax.swing.JTextField txtgpa8;
    // End of variables declaration//GEN-END:variables
}
