import javax.swing.*;

/**
 * Created by Florencia on 3/6/17.
 */
public class HelloWorldSwing {

    public HelloWorldSwing(){
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello world");
        frame.getContentPane().add(label);
        frame.pack(); //adjust
        frame.setLocationRelativeTo(null); //where to show
        frame.setVisible(true);
    }
}
