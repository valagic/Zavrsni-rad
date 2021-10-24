/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.util;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author valagic
 */
public class Postavke {
    
    public static void otvoriPoveznicu(String link) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            desktop.browse(new URI(link));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Greška se dogodila. Probajte kasnije.");
        }
    }
}
