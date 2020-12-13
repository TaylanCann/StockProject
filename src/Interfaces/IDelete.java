package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public interface IDelete {
    
    public static int Delete (String SQL)   {

    try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
            
            Connection connection =( DriverManager.getConnection("jdbc:ucanaccess://" + IDelete.class.getProtectionDomain().getCodeSource().getLocation().getPath() 
                    + "..\\..\\JavaAccessStock.mdb"));

            Statement st = connection.createStatement();
            st.executeUpdate(SQL);
        } catch (Exception e) {
            return -1;
        }

        return 0;
       }
    
}
