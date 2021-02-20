
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Panel_Administrator extends javax.swing.JPanel {

      //Variaable for Database Connection
    
    Connection con;
    PreparedStatement prepstmnt = null;
    ResultSet res = null;
    
    public Panel_Administrator() {
        initComponents();
        
        //Database Connection Code call
        try {
            con = DBConnectioncode.DBConnectioncode();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Panel_Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ShowTable();
        showSession();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel38 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        combouserType = new javax.swing.JComboBox();
        jLabel142 = new javax.swing.JLabel();
        txtpswd = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jButton115 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSession = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();

        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel140.setText("User Name :");

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel141.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel141.setText("User Type :");

        combouserType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combouserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Admin", "User" }));

        jLabel142.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel142.setText("Password :");

        txtpswd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpswd)
                        .addContainerGap())
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsername)
                            .addComponent(combouserType, 0, 227, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combouserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel38Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtUsername, txtpswd});

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/save2.png"))); // NOI18N
        jButton109.setText("Save");
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Trash-can16.png"))); // NOI18N
        jButton110.setText("Delete");
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jButton111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Update.png"))); // NOI18N
        jButton111.setText("Update");
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jButton112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/refresh.png"))); // NOI18N
        jButton112.setText("Refresh");
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/Print.png"))); // NOI18N
        jButton113.setText("Print");
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });

        jButton114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/view.gif"))); // NOI18N
        jButton114.setText("Preview");
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton114)
                .addGap(26, 26, 26)
                .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton112)
                .addContainerGap())
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton110)
                .addGap(18, 18, 18)
                .addComponent(jButton111)
                .addGap(22, 22, 22))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   Username", "   User Type", "   Password"
            }
        ));
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jTableUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableUserKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(jTableUser);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Panel/search.gif"))); // NOI18N
        jButton115.setText("Search");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Session :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/save.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setToolTipText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Window/file-add-1.png"))); // NOI18N
        jButton4.setText("Add New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ex : 2012-2013");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Session"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSession);
        if (jTableSession.getColumnModel().getColumnCount() > 0) {
            jTableSession.getColumnModel().getColumn(0).setMinWidth(20);
            jTableSession.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableSession.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jCheckBox1.setText("Select All");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton115))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
       
        try{
            String sqlsave = "INSERT INTO login_info(usertype,username,password) values(?,?,?)";

                prepstmnt=con.prepareStatement(sqlsave);
                
               
                prepstmnt.setString(1, (String) combouserType.getSelectedItem());
                prepstmnt.setString(2,txtUsername.getText());
                prepstmnt.setString(3,txtpswd.getText());
                

                
                
            int n=prepstmnt.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(this,"Data Saved ");
            }
            
            
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
                  
        }
        TableRefresh();
        
        ShowTable();
       
        refresh();
            
     
    }//GEN-LAST:event_jButton109ActionPerformed

    public void refresh()
    {
        combouserType.setSelectedItem("Select");
        txtUsername.setText("");
        txtpswd.setText("");
        
    }
    
    public void showSession()
    {
        try{
            DefaultTableModel tb = (DefaultTableModel)jTableSession.getModel();
            String sqlSearch = "SELECT * FROM Session ORDER BY session ASC";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            while(res.next())
            {
                String ses = res.getString("session");
                
               
                
                
                tb.addRow(new Object[]{false,ses});
                
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void SessionRefresh()
    {
        try{
               DefaultTableModel tb = (DefaultTableModel)jTableSession.getModel();
               int row=jTableSession.getRowCount();
               for(int i=row-1;i>=0;i--)
               {
                   tb.removeRow(i);
               }
        
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void ShowTable()
    {
        try{
            DefaultTableModel tb = (DefaultTableModel)jTableUser.getModel();
            String sqlSearch = "SELECT * FROM login_info";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            while(res.next())
            {
                String username = res.getString("username");
                String usertype = res.getString("usertype");
                String passwd = res.getString("password");
               
                
                
                tb.addRow(new Object[]{username,usertype,passwd});
                
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void TableRefresh()
    {
        try{
               DefaultTableModel tb = (DefaultTableModel)jTableUser.getModel();
               int row=jTableUser.getRowCount();
               for(int i=row-1;i>=0;i--)
               {
                   tb.removeRow(i);
               }
        
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        
        refresh();
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        
        try{
            String sqlDelete = "DELETE from login_info where username = ?";

            prepstmnt = con.prepareStatement(sqlDelete);

            prepstmnt.setString(1, txtUsername.getText());

            prepstmnt.execute();

            JOptionPane.showMessageDialog(null, "Deleted!!!");
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        TableRefresh();
        
        ShowTable();
        
        refresh();
    }//GEN-LAST:event_jButton110ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
     
        try{
            
            String sqlSearch = "SELECT * FROM login_info";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                String usertype = res.getString("usertype");
                String username = res.getString("username");
                String passwd = res.getString("password");
                
                combouserType.setSelectedItem(usertype);
                txtUsername.setText(username);
                txtpswd.setText(passwd);
                
               
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jTableUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableUserKeyReleased
       
         if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            try{
            int row = jTableUser.getSelectedRow();
            String Table_Click = (jTableUser.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM login_info WHERE username ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                String username = res.getString("username");
                String usertype = res.getString("usertype");
                
                String passwd = res.getString("password");
                
                combouserType.setSelectedItem(usertype);
                txtUsername.setText(username);
                txtpswd.setText(passwd);
                
               
            }
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jTableUserKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        
       TableRefresh();
        
        
        try{
            
            DefaultTableModel tb = (DefaultTableModel)jTableUser.getModel();
            String sqlSearch = "SELECT * FROM login_info where username like '%"+txtSearch.getText()+"%'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            while(res.next())
            {
                
                String username = res.getString("username");
                String usertype = res.getString("usertype");
                String passwd = res.getString("password");
               
                tb.addRow(new Object[]{username,usertype,passwd});
                
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
      
         try{
            int row = jTableUser.getSelectedRow();
            String Table_Click = (jTableUser.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM login_info WHERE username ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                 
                String username = res.getString("username");
                String usertype = res.getString("usertype");
                String passwd = res.getString("password");
                
                txtUsername.setText(username);
                combouserType.setSelectedItem(usertype);
                
                txtpswd.setText(passwd);
                
               
            }
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        /* try{
           
            int row = jTableUser.getSelectedRow();
            String Table_Click = (jTableUser.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM student_information WHERE Stu_Name ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
          
           while(res.next())
            {
                String usertype = res.getString("usertype");
                String username = res.getString("username");
                String passwd = res.getString("password");
                
                combouserType.setSelectedItem(usertype);
                txtUsername.setText(username);
                txtpswd.setText(passwd);
                
               
            }
           
           
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }*/
    }//GEN-LAST:event_jTableUserMouseClicked

    private void jTableUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableUserKeyPressed
       
       if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            try{
            int row = jTableUser.getSelectedRow();
            String Table_Click = (jTableUser.getModel().getValueAt(row, 0).toString());
            String sqlSearch = "SELECT * FROM  login_info WHERE username ='"+Table_Click+"'";
            prepstmnt = con.prepareStatement(sqlSearch);
            res = prepstmnt.executeQuery();
            
            
            while(res.next())
            {
                 String usertype = res.getString("usertype");
                String username = res.getString("username");
                String passwd = res.getString("password");
                
                combouserType.setSelectedItem(usertype);
                txtUsername.setText(username);
                txtpswd.setText(passwd);
                
                
               
            }
        }catch(SQLException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jTableUserKeyPressed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
      
        try{
            
             String sqlQry="UPDATE  login_info SET usertype = ?,password = ? WHERE username = ?";
                
                prepstmnt = con.prepareStatement(sqlQry);
                
                prepstmnt.setString(1, combouserType.getSelectedItem().toString());
                prepstmnt.setString(2, txtpswd.getText());
                prepstmnt.setString(3, txtUsername.getText());
                

                int i = prepstmnt.executeUpdate();

                if (i > 0) {
                    JOptionPane.showMessageDialog(this, "DATABAE UPDATED");
                }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        TableRefresh();
        
        ShowTable();
        
        refresh();
        
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            String sqlsave = "INSERT INTO Session(session) values(?)";

            prepstmnt=con.prepareStatement(sqlsave);

            prepstmnt.setString(1,jTextField1.getText());

            int n=prepstmnt.executeUpdate();

            if(n>0)
            {
                JOptionPane.showMessageDialog(this,"Data Saved ");
            }
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        SessionRefresh();
        showSession();
        jTextField1.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String sqlDelete = "DELETE from Session where session = ?";

            prepstmnt = con.prepareStatement(sqlDelete);

            prepstmnt.setString(1, jTextField1.getText());

            prepstmnt.execute();

            JOptionPane.showMessageDialog(null, "Deleted!!!");
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        try{
             DefaultTableModel tb = (DefaultTableModel)jTableSession.getModel();
        
             
         for (int i = 0; i < tb.getRowCount(); i++){
             
             if ((tb.getValueAt(i, 0).toString().equals("true"))) {
                 
         String sqlDelete = "DELETE from Session where session = '"+tb.getValueAt(i, 1).toString()+"'";
            
         PreparedStatement prepStmtd = con.prepareStatement(sqlDelete);
           
             
         prepStmtd.execute();
             }
         }
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
        
        SessionRefresh();
        showSession();
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        DefaultTableModel tbmodel = (DefaultTableModel) jTableSession.getModel();
        if(jCheckBox1.isSelected()==true)
        {
            try{
                for (int i = 0; i < tbmodel.getRowCount(); i++) {
                
           jTableSession.getModel().setValueAt(true, i, 0);
                }}catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        
        if(jCheckBox1.isSelected()==false)
        {
            try{
                for (int i = 0; i < tbmodel.getRowCount(); i++) {
                
           jTableSession.getModel().setValueAt(false, i, 0);
                }}catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
void print_User_Information() throws SQLException, BadElementException, IOException {
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

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("User.pdf"));

            document.open();

            PdfContentByte cb = writer.getDirectContent();

            PdfPTable table = new PdfPTable(2);

            PdfPCell cell5 = new PdfPCell();

            String username="",usertype="",passwd="";

          
            
            ///////Name
          
             try{
            
            
            
            String sqlSearch = "SELECT * FROM login_info";
            
            prepstmnt = con.prepareStatement(sqlSearch);
            res=prepstmnt.executeQuery();
            
            while(res.next())
                {
                username = res.getString("username");
                usertype = res.getString("usertype");
                passwd = res.getString("password");
                    
               
             
              
            }
            
            
            
        }catch(Exception e)
        {
            System.out.println("Error ==> "+e);
        }
             
            Paragraph Title = new Paragraph("Chittagong Polytechnic Institute", new Font(Font.BOLD, 40, Font.BOLD,Color.DARK_GRAY));
            Title.setAlignment(Element.ALIGN_CENTER);
            document.add(Title);
            Paragraph Subtitle = new Paragraph("Nasirabad, Chittagong - 4209", new Font(Font.BOLD, 20, Font.BOLD,Color.DARK_GRAY));
            Subtitle.setAlignment(Element.ALIGN_CENTER);
            document.add(Subtitle);

            Paragraph mainparagraph = new Paragraph("User's Information", new Font(Font.BOLD, 30, Font.BOLD,Color.DARK_GRAY));
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
                                 

            //TABLE HEADER
            PdfPTable my_report_table = new PdfPTable(3);
            float[] columnWidths = {0.5f,0.8f,0.8f};
            my_report_table.setWidths(columnWidths);
            my_report_table.setWidthPercentage(100);
            String[] headers1 = new String[]{
                "User Name","User Type","Password"
            };

            PdfPTable table1 = new PdfPTable(headers1.length);
            table1.setWidths(columnWidths);
            table1.setWidthPercentage(100);
            for (String header : headers1) {
                PdfPCell cell = new PdfPCell();

                cell.setGrayFill(0.9f);
                cell.setPhrase(new Phrase(header, new Font(Font.NORMAL, 15, Font.BOLD)));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table1.addCell(cell);
            }
            table1.completeRow();
            
            ////END OF HEADER
            
            ///////////////
            
            PdfPTable my_report_table2 = new PdfPTable(3);
            
            //left side
            PdfPCell table_cell2 = new PdfPCell();
            my_report_table2.setWidthPercentage(100);         
            my_report_table2.setWidths(columnWidths);

            
            ///////////////////
            
              try {

            
            //String sqlQry="Select * from emp_info ORDER BY Emp_ID ASC";
           String sqlSearch = "SELECT * FROM login_info";

            prepstmnt = con.prepareStatement(sqlSearch);
            res=prepstmnt.executeQuery();
            
            while(res.next())
            {
                
            username=res.getString("username");  
            table_cell2 = new PdfPCell(new Phrase(username, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            // table_cell1.setBorder(1);           
           // table_cell2.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table2.addCell(table_cell2);
            
            usertype = res.getString("usertype");
             table_cell2 = new PdfPCell(new Phrase(usertype, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            // table_cell1.setBorder(1);           
           // table_cell2.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table2.addCell(table_cell2);
            
            passwd = res.getString("password");
             table_cell2 = new PdfPCell(new Phrase(passwd, new Font(Font.NORMAL, 15, Font.BOLD)));
            table_cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            // table_cell1.setBorder(1);           
           // table_cell2.setBorder(Rectangle.NO_BORDER);
            //table_cell1.setBorder(Rectangle.BOX);
            my_report_table2.addCell(table_cell2);
            
           
            
            
             
                
               
                
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
           

           ///////////////

            document.add(mainparagraph);
            document.add(paragraph3);
            document.add(my_report_table1);
           
            document.add(paragraph3);
            document.add(table1);
            document.add(my_report_table2);
            
            
           

            // document.add(table);
        } catch (DocumentException | HeadlessException e56) {
            System.err.println(e56.getMessage());
        }

        document.close(); 
    }                   
    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
        // TODO add your handling code here:
        try {
            print_User_Information();
        } catch (SQLException | BadElementException | IOException ex) {
            Logger.getLogger(Panel_Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (Desktop.isDesktopSupported()) {
            try {
                File myfile = new File("User.pdf");

                Desktop.getDesktop().open(myfile);
            } catch (IOException e17) {
                // JOptionPane.showMessageDialog(null, e17.toString());
            }
        }
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        // TODO add your handling code here:
        
        try {
            print_User_Information();
        } catch (SQLException | BadElementException | IOException ex) {
            Logger.getLogger(Panel_Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (Desktop.isDesktopSupported()) {
            try {
                File myfile = new File("User.pdf");

                Desktop.getDesktop().open(myfile);
            } catch (IOException e17) {
                // JOptionPane.showMessageDialog(null, e17.toString());
            }
        }
    }//GEN-LAST:event_jButton114ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combouserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableSession;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtpswd;
    // End of variables declaration//GEN-END:variables
}
