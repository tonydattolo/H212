package Labs.Lab0;
import javax.swing.JOptionPane;

public class E1_17 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String something = JOptionPane.showInputDialog("My Name is Hal! What would you like me to do?");
        System.out.println("I'm sorry, "+name+". I'm afraid I can't do that.");
    }
}