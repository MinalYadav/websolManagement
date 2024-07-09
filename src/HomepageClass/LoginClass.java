
package HomepageClass;

import HomePageJframe.HomePage;
import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Education
 */
public class LoginClass {
    public static ResultSet userLogin(String la , String us)
    {
        try {
            Connection con =ConnectonClass.getConnection();
            String q ="SELECT * FROM login WHERE Login_As=? AND User_Name=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, la);
            ps.setString(2, us);
            ResultSet rs = ps.executeQuery();
           return rs;
        } catch (SQLException ex) {
            Logger.getLogger(LoginClass.class.getName()).log(Level.SEVERE, null, ex);
       
        }
        return null;
    }
    
}
