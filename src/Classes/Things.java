package Classes;

import Interfaces.IAddUpdate;
import Interfaces.IDelete;
import Interfaces.ISearchList;
import java.sql.ResultSet;

public class Things implements IAddUpdate,ISearchList {
   
    public static int Delete (String SQL){
        return IDelete.Delete(SQL);
    } 
    
    public static int Add (String SQL){
        return IAddUpdate.Add(SQL);
    }
    public static int Update (String SQL){
       return IAddUpdate.Update(SQL);
    }
    
    public static ResultSet Search(String SQL){
        return ISearchList.Search(SQL);
    }
    public static ResultSet List(String SQL){
        return ISearchList.List(SQL);
    }
    
}
