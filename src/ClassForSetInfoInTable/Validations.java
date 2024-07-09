package ClassForSetInfoInTable;


import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Validations {
    
    public static boolean containsOnlyAlphabets(String value)
    {
       if(Pattern.matches("^[a-zA-Z]+$",value))
           return true;
       
       return false;
    }
    
    public static boolean isValidMobileNo(String value)
    {
         if(Pattern.matches("^[6-9][0-9]{9}$", value))
             return true;
         
         return false;
    }
     public static boolean isEValid(String eml)
   {
     String emlRegex =   "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
     Pattern pat=Pattern.compile(emlRegex);
     if(eml==null)
     {
       return false;
     }
     
         return pat.matcher(eml).matches();
   }
     
}
