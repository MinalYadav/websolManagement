
package HomepageClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Education
 */
    public class ConnectonClass {
    
    public static Connection getConnection()
    {
       
            
              try {
            FileReader fr = new FileReader("D:\\Management\\db.properties");
            Properties pos = new Properties();
            pos.load(fr);
            String driver = pos.getProperty("drivername");
            String url=pos.getProperty("url");
            String ip = pos.getProperty("ipaddress");
            String port = pos.getProperty("port");
            String dbname = pos.getProperty("dbname");
            url = url+ip+":"+port+"/"+dbname;

            String username =pos.getProperty("username");
            String password=pos.getProperty("password");
            
            
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            
            return con;
            } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            } catch (IOException ex) {
            ex.printStackTrace();
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
   return null;
     
   
    }
    
    
}
