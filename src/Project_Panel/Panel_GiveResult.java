
package Project_Panel;

import DatabaseConnection.DBConnectioncode;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Panel_GiveResult extends javax.swing.JPanel {

  
    //Variaable for Database Connection
    
    Connection con;
    PreparedStatement prepstmnt = null;
    ResultSet res = null;
    
    
    public Panel_GiveResult() {
        initComponents();
        
         try {
            con = DBConnectioncode.DBConnectioncode();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Panel_GiveResult.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         try{
            String sqlSrch = "Select distinct(session) AS Session from Session ORDER BY session ASC";
            prepstmnt=con.prepareStatement(sqlSrch);
            res=prepstmnt.executeQuery();
            while(res.next())
            {
               
                String ses=res.getString("session");
               jComboSession.addItem(ses);
              
            }
           
        }catch(SQLException e)
        {
        } 
    }
    
    public void TableRefresh()
    {
        try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                int row=jTableResult.getRowCount();
                for(int i=row-1;i>=0;i--)
                {
                    tb.removeRow(i);
                }
                
                jCheckBox1.setSelected(false);
       
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void ShowTable()
     {
         try{
            
            DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
            String sqlSearch = "SELECT * FROM student_information ORDER BY Stu_Roll ASC";
            
            
            prepstmnt = con.prepareStatement(sqlSearch);
            
            
            res = prepstmnt.executeQuery();
            
            while(res.next())
            {
                String Name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String reg = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
               
                tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});
                
                
            }
         }catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
    
     public void Refresh()
     {
         jComboResult.setSelectedItem("Select");
         txtName.setText("");
         txtRoll.setText("");
         txtReg.setText("");
         jComboSession.setSelectedItem("Select");
         jComboSemester.setSelectedItem("Select");
         txtCGPA.setText("");
         
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jComboResult = new javax.swing.JComboBox();
        jPanel87 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtRoll = new javax.swing.JTextField();
        txtReg = new javax.swing.JTextField();
        jComboSemester = new javax.swing.JComboBox();
        jComboSession = new javax.swing.JComboBox();
        jLabel75 = new javax.swing.JLabel();
        txtCGPA = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jPanel90 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxselectsemesterresult = new javax.swing.JComboBox<>();
        jComboBoxPromotion = new javax.swing.JComboBox<>();
        jComboBoxDrop = new javax.swing.JComboBox<>();

        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel159.setText("Select Semester :");

        jComboResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboResult.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" }));
        jComboResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboResult, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        jPanel87.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Name :");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setText("Roll :");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel66.setText("Reg. No :");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setText("Session :");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel74.setText("CGPA :");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtRoll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jComboSemester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" }));

        jComboSession.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboSession.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel75.setText("Semester :");

        txtCGPA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jComboSession, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel87Layout.createSequentialGroup()
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jComboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/view.gif"))); // NOI18N
        jButton45.setText("Preview");
        jButton45.setEnabled(false);

        jButton46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/save2.png"))); // NOI18N
        jButton46.setText("Save");
        jButton46.setEnabled(false);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Trash-can16.png"))); // NOI18N
        jButton96.setText("Delete");
        jButton96.setEnabled(false);
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Print.png"))); // NOI18N
        jButton97.setText("Print");
        jButton97.setEnabled(false);

        jButton98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Update.png"))); // NOI18N
        jButton98.setText("Update");
        jButton98.setEnabled(false);
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        jButton99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/refresh.png"))); // NOI18N
        jButton99.setText("Refresh");
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton45)
                .addGap(26, 26, 26)
                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton99)
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton96)
                .addGap(18, 18, 18)
                .addComponent(jButton98)
                .addGap(22, 22, 22))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  Select", "   Name", "   Roll ", "   Reg. No", "   Session ", "   Semester  ", "   Enter  CGPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableResultMouseClicked(evt);
            }
        });
        jTableResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableResultKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(jTableResult);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Select All");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/save2.png"))); // NOI18N
        jLabel28.setText("Selected Student");

        jComboBoxselectsemesterresult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxselectsemesterresult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Save Result To", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" }));
        jComboBoxselectsemesterresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxselectsemesterresultActionPerformed(evt);
            }
        });

        jComboBoxPromotion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxPromotion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promotion To", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester", "Passed From Institute" }));
        jComboBoxPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPromotionActionPerformed(evt);
            }
        });

        jComboBoxDrop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drop Out To", "1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" }));
        jComboBoxDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxselectsemesterresult, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxselectsemesterresult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxPromotion)
                    .addComponent(jComboBoxDrop))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboResultActionPerformed
       
        Object Result = jComboResult.getSelectedItem();
        
        if("1st Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
        
        if("2nd Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
        
        if("3rd Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
        
        if("4th Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        if("5th Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
        if("6th Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
        if("7th Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
        if("8th Semester"==Result)
        {
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            TableRefresh();
            try{
                DefaultTableModel tb = (DefaultTableModel)jTableResult.getModel();
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,""});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
               
        }
        
        
    }//GEN-LAST:event_jComboResultActionPerformed

    private void jTableResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableResultMouseClicked
       
        
        try{
           
            int row = jTableResult.getSelectedRow();
            String Table_Click = (jTableResult.getModel().getValueAt(row, 1).toString());
            String sqlSearch = "SELECT * FROM student_information WHERE Stu_Name ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
          
            while(res.next())
            {
                String Name = res.getString("Stu_Name");
                String roll = res.getString("Stu_Roll");
                String reg = res.getString("Stu_RegNo");
                String session = res.getString("Stu_Session");
                String semester = res.getString("Stu_semester");
                
                
                txtName.setText(Name);
                txtRoll.setText(roll);
                txtReg.setText(reg);
                jComboSession.setSelectedItem(session);
                jComboSemester.setSelectedItem(semester);
                
               
            }
           
           
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
        
         
    }//GEN-LAST:event_jTableResultMouseClicked

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
       
        
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
       Refresh();
       TableRefresh();
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
       
        
        
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        
        
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jTableResultKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableResultKeyReleased
        
    }//GEN-LAST:event_jTableResultKeyReleased

    private void jComboBoxselectsemesterresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxselectsemesterresultActionPerformed
        DefaultTableModel tb = (DefaultTableModel) jTableResult.getModel();
        
        Object ViewResult = jComboBoxselectsemesterresult.getSelectedItem();
        
       
        if("1st Semester"==ViewResult)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from first_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO first_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }
        
        
        ///To Save Result into second semeter 
        
        if("2nd Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from second_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO second_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }
        
        
        
        if("3rd Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from third_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO third_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }
        
        
        
        if("4th Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from fourth_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO fourth_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }
 
        
        if("5th Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from fifth_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO fifth_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }
        
        
        if("6th Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from sixth_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO sixth_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }

        
        if("7th Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from seventh_semster_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO seventh_semster_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }

        
        if("8th Semester"==ViewResult)
        {
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from eighth_semester_result where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO eighth_semester_result(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Saved!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         
        }

        

    }//GEN-LAST:event_jComboBoxselectsemesterresultActionPerformed

    private void jComboBoxPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPromotionActionPerformed
        DefaultTableModel tb = (DefaultTableModel) jTableResult.getModel();
        Object Promote = jComboBoxPromotion.getSelectedItem();
        
        if(Promote=="2nd Semester")
        {
            try{
                
                String value = "2nd Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            TableRefresh();
            
            try{
                String Result ="1st Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        
        if(Promote=="3rd Semester")
        {
            try{
                
                String value = "3rd Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="2nd Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        if(Promote=="4th Semester")
        {
            try{
                
                String value = "4th Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="3rd Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        if(Promote=="5th Semester")
        {
            try{
                
                String value = "5th Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="4th Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        if(Promote=="6th Semester")
        {
            try{
                
                String value = "6th Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="5th Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        if(Promote=="7th Semester")
        {
            try{
                
                String value = "7th Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="6th Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        if(Promote=="8th Semester")
        {
            try{
                
                String value = "8th Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="7th Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        if(Promote=="Passed From Institute")
        {
            try{
                
                String value = "EX- Semester";
                for (int i = 0; i < tb.getRowCount(); i++){
                    if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                    
                String Update = "UPDATE  student_information SET Stu_semester='"+value+"' WHERE Stu_Roll='"+tb.getValueAt(i, 2).toString()+"'";
                PreparedStatement prepStmtd = con.prepareStatement(Update);
           
             
         prepStmtd.execute();
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Successfully Promoted");
                
            }catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            TableRefresh();
            
            try{
                String Result ="8th Semester";
                String sqlSrch = "SELECT * FROM  student_information WHERE Stu_semester='"+Result+"'";
            
                     prepstmnt = con.prepareStatement(sqlSrch);
                     res = prepstmnt.executeQuery();
            
                    while(res.next())
                    {
                        String Name = res.getString("Stu_Name");
                        String roll = res.getString("Stu_Roll");
                        String reg = res.getString("Stu_RegNo");
                        String session = res.getString("Stu_Session");
                        String semester = res.getString("Stu_semester");

                        tb.addRow(new Object[]{false,Name,roll,reg,session,semester,"0.00"});

                    }
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jComboBoxPromotionActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        DefaultTableModel tbmodel = (DefaultTableModel) jTableResult.getModel();
        if(jCheckBox1.isSelected()==true)
        {
            try{
                for (int i = 0; i < tbmodel.getRowCount(); i++) {
                
           jTableResult.getModel().setValueAt(true, i, 0);
                }}catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        
        if(jCheckBox1.isSelected()==false)
        {
            try{
                for (int i = 0; i < tbmodel.getRowCount(); i++) {
                
           jTableResult.getModel().setValueAt(false, i, 0);
                }}catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBoxDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDropActionPerformed
        DefaultTableModel tb = (DefaultTableModel) jTableResult.getModel();
        Object Drop = jComboBoxDrop.getSelectedItem();
        
        if("1st Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from first_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO first_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        
        if("2nd Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from second_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO second_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        
        if("3rd Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from third_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO third_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        
        if("4th Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from fourth_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO fourth_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        
        
        if("5th Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from fifth_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO fifth_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        
        if("6th Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from sixth_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO sixth_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        if("7th Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from seventh_semster_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO seventh_semster_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
        
        if("8th Semester"==Drop)
        {
          
            //////////////////start of delete code
         try{
         for (int i = 0; i < tb.getRowCount(); i++){
                 
         String sqlDelete = "DELETE from eighth_semester_drop where roll = '"+tb.getValueAt(i, 2).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
                 
         }            
         // JOptionPane.showMessageDialog(null, "Deleted!!!");
         }catch(SQLException | HeadlessException e)
         {
         //JOptionPane.showMessageDialog(null, e);
         }
         ///////////////////////end of delete code



            try {
            String sqlQry = "INSERT INTO eighth_semester_drop(promotestatus,name,roll,reg,session,semester,cgpa) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement prepStmts = con.prepareStatement(sqlQry);

            for (int i = 0; i < tb.getRowCount(); i++) {

                
 
                
                if ((tb.getValueAt(i, 0).toString().equals("true"))) { //start if condition
                
                    prepStmts.setString(1, tb.getValueAt(i, 0).toString());
                    prepStmts.setString(2, tb.getValueAt(i, 1).toString());
                    prepStmts.setString(3, tb.getValueAt(i, 2).toString());
                    prepStmts.setString(4, tb.getValueAt(i, 3).toString());
                    prepStmts.setString(5, tb.getValueAt(i, 4).toString());
                    prepStmts.setString(6, tb.getValueAt(i, 5).toString());
                    prepStmts.setString(7, tb.getValueAt(i, 6).toString());

                    prepStmts.execute();

                }

            }
            JOptionPane.showMessageDialog(this, "Dropped!!!");

        } catch (SQLException | HeadlessException e) {
          JOptionPane.showMessageDialog(null, e);
        }
            
         TableRefresh();
        }
        
    }//GEN-LAST:event_jComboBoxDropActionPerformed

    

     
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBoxDrop;
    private javax.swing.JComboBox<String> jComboBoxPromotion;
    private javax.swing.JComboBox<String> jComboBoxselectsemesterresult;
    private javax.swing.JComboBox jComboResult;
    private javax.swing.JComboBox jComboSemester;
    private javax.swing.JComboBox jComboSession;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable jTableResult;
    private javax.swing.JTextField txtCGPA;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtReg;
    private javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
}
