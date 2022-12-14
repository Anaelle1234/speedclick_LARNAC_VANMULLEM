/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

/**
 *
 * @author Anaëlle
 */
public class bouton {
    
   private String Couleur;
    public bouton(String Couleur) {
        this.Couleur = Couleur;
    }
  public String lireCouleur(){
      return(Couleur);   
  } 

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
}
