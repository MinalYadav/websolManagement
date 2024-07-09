/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassForSetInfoInTable;

import AddminFrane.CostomizeDitale;
import HomepageClass.ConnectonClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Education
 */
public class CostmizeDitalesTable {
    public static ResultSet setInfoOfCourse()
    {  
         try {
           
            
            Connection con =ConnectonClass.getConnection();
            String q ="SELECT * FROM course";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return null;

    }
     public static ResultSet setInfoOfFeculty()
    {  
         try {
           
            
            Connection con =ConnectonClass.getConnection();
            String q ="SELECT * FROM feculty_info";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return null;

    }
       public static ResultSet seStudentList()
    {  
         try {
           
            
            Connection con =ConnectonClass.getConnection();
            String q =" SELECT * FROM student_info";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return null;

    }
    
       public static ResultSet setStafList()
    {  
         try {
           
            
            Connection con =ConnectonClass.getConnection();
            String q =" SELECT * FROM feculty_info";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return null;

    }
      public static ResultSet setStudentInfo()
    {  
         try {
           
            
            Connection con =ConnectonClass.getConnection();
            String q =" SELECT * FROM student_info";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return null;

    }
      public static void deleStudentData(String q,String qu ,String n,String cn)
    {
       try {
            Connection con  = ConnectonClass.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, cn);
             ps.setString(2,n);
            Connection c = ConnectonClass.getConnection();
            PreparedStatement p= c.prepareStatement(qu);
            p.setString(1, cn);
             p.setString(2, cn);
              p.setString(3, cn);  
             p.setString(4,n); 
            int x =ps.executeUpdate();
            int y=p.executeUpdate();
           // JOptionPane.showMessageDialog(null, x+"\n"+y);
           if(x>0 && y>0){
           JOptionPane.showMessageDialog(null, "Done");
           }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
       public static void deleStudentData(String q,String qu ,String que,String n,String cn,int df,int pf,String ph,String em,String add)
    {
       try {
            Connection con  = ConnectonClass.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, cn);
             ps.setString(2,n);
            Connection c = ConnectonClass.getConnection();
            PreparedStatement p= c.prepareStatement(qu);
            p.setString(1, cn);
             p.setString(2, cn);
              p.setString(3, cn);  
             p.setString(4,n);
             Connection co = ConnectonClass.getConnection();
            PreparedStatement pr= c.prepareStatement(que);
            pr.setInt(1, df);
            pr.setInt(2, pf);
            pr.setString(3, em);
            pr.setString(4, ph);
            pr.setString(5, add);
            pr.setString(6, n);
             
            int x =ps.executeUpdate();
            int y=p.executeUpdate();
            int z=pr.executeUpdate();
           // JOptionPane.showMessageDialog(null, x+"\n"+y);
           if(x>0 && y>0 && z>0 )
           {
             JOptionPane.showMessageDialog(null, "Done");
           }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        public static void deleStudentData(String q,String n,String ph)
    {
       try {
            Connection con  = ConnectonClass.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, ph);
             ps.setString(2,n);
            int x =ps.executeUpdate();
         //   JOptionPane.showMessageDialog(null, x);
         if(x>0)
         {
         JOptionPane.showMessageDialog(null, "Done");
         }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
         public static void delStudentData(String q,String n,String em)
    {
       try {
            Connection con  = ConnectonClass.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, em);
             ps.setString(2,n);
            int x =ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, x);
             if(x>0)
         {
         JOptionPane.showMessageDialog(null, "Done");
         }else
         {
         JOptionPane.showMessageDialog(null,x);
         }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
          public static void deleStudent(String q,String n,String add)
    {
       try {
            Connection con  = ConnectonClass.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, add);
             ps.setString(2,n);
            int x =ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, x);
               if(x>0)
         {
         JOptionPane.showMessageDialog(null, "Done");
         }else
         {
         JOptionPane.showMessageDialog(null,x);
         }
          //   JOptionPane.showMessageDialog(null, "Done");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
            public static void deleStudentData(String q,String n,int sf,int pf)
    {
       try {
            Connection con  = ConnectonClass.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, sf);
            ps.setInt(2, pf);
             ps.setString(3,n);
            int x =ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, x);
             //JOptionPane.showMessageDialog(null, "Done");
         if(x>0)
         {
         JOptionPane.showMessageDialog(null, "Done");
         }else
         {
         JOptionPane.showMessageDialog(null,x);
         }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
      
}
