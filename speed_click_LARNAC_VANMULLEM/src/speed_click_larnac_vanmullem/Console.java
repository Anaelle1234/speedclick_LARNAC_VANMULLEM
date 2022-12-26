/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.List;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.util.Iterator;

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
    
    void addListener(ConsoleListener listener) {
        listeners.add(listener);
    }
    
     void Score() {//méthode pour augmenter le score
        score++;//on incrémente le score
        for (Iterator<ConsoleListener> it = listeners.iterator(); it.hasNext();) {//pour toutes les fois où un bouton diff va être cliqué
            ConsoleListener next = it.next();
            //avec leur état correspondant
            //https://www.geeksforgeeks.org/how-to-use-iterator-in-java/
            //Il renvoie l'élément suivant dans la collection jusqu'à ce que la méthode renvoie true.
            next.scoreUpdated(score);//on update le score
        }

    }
     
    int tailleTab() {//méthode qui renvoie la longueur du tableau
        return tableau.length;
    }
    
    boolean getEtat(int i) {//retourne la cellule concernée
        return tableau[i]; //allumer = true et éteint = false
    }
    
    void setEtat(int i, boolean state) {//méthode pour déclarer l'état de la cellule
        //i ->> le numéro de la cellule
        //state->> état en booléen c-à-d allumer ou éteint (true ou false)
        tableau[i] = state;//on prend une cellule et on y attribut son état
    }
    
    
}
