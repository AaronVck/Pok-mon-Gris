/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rotom_guia_dex;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

/**
 *
 * @author Kevin
 */
public class Rotom_guia extends javax.swing.JFrame {
    //objetos para los jpaneles;
    
   //Variables globales para la Rotom_guia
    
    //Mover la rotomo guia
    
    int posXR,posYR;
    
    public Rotom_guia() {
         
        setDefaultCloseOperation(EXIT_ON_CLOSE);//se cierre la ventana del jframr 
        setUndecorated(true);//Desabilita la barra de navegacion (solo ver el JFRAME)
        setBackground(new Color(0,0,0,0));//Con este cofigo de colores hacemos completamente trasparente el jframe
       
        initComponents();
        setLocationRelativeTo(null);//la pantalla siempre estr en el centro de la pantall
        
        Modificaciones_Panel_rotom();
        Inicio_aventura inicio = new Inicio_aventura();
        ComienzaAventura cv = new ComienzaAventura();
        
        Panel_rotom.add(cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 154, 383, 428));
        
        // Asegura que el panel "Inicio_aventura" esté en la parte superior
        
        cv.cargarDatosJuegos();
        Panel_rotom.setComponentZOrder(cv, 0);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_rotom = new javax.swing.JPanel();
        Imagen_Rotom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_rotom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen_Rotom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RotomImagenes/Rotom-sprite.png"))); // NOI18N
        Imagen_Rotom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Imagen_Rotom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Imagen_RotomMouseDragged(evt);
            }
        });
        Imagen_Rotom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_RotomMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Imagen_RotomMousePressed(evt);
            }
        });
        Panel_rotom.add(Imagen_Rotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 610));

        getContentPane().add(Panel_rotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Imagen_RotomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_RotomMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Imagen_RotomMouseClicked

    private void Imagen_RotomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_RotomMousePressed
      //obtener la posicion en vertical de la imagen de la rotom guia
        posXR = evt.getX();
        posYR = evt.getY();
       
        
    }//GEN-LAST:event_Imagen_RotomMousePressed

    private void Imagen_RotomMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_RotomMouseDragged
       
    //obtenemos la posicion pero horizontal de la imagen y se la restanos a la posicion vertical
      int x,y;
      
      x = evt.getXOnScreen();
      y = evt.getYOnScreen();
      
        setLocation(x -posYR , y-posYR);
        
    }//GEN-LAST:event_Imagen_RotomMouseDragged

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen_Rotom;
    private javax.swing.JPanel Panel_rotom;
    // End of variables declaration//GEN-END:variables

  public void Modificaciones_Panel_rotom(){
      Panel_rotom.setBackground(new Color(0,0,0,0));
  }
}

