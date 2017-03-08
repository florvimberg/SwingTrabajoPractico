import javax.swing.*;

/**
 * Created by Florencia on 3/6/17.
 */
public class ButtonsWindowMain {
    public static void main(String[] args) {
        ButtonsWindow jframe = new ButtonsWindow();
        jframe.pack();
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
