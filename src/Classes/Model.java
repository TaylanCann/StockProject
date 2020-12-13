package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Model {
    public int Id;
    public String ModelName;
    
    public Model(int Id,String ModelName)
    {
      this.Id=Id;
      this.ModelName=ModelName;
    }
    
    public static int Add(String ModelName) {

        return Things.Add("Insert Into Model (ModelName) Values ('" + ModelName + "')");
    }
    
    public static int Delete(int Id) {

        return Things.Delete("Delete From Model where Id=" + Id);
    }
    
    public static int Update(int Id, String ModelName) {

        return Things.Update("Update Model set ModelName=" + ModelName + " where Id=" + Id);
    }
    
    public static List<Model> Listing() {

        ResultSet rs = Things.List("Select * From Model ");

        List<Model> Listeleme=new ArrayList<Model>();
        try {
            {
                while (rs.next() ) {
                  Listeleme.add(new Model(Integer.parseInt(rs.getString("Id")),rs.getString("ModelName")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrductClass");
        } 
        return null;
    }
    
    public static List<Model> Searching(int Id) {

        ResultSet rs = Things.List("Select * From Model where Id="+Id);

        List<Model> Listeleme=new ArrayList<Model>();
        try {
            {
                while (rs.next()) {
                  Listeleme.add(new Model(Integer.parseInt(rs.getString("Id")),rs.getString("ModelName")));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrductClass");
        } 
        return null;
    }
    
}
