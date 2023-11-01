/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rotom_guia_dex;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;


public class Inicio_aventura extends javax.swing.JPanel {

   //declaracion de variables principales para el rotom
   Color colorRotom = new Color(217,68,59);
   String[] texto_juegos = new String[8];
   private int posicion_texto_juego = -1; // varaible que controla el arreglo String para los textos de la rotom guia
   int index =0; 
   boolean decicionCantidadJugadores1 = false;
   boolean decicionCantidadJugadores2 = false;
   boolean decicionCantidadJugadores3 = false;
   String nombreJugador1;
   String nombreJugador2;
   String nombreJugador3;
   
    
    public Inicio_aventura() {
        initComponents();
         
        texto_rotomguia();//Mandamos a llamar al texto de la rotomguia;
        ocultat_elementos_juego();//ocultamos elementos como botones y cajas de texto
        
       
        
    }
   //Este metodo da formato cuando mandamos a llamar el String al JLABEL principal
   public String textHtml(String texto) {
    return "<html><div style='text-align: center; vertical-align: middle; height: 100%;'>" + texto + "</div></html>";
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BTN_continuar = new javax.swing.JButton();
        imagenjugador3 = new javax.swing.JLabel();
        imagenjuagdor = new javax.swing.JLabel();
        imagenjuagdor2 = new javax.swing.JLabel();
        eleccionjugador2 = new javax.swing.JRadioButton();
        eleccionjugador3 = new javax.swing.JRadioButton();
        eleccion1jugador = new javax.swing.JRadioButton();
        Rotmo_text = new javax.swing.JLabel();
        TXT_NombreJugador1 = new javax.swing.JTextField();
        TXT_Nombrejugador2 = new javax.swing.JTextField();
        TXT_Nombrejugador3 = new javax.swing.JTextField();
        BTN_INICIAR = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_continuar.setBackground(new java.awt.Color(217, 68, 59));
        BTN_continuar.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        BTN_continuar.setForeground(new java.awt.Color(0, 0, 0));
        BTN_continuar.setText("Continuar");
        BTN_continuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTN_continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_continuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_continuarMouseExited(evt);
            }
        });
        BTN_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_continuarActionPerformed(evt);
            }
        });
        add(BTN_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 143, -1));

        imagenjugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RotomImagenes/TresJugadores.png"))); // NOI18N
        add(imagenjugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 100));

        imagenjuagdor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RotomImagenes/unjugador.png"))); // NOI18N
        add(imagenjuagdor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 100));

        imagenjuagdor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RotomImagenes/Dos jugadores.png"))); // NOI18N
        add(imagenjuagdor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 100));

        eleccionjugador2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(eleccionjugador2);
        eleccionjugador2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        eleccionjugador2.setText("2 Jugadores");
        eleccionjugador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eleccionjugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionjugador2ActionPerformed(evt);
            }
        });
        add(eleccionjugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        eleccionjugador3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(eleccionjugador3);
        eleccionjugador3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        eleccionjugador3.setText("3 Jugadores");
        eleccionjugador3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eleccionjugador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionjugador3ActionPerformed(evt);
            }
        });
        add(eleccionjugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        eleccion1jugador.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(eleccion1jugador);
        eleccion1jugador.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        eleccion1jugador.setText("1 Jugador");
        eleccion1jugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eleccion1jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccion1jugadorActionPerformed(evt);
            }
        });
        add(eleccion1jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        Rotmo_text.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Rotmo_text.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(Rotmo_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 380, 240));

        TXT_NombreJugador1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TXT_NombreJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NombreJugador1ActionPerformed(evt);
            }
        });
        add(TXT_NombreJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, 40));

        TXT_Nombrejugador2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        add(TXT_Nombrejugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 230, 40));

        TXT_Nombrejugador3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        add(TXT_Nombrejugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 230, 40));

        BTN_INICIAR.setBackground(new java.awt.Color(217, 68, 82));
        BTN_INICIAR.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        BTN_INICIAR.setForeground(new java.awt.Color(0, 0, 0));
        BTN_INICIAR.setText("Iniciar Partida");
        BTN_INICIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_INICIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN_INICIARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTN_INICIARMouseExited(evt);
            }
        });
        add(BTN_INICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 290, -1));
    }// </editor-fold>//GEN-END:initComponents
    //Boton principal
    private void BTN_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_continuarActionPerformed

        
        animarTexto(); //anima el texto 
        posicion_texto_juego++; //aumentamos en uno cada vez que activamos el evento del botnn

        if (posicion_texto_juego == 3) { //cuando la variable pos sea igual a 3 mostrar los elementos restantes de la rotom
            mostrarELementos_juego_RadioB();
          }
        
       if(eleccion1jugador.isSelected() == true){
          
           if(posicion_texto_juego == 5){
               ingresarNombre1();
               
           }
          
       
       }
       
       if(eleccionjugador2.isSelected() == true){
            
           if(posicion_texto_juego == 5){
              
               ingresarNombre2();
               
           }
       
       }
       
         if(eleccionjugador3.isSelected() == true){
           
           if(posicion_texto_juego == 5){
               ingresarNombre3();
           
           }
       
       }
    

        
        System.out.println(posicion_texto_juego); //imprime en consola la variable posicion
       
       
      
    }//GEN-LAST:event_BTN_continuarActionPerformed
    //Da un efecto hover al boton continuar
    private void BTN_continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_continuarMouseExited
        BTN_continuar.setBackground(colorRotom);
    }//GEN-LAST:event_BTN_continuarMouseExited
        //Da un efecto hover al boton continuar
    private void BTN_continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_continuarMouseEntered
        BTN_continuar.setBackground(Color.red);
    }//GEN-LAST:event_BTN_continuarMouseEntered

    private void eleccionjugador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionjugador3ActionPerformed
        
    }//GEN-LAST:event_eleccionjugador3ActionPerformed

    private void eleccionjugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionjugador2ActionPerformed
        
    }//GEN-LAST:event_eleccionjugador2ActionPerformed

    private void eleccion1jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccion1jugadorActionPerformed
        
    }//GEN-LAST:event_eleccion1jugadorActionPerformed

    private void TXT_NombreJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NombreJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NombreJugador1ActionPerformed

    private void BTN_INICIARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_INICIARMouseEntered
        BTN_INICIAR.setBackground(Color.RED);
    }//GEN-LAST:event_BTN_INICIARMouseEntered

    private void BTN_INICIARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_INICIARMouseExited
        BTN_INICIAR.setBackground(colorRotom);
    }//GEN-LAST:event_BTN_INICIARMouseExited
    //esta fucion contiene todo el texto inicial de la rotomguia
        public void texto_rotomguia(){
    texto_juegos[0] = "¡Hola, Entrenadores Pokémon." + "\n" +
        "Soy Rotom Guía, tu compañero por tu aventura en tu emocionante travesia en el mundo de Pokémon Gris. " +
        "Estoy aquí para ser tu apoyo constante mientras exploras, luchas y se convierten en los mejores" +
        " entrenadores Pokemon de la historia. ";

    // Asignar la pregunta a la posición 1
    texto_juegos[1] = "En su extenso recorrido en este juego, se enfrentarán a desafíos y retos monumentales que solo podrán "+
        "superar si poseen la astucia necesaria y forjan un fuerte vínculo con sus Pokémon. En tu travesía, se"+ 
        "cruzarán con rivales desafiantes y criaturas salvajes que deberás enfrentar o atrapar. ";

    texto_juegos[2] = "¡Vamos, mantengan el ánimo! Tengo plena confianza en que pueden lograrlo. Recuerden que la verdadera derrota solo llega cuando alguien se rinde por completo. ";
    
    texto_juegos[3] = "¿Antes de comenzar, debo saber cuántos jugadores habrá en la partida? ";
    
    texto_juegos[4] = "Muy bien... ahora quiero saber los nombres de los jugadores.";

    
     if (decicionCantidadJugadores1 == true && decicionCantidadJugadores2 ==false && decicionCantidadJugadores3 == false) {
        System.out.println(decicionCantidadJugadores2+"nuevo valor");
        texto_juegos[5] = "Muy bien :"+nombreJugador1+" estas apunto de entrar al mundo de Pokemon, tu gran historia esta apunto de comenzar. Recuerda llegaras lejos si creas lazos grandes entre tu y tus Pokemon ";
         InciarPartida();
    }else if(decicionCantidadJugadores1 == true && decicionCantidadJugadores2==true && decicionCantidadJugadores3 == false) {
        texto_juegos[5] = "Muy bien :"+nombreJugador1+" y "+nombreJugador2+" estan apunto de entrar al mundo de Pokemon, su gran historia esta apunto de comenzar. Recuerden llegaran lejos si crean lazos grandes entre sus Pokemon ";
         InciarPartida();
    }else if(decicionCantidadJugadores1 == true && decicionCantidadJugadores2 && decicionCantidadJugadores3 ==true){
         
        texto_juegos[5] = "Muy bien :"+nombreJugador1+" , "+nombreJugador2+" y "+nombreJugador3+" estan apunto de entrar al mundo de Pokemon, su gran historia esta apunto de comenzar. Recuerden llegaran lejos si crean lazos grandes entre sus Pokemon ";
        InciarPartida();
    }
   



        
        
        
    }
    public void ocultat_elementos_juego(){
        imagenjuagdor.setVisible(false);
        imagenjuagdor2.setVisible(false);
        imagenjugador3.setVisible(false);
        eleccionjugador2.setVisible(false);
        eleccionjugador3.setVisible(false);
        eleccion1jugador.setVisible(false);
        TXT_NombreJugador1.setVisible(false);
        TXT_Nombrejugador2.setVisible(false);
        TXT_Nombrejugador3.setVisible(false);
        BTN_INICIAR.setVisible(false);
                
    
    }
    public void mostrarElementosJuego(){
       imagenjuagdor.setVisible(true);
       imagenjuagdor2.setVisible(true);
       imagenjugador3.setVisible(true);
       eleccionjugador2.setVisible(true);
       eleccionjugador3.setVisible(true);
       eleccion1jugador.setVisible(true);
       TXT_NombreJugador1.setVisible(true);
       TXT_Nombrejugador2.setVisible(true);
       TXT_Nombrejugador3.setVisible(true);
       BTN_INICIAR.setVisible(true);

}
    public void ocualtar_elementos_radioB(){
        imagenjuagdor.setVisible(false);
        imagenjuagdor2.setVisible(false);
        imagenjugador3.setVisible(false);
        eleccionjugador2.setVisible(false);
        eleccionjugador3.setVisible(false);
        eleccion1jugador.setVisible(false);
        
       
    }
   //muestra los elementos que no se veb al inicio de la ROTOM
    public void mostrarELementos_juego_RadioB(){
         
        
            imagenjuagdor.setVisible(true);
            imagenjuagdor2.setVisible(true);
            imagenjugador3.setVisible(true);
            eleccionjugador2.setVisible(true);
            eleccionjugador3.setVisible(true);
            eleccion1jugador.setVisible(true); 
            Eleccion_Rbotones(); 
        
              
              
              
    }
    public void NombreJugador1(){
        Color borderColor = Color.BLACK; // Color del borde
       // Color backgroundColor = Color.RED; // Color del fondo interno
        int borderThickness = 2; // Grosor del borde exterior
        int paddingThickness = 5; // Grosor del fondo interno

        
    TXT_NombreJugador1.setVisible(true);
    TXT_Nombrejugador2.setVisible(false);
    TXT_Nombrejugador3.setVisible(false);
        
         Border lineBorder = new LineBorder(borderColor, borderThickness);
    Border matteBorder = new MatteBorder(paddingThickness, paddingThickness, paddingThickness, paddingThickness, colorRotom);
    Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, matteBorder);

        
         TXT_NombreJugador1.setBorder(compoundBorder);

        
        
    
    }
     public void NombreJugador2(){
        TXT_NombreJugador1.setVisible(true);
        TXT_Nombrejugador2.setVisible(true);
        TXT_Nombrejugador3.setVisible(false);
        
         Color borderColor = Color.BLACK; // Color del borde
        int borderThickness = 2; // Grosor del borde exterior
        int paddingThickness = 5; // Grosor del fondo interno

        
         Border lineBorder = new LineBorder(borderColor, borderThickness);
         Border matteBorder = new MatteBorder(paddingThickness, paddingThickness, paddingThickness, paddingThickness, colorRotom);
         Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, matteBorder);

         TXT_NombreJugador1.setBorder(compoundBorder);
         TXT_Nombrejugador2.setBorder(compoundBorder);

    
    }
    
      public void NombreJugador3(){
        TXT_NombreJugador1.setVisible(true);
        TXT_Nombrejugador2.setVisible(true);
        TXT_Nombrejugador3.setVisible(true);
        
         Color borderColor = Color.BLACK; // Color del borde
        int borderThickness = 2; // Grosor del borde exterior
        int paddingThickness = 5; // Grosor del fondo interno

        
         Border lineBorder = new LineBorder(borderColor, borderThickness);
         Border matteBorder = new MatteBorder(paddingThickness, paddingThickness, paddingThickness, paddingThickness, colorRotom);
         Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, matteBorder);

         TXT_NombreJugador1.setBorder(compoundBorder);
         TXT_Nombrejugador2.setBorder(compoundBorder);
         TXT_Nombrejugador3.setBorder(compoundBorder);
    
    }
      
    public void ingresarNombre1(){
              nombreJugador1 = TXT_NombreJugador1.getText();
             
               if(nombreJugador1.isEmpty()){
                   System.out.println(decicionCantidadJugadores1);
                   System.out.println("Ingresa el nombre :(");
                   posicion_texto_juego--;
                   System.out.println(posicion_texto_juego);
               }else{
                   System.out.println(nombreJugador1);
                   decicionCantidadJugadores1=true;
                   System.out.println(decicionCantidadJugadores1);
                   texto_rotomguia();
                   
               }
        
    }
    public void ingresarNombre2(){
           nombreJugador1 = TXT_NombreJugador1.getText();
           nombreJugador2 = TXT_Nombrejugador2.getText();
           decicionCantidadJugadores1 = true;
           decicionCantidadJugadores2 = true;
               if(nombreJugador1.isEmpty() || nombreJugador2.isEmpty()){
                   System.out.println("Ingresa los dos nombres 2 :(");
                   posicion_texto_juego--;
               }else{
                   System.out.println(nombreJugador1);
                   System.out.println(nombreJugador2);
                  
                   System.out.println(decicionCantidadJugadores1);
                   System.out.println(decicionCantidadJugadores2);
                   texto_rotomguia();
               }
    
    }
    
        public void ingresarNombre3(){
            decicionCantidadJugadores1 = true;
            decicionCantidadJugadores2 = true;
            decicionCantidadJugadores3 = true;
               nombreJugador1 = TXT_NombreJugador1.getText();
               nombreJugador2 = TXT_Nombrejugador2.getText();
               nombreJugador3 = TXT_Nombrejugador3.getText();
                              
               if(nombreJugador1.isEmpty() || nombreJugador2.isEmpty() || nombreJugador3.isEmpty()){
                   System.out.println("Ingrese los 3 nombres :( ");
                   posicion_texto_juego--;
               }else{
                     System.out.println(nombreJugador1);
                     System.out.println(nombreJugador2);
                     System.out.println(nombreJugador3);
                     texto_rotomguia();
               
               }
    
    }

    
    //anima el texto que se muestra en pantalla con un TIMER de 1 segundo
    private void animarTexto(){
       index = 0;
       
       Timer tiempo = new Timer(100,new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
              if(index<texto_juegos[posicion_texto_juego].length()){
              Rotmo_text.setText(textHtml(texto_juegos[posicion_texto_juego].substring(0, index++)));
              BTN_continuar.setEnabled(false);
              
              
              
              }else{
                  ((Timer) e.getSource()).stop();
                  BTN_continuar.setEnabled(true);
                  
              }
           }
       });
       tiempo.start();
       
               
    }
    
    //Esta funcion se encarga de verificar si se selecciono o no un radio BUTTOM de la opccion "escojer jugadores"
    public void Eleccion_Rbotones(){
        
       
        if (eleccion1jugador.isSelected() || eleccionjugador2.isSelected() || eleccionjugador3.isSelected()) {
            posicion_texto_juego++;
            BTN_continuar.setEnabled(true);
            
            if(eleccion1jugador.isSelected()){
                
                ocualtar_elementos_radioB();
                NombreJugador1();
               
       
            }
            
            if(eleccionjugador2.isSelected()){
                ocualtar_elementos_radioB();
                NombreJugador2();
            
            }
            
            if(eleccionjugador3.isSelected()){
                ocualtar_elementos_radioB();
                NombreJugador3();
            
            }
        
      } else {
         
         BTN_continuar.setEnabled(false);
          mostrarpregutas();
            
         
      }
       
    
       
    }
    public void InciarPartida(){
       TXT_NombreJugador1.setEditable(false);
       TXT_Nombrejugador2.setEditable(false);
       TXT_Nombrejugador3.setEditable(false);
       BTN_INICIAR.setVisible(true);
       BTN_continuar.setVisible(false);
    }
    //En el caso que el jugador no presione un radio button se mostrara de nuevo el texto
    public void mostrarpregutas(){
        index = 0;
      Timer tiempo = new Timer(100, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if (index < texto_juegos[3].length()) {
               Rotmo_text.setText(textHtml(texto_juegos[3].substring(0, index++)));
            } else {
                posicion_texto_juego--;
               ((Timer) e.getSource()).stop();
            }
         }
      });
      tiempo.start();
    }
    


     
      
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_INICIAR;
    private javax.swing.JButton BTN_continuar;
    private javax.swing.JLabel Rotmo_text;
    private javax.swing.JTextField TXT_NombreJugador1;
    private javax.swing.JTextField TXT_Nombrejugador2;
    private javax.swing.JTextField TXT_Nombrejugador3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton eleccion1jugador;
    private javax.swing.JRadioButton eleccionjugador2;
    private javax.swing.JRadioButton eleccionjugador3;
    private javax.swing.JLabel imagenjuagdor;
    private javax.swing.JLabel imagenjuagdor2;
    private javax.swing.JLabel imagenjugador3;
    // End of variables declaration//GEN-END:variables
}
