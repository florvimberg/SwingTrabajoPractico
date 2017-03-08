package trabajoPractico;

import com.sun.xml.internal.ws.api.pipe.helper.AbstractTubeImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Florencia on 3/7/17.
 */
public class Settings extends JFrame {
    public Settings(ActionListener close){
        super("Settings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        JButton backButton = new JButton("Close");
        backButton.addActionListener(close);

        backButton.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        mainPanel.add(backButton);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
