import java.awt.Graphics;
import javax.swing.JPanel;

public class Planete extends JPanel {
	public void paintComponent(Graphics g){
	    System.out.println("Je suis exécutée !"); 
	    g.fillOval(20, 20, 75, 75);
	}
}