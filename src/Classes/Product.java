package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Product {

    public int Id;
    public int ModelId;
    public int BrandId;
    public int CategoryId;
    public String GuaranteePeriod;
    public float Price;
    public int Stock;

    public Product(int Id,int ModelId, int BrandId,int CategoryId,String GuaranteePeriod,float Price,int Stock)
    {
      this.Id=Id;
      this.BrandId=BrandId;
      this.CategoryId=CategoryId;
      this.GuaranteePeriod=GuaranteePeriod;
      this.ModelId=ModelId;
      this.Price=Price;
      this.Stock=Stock;
    }
    
    public static int Add(int ModelId, int BrandId, int CategoryId, String GuaranteePeriod, float Price, int Stock) {

        return Things.Add("Insert Into Product (ModelId,BrandId,CategoryId,GuaranteePeriod,Price,Stock) Values (" + ModelId + "," + BrandId
                + "," + CategoryId + ",'" + GuaranteePeriod + "','" + String.valueOf(Price) + "'," + Stock + ")");

    }

    public static int Delete(int Id) {

        return Things.Delete("Delete From Product where Id=" + Id);
    }

    public static int Update(int Id, int ModelId, int BrandId, int CategoryId, String GuaranteePeriod, float Price, int Stock) {

        return Things.Update("Update Product set ModelId=" + ModelId + ",BrandId=" + BrandId + ",CategoryId=" + CategoryId
                + ",GuaranteePeriod='" + GuaranteePeriod + "',Price=" + Price + ",Stock=" + Stock + " where Id=" + Id);
    }

    public static List<Product> Listing() {

        ResultSet rs = Things.List("Select * From Product ");

        List<Product> Listeleme=new ArrayList<Product>();
        try {
            {
                while (rs.next()) {
                    
                 
                    
                 Listeleme.add(new Product(Integer.parseInt(rs.getString("Id")),
                          Integer.parseInt(rs.getString("ModelId")),
                          Integer.parseInt(rs.getString("BrandId")),
                          Integer.parseInt(rs.getString("CategoryId")),
                          rs.getString("GuaranteePeriod"),
                          Float.parseFloat(rs.getString("Price")),
                          Integer.parseInt(rs.getString("Stock"))));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrducastClass");
        } 
        return null;
    }

    public static List<Product> Searching(int Id ) {

        ResultSet rs = Things.List("Select * From Product where Id = " + Id);

        List<Product> Listeleme=new ArrayList<Product>();
        try {
            {
                
                while (rs.next()) {
                  Listeleme.add(new Product(Integer.parseInt(rs.getString("Id")),
                          Integer.parseInt(rs.getString("ModelId")),
                          Integer.parseInt(rs.getString("BrandId")),
                          Integer.parseInt(rs.getString("CategoryId")),
                          rs.getString("GuaranteePeriod"),
                          Float.parseFloat(rs.getString("Price")),
                          Integer.parseInt(rs.getString("Stock"))));
                }
                return Listeleme;
                        
            }
        } catch (Exception e) {
            System.out.println("HataPrductClass");
        } 
        return null;
    }
    
    
    
}
