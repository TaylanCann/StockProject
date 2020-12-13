package javastockproject;

import JFrames.SaleFrame;
import JFrames.StaffFrame;
import JFrames.ProductFrame;
import javax.swing.JFrame;
import JFrames.MenuFrame;

public class JavaStockProject {

    //static JFrame SaleFrame = new SaleFrame();
    static JFrame ProductFrame= new ProductFrame();
    static JFrame MenuFrame=new MenuFrame();
    
    public static void main(String[] args) {
             
        new ProductFrame().setVisible(true);

    }
    
}
