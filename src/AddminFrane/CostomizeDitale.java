/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddminFrane;

import HomepageClass.ConnectonClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import ClassForSetInfoInTable.CostmizeDitalesTable;
import ClassForSetInfoInTable.Validations;
import CommenFrams.*;
import CommenFrams.UpsateStudent;
import CommenFrams.StudentFrame;
import DropData.Drop;
import HomePageJframe.HomePage;

/**
 *
 * @author Education
 */
public class CostomizeDitale extends javax.swing.JFrame {

    public static int x=2;
    public CostomizeDitale() {
        
            initComponents();
            jPanel5.setVisible(false);
            
           
            ResultSet rs = CostmizeDitalesTable.setInfoOfCourse();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             ResultSet r = CostmizeDitalesTable.setInfoOfFeculty();
            jTable2.setModel(DbUtils.resultSetToTableModel(r));
       
       
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        l1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1446, 709));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTabbedPane8.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel28.setText("Enter Current Name");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel28);
        jLabel28.setBounds(26, 120, 175, 42);

        jLabel29.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel29.setText("Enter New Name");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel29);
        jLabel29.setBounds(26, 189, 175, 42);

        jLabel30.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel30.setText("Enter Current Password");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel30);
        jLabel30.setBounds(26, 258, 185, 42);

        jLabel31.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel31.setText("Enter New Password");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel31);
        jLabel31.setBounds(26, 327, 185, 42);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.setToolTipText("to save profile");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(0, java.awt.Color.white, java.awt.Color.white));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(330, 420, 100, 50);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1);
        jTextField1.setBounds(357, 120, 255, 42);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2);
        jTextField2.setBounds(357, 189, 255, 42);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jPasswordField1);
        jPasswordField1.setBounds(357, 258, 255, 42);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jPasswordField2);
        jPasswordField2.setBounds(357, 327, 255, 42);

        jLabel27.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel27.setText("    Edit Addmin Profile");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(260, 10, 187, 42);

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel3);
        jLabel3.setBounds(1564, 122, 18, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddminFrane/1--.jpg"))); // NOI18N
        jPanel6.add(jLabel4);
        jLabel4.setBounds(0, 0, 1530, 60);

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel6.add(jLabel2);
        jLabel2.setBounds(360, 370, 250, 20);

        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jPanel6.add(jLabel19);
        jLabel19.setBounds(360, 164, 250, 20);

        jLabel57.setForeground(new java.awt.Color(255, 51, 51));
        jPanel6.add(jLabel57);
        jLabel57.setBounds(360, 230, 250, 20);

        jLabel59.setForeground(new java.awt.Color(255, 51, 51));
        jPanel6.add(jLabel59);
        jLabel59.setBounds(360, 300, 250, 20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Edit Addmin Profile", jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel38.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel38.setText("Enter Current Name");
        jPanel7.add(jLabel38);
        jLabel38.setBounds(24, 118, 175, 42);

        jLabel39.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel39.setText("Enter New Name");
        jPanel7.add(jLabel39);
        jLabel39.setBounds(24, 187, 175, 42);

        jLabel40.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel40.setText("Enter Current Password");
        jPanel7.add(jLabel40);
        jLabel40.setBounds(24, 256, 185, 42);

        jLabel32.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel32.setText("    Edit User Profile");
        jPanel7.add(jLabel32);
        jLabel32.setBounds(270, 10, 162, 42);

        jLabel41.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel41.setText("Enter New Password");
        jPanel7.add(jLabel41);
        jLabel41.setBounds(24, 325, 185, 42);

        jPasswordField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField5ActionPerformed(evt);
            }
        });
        jPanel7.add(jPasswordField5);
        jPasswordField5.setBounds(330, 330, 255, 42);

        jPasswordField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField6ActionPerformed(evt);
            }
        });
        jPanel7.add(jPasswordField6);
        jPasswordField6.setBounds(330, 250, 255, 42);

        jTextField5.setText(" ");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField5);
        jTextField5.setBounds(330, 180, 255, 42);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField6);
        jTextField6.setBounds(330, 110, 255, 42);

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.setToolTipText("to save user profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(330, 430, 100, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddminFrane/1--.jpg"))); // NOI18N
        jPanel7.add(jLabel6);
        jLabel6.setBounds(0, 0, 1530, 60);

        jLabel60.setForeground(new java.awt.Color(255, 51, 0));
        jPanel7.add(jLabel60);
        jLabel60.setBounds(330, 380, 260, 20);

        jLabel61.setForeground(new java.awt.Color(255, 51, 0));
        jPanel7.add(jLabel61);
        jLabel61.setBounds(330, 160, 260, 20);

        jLabel62.setForeground(new java.awt.Color(255, 51, 0));
        jPanel7.add(jLabel62);
        jLabel62.setBounds(330, 230, 260, 20);

        jLabel63.setForeground(new java.awt.Color(255, 51, 0));
        jPanel7.add(jLabel63);
        jLabel63.setBounds(330, 300, 260, 20);

        jTabbedPane8.addTab("Edit User Profile", jPanel7);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        jLabel45.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel45.setText("Enter Course Name");
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel45);
        jLabel45.setBounds(52, 209, 175, 42);

        jTextField10.setEditable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField10);
        jTextField10.setBounds(357, 209, 255, 42);

        jLabel46.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel46.setText(" Enter Course Fee");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel46);
        jLabel46.setBounds(50, 340, 175, 42);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField11);
        jTextField11.setBounds(360, 340, 255, 42);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("select one course");
        jTable1.setRowHeight(26);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel10.add(jScrollPane1);
        jScrollPane1.setBounds(10, 82, 670, 108);

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setText("Edit");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4);
        jButton4.setBounds(341, 785, 97, 48);

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setText("Drop");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5);
        jButton5.setBounds(475, 785, 94, 48);

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField19);
        jTextField19.setBounds(357, 723, 255, 42);

        jLabel54.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel54.setText(" Enter Course Duretion");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel54);
        jLabel54.setBounds(52, 723, 175, 42);

        jLabel35.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel35.setText("      Delete Course /Edit Course");
        jPanel10.add(jLabel35);
        jLabel35.setBounds(240, 10, 270, 42);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddminFrane/1--.jpg"))); // NOI18N
        jPanel10.add(jLabel7);
        jLabel7.setBounds(0, 0, 1530, 60);

        jLabel55.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel55.setText(" Enter Feculty Name");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel55);
        jLabel55.setBounds(52, 275, 175, 42);

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField20);
        jTextField20.setBounds(357, 275, 255, 42);

        jLabel56.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel56.setText(" Enter Course Duretion");
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel56);
        jLabel56.setBounds(50, 410, 175, 42);

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField21);
        jTextField21.setBounds(360, 410, 255, 42);

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.setText("Update");
        jButton9.setToolTipText("Update Course");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9);
        jButton9.setBounds(275, 550, 92, 48);

        jButton10.setBackground(new java.awt.Color(51, 102, 255));
        jButton10.setText("Drop");
        jButton10.setToolTipText("Delete Course");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton10);
        jButton10.setBounds(406, 550, 92, 48);

        jLabel64.setForeground(new java.awt.Color(255, 0, 0));
        jPanel10.add(jLabel64);
        jLabel64.setBounds(360, 250, 250, 20);

        jLabel65.setForeground(new java.awt.Color(255, 0, 0));
        jPanel10.add(jLabel65);
        jLabel65.setBounds(360, 460, 260, 20);

        jLabel66.setForeground(new java.awt.Color(255, 0, 0));
        jPanel10.add(jLabel66);
        jLabel66.setBounds(360, 320, 260, 20);

        jLabel67.setForeground(new java.awt.Color(255, 0, 0));
        jPanel10.add(jLabel67);
        jLabel67.setBounds(360, 390, 260, 20);

        jTabbedPane8.addTab("Delete Course", jPanel10);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);

        jLabel48.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel48.setText("Enter Fecuty Name");
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.add(jLabel48);
        jLabel48.setBounds(64, 112, 175, 42);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField13);
        jTextField13.setBounds(318, 112, 255, 42);

        jLabel49.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel49.setText("Enter Fee");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.add(jLabel49);
        jLabel49.setBounds(70, 190, 175, 42);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField14);
        jTextField14.setBounds(320, 190, 255, 42);

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setText("Add");
        jButton6.setToolTipText("add Faculty");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6);
        jButton6.setBounds(318, 487, 92, 48);

        jLabel36.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel36.setText("   Add Faculty");
        jPanel12.add(jLabel36);
        jLabel36.setBounds(330, 10, 131, 42);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddminFrane/1--.jpg"))); // NOI18N
        jPanel12.add(jLabel8);
        jLabel8.setBounds(0, 0, 1530, 60);

        jLabel47.setForeground(new java.awt.Color(204, 0, 0));
        jPanel12.add(jLabel47);
        jLabel47.setBounds(320, 160, 260, 30);

        jLabel68.setForeground(new java.awt.Color(255, 0, 0));
        jPanel12.add(jLabel68);
        jLabel68.setBounds(320, 400, 250, 30);

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField17);
        jTextField17.setBounds(320, 270, 255, 42);

        jLabel69.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel69.setText("Enter Qualification");
        jLabel69.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.add(jLabel69);
        jLabel69.setBounds(70, 270, 175, 42);

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField22);
        jTextField22.setBounds(320, 350, 255, 42);

        jLabel70.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel70.setText("Enter Phone number");
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.add(jLabel70);
        jLabel70.setBounds(70, 350, 175, 42);

        jLabel71.setForeground(new java.awt.Color(204, 0, 0));
        jPanel12.add(jLabel71);
        jLabel71.setBounds(320, 230, 250, 30);

        jLabel72.setForeground(new java.awt.Color(204, 0, 0));
        jPanel12.add(jLabel72);
        jLabel72.setBounds(320, 310, 250, 30);

        jTabbedPane8.addTab("Add Faculty", jPanel12);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setToolTipText("select facuty");
        jTable2.setRowHeight(26);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel14.add(jScrollPane2);
        jScrollPane2.setBounds(10, 75, 660, 99);

        jLabel50.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel50.setText(" Facuty Name");
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.add(jLabel50);
        jLabel50.setBounds(152, 206, 175, 42);

        jTextField15.setEditable(false);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField15);
        jTextField15.setBounds(406, 206, 255, 42);

        jLabel51.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel51.setText(" Fee");
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jLabel51);
        jLabel51.setBounds(150, 280, 175, 42);

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField16);
        jTextField16.setBounds(410, 280, 255, 42);

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton7);
        jButton7.setBounds(260, 500, 92, 48);

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.setText("Drop");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8);
        jButton8.setBounds(400, 500, 92, 48);

        jLabel37.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel37.setText("   Add Faculty");
        jPanel14.add(jLabel37);
        jLabel37.setBounds(290, 10, 131, 42);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddminFrane/1--.jpg"))); // NOI18N
        jPanel14.add(jLabel9);
        jLabel9.setBounds(0, 0, 1530, 60);

        jLabel73.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel73.setText("Qualificetion");
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jLabel73);
        jLabel73.setBounds(150, 350, 175, 42);

        jTextField23.setEditable(false);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField23);
        jTextField23.setBounds(410, 350, 255, 42);

        jLabel74.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel74.setText("Phone number");
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jLabel74);
        jLabel74.setBounds(150, 420, 175, 42);

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField24);
        jTextField24.setBounds(410, 420, 255, 42);

        jLabel75.setForeground(new java.awt.Color(204, 0, 0));
        jPanel14.add(jLabel75);
        jLabel75.setBounds(410, 460, 260, 30);

        jLabel76.setForeground(new java.awt.Color(204, 0, 0));
        jPanel14.add(jLabel76);
        jLabel76.setBounds(400, 250, 260, 30);

        jLabel77.setForeground(new java.awt.Color(204, 0, 0));
        jPanel14.add(jLabel77);
        jLabel77.setBounds(410, 320, 260, 30);

        jLabel78.setForeground(new java.awt.Color(204, 0, 0));
        jPanel14.add(jLabel78);
        jLabel78.setBounds(410, 390, 260, 30);

        jTabbedPane8.addTab("Drop Faculty", jPanel14);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel43.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel43.setText(" Enter Feculty Name");
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel43);
        jLabel43.setBounds(34, 197, 175, 42);

        jLabel44.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel44.setText(" Enter Course Fee");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel44);
        jLabel44.setBounds(34, 263, 175, 42);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField8);
        jTextField8.setBounds(213, 197, 255, 42);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField9);
        jTextField9.setBounds(213, 263, 255, 42);

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton3.setText("Add");
        jButton3.setToolTipText("add course");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(220, 460, 110, 50);

        jLabel52.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel52.setText("Enter Course Name");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel52);
        jLabel52.setBounds(34, 131, 175, 42);

        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });
        jPanel4.add(l1);
        l1.setBounds(213, 131, 255, 42);

        jLabel53.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel53.setText(" Enter  Course Duretion");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel53);
        jLabel53.setBounds(34, 335, 175, 42);

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField18);
        jTextField18.setBounds(213, 335, 255, 42);

        jLabel34.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel34.setText("       Add Course");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(240, 10, 187, 42);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddminFrane/1--.jpg"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 1530, 60);

        c.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(c);
        c.setBounds(210, 380, 260, 30);

        a.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(a);
        a.setBounds(210, 180, 270, 20);

        b.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(b);
        b.setBounds(210, 240, 260, 20);

        jLabel58.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(jLabel58);
        jLabel58.setBounds(210, 310, 260, 20);

        jTabbedPane8.addTab("Add Course", jPanel4);

        jPanel1.add(jTabbedPane8);
        jTabbedPane8.setBounds(230, 0, 700, 650);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel20.setText("        Student List");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel20);
        jLabel20.setBounds(20, 150, 180, 38);

        jLabel21.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel21.setText("        Update Student");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel21);
        jLabel21.setBounds(20, 278, 180, 40);

        jLabel22.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel22.setText("        Staff  List");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel22);
        jLabel22.setBounds(20, 210, 150, 38);

        jLabel23.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel23.setText("        Delete Data");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel23);
        jLabel23.setBounds(20, 360, 140, 30);

        jLabel24.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel24.setText("         Customize Detail");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel24);
        jLabel24.setBounds(10, 90, 200, 42);

        jLabel25.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel25.setText("        New Adimission");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25);
        jLabel25.setBounds(20, 430, 180, 38);

        jLabel26.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 24)); // NOI18N
        jLabel26.setText("       Home");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel26);
        jLabel26.setBounds(20, 30, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/home (1).png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(20, 30, 29, 25);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(2, 332, 236, 3);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(2, 73, 236, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-tune-24.png"))); // NOI18N
        jPanel5.add(jLabel5);
        jLabel5.setBounds(20, 100, 24, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel13);
        jLabel13.setBounds(20, 150, 30, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel14);
        jLabel14.setBounds(20, 210, 30, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-update-user-32.png"))); // NOI18N
        jPanel5.add(jLabel16);
        jLabel16.setBounds(20, 280, 32, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/question.png"))); // NOI18N
        jPanel5.add(jLabel17);
        jLabel17.setBounds(20, 510, 32, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-delete-bin-30.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(20, 360, 30, 30);

        jLabel33.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel33.setText("        App info");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel33);
        jLabel33.setBounds(20, 500, 170, 38);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-student-registration-30.png"))); // NOI18N
        jPanel5.add(jLabel42);
        jLabel42.setBounds(20, 430, 40, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 230, 670);

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-10, -500, 1400, 1460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 1370, 650);

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText(" X");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel79.setText("       Customize Detail");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1370, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
           
                  if(jTextField13.getText().trim().length()==0)
            {
              jLabel47.setText("*Please Enter Faculty Name");
             
            }
            if(jTextField13.getText().trim().length()==0)
            {
              jLabel71.setText("*Please Enter Fee");
            }
            
           if(jTextField17.getText().trim().length()==0)
            {
              jLabel72.setText("*Please Enter Qualification");
            }
           if(jTextField22.getText().trim().length()==0)
            {
              jLabel68.setText("*Please Enter Phone number");
            }
           if(jTextField13.getText().trim().length()==0||jTextField14.getText().trim().length()==0||jTextField17.getText().trim().length()==0||jTextField22.getText().trim().length()==0)
           {
               return;
           }
           else
           {
                jLabel47.setText("");
              jLabel71.setText("");
              jLabel72.setText("");
             jLabel68.setText("");
           }
           
             

            String fname=jTextField13.getText();
            int fee=Integer.parseInt(jTextField14.getText());
             String qu=jTextField17.getText();
          String ph=jTextField22.getText();
             if(Validations.containsOnlyAlphabets(fname))
            {
            }
            else
            {
                jLabel47.setText("Invalid Name");
                return;
            }
        if(Validations.isValidMobileNo(ph))
        { 
        }else
        {
            jLabel68.setText("Invalid Number");
           return;
        }
            Connection con =ConnectonClass.getConnection();
            String q ="INSERT INTO feculty_info VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,fname );
            ps.setInt(2,fee );
            ps.setString(3,qu );
            ps.setString(4,ph );
            int i= ps.executeUpdate();
            if(i>0)
            {
            JOptionPane.showMessageDialog(null,"Faculty added");
            }
             //ResultSet r = CostmizeDitalesTable.setInfoOfFeculty();
            //jTable2.setModel(DbUtils.resultSetToTableModel(r));
           // JOptionPane.showMessageDialog(null,i);
        } catch (SQLException ex) {
             int ercode = ex.getErrorCode();
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "Faculty already exist in database");
                return;
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
            }
           
            Logger.getLogger(CostomizeDitale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
                if(jTextField6.getText().trim().length()==0)
            {
              jLabel61.setText("*Please Enter User Name");
             
            }
            else
            {
              jLabel61.setText("");
            }
           
            if(jTextField5.getText().trim().length()==0)
            {
              jLabel62.setText("*Please Enter New User Name");
            }else{
             jLabel62.setText("");
            }
          
            if(jPasswordField6.getText().trim().length()==0)
            {
              jLabel63.setText("*Please Enter Password");
            }else
            {
              jLabel63.setText("");
            }
            if(jPasswordField5.getText().trim().length()==0)
            {
              jLabel60.setText("*Please Enter New Password");
            }
            else
            {
              jLabel60.setText("");
            }
           
             if(jTextField6.getText().trim().length()==0||jTextField5.getText().trim().length()==0||
               jPasswordField6.getText().trim().length()==0 ||jPasswordField5.getText().trim().length()==0    )
            {
              return;
            }
        
            String currentName=jTextField6.getText();
            String newname=jTextField5.getText();
            String currentpassword=jPasswordField6.getText();
            String newpassword=jPasswordField5.getText();
             
            Connection con =ConnectonClass.getConnection();
            String q = "UPDATE login SET User_Name =? ,User_Password=?"
                    + " WHERE Login_As ='User' AND User_Name=?";
            PreparedStatement ps = con.prepareStatement(q);
        
            ps.setString(1,newname );
            ps.setString(2,newpassword);
            ps.setString(3,currentName );
                        

            int i= ps.executeUpdate();
              if(i>0)
            {
             JOptionPane.showMessageDialog(null,"Profile Updated");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Please enter vaild detail");
            }
           // JOptionPane.showMessageDialog(null,i);
           jTextField6.setText("");
           jTextField5.setText("");
           jPasswordField6.setText("");
           jPasswordField5.setText("");
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CostomizeDitale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPasswordField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField6ActionPerformed

    private void jPasswordField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField5ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
             if(jTextField1.getText().trim().length()==0)
            {
              jLabel19.setText("*Please Enter Addmin Name");
             
            }
            else
            {
              jLabel19.setText("");
            }
           
            if(jTextField2.getText().trim().length()==0)
            {
              jLabel57.setText("*Please Enter New Addmin Name");
            }else{
             jLabel57.setText("");
            }
          
            if(jPasswordField1.getText().trim().length()==0)
            {
              jLabel59.setText("*Please Enter Password");
            }else
            {
              jLabel59.setText("");
            }
            if(jPasswordField2.getText().trim().length()==0)
            {
              jLabel2.setText("*Please Enter New Password");
            }
            else
            {
              jLabel2.setText("");
            }
           
             if(jTextField1.getText().trim().length()==0||jTextField2.getText().trim().length()==0||
               jPasswordField1.getText().trim().length()==0 ||jPasswordField2.getText().trim().length()==0    )
            {
              return;
            }
           
            String currentName=jTextField1.getText();
            String newname=jTextField2.getText();
            String currentpassword=jPasswordField1.getText();
            String newpassword=jPasswordField2.getText();
            Connection con =ConnectonClass.getConnection();
            String q = "UPDATE login SET User_Name =? ,User_Password=?"
                    + " WHERE Login_As ='Administretor' AND User_Name=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,newname);
            ps.setString(2,newpassword);
            ps.setString(3,currentName);
            int i= ps.executeUpdate();
            if(i>0)
            {
             JOptionPane.showMessageDialog(null,"Profile Updated");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Please enter vaild detail");
            }
            
           jTextField1.setText("");
           jTextField2.setText("");
           jPasswordField1.setText("");
           jPasswordField2.setText("");
            
           // JOptionPane.showMessageDialog(null,i);
        } catch (SQLException ex) {
            Logger.getLogger(CostomizeDitale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       if(jTextField15.getText().trim().length()==0)
       {
       jLabel76.setText("*Please enter Faculty name");
      
       }
       if(jTextField16.getText().trim().length()==0)
       {
       jLabel77.setText("*Please enter Fee");
       
       }
       if(jTextField23.getText().trim().length()==0)
       {
       jLabel78.setText("*Please enter Qualifications");
      
       }
       if(jTextField24.getText().trim().length()==0)
       {
       jLabel75.setText("*Please enter phone number");
       return;
       }
       if(jTextField15.getText().trim().length()==0||jTextField16.getText().trim().length()==0||jTextField23.getText().trim().length()==0||
               jTextField24.getText().trim().length()==0)
       {
        return;
       }else
       {
       jLabel76.setText("");
        jLabel77.setText("");
         jLabel78.setText("");
       jLabel75.setText("");
       }
        String n =  jTextField15.getText();
        int c =Integer.parseInt(jTextField16.getText());
        String qu=  jTextField23.getText();
        String ph =  jTextField24.getText();
         
            
        if(Validations.isValidMobileNo(ph))
        { 
        }else
        {
            jLabel75.setText("Invalid Number");
           return;
        }
        UpdateClass.UpadateInformetion.updateFeculty(c, n, qu, ph);
        ResultSet r = CostmizeDitalesTable.setInfoOfFeculty();
       
        jTable2.setModel(DbUtils.resultSetToTableModel(r));
      
  
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          String n =  jTextField15.getText();
           int x= JOptionPane.showConfirmDialog(null, "You want delete the selected Course");
           //JOptionPane.showMessageDialog(null, x);
           Drop.dropFecultyInfo(x, n);
         ResultSet r = CostmizeDitalesTable.setInfoOfFeculty();
        jTable2.setModel(DbUtils.resultSetToTableModel(r));
     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l1ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
               
            if(l1.getText().trim().length()==0)
            {
              a.setText("*Please Enter Course Name");
             
            }
            else
            {
              a.setText("");
            }
           
            String cname= l1.getText();
            if(jTextField8.getText().trim().length()==0)
            {
              b.setText("*Please Enter Faculty Name");
            }else{
             b.setText("");
            }
            String fname=jTextField8.getText();
            if(jTextField9.getText().trim().length()==0)
            {
              jLabel58.setText("*Please Enter Course Fee");
            }else
            {
              jLabel58.setText("");
            }
            if(jTextField18.getText().trim().length()==0)
            {
              c.setText("*Please Enter Course Dueretion");
            }
            else
            {
              c.setText("");
            }
           
             if(l1.getText().trim().length()==0||jTextField8.getText().trim().length()==0||
               jTextField9.getText().trim().length()==0 ||jTextField18.getText().trim().length()==0    )
            {
              return;
            }
            int cfee=Integer.parseInt(jTextField9.getText());
            int duretion=Integer.parseInt(jTextField18.getText());
           
            
            Connection con = ConnectonClass.getConnection();
            String q ="INSERT INTO course VALUES(?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(q);
            ps.setString(1, cname);
            ps.setInt(3, cfee);
            ps.setString(2, fname);
            ps.setInt(4, duretion);
            int x=ps.executeUpdate();
             ResultSet r = CostmizeDitalesTable.setInfoOfCourse();                    
             jTable1.setModel(DbUtils.resultSetToTableModel(r));
             if(x>0)
             {
                JOptionPane.showMessageDialog(null,"Done");
             }
          // JOptionPane.showMessageDialog(null, x);
        } catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "course already exist in database");
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
                return;
            }
            else if(ercode==1452)
            {
              JOptionPane.showMessageDialog(null,"Faculty dose not exist.Please add Faculty");
              return;
            }
            Logger.getLogger(CostomizeDitale.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(rootPane, "course fee must be numeric");
            return;
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          int n = jTable1.getSelectedRow();
        String cname = jTable1.getValueAt(n, 0).toString();
         String fname = jTable1.getValueAt(n, 1).toString();
        int cfee =Integer.parseInt(jTable1.getValueAt(n, 2).toString());
        int dura = Integer.parseInt(jTable1.getValueAt(n, 3).toString());
       
        //int pf = Integer.parseInt(jTable1.getValueAt(n, 4).toString());
        jTextField10.setText(cname);
        jTextField20.setText(fname);
        jTextField11.setText(String.valueOf(cfee));
        jTextField21.setText(String.valueOf(dura));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int n = jTable2.getSelectedRow();
        String fname = jTable2.getValueAt(n, 0).toString();
        int ffee =Integer.parseInt(jTable2.getValueAt(n, 1).toString());
        String qu = jTable2.getValueAt(n, 2).toString();
        String ph = jTable2.getValueAt(n, 3).toString();
        jTextField15.setText(fname);
        jTextField16.setText(String.valueOf(ffee));
        jTextField23.setText(qu);
        jTextField24.setText(ph);
       
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       String cname= jTextField10.getText();
         int x= JOptionPane.showConfirmDialog(null, "You want delete the selected Student");
          // JOptionPane.showMessageDialog(null, x);
           Drop.dropCourse(x, cname);
         ResultSet r = CostmizeDitalesTable.setInfoOfCourse();
        jTable1.setModel(DbUtils.resultSetToTableModel(r));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        if(x%2==0)
        {
            jPanel5.setVisible(true);
            x=x+1;

        }else
        {
            jPanel5.setVisible(false);
            x=x+1;
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
      if(jTextField10.getText().trim().length()==0)
            {
              jLabel64.setText("*Please Enter Course Name");
             
            }
            else
            {
              jLabel64.setText("");
            }
           
          
            if(jTextField20.getText().trim().length()==0)
            {
              jLabel66.setText("*Please Enter Faculty Name");
            }else{
             jLabel66.setText("");
            }
           
            if(jTextField11.getText().trim().length()==0)
            {
              jLabel67.setText("*Please Enter Course Fee");
            }else
            {
              jLabel67.setText("");
            }
            if(jTextField21.getText().trim().length()==0)
            {
              jLabel65.setText("*Please Enter Course Dueretion");
            }
            else
            {
              jLabel65.setText("");
            }
           
             if(jTextField10.getText().trim().length()==0||jTextField20.getText().trim().length()==0||
               jTextField11.getText().trim().length()==0 ||jTextField21.getText().trim().length()==0    )
            {
              return;
            }
        String n =  jTextField10.getText();
          String fn =  jTextField20.getText();
        int cf =Integer.parseInt(jTextField11.getText());
        int due =Integer.parseInt(jTextField21.getText());
         try{
        int s = Integer.parseInt(JOptionPane.showInputDialog("You Want To Update\n"+
                "'1Course fee'\n"+
                "'2Feculty name'\n"+
                "'3Course Duretion'\n"+"or 4. 'all'  "));
        UpdateClass.UpadateInformetion.updateCourse(n, cf, fn, due, s);
        ResultSet r = CostmizeDitalesTable.setInfoOfCourse();
        jTable1.setModel(DbUtils.resultSetToTableModel(r));
       
         }catch(NumberFormatException ex)
         {
             JOptionPane.showMessageDialog(null, "Please enter numeric values");
         return;
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         String n =  jTextField10.getText();
           int x= JOptionPane.showConfirmDialog(null, "You want delete the selected Student");
           //JOptionPane.showMessageDialog(null, x);
           Drop.dropCourse(x, n);
         ResultSet r = CostmizeDitalesTable.setInfoOfCourse();
        jTable1.setModel(DbUtils.resultSetToTableModel(r));
        jTextField10.setText("");
        jTextField20.setText("");
        jTextField11.setText("");
        jTextField21.setText("");
     
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        //student list
        StudentList.main(null);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        //updatestudent
        UpsateStudent.main(null);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        //staf list
        StafList.main(null);
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        //drop data
        DropData.main(null);
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        //costomize ditales
        CostomizeDitale.main(null);
        dispose();
        x=2;
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        //add Student
        StudentFrame.main(null);
        dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        //home

        HomePage.main(null);
        dispose();
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        infoApp.main(null);
        dispose();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel79MouseClicked

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
            java.util.logging.Logger.getLogger(CostomizeDitale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CostomizeDitale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CostomizeDitale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CostomizeDitale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CostomizeDitale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField l1;
    // End of variables declaration//GEN-END:variables
}
