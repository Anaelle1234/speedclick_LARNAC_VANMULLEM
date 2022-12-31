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
import javax.swing.Icon;
import javax.swing.Timer;

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
        JLabel chrono = new JLabel("  ");
        chrono.setBorder(BorderFactory.createTitledBorder("tic-tac")); //créé un titre sur la bordure
        caseSecondaire.add(chrono);
        
        

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
    
     ActionListener tache_recurrente;
        tache_recurrente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                
                nbSecondes++;
                txt_temps.setText(nbSecondes + "");
                System.out.println(nbSecondes);
                chrono.setText("ss");           
            }
            ;
        };
		/* instanciation du timer */
	monChrono = new Timer(1000, tache_recurrente);
        
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
    Timer monChrono;
    int nbSecondes=0;
    
    public void fenetre_chrono() {
        initComponents();

        
                
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        monChrono.stop();        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        monChrono.start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nbSecondes = 0;
        txt_temps.setText(nbSecondes + "");
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void initComponents() {
    }
    

    
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
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    
     
     
     
     
     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
     private javax.swing.JLabel txt_temps;
    } 
    

