package trabajoPractico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Florencia on 3/7/17.
 */
public class SettingsAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        BorderLayout layout = new BorderLayout();

        JRadioButton soundOn = new JRadioButton("On");
        JRadioButton soundOff = new JRadioButton("Off");

        JRadioButton musicOn = new JRadioButton("On");
        JRadioButton musicOff = new JRadioButton("Off");

        JLabel sound = new JLabel("Sound:");
        JLabel music = new JLabel("Music:");

        JButton back = new JButton("Back");
        back.addActionListener(new Controller.exit());

        JCheckBox shadows = new JCheckBox("Shadow");
        JCheckBox AntiAliasing = new JCheckBox("Anti-aliasing");

        panel.add(sound, layout.LINE_START);
        panel.add(soundOn, layout.CENTER);
        panel.add(soundOff, layout.LINE_END);

        panel.add(music, layout.LINE_START);
        panel.add(musicOn, layout.CENTER);
        panel.add(musicOff, layout.LINE_END);

        panel.add(back, layout.PAGE_END);

        frame.add(panel);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
