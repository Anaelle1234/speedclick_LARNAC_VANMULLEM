/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
        frame.setPreferredSize(new Dimension(800,600)); // taille de la fenetre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ferme la fenetre = prog s'arrete
        
        //frame.setLayout(new GridLayout(1,2)); grille de 1 ligne et 2 colonnes --> 1 label = 1 case
        frame.setLayout(new BorderLayout()); //version de GridLayout mais en mieux
        
        JLabel label1 = new JLabel ();    
        label1.setBorder(BorderFactory.createTitledBorder("Bienvenue dans le jeu !"));//titre du label
        frame.add(label1,BorderLayout.CENTER); //zone principale (=zone de jeu
        
        JLabel label2 = new JLabel ("Choisissez votre chrono et augmentez votre score en cliquant le plus vite possible sur les boutons rouges.");
        label2.setBorder(BorderFactory.createTitledBorder("Règles du jeu :")); //titre
        frame.add(label2, BorderLayout.NORTH);
        // un seul label par zone
        // si plusieurs label --> Jpanel
       
        frame.pack(); //calcul sa taille final
        frame.setVisible(true); //montre la fenetre
        
        
        
        
    }
    
}
