/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.Action;
import javax.swing.Icon;
import java.util.Timer;
import javax.swing.JOptionPane;

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
        frame.setPreferredSize(new Dimension(1000,650)); // taille de la fenetre
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
        
        
        JPanel casePrincipale = new JPanel(new GridLayout(6,6));
        casePrincipale.setBorder(BorderFactory.createTitledBorder("Bienvenue dans le jeu !"));
        frame.add(casePrincipale, BorderLayout.CENTER);
            
        JPanel caseSecondaire = new JPanel(new GridLayout(1,2));//on fait une grille avec les éléments
        caseSecondaire.setBorder(BorderFactory.createTitledBorder("   "));
        frame.add(caseSecondaire, BorderLayout.SOUTH);
        
               
        //contenu des jpanel
        JLabel txt_temps = new JLabel("  ");
        txt_temps.setBorder(BorderFactory.createTitledBorder("tic-tac")); //créé un titre sur la bordure
        caseSecondaire.add(txt_temps);
        
        

        JLabel scoreLabel = new JLabel("   ");//j'arrive pas à agrandir la fenetre donc..
        scoreLabel.setBorder(BorderFactory.createTitledBorder("points gagnés")); //créé un titre sur la bordure
        caseSecondaire.add(scoreLabel);

        
    Console Console = new Console(36);//tab de 9 cases
    JButton[] buttons = new JButton[36];//avec 9 boutons
     for (int i = 0; i < Console.tailleTab(); i++) {
            JButton button = new JButton("");// pour ttes cases on met un bouton
            button.setEnabled(Console.getEtat(i)); // on initialise l'état de la cellule
            button.addActionListener(new MyListener(Console,buttons, i));//on ajoute au bouton un 'capteur' 
            //https://docs.oracle.com/javase/tutorial/uiswing/events/intro.html 
            //action listener ajouter par l'ampoule de java
            buttons[i] = button;//le bouton de la case devient le bouton à ajouter
            casePrincipale.add(button);//on ajoute ce bouton au cadre principale      
        }

   Timer chrono = new Timer();
    chrono.schedule(new TimerTask() {
        int time=10;
            @Override
            public void run() {
                System.out.println("time : "+time);
                txt_temps.setText(String.valueOf(time));
                if (time==0){
                    cancel();
                    casePrincipale.setVisible(false);
                    JFrame frame2 = new JFrame("Resultat");
                    frame2.add(casePrincipale, BorderLayout.CENTER);
                    JOptionPane.showMessageDialog(frame2, "Le temps est écoulé ! "+"\n"+"votre score est de : "+Console.score);
                    
                }
                time--;
            }
    }, 1000,1000);
     
    
            
    
            
            
  
     
      
        
        frame.pack(); //calcul sa taille final
        frame.setVisible(true); //montre la fenetre   
            ConsoleListener ConsoleListener = new ConsoleListener() {
            @Override
            public void scoreUpdated(int score) {
                scoreLabel.setText(Integer.toString(score));//on actualise le score
            }
            };//je sais pas pourquoi il veule un ; là...
        Console.addListener(ConsoleListener); //on ajoute les listeners 
    }
    // début chrono
    //Timer monChrono;
    //int nbSecondes=0;
    
     // test autre chrono
    //Timer chrono = new Timer();
    //chrono.schedule(new TimerTask(){
      //  int time = 60;
        //@Override
        //public void run(){
        //System.out.println("tic-tac" + time);
        
        //if (time==10){
          //  System.out.println("Temps bientôt écoulé");
        //}
        //if (time ==0) {
        //    cancel();
      //  }
        //time--;
    //}
        //return null;
    //}
    // pas ouf
    
    
//suppression de la classe my listner et ajout ici car je n'arrive pas à l'appeler correctement
     private class MyListener implements ActionListener {
        private Console Console;
        private int cellule;
        private JButton[] buttons;

        public MyListener(Console Console, JButton[] buttons, int cellule) {
            super();//on créer le constructeur de mylistener
            this.Console = Console;
            this.cellule = cellule;
            this.buttons = buttons;
        }

   
        public void actionPerformed(ActionEvent e) {//quand on clique sur un bouton
            JButton source = (JButton) e.getSource();
            source.setEnabled(false); // on le rend pas cliquable
            Console.setEtat(cellule, false);//on passe l'état de la cellule à false
            int next = Console.celluleSuivante(cellule);
            Console.Score();//on actualise le score
            System.out.println(Console);//on écrit dans la console une nouvelle ligne pour l'état de chaque cellule
            buttons[next].setEnabled(true);//le bouton suivant se rend ensuite cliquable
            
        }
        
        
        
     }
     
    
    } 
    

