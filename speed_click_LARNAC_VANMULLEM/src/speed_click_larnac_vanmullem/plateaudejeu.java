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
                grille [i][j]=new celluledegrille();//initialise un tableau de 72 cases
            }
        }  
    }
    
public boolean presencebouton(int x, int y){//regarde si pour une case donnée la case est vide ou pleine
    if (grille[x][y]!=null){//si la case n'est pas vide
    return true;//la case est occupée
}else{
    return false;//la case est vide
    }
}   
public void placerbouton(int x,int y){
        grille[x][y].placerbouton();
    }
}

