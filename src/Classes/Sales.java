package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Sales {
    
    public int Id;
    public int CustomerId;
    public int StaffId;
    public int ProductId;
    public String ProcessDate;
    public float TotalPrice;

    public Sales(int Id,int CustomerId, int StaffId,int ProductId,String ProcessDate,float TotalPrice)
    {
      this.Id=Id;
      this.CustomerId=CustomerId;
      this.StaffId=StaffId;
      this.ProductId=ProductId;
      this.ProcessDate=ProcessDate;
      this.TotalPrice=TotalPrice;
    }
    
    public static int Add(int CustomerId, int StaffId, int ProductId, String ProcessDate, float TotalPrice) {

        return Things.Add("Insert Into Sales (CustomerId,StaffId,ProductId,ProcessDate,TotalPrice) Values (" + CustomerId + "," + StaffId
                + "," + ProductId + ",'" + ProcessDate + "'," + TotalPrice + ")");

    }
    
    public static int Delete(int Id) {

        return Things.Delete("Delete From Product where Id=" + Id);
    }
    
    public static int Update(int Id,int CustomerId, int StaffId, int ProductId, String ProcessDate, float TotalPrice) {

        return Things.Update("Update Sales Set CustomerId=" + CustomerId + ",StaffId=" + StaffId + ",ProductId=" + ProductId + 
                ",ProcessDate='" + ProcessDate +"',TotalPrice=" + TotalPrice + " where Id=" + Id);

    }
    
    public static List<Sales> Listing() {

        ResultSet rs = Things.List("Select * From Sales ");

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
            System.out.println("HataPrducastClass");
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
