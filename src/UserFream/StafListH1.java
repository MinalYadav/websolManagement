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

public class StafListH1 extends javax.swing.JFrame {

    /**
     * Creates new form StafList
     */
    public StafListH1() {
        initComponents();
       jPanel5. setVisible(false);
       ResultSet rs = CostmizeDitalesTable.setStafList();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
            showCourseInComboBox();
            showStafIncome();
            
            
    }
    
    public static int x=2;
    public void showStafIncome()
    {
             
        try {
            Connection con =  ConnectonClass.getConnection();
            String query = "SELECT SUM(Feculty_Fee)AS Staf_Total_Fee FROM feculty_info";       
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
              int n=rs.getInt("Staf_Total_Fee");
              jLabel14.setText(String.valueOf(n));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StafListH1.class.getName()).log(Level.SEVERE, null, ex);
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
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1446, 709));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(248, 90, 710, 320);

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("Course");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(280, 520, 103, 20);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("Search Staff");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(280, 30, 90, 20);

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(440, 520, 149, 20);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Total  Fee Of Staff");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(280, 560, 140, 30);

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(jLabel14);
        jLabel14.setBounds(440, 560, 140, 30);

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setText("Show Staff According to:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(280, 460, 225, 20);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(400, 20, 270, 40);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/home (1).png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(20, 30, 29, 25);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(2, 332, 236, 3);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(2, 73, 236, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(20, 150, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(20, 210, 30, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-update-user-32.png"))); // NOI18N
        jPanel5.add(jLabel17);
        jLabel17.setBounds(20, 280, 32, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/question.png"))); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 420, 32, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-delete-bin-30.png"))); // NOI18N
        jPanel5.add(jLabel12);
        jLabel12.setBounds(20, 360, 30, 30);

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-student-registration-30.png"))); // NOI18N
        jPanel5.add(jLabel13);
        jLabel13.setBounds(20, 90, 40, 30);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(0, 0, 240, 670);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserFream/614504-PNJGMU-681.jpg"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(-40, -520, 1670, 1460);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 60, 1360, 670);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Education\\Downloads\\list(1).png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText(" X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel37.setText("   Staff List");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 720, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
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
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        try {
            // TODO add your handling code here:
            String x= jComboBox3.getSelectedItem().toString();

            Connection con =  ConnectonClass.getConnection();
           // String query = " SELECT Faculty_Name FROM course WHERE Course_Name=?";
            //PreparedStatement ps = con.prepareStatement(query);
            //ps.setString(1, x);
            //ResultSet rs = ps.executeQuery();
            //String nam="";
            //while(rs.next())
            //{
              //  String n=rs.getString("Faculty_Name");
               // nam=n;
              
            //}
              Connection co =ConnectonClass.getConnection();
                String q="SELECT * FROM feculty_info WHERE Feculty_Name=(SELECT Faculty_Name FROM course WHERE Course_Name=?)";
                PreparedStatement p = co.prepareStatement(q);
                p.setString(1, x);
                ResultSet r = p.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(r));


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

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
                 Connection con = null;
        try {
            // TODO add your handling code here:
            String text =jTextField1.getText();
            
             con = ConnectonClass.getConnection();
            String q ="SELECT * FROM feculty_info WHERE Feculty_Name LIKE '%"+text+"%'";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ResultSet rs = ps.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
     
        } catch (SQLException ex) {
            Logger.getLogger(StafListH1.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(StafListH1.class.getName()).log(Level.SEVERE, null, ex);
           }
        }

    }//GEN-LAST:event_jTextField1KeyReleased

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
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        //staf list
        StafListH1.main(null);
        x=2;
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
            java.util.logging.Logger.getLogger(StafListH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StafListH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StafListH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StafListH1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StafListH1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
