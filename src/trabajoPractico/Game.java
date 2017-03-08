package trabajoPractico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Florencia on 3/7/17.
 */
public class Game extends JFrame{
    public Game(ActionListener goToMenu){
        super("Start game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        ImageIcon image = new ImageIcon("/Users/Florencia/downloads/snake.png");
        JLabel img = new JLabel(image);
        img.setSize(300,300);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(goToMenu);

        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        mainPanel.add(img);
        mainPanel.add(backButton);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
