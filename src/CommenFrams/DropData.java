/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommenFrams;

import AddminFrane.CostomizeDitale;
import ClassForSetInfoInTable.CostmizeDitalesTable;
import DropData.Drop;
import HomePageJframe.HomePage;
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
public class DropData extends javax.swing.JFrame {

    /**
     * Creates new form DropData
     */
    public DropData() {
        initComponents();
        jPanel5.setVisible(false);
         ResultSet rs = CostmizeDitalesTable.setStudentInfo();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            showCourseInComboBox();
    }
    public static int x=2;
    public static String Sname;
    public static String Cname;
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
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1446, 709));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 250, 910, 260);

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("Serch Student ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(254, 65, 120, 29);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(392, 65, 289, 42);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("Course");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(254, 163, 103, 20);

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(392, 154, 289, 29);

        jButton1.setText("Drop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 520, 118, 44);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/home (1).png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(20, 30, 29, 25);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(2, 332, 236, 3);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(2, 73, 236, 10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-tune-24.png"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, 100, 24, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel16);
        jLabel16.setBounds(20, 150, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-todo-list-30.png"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(20, 210, 30, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-update-user-32.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(20, 280, 32, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/question.png"))); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 510, 32, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-delete-bin-30.png"))); // NOI18N
        jPanel5.add(jLabel17);
        jLabel17.setBounds(20, 360, 30, 30);

        jLabel27.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel27.setText("        App info");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel27);
        jLabel27.setBounds(20, 500, 170, 38);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePageJframe/icons8-student-registration-30.png"))); // NOI18N
        jPanel5.add(jLabel12);
        jLabel12.setBounds(20, 430, 40, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, -10, 240, 680);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Education\\Desktop\\images\\614504-PNJGMU-681.jpg")); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-30, -490, 1400, 1460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 66, 1370, 660);

        jLabel37.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel37.setText("    Drop Data");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(480, 10, 131, 42);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Education\\Downloads\\list(1).png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText(" X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1255, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int n = jTable1.getSelectedRow();
       Sname= jTable1.getValueAt(n, 1).toString();
       Cname= jTable1.getValueAt(n, 2).toString();
       
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null, "You want delete the selected Student");
           //JOptionPane.showMessageDialog(null, x);
           Drop.dropStudent(x, Sname,Cname);
         ResultSet r = CostmizeDitalesTable.setStudentInfo();
        jTable1.setModel(DbUtils.resultSetToTableModel(r)); 
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
               Connection con = null;
        try {
            // TODO add your handling code here:
            String text =jTextField1.getText();
            
             con = ConnectonClass.getConnection();
            String q ="SELECT * FROM student_info WHERE Student_Name LIKE '%"+text+"%'";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ResultSet rs = ps.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
     
        } catch (SQLException ex) {
            Logger.getLogger(DropData.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(DropData.class.getName()).log(Level.SEVERE, null, ex);
           }
        }

    }//GEN-LAST:event_jTextField1KeyReleased

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
        x=2;
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
        infoApp.main(null);
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
            java.util.logging.Logger.getLogger(DropData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DropData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DropData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DropData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DropData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
