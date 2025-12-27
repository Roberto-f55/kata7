package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;

public class HappyFriends extends JFrame {
    public static void main(String[] args) {
        System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
        new HappyFriends().setVisible(true);
    }

    public HappyFriends() throws HeadlessException {
        this.setTitle("Kata 7");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/image.jpg"));

        JLabel label = new JLabel(imagen);

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        this.add(label);
    }
}
