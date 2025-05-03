package BrickBreaker;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        ImageIcon icon = new ImageIcon(Main.class.getResource("/Brick Breaker.png"));
        obj.setIconImage(icon.getImage());
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Smasher");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }

}
