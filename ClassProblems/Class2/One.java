package ClassProblems.Class2;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
/**
 * strings0 are IMMUTABLE
 */
public class One extends JComponent {

    public One {
        this.p = new Penguin();
    }
    public static void main(String[] args) {
        JFrame a = new JFrame("Blue pill, or red?");
        a.setVisible(true);
        a.setSize(500,400);

        One b = new One();
        // System.out.println(b);
        a.add(b);
    }

    public void paintComponent(Graphics g){
        // g.setColor(Color.YELLOW);
        // g.fillOval(100, 100, 200, 200);
        this.p.draw();
    }

}