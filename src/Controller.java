import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Florencia on 3/6/17.
 */
public class Controller {
    private Controller() {
        Controller controller = new Controller();

    }
}
class newGameAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("New GAME starting");
    }
}
