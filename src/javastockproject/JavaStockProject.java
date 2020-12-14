package javastockproject;

import JFrames.SaleFrame;
import JFrames.StaffFrame;
import JFrames.NewStaffFrame;
import JFrames.ProductFrame;
import javax.swing.JFrame;
import JFrames.MenuFrame;
import JFrames.NewCustomerFrame;
import JFrames.SaleUpdateListFrame;



public class JavaStockProject {

    //static JFrame SaleFrame = new SaleFrame();
    static JFrame ProductFrame = new ProductFrame();
    static JFrame MenuFrame = new MenuFrame();
    static JFrame NewCustomerFrame = new NewCustomerFrame();
    static JFrame NewStaffFrame = new NewStaffFrame();
    static JFrame SaleUpdateListFrame = new SaleUpdateListFrame();
    
    
    public static void main(String[] args) {
             
        new NewStaffFrame().setVisible(true);

    }
    
}
