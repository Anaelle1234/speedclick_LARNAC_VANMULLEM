/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.util.Random;

/**
 *
 * @author Soso
 */
public class Partie {
    plateaudejeu plateau;
    
    Random r1 =new Random();//génère ligne au hasard
    int ligne=r1.nextInt(9);
          
    Random r2 =new Random();//génère colonne au hasard
    int col=r2.nextInt(8);
    
   public Partie(){
       plateau=new plateaudejeu();
       plateau.placerbouton(ligne,col);//on place un bouton au hasard
   }
   
}
   


