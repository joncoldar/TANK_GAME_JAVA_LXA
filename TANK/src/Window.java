import java.awt.*;
import javax.swing.*;



public class Window extends JFrame{
    public static void main(String[]args){
        Window win = new Window();
    }
    public Window(){
        JPanel pan = new JPanel();
        DrawTanks tanks = new DrawTanks();
        this.add(tanks);
        this.setTitle("Tank");
        this.setSize(900,900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}