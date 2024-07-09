/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommenFrams;

import AddminFrane.CostomizeDitale;
import ClassForSetInfoInTable.CostmizeDitalesTable;
import HomePageJframe.HomePage;
import HomepageClass.ConnectonClass;
import HomepageClass.ShowComboboxInfo;
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
public class StudentList extends javax.swing.JFrame {

    /**
     * Creates new form StudenList
     */
    
    public StudentList() {
        initComponents();
        jPanel5.setVisible(false);
       
            ResultSet rs = CostmizeDitalesTable.seStudentList();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            showCourseInComboBox();
            showCourseComboBox();
            showFecultyComboBox();
             showIncome();
    }
     public static int x=2;
     public void showIncome()
     {
        try {
            Connection con =  ConnectonClass.getConnection();
            String query = "SELECT SUM(Course_Fees)AS Total_income FROM student_info";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               int tin = rs.getInt("Total_income");
                jLabel11.setText(String.valueOf(tin));
            }
                 Connection c =  ConnectonClass.getConnection();
            String qu = "SELECT SUM(Deposited_Fees)AS Submitted_Fee FROM student_info";
            PreparedStatement p = c.prepareStatement(qu);
            ResultSet r = p.executeQuery();
            while(r.next()){
               int sin = r.getInt("Submitted_Fee");
                jLabel10.setText(String.valueOf(sin));
            }
                   Connection co =  ConnectonClass.getConnection();
            String que = "SELECT SUM(Pending_Fee)AS Pending_Fee FROM student_info";
            PreparedStatement po = c.prepareStatement(que);
            ResultSet rss = po.executeQuery();
            while(rss.next()){
               int pin = rss.getInt("Pending_Fee");
                jLabel16.setText(String.valueOf(pin));
              
            }
           
        
           
     }  catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
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
            
            jComboBox3.setModel(combomodel);
            
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
            String query = "SELECT * FROM st_year";
           
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            DefaultComboBoxModel combomode2 = new DefaultComboBoxModel();
            combomode2.addElement("Select Year");
            while(rs.next())
            {
                int cname = rs.getInt("A_Year");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1446, 709));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(26);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 0, 1100, 290);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Show Studen According to:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(328, 291, 225, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Course");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(328, 333, 64, 20);

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(490, 340, 149, 22);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Year");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(700, 340, 52, 20);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(489, 412, 149, 22);

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
        jComboBox2.setBounds(800, 340, 149, 22);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("Feculty Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(328, 410, 103, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("Total Fee");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 470, 103, 20);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("Submitted income");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 540, 129, 32);

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 540, 150, 40);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(490, 460, 150, 30);

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setText("Remeing income");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(690, 490, 129, 32);

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(850, 490, 150, 40);

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        rb2.setText(" Pending Fee");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rb2);
        rb2.setBounds(950, 420, 130, 29);

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        rb1.setText(" Submitted Fee");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb1);
        rb1.setBounds(800, 420, 140, 30);

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel19.setText("Fee");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(700, 420, 80, 20);

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

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/home (1).png"))); // NOI18N
        jPanel5.add(jLabel31);
        jLabel31.setBounds(20, 30, 29, 25);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(2, 332, 236, 3);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(2, 73, 236, 10);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-tune-24.png"))); // NOI18N
        jPanel5.add(jLabel32);
        jLabel32.setBounds(20, 100, 24, 20);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel33);
        jLabel33.setBounds(20, 150, 30, 30);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel39);
        jLabel39.setBounds(20, 210, 30, 30);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-update-user-32.png"))); // NOI18N
        jPanel5.add(jLabel40);
        jLabel40.setBounds(20, 280, 32, 30);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/question.png"))); // NOI18N
        jPanel5.add(jLabel34);
        jLabel34.setBounds(20, 510, 32, 30);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-delete-bin-30.png"))); // NOI18N
        jPanel5.add(jLabel41);
        jLabel41.setBounds(20, 360, 30, 30);

        jLabel27.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel27.setText("        App info");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel27);
        jLabel27.setBounds(20, 500, 170, 40);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-student-registration-30.png"))); // NOI18N
        jPanel5.add(jLabel42);
        jLabel42.setBounds(20, 430, 40, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, -10, 240, 680);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, -390, 1670, 1460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, 59, 1370, 680);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

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

        jLabel28.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel28.setText("        Student List");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
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
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
           String x= jComboBox3.getSelectedItem().toString();
               
            Connection con =  ConnectonClass.getConnection();
            String query = " SELECT * FROM student_info WHERE Course_Name=?";
           
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, x);
            
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            
    // SELECT SUM(Course_Fees)AS Total_income FROM student_info WHERE Course_Name='c++'
     Connection co =  ConnectonClass.getConnection();
            String qu = "SELECT SUM(Course_Fees)AS Total_income FROM student_info WHERE Course_Name=?";
            PreparedStatement p = co.prepareStatement(qu);
             p.setString(1,x);
            ResultSet r = p.executeQuery();
            while(r.next()){
               int tin = r.getInt("Total_income");
                jLabel11.setText(String.valueOf(tin));
            }
            //Deposited Fee
                 Connection c =  ConnectonClass.getConnection();
            String q = "SELECT SUM(Deposited_Fees)AS Submitted_Fee FROM student_info WHERE Course_Name=?";
            PreparedStatement pss = c.prepareStatement(q);
            pss.setString(1,x);
            ResultSet rss = pss.executeQuery();
            while(rss.next()){
               int sin = rss.getInt("Submitted_Fee");
                jLabel10.setText(String.valueOf(sin));
            } 
             Connection coo =  ConnectonClass.getConnection();
            String qe = "SELECT SUM(Pending_Fee)AS Pending_Fee FROM student_info WHERE Course_Name=?";
            PreparedStatement po = coo.prepareStatement(qe);
            po.setString(1,x);
            ResultSet re = po.executeQuery();
            while(re.next()){
               int pin = re.getInt("Pending_Fee");
                 
                jLabel16.setText(String.valueOf(pin));
              
            }      
     
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
    }//GEN-LAST:event_jComboBox3ItemStateChanged

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
            
            Connection co =  ConnectonClass.getConnection();
            String qu = "SELECT SUM(Course_Fees)AS Total_income FROM student_info WHERE Addmision_Year=?";
            PreparedStatement p = co.prepareStatement(qu);
             p.setInt(1,Integer.parseInt(x));
            ResultSet r = p.executeQuery();
            while(r.next()){
               int tin = r.getInt("Total_income");
                jLabel11.setText(String.valueOf(tin));
            }
            //Deposited Fee
                 Connection c =  ConnectonClass.getConnection();
            String q = "SELECT SUM(Deposited_Fees)AS Submitted_Fee FROM student_info WHERE Addmision_Year=?";
            PreparedStatement pss = c.prepareStatement(q);
            pss.setInt(1,Integer.parseInt(x));
            ResultSet rss = pss.executeQuery();
            while(rss.next()){
               int sin = rss.getInt("Submitted_Fee");
                jLabel10.setText(String.valueOf(sin));
            } 
             Connection coo =  ConnectonClass.getConnection();
            String qe = "SELECT SUM(Pending_Fee)AS Pending_Fee FROM student_info WHERE Addmision_Year=?";
            PreparedStatement po = coo.prepareStatement(qe);
            po.setInt(1,Integer.parseInt(x));
            ResultSet re = po.executeQuery();
            while(re.next()){
               int pin = re.getInt("Pending_Fee");
                 
                jLabel16.setText(String.valueOf(pin));
              
            }      
     
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

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
           if(rb1.isSelected())
        {
          ResultSet rs=  ShowComboboxInfo.showSubmittedFee();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
        }
        else{
            if(rb2.isSelected())
            {
               ResultSet rs=  ShowComboboxInfo.showPendingFee();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            }
                }
            
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        if(rb1.isSelected())
        {
          ResultSet rs=  ShowComboboxInfo.showSubmittedFee();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
        }
        else{
            if(rb2.isSelected())
            {
               ResultSet rs=  ShowComboboxInfo.showPendingFee();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            }
                }
            

    }//GEN-LAST:event_rb1ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        //student list
        StudentList.main(null);
        x=2;
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

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

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
            java.util.logging.Logger.getLogger(UpsateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpsateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpsateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpsateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables
}
