import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  public Fenetre(){             
    this.setTitle("Ma première fenêtre Java");
    this.setSize(1000, 1000);
    this.setLocationRelativeTo(null);               
 
    JPanel pan = new JPanel();
    //pan.setBackground(Color.WHITE);
    this.setContentPane(pan);
    this.setVisible(true);
  }
}