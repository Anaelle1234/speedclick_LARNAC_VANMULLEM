/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Soso
 */
public class Chrono extends javax.swing.JFrame{
    Timer monChrono;
    int nbSecondes = 0;
    /**
     * Creates new form fenetre_chrono
     */
    
    public Chrono() {
        ActionListener tache_recurrente = new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                nbSecondes++;
                txt_temps.setText(nbSecondes + "");
            }
        };
        /* instanciation du timer */
        monChrono = new Timer(1000, tache_recurrente);
    }
    
    
}
