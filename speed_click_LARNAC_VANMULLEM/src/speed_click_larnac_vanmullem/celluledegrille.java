/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

/**
 *
 * @author Anaëlle
 */
public class celluledegrille {
    bouton boutonCourant;
    private boolean allumer;
    
    public void celluledegrille(){
        allumer=false;
}
    public void placerbouton(){
        allumer=true;
    }
    //if bouton pas validé ça devient allumer ==false
     public boolean presenceBouton(){
        if (boutonCourant!=null){
            return true;
        }else{
            return false;
        }    
    }
public boolean allumerlebouton(){
    if (allumer==true){
        return true;
    }else{
        return false;
    }
}
   @Override
    public String toString() {
        if (boutonCourant != null){
            return boutonCourant.toString();
        }
        return toString();
    }


 
}
