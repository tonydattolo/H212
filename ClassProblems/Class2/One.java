package ClassProblems.Class2;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class One extends JComponent {
  Penguin p; // define it 
  public One() { // don't forget the parens 
    this.p = new Penguin("Tony Danza"); // pass the name 
  }
  public static void main(String[] args) {
    JFrame a = new JFrame("Blue pill, or red?");
    a.setVisible(true);
    a.setSize(500,400);
    
    One b = new One();
    a.add(b);
  }
  public void paintComponent(Graphics g){
    this.p.draw(g); // draw has an argument, provide
  }  
}