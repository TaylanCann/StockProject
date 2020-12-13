package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Staff {
    
    public int Id;
    public String StaffName;
    public String StaffSurname;
    public String Task;
    public String UserName;
    public String Password;
    
    public Staff(int Id,String StaffName,String StaffSurname,String Task,String UserName,String Password)
    {
      this.Id=Id;
      this.StaffName=StaffName;
      this.StaffSurname=StaffSurname;
      this.Task=Task;
      this.UserName=UserName;
      this.Password=Password;
    }
    
    public static int Add(String StaffName, String StaffSurname, String Task, String UserName, String Password) {

        return Things.Add("Insert Into Staff (StaffName,StaffSurname,Task,UserName,Password) Values (" + StaffName + "," + StaffSurname
                + "," + Task + ",'" + UserName + "'," + Password + ")");

    }
    
    public static int Delete(int Id) {

        return Things.Delete("Delete From Product where Id=" + Id);
    }
    
    public static int Update(int Id,String StaffName, String StaffSurname, String Task, String UserName, String Password) {

        return Things.Update("Update Staff Set StaffName=" + StaffName + ",StaffSurname=" + StaffSurname + ",Task=" + Task + 
                ",UserName='" + UserName +"',Password=" + Password + " where Id=" + Id);

    }
    
    
    public static List<Staff> Listing() {

        ResultSet rs = Things.List("Select * From Staff ");

        List<Staff> Listeleme=new ArrayList<Staff>();
        try {
            {
                while ( rs.next() ) {
                Listeleme.add (new Staff (Integer.parseInt(rs.getString("Id")),
                          rs.getString("StaffName"),
                          rs.getString("StaffSurname"),
                          rs.getString("Task"),
                          rs.getString("Username"),
                          rs.getString("Password")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataStaffClass");
        } 
        return null;
    }

    public static List<Sales> Searching(int Id ) {

        ResultSet rs = Things.List("Select * From Sales where Id="+Id);

        List<Sales> Listeleme=new ArrayList<Sales>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Sales(Integer.parseInt(rs.getString("Id")),
                          Integer.parseInt(rs.getString("CustomerId")),
                          Integer.parseInt(rs.getString("StaffId")),
                          Integer.parseInt(rs.getString("ProductId")),
                          rs.getString("ProcessDate"),
                          Float.parseFloat(rs.getString("Price"))));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrductClass");
        } 
        return null;
    }
    
    
}
