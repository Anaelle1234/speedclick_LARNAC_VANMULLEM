/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Anaëlle
 */
public class interfacejeu {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        interfacejeu interfacejeu = new interfacejeu();//on creer un jeu 
        interfacejeu.affichage();
        }
    public void affichage(){

    //création JFrame de la fenetre avec bordure et titre
        JFrame frame = new JFrame("Speed Click Game");
        frame.setPreferredSize(new Dimension(800,600)); // taille de la fenetre
        frame.getContentPane().setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ferme la fenetre = prog s'arrete
        
        //frame.setLayout(new GridLayout(1,2)); grille de 1 ligne et 2 colonnes --> 1 label = 1 case
        frame.setLayout(new BorderLayout()); //version de GridLayout mais en mieux
        
        //JLabel label1 = new JLabel ();    
        //label1.setBorder(BorderFactory.createTitledBorder("Bienvenue dans le jeu !"));//titre du label
        //frame.add(label1,BorderLayout.CENTER); //zone principale (=zone de jeu
        
        JLabel label2 = new JLabel ("Choisissez votre chrono et augmentez votre score en cliquant le plus vite possible sur les boutons.");
        label2.setBorder(BorderFactory.createTitledBorder("Règles du jeu :")); //titre
        frame.add(label2, BorderLayout.NORTH);
        // un seul label par zone
        // si plusieurs label --> Jpanel
        
        
        JPanel casePrincipale = new JPanel(new GridLayout(1,1));
        casePrincipale.setBorder(BorderFactory.createTitledBorder("Bienvenue dans le jeu !"));
        frame.add(casePrincipale, BorderLayout.CENTER);
            
        JPanel caseSecondaire = new JPanel(new GridLayout(1,2));//on fait une grille avec les éléments
        caseSecondaire.setBorder(BorderFactory.createTitledBorder("Score :"));
        frame.add(caseSecondaire, BorderLayout.SOUTH);
        
        frame.pack(); //calcul sa taille final
        frame.setVisible(true); //montre la fenetre
        
        //contenu des jpanel
        JLabel chrono = new JLabel("");//j'arrive pas à agrandir la fenetre donc..
        chrono.setBorder(BorderFactory.createTitledBorder("tic-tac")); //créé un titre sur la bordure
        caseSecondaire.add((chrono));

        final JLabel scoreLabel = new JLabel("   ");//j'arrive pas à agrandir la fenetre donc..
        scoreLabel.setBorder(BorderFactory.createTitledBorder("points gagnés")); //créé un titre sur la bordure
        caseSecondaire.add(scoreLabel);

        
        Console Console = new Console(9);//tab de 9 cases
        JButton[] buttons = new JButton[9];//avec 9 boutons
        for (int i = 0; i < Console.tailleTab(); i++) {
            JButton button = new JButton("");// pour ttes cases on met un bouton
            button.setEnabled(Console.getEtat(i)); // on initialise l'état de la cellule
            button.addActionListener((ActionListener) new MyListener(Console,buttons, i));//on ajoute au bouton un 'capteur' 
            //https://docs.oracle.com/javase/tutorial/uiswing/events/intro.html 
            //action listener ajouter par l'ampoule de java
            buttons[i] = button;//le bouton de la case deveient le bouton à ajouter
            casePrincipale.add(button);//on ajoute ce bouton au cadre principale      
        }
   
           
   
}   
}

