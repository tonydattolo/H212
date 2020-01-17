package ClassProblems.Class2;
import java.awt.*;
/**
 * penguin
 */
public class Penguin {

    public Penguin(String name) {
        this.name = name;
    }

    private String name = "Tommy Gufano";
    String nickname = "The Big Sleazy";
    public void talk() {
        System.out.println("Howdy" + this.name + " otherwise known as, " + this.nickname);    
    }
    public void draw(Graphics g){
        // THis is Lab2
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200);
     
    }
}


// public class Penguin() {
//     String name = "Tommy The Big Sleazy Gufano";
//     public void talk() {
//         System.out.println("Howdy" + name + " otherwise known as, " + this);    
//     }
// }

