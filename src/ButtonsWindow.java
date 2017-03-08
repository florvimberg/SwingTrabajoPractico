import javax.swing.*;
import java.awt.*;

/**
 * Created by Florencia on 3/6/17.
 */
public class ButtonsWindow extends JFrame {
    private JPanel centerPanel;
    private JButton newGame, continueGame;
    private JLabel titleLabel;

    public ButtonsWindow(){
        super("Buttons");

        centerPanel = new JPanel();
        newGame = new JButton();
        continueGame = new JButton();
        titleLabel = new JLabel();

        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.LINE_AXIS));

        centerPanel.add(newGame);
        centerPanel.add(continueGame);
        centerPanel.add(titleLabel);

        newGame.setText("New GAME");
        continueGame.setText("Continue GAME");
        titleLabel.setText("TITLE");

        getContentPane().add(centerPanel, BorderLayout.CENTER);


        newGame.addActionListener(new newGameAction());
    }
}
