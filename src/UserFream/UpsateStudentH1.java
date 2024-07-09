/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserFream;

import CommenFrams.*;
import AddminFrane.CostomizeDitale;
import ClassForSetInfoInTable.CostmizeDitalesTable;
import HomePageJframe.HomePage;
import HomePageJframe.HomePage1;
import HomepageClass.ConnectonClass;
import com.mysql.jdbc.CommunicationsException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Education
 */
public class UpsateStudentH1 extends javax.swing.JFrame {

    /**
     * Creates new form StudenList
     */
    
    public UpsateStudentH1() {
        initComponents();
        jPanel5.setVisible(false);
            ResultSet rs = CostmizeDitalesTable.seStudentList();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            showCourseInComboBox();
            showCourseComboBox();
            showFecultyComboBox();
    }
     public static int x=2;
     public static int cf;
     public static String y;
    public void showCourseInComboBox()
     {
           try {
           

            Connection con =  ConnectonClass.getConnection();
            String query = "SELECT Course_Name FROM course";
           
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            DefaultComboBoxModel combomodel = new DefaultComboBoxModel();
            combomodel.addElement("Select Course");
            while(rs.next())
            {
                String cname = rs.getString("Course_Name");
                combomodel.addElement(cname);
            }
            
            jComboBox4.setModel(combomodel);
            
           }catch(CommunicationsException e)
        {
            JOptionPane.showMessageDialog(rootPane, "database details not valid");
        }
         catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
             System.out.println(ercode);
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "course already exist in database");
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
            }else if(ercode == 1452)
            {
                JOptionPane.showMessageDialog(rootPane, "dont have this course");
            }
          
           ex.printStackTrace();
        }
     }
   
     public void showCourseComboBox()
     {
           try {
           

            Connection con =  ConnectonClass.getConnection();
            String query = "SELECT Addmision_Year FROM student_info";
           
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            DefaultComboBoxModel combomode2 = new DefaultComboBoxModel();
            combomode2.addElement("Select Year");
            while(rs.next())
            {
                int cname = rs.getInt("Addmision_Year");
                combomode2.addElement(cname);
            }
             jComboBox2.setModel(combomode2);
            
      }catch(CommunicationsException e)
        {
            JOptionPane.showMessageDialog(rootPane, "database details not valid");
        }
         catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
             System.out.println(ercode);
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "course already exist in database");
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
            }else if(ercode == 1452)
            {
                JOptionPane.showMessageDialog(rootPane, "dont have this course");
            }
          
           ex.printStackTrace();
        }
     }
    public void showFecultyComboBox()
     {
           try {
           

            Connection con =  ConnectonClass.getConnection();
            String query = "SELECT Feculty_Name FROM feculty_info";
           
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            DefaultComboBoxModel combomode2 = new DefaultComboBoxModel();
            combomode2.addElement("Select Feculty Name");
            while(rs.next())
            {
                String cname = rs.getString("Feculty_Name");
                combomode2.addElement(cname);
            }
             jComboBox1.setModel(combomode2);
      }catch(CommunicationsException e)
        {
            JOptionPane.showMessageDialog(rootPane, "database details not valid");
        }
         catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
             System.out.println(ercode);
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "course already exist in database");
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
            }else if(ercode == 1452)
            {
                JOptionPane.showMessageDialog(rootPane, "dont have this course");
            }
          
           ex.printStackTrace();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1446, 709));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 10, 1100, 273);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Show Studen According to:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 290, 225, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Course");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 330, 64, 20);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Year");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 450, 52, 20);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(360, 390, 149, 20);

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(360, 450, 149, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("Feculty Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 390, 103, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("Student Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 370, 110, 20);

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(550, 410, 120, 30);

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(550, 450, 110, 30);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(550, 490, 80, 30);

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setText("Course");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(550, 530, 70, 30);

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setText("Submitted Fee");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(550, 570, 98, 30);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(790, 570, 274, 30);

        jTextField11.setEditable(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(790, 360, 274, 30);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(790, 410, 274, 30);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14);
        jTextField14.setBounds(790, 450, 274, 30);

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15);
        jTextField15.setBounds(790, 490, 274, 30);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1120, 360, 100, 40);

        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(360, 330, 149, 20);

        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(790, 530, 270, 30);

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
        jLabel22.setText("        Staff List");
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

        jLabel25.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel25.setText("        New Adimission");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel25);
        jLabel25.setBounds(20, 90, 200, 38);

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/home (1).png"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(20, 30, 29, 25);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(2, 332, 236, 3);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(2, 73, 236, 10);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel13);
        jLabel13.setBounds(20, 150, 30, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel14);
        jLabel14.setBounds(20, 210, 30, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-update-user-32.png"))); // NOI18N
        jPanel5.add(jLabel17);
        jLabel17.setBounds(20, 280, 32, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/question.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(20, 420, 32, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-delete-bin-30.png"))); // NOI18N
        jPanel5.add(jLabel28);
        jLabel28.setBounds(20, 360, 30, 30);

        jLabel27.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel27.setText("        App info");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel27);
        jLabel27.setBounds(20, 420, 170, 38);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-student-registration-30.png"))); // NOI18N
        jPanel5.add(jLabel29);
        jLabel29.setBounds(20, 90, 40, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 240, 670);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserFream/614504-PNJGMU-681.jpg"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-120, -390, 1670, 1460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, 59, 1370, 620);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Education\\Downloads\\list(1).png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText(" X");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel24.setText("        Update Student");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1255, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
           try {
            // TODO add your handling code here:
           String x= jComboBox2.getSelectedItem().toString();
               
            Connection con =  ConnectonClass.getConnection();
            String query = " SELECT * FROM student_info WHERE  Addmision_Year=?";
           
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, x);
            
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            
     
           }catch(CommunicationsException e)
        {
            JOptionPane.showMessageDialog(rootPane, "database details not valid");
        }
         catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
             System.out.println(ercode);
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "course already exist in database");
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
            }else if(ercode == 1452)
            {
                JOptionPane.showMessageDialog(rootPane, "dont have this course");
            }
         }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
                try {
            // TODO add your handling code here:
           String x= jComboBox1.getSelectedItem().toString();
               
            Connection con =  ConnectonClass.getConnection();
            String query = " SELECT * FROM student_info WHERE Feculty_Name=?";
           
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, x);
            
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            
     
           }catch(CommunicationsException e)
        {
            JOptionPane.showMessageDialog(rootPane, "database details not valid");
        }
         catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
             System.out.println(ercode);
            if(ercode == 1062)
            {
                JOptionPane.showMessageDialog(rootPane, "course already exist in database");
            }else if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(rootPane, "problem with database schema");
            }else if(ercode == 1452)
            {
                JOptionPane.showMessageDialog(rootPane, "dont have this course");
            }
         }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
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
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            int n = jTable1.getSelectedRow();
            int year= Integer.parseInt(jTable1.getValueAt(n, 0).toString());
            String name = jTable1.getValueAt(n, 1).toString();
            String cname = jTable1.getValueAt(n, 2).toString();
            cf =Integer.parseInt(jTable1.getValueAt(n, 3).toString());
            String fname = jTable1.getValueAt(n, 4).toString();
            int sf = Integer.parseInt(jTable1.getValueAt(n, 5).toString());
            String address = jTable1.getValueAt(n, 8).toString();
            String phone = jTable1.getValueAt(n, 9).toString();
            String email= jTable1.getValueAt(n, 10).toString();
            Connection con = ConnectonClass.getConnection();
            String query = "select Course_Name from course";
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            DefaultComboBoxModel combomodel = new DefaultComboBoxModel();
            combomodel.addElement(cname);
            while(rs.next())
            {
                String c = rs.getString("Course_Name");
                combomodel.addElement(c);
            }
            
            jComboBox5.setModel(combomodel);
            jTextField11.setText(name);
            jTextField13.setText(String.valueOf(phone));
            jTextField14.setText(email);
            jTextField15.setText(address);
            jTextField10.setText(String.valueOf(sf));
        } catch (SQLException ex) {
            Logger.getLogger(UpsateStudentH1.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      String n =jTextField11.getText();
      if(n.equals(""))
      {
      JOptionPane.showMessageDialog(null,"Please select data from table");
      return;
      }
     String phone =jTextField13.getText();   
    String email =jTextField14.getText();    
    String address =jTextField15.getText();         
     String cname=jComboBox5.getSelectedItem().toString();
    int sf =Integer.parseInt(jTextField10.getText());  
    int pf=cf-sf;
    JOptionPane.showMessageDialog(null, "your Pending Fee is "+pf);
      try{ 
    int s = Integer.parseInt(JOptionPane.showInputDialog("Enter the following number to update\n"+
               
                "'1.Phone Number'\n"+
                "'2.Email'\n"+
                "'3.Address'\n"+                                                                                                                
                "'4.Course'\n"+
                "'5.Submitted Fee'\n"+"or 6.Upadate 'all'  "));
       if(s==1)
       {
        String q="UPDATE student_info SET Phone_no = ? WHERE Student_Name=?";
          CostmizeDitalesTable.deleStudentData(q, n, phone);
           ResultSet rs = CostmizeDitalesTable.seStudentList(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
       }
       if(s==2)
       {
       String q="UPDATE student_info SET Email = ? WHERE Student_Name=?";
         CostmizeDitalesTable.delStudentData(q, n, email);
           ResultSet rs = CostmizeDitalesTable.seStudentList();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       if(s==3)
       {
       String q="UPDATE student_info SET Address = ? WHERE Student_Name=?";
         CostmizeDitalesTable.deleStudent(q, n, address);
           ResultSet rs = CostmizeDitalesTable.seStudentList(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       if(s==4)
       {
       String q="UPDATE student_info SET Course_Name = ? WHERE Student_Name=?";
        String qu="UPDATE student_info SET Course_Fees="
                + "(SELECT Course_Fee FROM course WHERE Course_Name=?),\n" +
                 " Feculty_Name="
                + "(SELECT Feculty_Name FROM course WHERE Course_Name=?),\n" +
                " Course_Duration ="
                + "(SELECT Course_Duration FROM course WHERE Course_Name=?)\n" +
                " WHERE Student_Name = ?";
          CostmizeDitalesTable.deleStudentData(q, qu, n, cname);
           ResultSet rs = CostmizeDitalesTable.seStudentList(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       if(s==5)
       {
         String q="UPDATE student_info SET Deposited_Fees = ?,Pending_Fee=? WHERE Student_Name=?";
         CostmizeDitalesTable.deleStudentData(q, n, sf, pf);
           ResultSet rs = CostmizeDitalesTable.seStudentList(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       if(s==6)
       {
        String q="UPDATE student_info SET Course_Name = ? WHERE Student_Name=?";
        String qu="UPDATE student_info SET Course_Fees="
                + "(SELECT Course_Fee FROM course WHERE Course_Name=?),\n" +
                 " Feculty_Name="
                + "(SELECT Feculty_Name FROM course WHERE Course_Name=?),\n" +
                " Course_Duration ="
                + "(SELECT Course_Duration FROM course WHERE Course_Name=?)\n" +
                " WHERE Student_Name = ?";
        String que="UPDATE student_info SET Deposited_Fees = ?,Pending_Fee=? ,Email = ?,Phone_no = ?,"
                + "Address = ? WHERE Student_Name=?";
          CostmizeDitalesTable.deleStudentData(q, qu, que, n,cname, sf, pf, phone,email,address);
           ResultSet rs = CostmizeDitalesTable.seStudentList(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
      }catch(NumberFormatException ex)
      {
        
        ex.printStackTrace();
        
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        try {
            // TODO add your handling code here:
            String x= jComboBox4.getSelectedItem().toString();
            
            Connection con =  ConnectonClass.getConnection();
            //  String query = " SELECT Faculty_Name FROM course WHERE Course_Name=?";
           
            //PreparedStatement ps = con.prepareStatement(query);
            String q="SELECT * FROM student_info WHERE Course_Name=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, x);
            
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
        } catch (SQLException ex) {
            Logger.getLogger(UpsateStudentH1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        //student list
        StudentListH1.main(null);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        //updatestudent
       
        UpsateStudentH1.main(null);
        x=2;
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        //staf list
        StafListH1.main(null);
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        //drop data
        DropDataH1.main(null);
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        //add Student
        StudentFrameH1.main(null);
        dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        //home

        HomePage1.main(null);
        dispose();
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        infoAppH1.main(null);
        dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

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
            java.util.logging.Logger.getLogger(UpsateStudentH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpsateStudentH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpsateStudentH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpsateStudentH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpsateStudentH1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    // End of variables declaration//GEN-END:variables

   
}
