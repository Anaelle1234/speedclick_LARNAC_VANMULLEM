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
    celluledegrille[][] grille = new celluledegrille [8][9];
    
    public plateaudejeu() {//constructeur de la classe
     for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                grille [i][j]=new celluledegrille();//initialise un tableau de 72 cases
            }
        }  
    }
    

    
    public void placerbouton(int x,int y){
        grille[x][y].placerbouton();
    }
}

