package ClassProblems.Class2;
import java.awt.*;

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
    g.setColor(Color.YELLOW);
    g.fillOval(100, 100, 200, 200);
  }
}