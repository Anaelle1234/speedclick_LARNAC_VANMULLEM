/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.util.Random;

/**
 *
 * @author Anaëlle
 */
public class plateaudejeu {
    celluledegrille[][] grille = new celluledegrille [6][7];
    
    public plateaudejeu() {//constructeur de la classe
     for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                grille [i][j]=new celluledegrille();//initialise un tableau de 42 cases
            }
        }  
    }
    
public void placerhasard_i(int i){
                Random r =new Random();
                i=r.nextInt(7);
            }
        public void placerhasard_j(int j){
                Random r =new Random();
                j=r.nextInt(7);
            }   
            

  
            
        

    public int ajouterJetonDanstableau(bouton j, int c){//
        for(int i=0;i<7;i++){//on balaie les lignes
            for(int d=0;d<7;d++){
                
            }
            
                return i;
            }
            
        
   return -1;   //on rajoute pour ne pas créer un bug  
    }
}

