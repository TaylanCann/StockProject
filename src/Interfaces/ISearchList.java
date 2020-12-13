package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
        
public interface ISearchList {
    
public static ResultSet List(String SQL){
   
    try{
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
              
              Connection connection =( DriverManager.getConnection("jdbc:ucanaccess://" + ISearchList.class.getProtectionDomain().getCodeSource().getLocation().getPath() 
                    + "..\\..\\JavaAccessStock.mdb"));
              
              System.out.println("Connected Successfully");

              Statement stmt = null;
              stmt = connection.createStatement();
                ResultSet resultSet=stmt.executeQuery(SQL);
              return resultSet;
          }catch(Exception e){
              System.out.println("Error in connection");
 
          }
        return null; 
}

public static ResultSet Search(String SQL){
   
    try{
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//Loading Driver
              Connection connection =( DriverManager.getConnection("jdbc:ucanaccess://" + ISearchList.class.getProtectionDomain().getCodeSource().getLocation().getPath() 
                    + "..\\..\\JavaAccessStock.mdb"));
              
              System.out.println("Connected Successfully");

              Statement stmt = null;
              stmt = connection.createStatement();
                ResultSet resultSet=stmt.executeQuery(SQL);
              return resultSet;
          }catch(Exception e){
              System.out.println("Error in connection");
 
          }
        return null; 
}
   
    
}
