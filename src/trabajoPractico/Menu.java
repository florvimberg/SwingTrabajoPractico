package trabajoPractico;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static trabajoPractico.Controller.*;

/**
 * Created by Florencia on 3/7/17.
 */
public class Menu extends JFrame {
    private JPanel panel;
    private JLabel name;
    private JButton newGame, settings, exit;

    public Menu(){
        super("Menu");

        setSize(500, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        setResizable(false);

        JLabel students = new JLabel("Martin Elissamburu \t Florencia Vimberg");

        panel = new JPanel();

        name = new JLabel("Swing Practice");
        newGame = new JButton();
        settings = new JButton();
        exit = new JButton();

        BorderLayout layout = new BorderLayout();

        setLayout(layout);

        newGame.setText("New game");
        settings.setText("Settings");
        exit.setText("Exit");
        name.setFont(new Font(name.getFont().getName(), Font.ROMAN_BASELINE, 35));
        students.setFont(new Font(students.getFont().getName(), Font.ITALIC, 20));

        newGame.addActionListener(new Controller.newGameAction());
        exit.addActionListener(new Controller.exit());
        settings.addActionListener(new Controller.newSettingsPanel());

        panel.add(name, layout.PAGE_START);
        panel.add(Box.createHorizontalBox());
        panel.add(students, layout.PAGE_START);
        panel.add(Box.createRigidArea(new Dimension(0,100)));
        panel.add(newGame, layout.LINE_START);
        panel.add(settings, layout.CENTER);
        panel.add(exit, layout.LINE_END);

        setContentPane(panel);
        setVisible(true);
    }
}
