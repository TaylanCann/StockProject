package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    public int Id;
    public String CustomerName;
    public String CustomerSurname;
    
    public Customer(int Id,String CustomerName,String CustomerSurname)
    {
      this.Id=Id;
      this.CustomerName=CustomerName;
      this.CustomerSurname=CustomerName;
    }
    
    public static int Add(String CustomerName,String CustomerSurname) {

        return Things.Add("Insert Into Customer (CustomerName,CustomerSurname) Values ('" + CustomerName + "','" +CustomerSurname+ "')");
    }
    
    public static int Delete(int Id) {

        return Things.Delete("Delete From Customer where Id=" + Id);
    }

    public static int Update(int Id,String CustomerName, String CustomerSurname ) {

        return Things.Update("Update Customer Set CustomerName='" + CustomerName + "',CustomerSurname='" + CustomerSurname + "' where Id=" + Id);

    }
    
     public static List<Customer> Listing() {

        ResultSet rs = Things.List("Select * From Customer ");

        List<Customer> Listeleme=new ArrayList<Customer>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Customer(Integer.parseInt(rs.getString("Id")),rs.getString("CustomerName"),rs.getString("CustomerSurname")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataBrandClass");
        } 
        return null;
    }
    
    public static List<Customer> Searching(int Id) {

        ResultSet rs = Things.List("Select * From Customer where Id="+Id);

        List<Customer> Listeleme=new ArrayList<Customer>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Customer(Integer.parseInt(rs.getString("Id")),rs.getString("CustomerName"),rs.getString("CustomerSurname")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataBrandClass");
        } 
        return null;
    }
    
}
