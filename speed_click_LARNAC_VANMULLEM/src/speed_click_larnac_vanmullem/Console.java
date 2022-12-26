/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;

/**
 *
 * @author Soso
 */
public class Console {
        
    boolean[] tableau;//on prend un tableau de bolléen
    //true signifie que c'est allumer false non
    int score = 0;//on initialise le score à 0
    private List<ConsoleListener> listeners = new ArrayList<ConsoleListener>();
    
    
    public Console(int i) {
        tableau = new boolean[i];//tableau est le nom du tableau de booleen
        tableau[0] = true;//on commence avec la première case allumer
    }//cela fait partie des règles de jeu (définie par nous même)
}
