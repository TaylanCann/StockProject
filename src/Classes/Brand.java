package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Brand {
    
    public int Id;
    public String BrandName;
    
    public Brand(int Id,String BrandName)
    {
      this.Id=Id;
      this.BrandName=BrandName;
    }
    
    public static int Add(String BrandName) {

        return Things.Add("Insert Into Brand (BrandName) Values ('" + BrandName + "')");
    }
    
    public static int Delete(int Id) {

        return Things.Delete("Delete From Brand where Id=" + Id);
    }
    
    public static int Update(int Id, String BrandName) {

        return Things.Update("Update Brand set BrandName=" + BrandName + " where Id=" + Id);
    }
    
    public static List<Brand> Listing() {

        ResultSet rs = Things.List("Select * From Brand ");

        List<Brand> Listeleme=new ArrayList<Brand>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Brand(Integer.parseInt(rs.getString("Id")),rs.getString("BrandName")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataBrandClass");
        } 
        return null;
    }
    
    public static List<Brand> Searching(int Id) {

        ResultSet rs = Things.List("Select * From Brand where Id="+Id);

        List<Brand> Listeleme=new ArrayList<Brand>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Brand(Integer.parseInt(rs.getString("Id")),rs.getString("BrandName")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataBrandClass");
        } 
        return null;
    }
       
}
