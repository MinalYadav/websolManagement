/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomepageClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Education
 */
public class ShowComboboxInfo
{
public static ResultSet showPendingFee()
{
    try {
        Connection con =  ConnectonClass.getConnection();
        String query = "SELECT * FROM `student_info` WHERE `Deposited_Fees`!=`Course_Fees`";
        PreparedStatement ps = con.prepareStatement(query);
        
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (SQLException ex) {
        Logger.getLogger(ShowComboboxInfo.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;


}
public static ResultSet showSubmittedFee()
{
    try {
        Connection con =  ConnectonClass.getConnection();
        String query = "SELECT * FROM `student_info` WHERE `Deposited_Fees`=`Course_Fees`";
        PreparedStatement ps = con.prepareStatement(query);
        
        ResultSet rs = ps.executeQuery();
        return rs;
    } catch (SQLException ex) {
        Logger.getLogger(ShowComboboxInfo.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}
}
