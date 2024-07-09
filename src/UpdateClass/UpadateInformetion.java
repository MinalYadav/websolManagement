/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateClass;

import AddminFrane.CostomizeDitale;
import HomepageClass.ConnectonClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Education
 */
public class UpadateInformetion
{
    public static void updateFeculty(int fee,String fname,String qu,String ph)
    {
     
         try {
            Connection con= ConnectonClass.getConnection();
            String q ="UPDATE feculty_info SET Feculty_Fee=?,Phone_Number=? WHERE Feculty_Name=? and Education=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,fee);
            ps.setString(4,qu);
            ps.setString(2,ph);
            ps.setString(3,fname);
            int s=ps.executeUpdate();
            if(s>0)
            {
             JOptionPane.showMessageDialog(null, "Feculty updated");
            }
            // JOptionPane.showMessageDialog(null, s);
             if(s==0)
             {
             JOptionPane.showMessageDialog(null, "Feculty dose not Eixist");
             }
             con.close();
         
            
         }
         catch (SQLException ex) {
             Logger.getLogger(UpadateInformetion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
          public static void updateCourse(String cname,int cfee, String fname,int duretion,int s)
         {
       
         try {
            Connection con= ConnectonClass.getConnection();
               if(s==1)
              {
                 String q ="UPDATE course SET Course_Fee=? WHERE Course_Name=?";
                  PreparedStatement ps=con.prepareStatement(q);
                  ps.setInt(1,cfee);
                  ps.setString(2,cname);
                        int m= ps.executeUpdate();
                        if(m>0)
                {
                 JOptionPane.showMessageDialog(null, "Course Update Succesfuly");
                }
            // JOptionPane.showMessageDialog(null, m);
              }
       
               if(s==2)
               {
                  String q = "UPDATE course SET Faculty_Name=? WHERE Course_Name=?";
                   PreparedStatement ps=con.prepareStatement(q);
                   ps.setString(1,fname);
                   ps.setString(2,cname);
                         int m= ps.executeUpdate();
                         if(m>0)
                {
                 JOptionPane.showMessageDialog(null, "Course Update Succesfuly");
                }
            // JOptionPane.showMessageDialog(null, m);
             
               }
             if(s==3)
             {
               String q ="UPDATE course SET Course_Duretion=? WHERE Course_Name=?";
                 PreparedStatement ps=con.prepareStatement(q);
                  ps.setInt(1,duretion);
                  ps.setString(2,cname);
                        int m= ps.executeUpdate();
                        if(m>0)
                {
                 JOptionPane.showMessageDialog(null, "Course Update Succesfuly");
                }
             //JOptionPane.showMessageDialog(null, m);
            
              }
           if(s==4)
            {
              String q ="UPDATE course SET Faculty_Name=?,Course_Fee=?,Course_Duretion=?"
                      + " WHERE Course_Name=?";
              PreparedStatement ps=con.prepareStatement(q);
                ps.setString(1,fname);
                ps.setInt(2,cfee);
                ps.setInt(3,duretion);
                 ps.setString(4,cname);
                int m= ps.executeUpdate();
                if(m>0)
                {
                 JOptionPane.showMessageDialog(null, "Course Update Succesfuly");
                }
                
               
             //JOptionPane.showMessageDialog(null, m);
            
                
            }
            }catch (SQLException ex) {
            
            int ercode = ex.getErrorCode();
            if(ercode == 1136)
            {
                JOptionPane.showMessageDialog(null, "problem with database schema");
            }
            else if(ercode==1452)
            {
              JOptionPane.showMessageDialog(null,"Feculty dose not exist.Please add Feculty");
            }
           
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "course fee must be numeric");
        }
            
         
                  
         
        
     
       
    
         }
    
}
