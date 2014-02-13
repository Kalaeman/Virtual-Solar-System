//import java.awt.Color; 
import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){             
    this.setTitle("Virtual System Solar");
    this.setSize(1000, 1000);
    this.setLocationRelativeTo(null);               
 
    //pan.setBackground(Color.WHITE);
    this.setContentPane(new Planete());
    this.setVisible(true);
  }
}