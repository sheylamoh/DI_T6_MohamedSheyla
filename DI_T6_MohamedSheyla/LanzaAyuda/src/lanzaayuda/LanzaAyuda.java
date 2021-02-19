package lanzaayuda;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


/**
 *
 * @author Usuario
 */
public class LanzaAyuda {

    private static JFrame frame;
    private static JPanel panel;
    private static JMenuBar menuBar;
    private static JMenu menu;
    private static JMenuItem miLanzarAyuda;

    public static HelpSet obtenFichAyuda(){
        try {
            //ClassLoader cl = LanzaAyuda.class.getClassLoader();
            File file = new File(LanzaAyuda.class.getResource("help/helpset.hs").getFile());
            URL url = file.toURI().toURL();
            HelpSet hs = new HelpSet(null,url);
            return hs;           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Fichero HelpSet no encontrado");
            return  null;
        }
    
    }
    public static void main(String[] args) {
        frame = new JFrame("LanzaAyuda");
        
        panel = new JPanel();
        panel.setSize(300,300);
        menuBar = new JMenuBar();
        menu = new JMenu("Ayuda");
        menuBar.add(menu);
        
        miLanzarAyuda = new JMenuItem("Lanzar ayuda");
        
        HelpSet hs = obtenFichAyuda();
        HelpBroker hb = hs.createHelpBroker();
        hb.enableHelpOnButton(miLanzarAyuda, "menu", hs);
        hb.setSize(new Dimension(1200,900));
        miLanzarAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0)); hb.enableHelpKey(miLanzarAyuda, "menu", hs);
        
        menu.add(miLanzarAyuda);
        frame.setJMenuBar(menuBar);

        frame.add(panel);
        
        frame.setVisible(true);
        frame.setSize(300, 300);

    }
    
}