/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Anaëlle
 */
public class Speed_click_LARNAC_VANMULLEM {

    public static void main(String[] args) {
        
        //création JFrame de la fenetre avec bordure et titre
        JFrame frame = new JFrame("Speed Click Game");
        frame.setPreferredSize(new Dimension(500,500)); // taille de la fenetre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ferme la fenetre = prog s'arrete
        
        frame.setLayout(new FlowLayout()); //place les deux labels cote à cote
        
        JLabel label1 = new JLabel ();
        frame.add(label1);
        label1.setBorder(BorderFactory.createTitledBorder("Bienvenue dans le jeu !"));
        
        JLabel label2 = new JLabel ();
        frame.add(label2);
        label2.setBorder(BorderFactory.createTitledBorder("Etes vous pret à jouer ?"));
        
        frame.pack(); //calcul sa taille final
        frame.setVisible(true); //montre la fenetre
        
        
        
        
    }
    
}
