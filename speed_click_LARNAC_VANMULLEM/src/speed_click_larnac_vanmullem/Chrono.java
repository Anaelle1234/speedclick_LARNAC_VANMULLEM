/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed_click_larnac_vanmullem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Soso
 */
public class Chrono extends javax.swing.JFrame{
    Timer monChrono;
    int nbSecondes = 0;
    /**
     * Creates new form fenetre_chrono
     */
    
    public Chrono() {
        ActionListener tache_recurrente = new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                nbSecondes++;
                txt_temps.setText(nbSecondes + "");
            }
        };
        /* instanciation du timer */
        monChrono = new Timer(1000, tache_recurrente);
    
    
    /**

     * This method is called from within the constructor to initialize the form.

     * WARNING: Do NOT modify this code. The content of this method is always

     * regenerated by the Form Editor.

     */

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_temps = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jButton1.setText("start");
        jButton1.addActionListener(new java.awt.event.ActionListener()) {
        }
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
            }
        

        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jButton2.setText("reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

        };

        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));


}
