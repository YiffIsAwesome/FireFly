import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * @author 
 * @version 
 */
public class Firefly
{
    public static void main(String[] args){
        
        JFrame testo = new JFrame();
        testo.setVisible(true);
        testo.setSize(600, 300);
        testo.setLocationRelativeTo(null);
        testo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        troll(testo);
     
    }
    
    private static void troll(JFrame frame) {
        for (int i = 0; i <= 1001; i = i + 100) {
            Thread.sleep(1000);
            frame.setSize(i, 500);
        } 
    }
}
