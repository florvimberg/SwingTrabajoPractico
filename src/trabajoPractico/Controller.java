package trabajoPractico;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.tools.javah.Util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Florencia on 3/7/17.
 */
public class Controller {
    private static Menu menu;
    private static Game newGameMenu;
    private static Settings settings;
    private static Settings newSettings;
    private static Exit exit;

    public Controller(){
        menu = new Menu();
    }

    public static class newGameAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            newGameMenu = new Game(new startNewGame());
            menu.setVisible(false);
        }
    }

    public static class startNewGame implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            newGameMenu.dispose();
            menu.setVisible(true);

        }
    }

    public static class newSettingsAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            newSettings = new Settings(new newSettingsAction());
            menu.setVisible(false);
        }
    }

    public static class newSettingsPanel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            newSettings.dispose();
            menu.setVisible(true);
        }
    }

    public static class exit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
