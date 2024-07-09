/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DropData;

import HomepageClass.ConnectonClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Education
 */
public class Drop {
    public static void dropFecultyInfo(int x,String fname)
    {
     if(x==0)
    {    try {
        Connection con =ConnectonClass.getConnection();
        String q = "DELETE FROM feculty_info WHERE Feculty_Name=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, fname);
        int i=ps.executeUpdate();
        if(i>0)
        {
        JOptionPane.showMessageDialog(null, "Done");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Faculty dose not exist");
        }
         con.close();
       
         } catch (SQLException ex) {
           ex.printStackTrace();
         }
     }
     else
     {
       return;
     }
      
    }
    
    public static void dropCourse(int x,String cname)
    {
     if(x==0)
    {    try {
        Connection con =ConnectonClass.getConnection();
        String q = "DELETE FROM course WHERE Course_Name=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, cname);
        int i=ps.executeUpdate();
        if(i>0)
        {
        JOptionPane.showMessageDialog(null, "Done");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Course dose not exist");
        }
        
         con.close();
       
         } catch (SQLException ex) {
           ex.printStackTrace();
         }
     }
     else
     {
       return;
     }
      
    }
    public static void dropStudent(int x,String sname, String cname)
    {
     if(x==0)
    {    try {
        Connection con =ConnectonClass.getConnection();
        String q = "DELETE FROM student_info WHERE Student_Name=? AND Course_Name=?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, sname);
        ps.setString(2, cname);
        int i=ps.executeUpdate();
      //  JOptionPane.showMessageDialog(null, "done");
        if(i>0)
        {
        JOptionPane.showMessageDialog(null, "Done");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Student dose not exist");
        }
         con.close();
       
         } catch (SQLException ex) {
           ex.printStackTrace();
         }
     }
     else
     {
       return;
     }
      
    }
}
