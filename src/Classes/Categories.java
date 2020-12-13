
package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Categories {
    
     public int Id;
    public String CategoryName;
    
    public Categories(int Id,String CategoryName)
    {
      this.Id=Id;
      this.CategoryName=CategoryName;
    }
    
    public static int Add(String CategoryName) {

        return Things.Add("Insert Into Categories (CategoryName) Values ('" + CategoryName + "')");
    }
    
    public static int Delete(int Id) {

        return Things.Delete("Delete From Categories where Id=" + Id);
    }
    
    public static int Update(int Id, String CategoryName) {

        return Things.Update("Update Categories set CategoryName=" + CategoryName + " where Id=" + Id);
    }
    
    public static List<Categories> Listing() {

        ResultSet rs = Things.List("Select * From Categories ");

        List<Categories> Listeleme=new ArrayList<Categories>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Categories(Integer.parseInt(rs.getString("Id")),rs.getString("CategoryName")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrductClass");
        } 
        return null;
    }
    
    public static List<Categories> Searching(int Id) {

        ResultSet rs = Things.List("Select * From Categories where Id="+Id);

        List<Categories> Listeleme=new ArrayList<Categories>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Categories(Integer.parseInt(rs.getString("Id")),rs.getString("CategoryName")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrductClass");
        } 
        return null;
    }   
    
}
