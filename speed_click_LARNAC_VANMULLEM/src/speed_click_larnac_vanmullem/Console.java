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
    //cette partie concerne tout le code concernant le score et l'état des cellules   
    boolean[] tableau;//on prend un tableau de bolléen
    //true signifie que c'est allumer false non
    int score = 0;//on initialise le score à 0
    private java.util.List<ConsoleListener> listeners = new ArrayList<ConsoleListener>();
    //pour cette ligne ci-dessus : on a d'abord fait avec l'aide de ce site : https://stackoverflow.com/questions/16529273/how-to-add-listener-on-arraylist-in-java
    //puis java nous recommandé de le mettre en final et en private
    //on met des arraylist avec des listeners 
    //les listeners seront placés sur les boutons pour capter leur mouvements
    //voir tuto vidéo 6
    
    //on met final pour pouvoir avoir accès à la variable même dans les boucles
    
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
    
    
    int celluleSuivante(int i) {//méthode pour le changement de cellule allumée
        int nbr = (int) (Math.random() * tableau.length);//nbr est le prochain numéro de cellule
         //on utilise maths random pour avoir un nombre de cellule au hasard
         //l'étoile * sert à lier random pour aller jusqu'à la longueur de la cellule
         //https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        setEtat(nbr, true);//setter pour actualiser l'état de la cellule
        return nbr;//on retourne le nouveau numéro de cellule allumée
    }
    
     
     
    //code pour pouvoir se reférer dans la console quand on execute le programme
    @Override
    //on utilise un string builder suite à l'erreur :  "may split declaration"
    //apres des recherches sur un forum il était indiqué que si on utilisait un string builders plutot qu'un string cela semblait résoudre le probleme
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Score: ");//affichage de "score"
       sb.append(score);//affichage du score
       sb.append(", ");// on sépare les élements d'une virgule
    
     for (int i = 0; i < tableau.length; i++) {//pour chacune des cellules:
         sb.append("Cell ");//annoncer num de la cellule
         sb.append(i);// son numéro
         sb.append(": ");//les deux points
         sb.append(tableau[i]);//état de la cellule
         sb.append(", ");//on séparer pour la suite de virgule
        }
        return sb.toString();//retourne tte la méthode dans la console
    }   

    
}
            
