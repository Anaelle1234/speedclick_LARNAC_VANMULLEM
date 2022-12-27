/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Anaëlle
 */
public class MyListener {
private Console Console;
        private int cellule;
        private JButton[] bouton;
    public MyListener(Console Console, JButton[] button, int i) {
            super();
            this.Console = Console;
            this.cellule = cellule;
            this.bouton = bouton;
        }
//https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html
    
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            source.setEnabled(false); // disable
            Console.setEtat(cellule, false);
            int next = Console.celluleSuivante(cellule);
            Console.Score();
            System.out.println(Console);
           
            bouton[next].setEnabled(true);

    }
}
   
