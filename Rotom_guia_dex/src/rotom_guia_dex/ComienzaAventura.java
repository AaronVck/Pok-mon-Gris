/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package rotom_guia_dex;

import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComienzaAventura extends javax.swing.JPanel {

    public int seleccion;
    private boolean presionado;
    private boolean presionado2;
    private boolean presionado3;
    private boolean presionado4;
    private boolean presionado5;
    private boolean presionado6;
    private boolean presionado7;
    private boolean presionado8;
    private boolean presionado9;
    private boolean presionado10;
    private boolean presionado11;
    private boolean presionado12;
    private boolean presionado13;
    private boolean presionado14;
    private boolean presionado15;
    private boolean presionado16;
    private boolean presionado17;
    private boolean presionado18;
    private boolean presionado19;

    public boolean isPresionado19() {
        return presionado19;
    }

    public void setPresionado19(boolean presionado19) {
        this.presionado19 = presionado19;
    }

    //estos tienen los arrays con los 6 pokemon de cada jugador
    private ArrayList<Pokemon> equipoJugador1 = new ArrayList<>(6);
    public ArrayList<Pokemon> equipoJugador2 = new ArrayList<>(6);
    private ArrayList<Pokemon> equipoJugador3 = new ArrayList<>(6);
    private Pokemon pokemonRival = new Pokemon();//este objeto contendra al pokemon rival
    private ArrayList<Integer> psPokemon = new ArrayList<>(6);
    private ArrayList<Integer> psPokemon2 = new ArrayList<>(6);
    private ArrayList<Integer> psPokemon3 = new ArrayList<>(6);
    int Ratioc = 150, bonues = 0;

    public EleccionPokemon EP = new EleccionPokemon();

    public Pokemon getPokemonRival() {
        return pokemonRival;
    }

    public void setPokemonRival(Pokemon pokemonRival) {
        this.pokemonRival = pokemonRival;
    }

    //elementos para la ventana emergente
    public boolean btnDialogoEquipo1Seleccionado1 = false;
    public boolean btnDialogoEquipo1Seleccionado2 = false;
    public boolean btnDialogoEquipo1Seleccionado3 = false;
    public JLabel mensajeDialog = new JLabel();
    public static JButton btnDialogoEquipo1 = new JButton();
    public static JButton btnDialogoEquipo2 = new JButton();
    public static JButton btnDialogoEquipo3 = new JButton();
    public static JButton btnpokemon1J1 = new JButton();
    public static JButton btnpokemon2J1 = new JButton();
    public static JButton btnpokemon3J1 = new JButton();
    public static JButton btnpokemon4J1 = new JButton();
    public static JButton btnpokemon5J1 = new JButton();
    public static JButton btnpokemon6J1 = new JButton();
    public static JButton btnpokemon1J2 = new JButton();
    public static JButton btnpokemon2J2 = new JButton();
    public static JButton btnpokemon3J2 = new JButton();
    public static JButton btnpokemon4J2 = new JButton();
    public static JButton btnpokemon5J2 = new JButton();
    public static JButton btnpokemon6J2 = new JButton();
    public static JButton btnpokemon1J3 = new JButton();
    public static JButton btnpokemon2J3 = new JButton();
    public static JButton btnpokemon3J3 = new JButton();
    public static JButton btnpokemon4J3 = new JButton();
    public static JButton btnpokemon5J3 = new JButton();
    public static JButton btnpokemon6J3 = new JButton();
    ImageIcon imagenSprite = null;

    public ArrayList<Pokemon> getEquipoJugador1() {
        return equipoJugador1;
    }

    public void setEquipoJugador1(ArrayList<Pokemon> equipoJugador1) {
        this.equipoJugador1 = equipoJugador1;
    }

    public ArrayList<Pokemon> getEquipoJugador2() {
        return equipoJugador2;
    }

    public void setEquipoJugador2(ArrayList<Pokemon> equipoJugador2) {
        this.equipoJugador2 = equipoJugador2;
    }

    public ArrayList<Pokemon> getEquipoJugador3() {
        return equipoJugador3;
    }

    public void setEquipoJugador3(ArrayList<Pokemon> equipoJugador3) {
        this.equipoJugador3 = equipoJugador3;
    }

    private ImageIcon imagenes;
    private Icon iconoImagen;

    public boolean isPresionado2() {
        return presionado2;
    }

    public JLabel getPokemon1Jugador1() {
        return Pokemon1Jugador1;
    }

    public void setPokemon1Jugador1(ImageIcon imagenSprite) {

        Pokemon1Jugador1.setIcon(imagenSprite);
    }

    public void setPokemon2Jugador1(ImageIcon imagenSprite) {

        Pokemon2Jugador1.setIcon(imagenSprite);
    }

    public void setPokemon3Jugador1(ImageIcon imagenSprite) {

        Pokemon3Jugador1.setIcon(imagenSprite);
    }

    public void setPokemon4Jugador1(ImageIcon imagenSprite) {

        Pokemon4Jugador1.setIcon(imagenSprite);
    }

    public void setPokemon5Jugador1(ImageIcon imagenSprite) {

        Pokemon5Jugador1.setIcon(imagenSprite);
    }

    public void setPokemon6Jugador1(ImageIcon imagenSprite) {

        Pokemon6Jugador1.setIcon(imagenSprite);
    }

    public void setPokemon1Jugador2(ImageIcon imagenSprite) {

        Pokemon1Jugador2.setIcon(imagenSprite);
    }

    public void setPokemon2Jugador2(ImageIcon imagenSprite) {

        Pokemon2Jugador2.setIcon(imagenSprite);
    }

    public void setPokemon3Jugador2(ImageIcon imagenSprite) {

        Pokemon3Jugador2.setIcon(imagenSprite);
    }

    public void setPokemon4Jugador2(ImageIcon imagenSprite) {

        Pokemon4Jugador2.setIcon(imagenSprite);
    }

    public void setPokemon5Jugador2(ImageIcon imagenSprite) {

        Pokemon5Jugador2.setIcon(imagenSprite);
    }

    public void setPokemon6Jugador2(ImageIcon imagenSprite) {

        Pokemon6Jugador2.setIcon(imagenSprite);
    }

    public void setPokemon1Jugador3(ImageIcon imagenSprite) {

        Pokemon1Jugador3.setIcon(imagenSprite);
    }

    public void setPokemon2Jugador3(ImageIcon imagenSprite) {

        Pokemon2Jugador3.setIcon(imagenSprite);
    }

    public void setPokemon3Jugador3(ImageIcon imagenSprite) {

        Pokemon3Jugador3.setIcon(imagenSprite);
    }

    public void setPokemon4Jugador3(ImageIcon imagenSprite) {

        Pokemon4Jugador3.setIcon(imagenSprite);
    }

    public void setPokemon5Jugador3(ImageIcon imagenSprite) {

        Pokemon5Jugador3.setIcon(imagenSprite);
    }

    public void setPokemon6Jugador3(ImageIcon imagenSprite) {

        Pokemon6Jugador3.setIcon(imagenSprite);
    }

    public void setJLBlucha1(ImageIcon imagenSprite) {

        JLBlucha1.setIcon(imagenSprite);
    }

    public void setJLBlucha2(ImageIcon imagenSprite) {

        JLBlucha2.setIcon(imagenSprite);
    }

    public void setTextoJLabelLucha2(String string) {

        jLbVidaRival.setText(string);
    }

    public void setElementoComboMovimientoPokemon2(String movimiento) {
        ComboMovimientoPokemon2.addItem(movimiento);
    }

    public void borrarElementosComboMovimientoPokemon2() {
        ComboMovimientoPokemon2.removeAllItems();
    }

    public void setPresionado2(boolean presionado2) {
        this.presionado2 = presionado2;
    }

    public void setBtnLuchar() {
        this.BtnLuchar.setEnabled(true);

    }

    public void setBtnCapturar() {
        this.BtnCapturar.setEnabled(true);

    }

    public void setBTNCurar() {
        this.BTN_curarEquipoPokemon.setEnabled(true);
    }

    public void setBTNCurar2() {
        this.BTN_curarEquipoPokemon2.setEnabled(true);
    }

    public void setBTNCurar3() {
        this.BTN_curarEquipoPokemon3.setEnabled(true);
    }

    public boolean isPresionado3() {
        return presionado3;
    }

    public void setPresionado3(boolean presionado3) {
        this.presionado3 = presionado3;
    }

    public boolean isPresionado4() {
        return presionado4;
    }

    public void setPresionado4(boolean presionado4) {
        this.presionado4 = presionado4;
    }

    public boolean isPresionado5() {
        return presionado5;
    }

    public void setPresionado5(boolean presionado5) {
        this.presionado5 = presionado5;
    }

    public boolean isPresionado6() {
        return presionado6;
    }

    public void setPresionado6(boolean presionado6) {
        this.presionado6 = presionado6;
    }

    public boolean isPresionado7() {
        return presionado7;
    }

    public void setPresionado7(boolean presionado7) {
        this.presionado7 = presionado7;
    }

    public boolean isPresionado8() {
        return presionado8;
    }

    public void setPresionado8(boolean presionado8) {
        this.presionado8 = presionado8;
    }

    public boolean isPresionado9() {
        return presionado9;
    }

    public void setPresionado9(boolean presionado9) {
        this.presionado9 = presionado9;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }

    //CHARMANDER ASCUAS  POTENCIA GET.POTENCIAMOVIMIENTO1
    //CHARMANDER ASCUAL FUEGO == FUEGO
    public boolean isPresionado10() {
        return presionado10;
    }

    public void setPresionado10(boolean presionado10) {
        this.presionado10 = presionado10;
    }

    public boolean isPresionado11() {
        return presionado11;
    }

    public void setPresionado11(boolean presionado11) {
        this.presionado11 = presionado11;
    }

    public boolean isPresionado12() {
        return presionado12;
    }

    public void setPresionado12(boolean presionado12) {
        this.presionado12 = presionado12;
    }

    public boolean isPresionado13() {
        return presionado13;
    }

    public void setPresionado13(boolean presionado13) {
        this.presionado13 = presionado13;
    }

    public boolean isPresionado14() {
        return presionado14;
    }

    public void setPresionado14(boolean presionado14) {
        this.presionado14 = presionado14;
    }

    public boolean isPresionado15() {
        return presionado15;
    }

    public void setPresionado15(boolean presionado15) {
        this.presionado15 = presionado15;
    }

    public boolean isPresionado16() {
        return presionado16;
    }

    public void setPresionado16(boolean presionado16) {
        this.presionado16 = presionado16;
    }

    public boolean isPresionado17() {
        return presionado17;
    }

    public void setPresionado17(boolean presionado17) {
        this.presionado17 = presionado17;
    }

    public boolean isPresionado18() {
        return presionado18;
    }

    public void setPresionado18(boolean presionado18) {
        this.presionado18 = presionado18;
    }

    EleccionPokemon ell = null;

    public ComienzaAventura(EleccionPokemon ell) {
        this.ell = ell;
        initComponents();
        TamanosPokemon();
        OcultarAgregarBTN();
        mostrarIconoPokeball();

    }

    public ComienzaAventura() {

        initComponents();
        TamanosPokemon();
        OcultarAgregarBTN();
        mostrarIconoPokeball();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LBLNombreJUgador1 = new javax.swing.JLabel();
        Panel1Jugador1 = new javax.swing.JPanel();
        BTNAgregarPokemon1 = new javax.swing.JButton();
        Pokemon1Jugador1 = new javax.swing.JLabel();
        Pane21Jugador1 = new javax.swing.JPanel();
        BTNAgregarPokemon2 = new javax.swing.JButton();
        Pokemon2Jugador1 = new javax.swing.JLabel();
        Pane31Jugador1 = new javax.swing.JPanel();
        BTNAgregarPokemon3 = new javax.swing.JButton();
        Pokemon3Jugador1 = new javax.swing.JLabel();
        Panel4Jugador1 = new javax.swing.JPanel();
        BTNAgregarPokemon4 = new javax.swing.JButton();
        Pokemon4Jugador1 = new javax.swing.JLabel();
        Panel5Jugador1 = new javax.swing.JPanel();
        BTNAgregarPokemon5 = new javax.swing.JButton();
        Pokemon5Jugador1 = new javax.swing.JLabel();
        Panel6Jugador1 = new javax.swing.JPanel();
        BTNAgregarPokemon6 = new javax.swing.JButton();
        Pokemon6Jugador1 = new javax.swing.JLabel();
        BTN_curarEquipoPokemon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Panel1Jugador2 = new javax.swing.JPanel();
        BTNAgregarPokemon7 = new javax.swing.JButton();
        Pokemon1Jugador2 = new javax.swing.JLabel();
        Panel2Jugador2 = new javax.swing.JPanel();
        BTNAgregarPokemon8 = new javax.swing.JButton();
        Pokemon2Jugador2 = new javax.swing.JLabel();
        Panel3Jugador2 = new javax.swing.JPanel();
        BTNAgregarPokemon9 = new javax.swing.JButton();
        Pokemon3Jugador2 = new javax.swing.JLabel();
        Panel4Jugador2 = new javax.swing.JPanel();
        BTNAgregarPokemon10 = new javax.swing.JButton();
        Pokemon4Jugador2 = new javax.swing.JLabel();
        Panel5Jugador2 = new javax.swing.JPanel();
        BTNAgregarPokemon11 = new javax.swing.JButton();
        Pokemon5Jugador2 = new javax.swing.JLabel();
        Panel6Jugador2 = new javax.swing.JPanel();
        BTNAgregarPokemon12 = new javax.swing.JButton();
        Pokemon6Jugador2 = new javax.swing.JLabel();
        LBLNombreJugador2 = new javax.swing.JLabel();
        BTN_curarEquipoPokemon2 = new javax.swing.JButton();
        ObjetosPokemon2 = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        Panel1Jugador3 = new javax.swing.JPanel();
        BTNAgregarPokemon13 = new javax.swing.JButton();
        Pokemon1Jugador3 = new javax.swing.JLabel();
        Panel2Jugador3 = new javax.swing.JPanel();
        BTNAgregarPokemon14 = new javax.swing.JButton();
        Pokemon2Jugador3 = new javax.swing.JLabel();
        Panel3Jugador3 = new javax.swing.JPanel();
        BTNAgregarPokemon15 = new javax.swing.JButton();
        Pokemon3Jugador3 = new javax.swing.JLabel();
        Panel4Jugador3 = new javax.swing.JPanel();
        BTNAgregarPokemon16 = new javax.swing.JButton();
        Pokemon4Jugador3 = new javax.swing.JLabel();
        Panel5Jugador3 = new javax.swing.JPanel();
        BTNAgregarPokemon17 = new javax.swing.JButton();
        Pokemon5Jugador3 = new javax.swing.JLabel();
        Panel6Jugador3 = new javax.swing.JPanel();
        BTNAgregarPokemon18 = new javax.swing.JButton();
        Pokemon6Jugador3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BTN_curarEquipoPokemon3 = new javax.swing.JButton();
        LBLversus = new javax.swing.JLabel();
        JLBlucha1 = new javax.swing.JLabel();
        JLBlucha2 = new javax.swing.JLabel();
        BtnLuchar = new javax.swing.JButton();
        BtnCapturar = new javax.swing.JButton();
        ComboMovimientoPokemon1 = new javax.swing.JComboBox<>();
        ComboMovimientoPokemon2 = new javax.swing.JComboBox<>();
        jLbVida = new javax.swing.JLabel();
        jLbVidaRival = new javax.swing.JLabel();
        objetosJugador1 = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLNombreJUgador1.setText("Nombre Jugador");
        jPanel1.add(LBLNombreJUgador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 114, -1));

        Panel1Jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon1.setText("+");
        BTNAgregarPokemon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon1MouseEntered(evt);
            }
        });
        BTNAgregarPokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon1ActionPerformed(evt);
            }
        });
        Panel1Jugador1.add(BTNAgregarPokemon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 35, 30));

        Pokemon1Jugador1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pokemon1Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon1Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon1Jugador1MouseExited(evt);
            }
        });
        Panel1Jugador1.add(Pokemon1Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        jPanel1.add(Panel1Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Pane21Jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon2.setText("+");
        BTNAgregarPokemon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon2MouseEntered(evt);
            }
        });
        BTNAgregarPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon2ActionPerformed(evt);
            }
        });
        Pane21Jugador1.add(BTNAgregarPokemon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon2Jugador1.setPreferredSize(new java.awt.Dimension(54, 54));
        Pokemon2Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon2Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon2Jugador1MouseExited(evt);
            }
        });
        Pane21Jugador1.add(Pokemon2Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Pane21Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        Pane31Jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon3.setText("+");
        BTNAgregarPokemon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon3MouseEntered(evt);
            }
        });
        BTNAgregarPokemon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon3ActionPerformed(evt);
            }
        });
        Pane31Jugador1.add(BTNAgregarPokemon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon3Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon3Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon3Jugador1MouseExited(evt);
            }
        });
        Pane31Jugador1.add(Pokemon3Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 53, 53));

        jPanel1.add(Pane31Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        Panel4Jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon4.setText("+");
        BTNAgregarPokemon4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon4MouseEntered(evt);
            }
        });
        BTNAgregarPokemon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon4ActionPerformed(evt);
            }
        });
        Panel4Jugador1.add(BTNAgregarPokemon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon4Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon4Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon4Jugador1MouseExited(evt);
            }
        });
        Panel4Jugador1.add(Pokemon4Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        jPanel1.add(Panel4Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        Panel5Jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon5.setText("+");
        BTNAgregarPokemon5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon5MouseEntered(evt);
            }
        });
        BTNAgregarPokemon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon5ActionPerformed(evt);
            }
        });
        Panel5Jugador1.add(BTNAgregarPokemon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon5Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon5Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon5Jugador1MouseExited(evt);
            }
        });
        Panel5Jugador1.add(Pokemon5Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        jPanel1.add(Panel5Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        Panel6Jugador1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon6.setText("+");
        BTNAgregarPokemon6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon6MouseEntered(evt);
            }
        });
        BTNAgregarPokemon6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon6ActionPerformed(evt);
            }
        });
        Panel6Jugador1.add(BTNAgregarPokemon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon6Jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon6Jugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon6Jugador1MouseExited(evt);
            }
        });
        Panel6Jugador1.add(Pokemon6Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 53));

        jPanel1.add(Panel6Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        BTN_curarEquipoPokemon.setText("Curar Equipo");
        BTN_curarEquipoPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_curarEquipoPokemonActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_curarEquipoPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        Panel1Jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon7.setText("+");
        BTNAgregarPokemon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon7MouseExited(evt);
            }
        });
        BTNAgregarPokemon7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon7ActionPerformed(evt);
            }
        });
        Panel1Jugador2.add(BTNAgregarPokemon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon1Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon1Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon1Jugador2MouseExited(evt);
            }
        });
        Panel1Jugador2.add(Pokemon1Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 54));

        Panel2Jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon8.setText("+");
        BTNAgregarPokemon8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon8MouseEntered(evt);
            }
        });
        BTNAgregarPokemon8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon8ActionPerformed(evt);
            }
        });
        Panel2Jugador2.add(BTNAgregarPokemon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon2Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon2Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon2Jugador2MouseExited(evt);
            }
        });
        Panel2Jugador2.add(Pokemon2Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel3Jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon9.setText("+");
        BTNAgregarPokemon9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon9MouseExited(evt);
            }
        });
        BTNAgregarPokemon9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon9ActionPerformed(evt);
            }
        });
        Panel3Jugador2.add(BTNAgregarPokemon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon3Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon3Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon3Jugador2MouseExited(evt);
            }
        });
        Panel3Jugador2.add(Pokemon3Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel4Jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon10.setText("+");
        BTNAgregarPokemon10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon10MouseEntered(evt);
            }
        });
        BTNAgregarPokemon10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon10ActionPerformed(evt);
            }
        });
        Panel4Jugador2.add(BTNAgregarPokemon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon4Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon4Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon4Jugador2MouseExited(evt);
            }
        });
        Panel4Jugador2.add(Pokemon4Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel5Jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon11.setText("+");
        BTNAgregarPokemon11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon11MouseEntered(evt);
            }
        });
        BTNAgregarPokemon11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon11ActionPerformed(evt);
            }
        });
        Panel5Jugador2.add(BTNAgregarPokemon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon5Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon5Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon5Jugador2MouseExited(evt);
            }
        });
        Panel5Jugador2.add(Pokemon5Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel6Jugador2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon12.setText("+");
        BTNAgregarPokemon12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon12MouseEntered(evt);
            }
        });
        BTNAgregarPokemon12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon12ActionPerformed(evt);
            }
        });
        Panel6Jugador2.add(BTNAgregarPokemon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon6Jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon6Jugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon6Jugador2MouseExited(evt);
            }
        });
        Panel6Jugador2.add(Pokemon6Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        LBLNombreJugador2.setText("Nombre Jugador2");

        BTN_curarEquipoPokemon2.setText("CurarPokemon");
        BTN_curarEquipoPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_curarEquipoPokemon2ActionPerformed(evt);
            }
        });

        ObjetosPokemon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Panel1Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel2Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel3Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel4Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel5Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel6Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BTN_curarEquipoPokemon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ObjetosPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LBLNombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel6Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel5Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel4Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel3Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel1Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_curarEquipoPokemon2)
                    .addComponent(ObjetosPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel15.setBackground(new java.awt.Color(255, 153, 153));

        Panel1Jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon13.setText("+");
        BTNAgregarPokemon13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon13MouseEntered(evt);
            }
        });
        BTNAgregarPokemon13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon13ActionPerformed(evt);
            }
        });
        Panel1Jugador3.add(BTNAgregarPokemon13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon1Jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon1Jugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon1Jugador3MouseExited(evt);
            }
        });
        Panel1Jugador3.add(Pokemon1Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel2Jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon14.setText("+");
        BTNAgregarPokemon14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon14MouseEntered(evt);
            }
        });
        BTNAgregarPokemon14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon14ActionPerformed(evt);
            }
        });
        Panel2Jugador3.add(BTNAgregarPokemon14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon2Jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon2Jugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon2Jugador3MouseExited(evt);
            }
        });
        Panel2Jugador3.add(Pokemon2Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel3Jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon15.setText("+");
        BTNAgregarPokemon15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon15MouseEntered(evt);
            }
        });
        BTNAgregarPokemon15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon15ActionPerformed(evt);
            }
        });
        Panel3Jugador3.add(BTNAgregarPokemon15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon3Jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon3Jugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon3Jugador3MouseExited(evt);
            }
        });
        Panel3Jugador3.add(Pokemon3Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 53, 54));

        Panel4Jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon16.setText("+");
        BTNAgregarPokemon16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon16MouseEntered(evt);
            }
        });
        BTNAgregarPokemon16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon16ActionPerformed(evt);
            }
        });
        Panel4Jugador3.add(BTNAgregarPokemon16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon4Jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon4Jugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon4Jugador3MouseExited(evt);
            }
        });
        Panel4Jugador3.add(Pokemon4Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel5Jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon17.setText("+");
        BTNAgregarPokemon17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon17MouseEntered(evt);
            }
        });
        BTNAgregarPokemon17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon17ActionPerformed(evt);
            }
        });
        Panel5Jugador3.add(BTNAgregarPokemon17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon5Jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon5Jugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon5Jugador3MouseExited(evt);
            }
        });
        Panel5Jugador3.add(Pokemon5Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        Panel6Jugador3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNAgregarPokemon18.setText("+");
        BTNAgregarPokemon18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgregarPokemon18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNAgregarPokemon18MouseEntered(evt);
            }
        });
        BTNAgregarPokemon18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarPokemon18ActionPerformed(evt);
            }
        });
        Panel6Jugador3.add(BTNAgregarPokemon18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Pokemon6Jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pokemon6Jugador3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pokemon6Jugador3MouseExited(evt);
            }
        });
        Panel6Jugador3.add(Pokemon6Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 54, 54));

        jLabel3.setText("Nombre Jugador3");

        BTN_curarEquipoPokemon3.setText("Curar Pokemon");
        BTN_curarEquipoPokemon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_curarEquipoPokemon3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(Panel1Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel2Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel3Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(Panel4Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel5Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel6Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(BTN_curarEquipoPokemon3)
                                .addGap(42, 42, 42)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel6Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel5Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel4Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel3Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel1Jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_curarEquipoPokemon3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel15);

        LBLversus.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LBLversus.setText("VS");

        JLBlucha1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLBlucha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBlucha1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLBlucha1MouseEntered(evt);
            }
        });

        JLBlucha2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLBlucha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBlucha2MouseClicked(evt);
            }
        });

        BtnLuchar.setText("Luchar");
        BtnLuchar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLucharMouseClicked(evt);
            }
        });
        BtnLuchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLucharActionPerformed(evt);
            }
        });

        BtnCapturar.setText("Capturar");
        BtnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCapturarActionPerformed(evt);
            }
        });

        ComboMovimientoPokemon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movimientos" }));
        ComboMovimientoPokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMovimientoPokemon1ActionPerformed(evt);
            }
        });

        ComboMovimientoPokemon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movimientos", " " }));

        jLbVida.setText("PS");

        jLbVidaRival.setText("PS");

        objetosJugador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokeball", "Superball", "Ultraball", "Maestro", "Nulo", " ", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboMovimientoPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBlucha1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboMovimientoPokemon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LBLversus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCapturar)
                            .addComponent(JLBlucha2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(BtnLuchar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLbVida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbVidaRival)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(objetosJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLuchar)
                    .addComponent(BtnCapturar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbVidaRival)
                    .addComponent(jLbVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLBlucha1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(JLBlucha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LBLversus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboMovimientoPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboMovimientoPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(objetosJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Pokemon1Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon1Jugador1MouseEntered
        BTNAgregarPokemon1.setVisible(true);
    }//GEN-LAST:event_Pokemon1Jugador1MouseEntered

    private void Pokemon1Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon1Jugador1MouseExited
        BTNAgregarPokemon1.setVisible(false);
    }//GEN-LAST:event_Pokemon1Jugador1MouseExited

    private void BTNAgregarPokemon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon1MouseEntered
        BTNAgregarPokemon1.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon1MouseEntered

    private void Pokemon2Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon2Jugador1MouseEntered
        BTNAgregarPokemon2.setVisible(true);
    }//GEN-LAST:event_Pokemon2Jugador1MouseEntered

    private void Pokemon2Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon2Jugador1MouseExited
        BTNAgregarPokemon2.setVisible(false);
    }//GEN-LAST:event_Pokemon2Jugador1MouseExited

    private void BTNAgregarPokemon2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon2MouseEntered
        BTNAgregarPokemon2.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon2MouseEntered

    private void Pokemon3Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon3Jugador1MouseEntered
        BTNAgregarPokemon3.setVisible(true);
    }//GEN-LAST:event_Pokemon3Jugador1MouseEntered

    private void Pokemon3Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon3Jugador1MouseExited
        BTNAgregarPokemon3.setVisible(false);
    }//GEN-LAST:event_Pokemon3Jugador1MouseExited

    private void BTNAgregarPokemon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon3MouseEntered
        BTNAgregarPokemon3.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon3MouseEntered

    private void Pokemon4Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon4Jugador1MouseEntered
        BTNAgregarPokemon4.setVisible(true);
    }//GEN-LAST:event_Pokemon4Jugador1MouseEntered

    private void Pokemon4Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon4Jugador1MouseExited
        BTNAgregarPokemon4.setVisible(false);
    }//GEN-LAST:event_Pokemon4Jugador1MouseExited

    private void BTNAgregarPokemon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon4MouseEntered
        BTNAgregarPokemon4.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon4MouseEntered

    private void Pokemon5Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon5Jugador1MouseEntered
        BTNAgregarPokemon5.setVisible(true);
    }//GEN-LAST:event_Pokemon5Jugador1MouseEntered

    private void Pokemon5Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon5Jugador1MouseExited
        BTNAgregarPokemon5.setVisible(false);
    }//GEN-LAST:event_Pokemon5Jugador1MouseExited

    private void BTNAgregarPokemon5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon5MouseEntered
        BTNAgregarPokemon5.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon5MouseEntered

    private void Pokemon6Jugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon6Jugador1MouseEntered
        BTNAgregarPokemon6.setVisible(true);
    }//GEN-LAST:event_Pokemon6Jugador1MouseEntered

    private void Pokemon6Jugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon6Jugador1MouseExited
        BTNAgregarPokemon6.setVisible(false);
    }//GEN-LAST:event_Pokemon6Jugador1MouseExited

    private void BTNAgregarPokemon6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon6MouseEntered
        BTNAgregarPokemon6.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon6MouseEntered

    private void BTNAgregarPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon1ActionPerformed
        setPresionado(true);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon1.setVisible(false);
        System.out.println("Hola" + isPresionado());
        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon1.setVisible(false);

        }

        ell.setVisible(true);


    }//GEN-LAST:event_BTNAgregarPokemon1ActionPerformed

    private void BTNAgregarPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon2ActionPerformed
        setPresionado2(true);
        setPresionado(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon2.setVisible(false);
        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon2.setVisible(false);
        }

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon2ActionPerformed

    private void BTNAgregarPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon3ActionPerformed
        setPresionado3(true);
        setPresionado(false);
        setPresionado2(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon3.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon3.setVisible(false);

        }

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon3ActionPerformed

    private void BTNAgregarPokemon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon4ActionPerformed
        setPresionado4(true);
        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon4.setVisible(false);
        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon4.setVisible(false);

        }

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon4ActionPerformed

    private void BTNAgregarPokemon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon5ActionPerformed

        setPresionado5(true);
        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon5.setVisible(false);
        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon5.setVisible(false);

        }

        ell.setVisible(true);

    }//GEN-LAST:event_BTNAgregarPokemon5ActionPerformed

    private void BTNAgregarPokemon6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon6ActionPerformed
        setPresionado6(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon6.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon2.setVisible(false);

        }
        BTNAgregarPokemon2.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon6ActionPerformed

    private void BTNAgregarPokemon7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon7ActionPerformed
        setPresionado7(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon7.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon7.setVisible(false);

        }
        BTNAgregarPokemon2.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon7ActionPerformed

    private void BTNAgregarPokemon7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon7MouseEntered
        BTNAgregarPokemon7.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon7MouseEntered

    private void BTNAgregarPokemon7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon7MouseExited

    }//GEN-LAST:event_BTNAgregarPokemon7MouseExited

    private void Pokemon1Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon1Jugador2MouseEntered
        BTNAgregarPokemon7.setVisible(true);
    }//GEN-LAST:event_Pokemon1Jugador2MouseEntered

    private void Pokemon1Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon1Jugador2MouseExited
        BTNAgregarPokemon7.setVisible(false);
    }//GEN-LAST:event_Pokemon1Jugador2MouseExited

    private void BTNAgregarPokemon8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNAgregarPokemon8MouseClicked

    private void BTNAgregarPokemon8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon8ActionPerformed
        setPresionado8(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon8.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon8.setVisible(false);

        }
        BTNAgregarPokemon8.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon8ActionPerformed

    private void BTNAgregarPokemon8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon8MouseEntered
        BTNAgregarPokemon8.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon8MouseEntered

    private void Pokemon2Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon2Jugador2MouseEntered
        BTNAgregarPokemon8.setVisible(true);
    }//GEN-LAST:event_Pokemon2Jugador2MouseEntered

    private void Pokemon2Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon2Jugador2MouseExited
        BTNAgregarPokemon8.setVisible(false);
    }//GEN-LAST:event_Pokemon2Jugador2MouseExited

    private void BTNAgregarPokemon9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon9ActionPerformed
        setPresionado9(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado10(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon9.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon9.setVisible(false);

        }
        BTNAgregarPokemon9.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon9ActionPerformed

    private void BTNAgregarPokemon9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon9MouseEntered
        BTNAgregarPokemon9.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon9MouseEntered

    private void Pokemon3Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon3Jugador2MouseEntered
        BTNAgregarPokemon9.setVisible(true);
    }//GEN-LAST:event_Pokemon3Jugador2MouseEntered

    private void BTNAgregarPokemon9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon9MouseExited

    }//GEN-LAST:event_BTNAgregarPokemon9MouseExited

    private void Pokemon3Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon3Jugador2MouseExited
        BTNAgregarPokemon9.setVisible(false);
    }//GEN-LAST:event_Pokemon3Jugador2MouseExited

    private void BTNAgregarPokemon10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon10ActionPerformed
        setPresionado10(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado11(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon10.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon10.setVisible(false);

        }
        BTNAgregarPokemon10.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon10ActionPerformed

    private void BTNAgregarPokemon10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon10MouseEntered
        BTNAgregarPokemon10.setVisible(true);

    }//GEN-LAST:event_BTNAgregarPokemon10MouseEntered

    private void Pokemon4Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon4Jugador2MouseEntered
        BTNAgregarPokemon10.setVisible(true);

    }//GEN-LAST:event_Pokemon4Jugador2MouseEntered

    private void Pokemon4Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon4Jugador2MouseExited
        BTNAgregarPokemon10.setVisible(false);

    }//GEN-LAST:event_Pokemon4Jugador2MouseExited

    private void BTNAgregarPokemon11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon11ActionPerformed
        setPresionado11(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado12(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon11.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon11.setVisible(false);

        }
        BTNAgregarPokemon11.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon11ActionPerformed

    private void BTNAgregarPokemon11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon11MouseEntered
        BTNAgregarPokemon11.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon11MouseEntered

    private void Pokemon5Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon5Jugador2MouseEntered
        BTNAgregarPokemon11.setVisible(true);
    }//GEN-LAST:event_Pokemon5Jugador2MouseEntered

    private void Pokemon5Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon5Jugador2MouseExited
        BTNAgregarPokemon11.setVisible(false);
    }//GEN-LAST:event_Pokemon5Jugador2MouseExited

    private void BTNAgregarPokemon12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon12ActionPerformed
        setPresionado12(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon12.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon12.setVisible(false);

        }
        BTNAgregarPokemon12.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon12ActionPerformed

    private void BTNAgregarPokemon12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon12MouseEntered
        BTNAgregarPokemon12.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon12MouseEntered

    private void Pokemon6Jugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon6Jugador2MouseEntered
        BTNAgregarPokemon12.setVisible(true);
    }//GEN-LAST:event_Pokemon6Jugador2MouseEntered

    private void Pokemon6Jugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon6Jugador2MouseExited
        BTNAgregarPokemon12.setVisible(false);
    }//GEN-LAST:event_Pokemon6Jugador2MouseExited

    private void BTNAgregarPokemon13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon13ActionPerformed
        setPresionado13(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon13.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon13.setVisible(false);

        }
        BTNAgregarPokemon13.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon13ActionPerformed

    private void BTNAgregarPokemon13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon13MouseEntered
        BTNAgregarPokemon13.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon13MouseEntered

    private void Pokemon1Jugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon1Jugador3MouseEntered
        BTNAgregarPokemon13.setVisible(true);
    }//GEN-LAST:event_Pokemon1Jugador3MouseEntered

    private void Pokemon1Jugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon1Jugador3MouseExited
        BTNAgregarPokemon13.setVisible(false);
    }//GEN-LAST:event_Pokemon1Jugador3MouseExited

    private void BTNAgregarPokemon14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon14ActionPerformed
        setPresionado14(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado13(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon14.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon14.setVisible(false);

        }
        BTNAgregarPokemon14.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon14ActionPerformed

    private void BTNAgregarPokemon14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon14MouseEntered
        BTNAgregarPokemon14.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon14MouseEntered

    private void Pokemon2Jugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon2Jugador3MouseEntered
        BTNAgregarPokemon14.setVisible(true);
    }//GEN-LAST:event_Pokemon2Jugador3MouseEntered

    private void Pokemon2Jugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon2Jugador3MouseExited
        BTNAgregarPokemon14.setVisible(false);
    }//GEN-LAST:event_Pokemon2Jugador3MouseExited

    private void BTNAgregarPokemon15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon15ActionPerformed
        setPresionado15(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon15.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon15.setVisible(false);

        }
        BTNAgregarPokemon15.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon15ActionPerformed

    private void BTNAgregarPokemon15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon15MouseEntered
        BTNAgregarPokemon15.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon15MouseEntered

    private void Pokemon3Jugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon3Jugador3MouseEntered
        BTNAgregarPokemon15.setVisible(true);
    }//GEN-LAST:event_Pokemon3Jugador3MouseEntered

    private void Pokemon3Jugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon3Jugador3MouseExited
        BTNAgregarPokemon15.setVisible(false);
    }//GEN-LAST:event_Pokemon3Jugador3MouseExited

    private void BTNAgregarPokemon16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon16ActionPerformed
        setPresionado16(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado17(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon16.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon16.setVisible(false);

        }
        BTNAgregarPokemon16.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon16ActionPerformed

    private void BTNAgregarPokemon16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon16MouseEntered
        BTNAgregarPokemon16.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BTNAgregarPokemon16MouseEntered

    private void Pokemon4Jugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon4Jugador3MouseEntered
        BTNAgregarPokemon16.setVisible(true);
    }//GEN-LAST:event_Pokemon4Jugador3MouseEntered

    private void Pokemon4Jugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon4Jugador3MouseExited
        BTNAgregarPokemon16.setVisible(false);
    }//GEN-LAST:event_Pokemon4Jugador3MouseExited

    private void BTNAgregarPokemon17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon17ActionPerformed
        setPresionado17(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado18(false);
        setPresionado19(false);

        BTNAgregarPokemon17.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon17.setVisible(false);

        }
        BTNAgregarPokemon17.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon17ActionPerformed

    private void BTNAgregarPokemon17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon17MouseEntered
        BTNAgregarPokemon17.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon17MouseEntered

    private void Pokemon5Jugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon5Jugador3MouseEntered
        BTNAgregarPokemon17.setVisible(true);
    }//GEN-LAST:event_Pokemon5Jugador3MouseEntered

    private void Pokemon5Jugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon5Jugador3MouseExited
        BTNAgregarPokemon17.setVisible(false);
    }//GEN-LAST:event_Pokemon5Jugador3MouseExited

    private void BTNAgregarPokemon18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon18ActionPerformed
        setPresionado18(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado19(false);

        BTNAgregarPokemon18.setVisible(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);
            BTNAgregarPokemon18.setVisible(false);

        }
        BTNAgregarPokemon18.setVisible(false);

        ell.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon18ActionPerformed

    private void BTNAgregarPokemon18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNAgregarPokemon18MouseEntered
        BTNAgregarPokemon18.setVisible(true);
    }//GEN-LAST:event_BTNAgregarPokemon18MouseEntered

    private void Pokemon6Jugador3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon6Jugador3MouseExited
        BTNAgregarPokemon18.setVisible(false);
    }//GEN-LAST:event_Pokemon6Jugador3MouseExited

    private void Pokemon6Jugador3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pokemon6Jugador3MouseEntered
        BTNAgregarPokemon18.setVisible(true);
    }//GEN-LAST:event_Pokemon6Jugador3MouseEntered

    private void JLBlucha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBlucha1MouseClicked

        if (ell == null) {
            ell = new EleccionPokemon(this);

        }

        ell.setVisible(false);
        ventanaEmergente(ell);
    }//GEN-LAST:event_JLBlucha1MouseClicked

    private void JLBlucha1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBlucha1MouseEntered

    }//GEN-LAST:event_JLBlucha1MouseEntered

    public int getVidaFinalRival() {
        return vidaFinalRival;
    }

    public void setVidaFinalRival(int vidaFinalRival) {
        this.vidaFinalRival = vidaFinalRival;
    }

    public double getEFFECTRival() {
        return EFFECTRival;
    }

    public void setEFFECTRival(double EFFECTRival) {
        this.EFFECTRival = EFFECTRival;
    }

    public double getVidaRival() {
        return vidaRival;
    }

    public void setVidaRival(double vidaRival) {
        this.vidaRival = vidaRival;
    }

    public double getAtaqueRival() {
        return ataqueRival;
    }

    public void setAtaqueRival(double ataqueRival) {
        this.ataqueRival = ataqueRival;
    }

    public double getDefensaRival() {
        return defensaRival;
    }

    public void setDefensaRival(double defensaRival) {
        this.defensaRival = defensaRival;
    }

    public int getPotenciaMovimientoRival() {
        return potenciaMovimientoRival;
    }

    public void setPotenciaMovimientoRival(int potenciaMovimientoRival) {
        this.potenciaMovimientoRival = potenciaMovimientoRival;
    }

    public boolean isSTABRival() {
        return STABRival;
    }

    public void setSTABRival(boolean STABRival) {
        this.STABRival = STABRival;
    }
    int vidaFinalRival;
    double EFFECTRival;
    double vidaRival;
    double ataqueRival;
    double defensaRival;
    int potenciaMovimientoRival;
    boolean STABRival;
    private void JLBlucha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBlucha2MouseClicked

        setAtaqueRival(0);
        setVidaFinalRival(0);
        setEFFECTRival(0);
        setAtaqueRival(0);
        setDefensaRival(0);
        setPotenciaMovimientoRival(0);
        setSTABRival(false);

        setPresionado19(true);

        setPresionado(false);
        setPresionado2(false);
        setPresionado3(false);
        setPresionado4(false);
        setPresionado5(false);
        setPresionado6(false);

        setPresionado7(false);
        setPresionado8(false);
        setPresionado9(false);
        setPresionado10(false);
        setPresionado11(false);

        setPresionado13(false);
        setPresionado14(false);
        setPresionado15(false);
        setPresionado16(false);
        setPresionado17(false);
        setPresionado18(false);

        if (ell == null) {
            ell = new EleccionPokemon(this);

        }

        ell.setVisible(true);


    }//GEN-LAST:event_JLBlucha2MouseClicked
    public void prueba() {
        System.out.println("a");

    }

    public int calcularDanio(double Atq, double PM, double DefRival, boolean STAB, double Efect) {
        Random random = new Random(); //clase para generar numeros aleatorios
        final double multiplicadorF = 1.4;
        final int multiplicadorF1 = 5;
        double PT = 0;
        final double CRITICO_DANO = 1.25;
        final double STAB_DANO = 1.2;
        int numeroAleatorio = 0;
        numeroAleatorio = random.nextInt(10) + 1;

        if (STAB == false && numeroAleatorio != 10) {
            PT = ((multiplicadorF * PM * Atq) / (DefRival * multiplicadorF1)) * Efect;
        }
        //en el caso que el pokemon pegue con un ataque de su mismo tipo

        if (STAB == true && numeroAleatorio != 10) {
            PT = ((multiplicadorF * PM * Atq) / (DefRival * multiplicadorF1) * STAB_DANO) * Efect;
        }
        // en el caso que el pokemon no tiiene stab pero si pega critco

        if (STAB == false && numeroAleatorio == 10) {
            System.out.println("Golpe critico");
            PT = ((multiplicadorF * PM * Atq) / (DefRival * multiplicadorF1) * CRITICO_DANO) * Efect;
        }

        //en el caso que el pokemon tiene STAB y pega critco
        if (STAB == true && numeroAleatorio == 10) {
            System.out.println("Golpe critico");
            PT = ((((multiplicadorF * PM * Atq) / (DefRival * multiplicadorF1)) * STAB_DANO) * CRITICO_DANO) * Efect;
        }

        System.out.println("La vida restada es de:" + PT);

        return (int) (PT);//PARCEAMOS DE DOUBLE A INT 
    }

    public int getVidaFinalAliada() {
        return vidaFinalAliada;
    }

    public void setVidaFinalAliada(int vidaFinalAliada) {
        this.vidaFinalAliada = vidaFinalAliada;
    }

    public double getEFFECTAliado() {
        return EFFECTAliado;
    }

    public void setEFFECTAliado(double EFFECTAliado) {
        this.EFFECTAliado = EFFECTAliado;
    }

    public double getVidaAliada() {
        return vidaAliada;
    }

    public void setVidaAliada(double vidaAliada) {
        this.vidaAliada = vidaAliada;
    }

    public double getAtaqueAliado() {
        return ataqueAliado;
    }

    public void setAtaqueAliado(double ataqueAliado) {
        this.ataqueAliado = ataqueAliado;
    }

    public double getDefensaAliada() {
        return defensaAliada;
    }

    public void setDefensaAliada(double defensaAliada) {
        this.defensaAliada = defensaAliada;
    }

    public int getPotenciaMovimientoAliado() {
        return potenciaMovimientoAliado;
    }

    public void setPotenciaMovimientoAliado(int potenciaMovimientoAliado) {
        this.potenciaMovimientoAliado = potenciaMovimientoAliado;
    }

    public boolean isSTABAliado() {
        return STABAliado;
    }

    public void setSTABAliado(boolean STABAliado) {
        this.STABAliado = STABAliado;
    }

    public double EFECTIVIDAD(String TipoAtaque, String Tipo1, String Tipo2, HashMap<String, HashMap<String, Double>> efectividadTipos) {
        String tipoAtaque = TipoAtaque;//Ese string será cambiado por el tipo del ataque que se va a emplear
        String[] tiposPokemon = {Tipo1, Tipo2};//Esos strings seran cambiados por los tipos del pokemon que va a recibir el ataque

        double efectividadTotal = 1.0; // Inicializa en 1.0 (neutral)

        for (String tipoPokemon : tiposPokemon) {
            double efectividad = efectividadTipos.get(tipoAtaque).getOrDefault(tipoPokemon, 1.0);
            efectividadTotal *= efectividad;
        }
        if (efectividadTotal == 1.6900000000000002) {//Ejemplo: lanzallamas contra un poke tipo bicho/planta
            System.out.println("Mega efectivo");
            EFFECTRival = 1.6;
        } else if (efectividadTotal == 0.25) {//Ejemplo: Lanzallamas contra un poke tipo fuego/agua
            System.out.println("Nada efectivo");
            EFFECTRival = 0.33;
        } else if (efectividadTotal == 0.65) {//Ejemplo: Lanzallamas contra un poke tipo planta/fuego
            System.out.println("Neutro");
            EFFECTRival = 1;
        } else if (efectividadTotal == 1.0) {//Ejemplo: lanzallamas contra un poke tipo electrico
            System.out.println("Neutro");
            EFFECTRival = 1;
        } else if (efectividadTotal == 0.5) {
            System.out.println("Poco efectivo");
            EFFECTRival = 0.5;
        } else if (efectividadTotal == 0) {
            System.out.println("Nulo");
            EFFECTRival = 0.0;
        } else if (efectividadTotal == 1.3) {
            System.out.println("Super efectivo");
            EFFECTRival = 1.3;
        }

        return EFFECTRival;
    }

    int vidaFinalAliada = 0;
    double EFFECTAliado = 0;
    double vidaAliada = 0;
    double ataqueAliado = 0;
    double defensaAliada = 0;
    int potenciaMovimientoAliado = 0;
    boolean STABAliado = false;

    private void BtnLucharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLucharActionPerformed
        ObtenerPsOriginales1();
        ObtenerPsOriginales2();
        ObtenerPsOriginales3();
        combatePokemon();


    }//GEN-LAST:event_BtnLucharActionPerformed

    private void ComboMovimientoPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMovimientoPokemon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMovimientoPokemon1ActionPerformed

    private void BtnLucharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLucharMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLucharMouseClicked

    private void BTN_curarEquipoPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_curarEquipoPokemonActionPerformed
        actulizarPuntosdeSalud();
    }//GEN-LAST:event_BTN_curarEquipoPokemonActionPerformed

    private void BTN_curarEquipoPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_curarEquipoPokemon2ActionPerformed
        actulizarPuntosdeSalud2();
    }//GEN-LAST:event_BTN_curarEquipoPokemon2ActionPerformed

    private void BTN_curarEquipoPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_curarEquipoPokemon3ActionPerformed
        actulizarPuntosdeSalud3();
    }//GEN-LAST:event_BTN_curarEquipoPokemon3ActionPerformed

    private void BtnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCapturarActionPerformed
        Object selectedItem = objetosJugador1.getSelectedItem();
        if (selectedItem != null) {
            String selectedValue = selectedItem.toString();

            if (selectedValue.equals("Pokeball")) {
                System.out.println("Se seleccionó una Pokeball.");
                Random rand = new Random();

                int PokeBallR = 24 + rand.nextInt(217);  // Número aleatorio de la Pokeball

                double Captura = CalcularCaptura(pokemonRival.getPuntosDeSalud(), (int) vidaRival, 150, 0);

                System.out.println(" ");
                System.out.println("Número generado por la fórmula: " + Captura);
                System.out.println("Número aleatorio de la Pokeball: " + PokeBallR);

                if (Captura > PokeBallR) {
                        JOptionPane.showMessageDialog(null, "Se atrapo el pokmemon");
                    System.out.println("El Pokemon se ha capturado");
                } else {
                    System.out.println("El Pokemon no se ha capturado");
                     JOptionPane.showMessageDialog(null, "Mo se atrapo el pokmemon");
                }
                
            } else if (selectedValue.equals("Superball")) {
                System.out.println("Se seleccionó una Superball.");
                
                Random rand = new Random();

                int Superbola = 16 + rand.nextInt(160);  // Número aleatorio de la Pokeball

                double Captura = CalcularCaptura(pokemonRival.getPuntosDeSalud(), (int) vidaRival, 150, 0);

                System.out.println(" ");
                System.out.println("Número generado por la fórmula: " + Captura);
                System.out.println("Número aleatorio de la Pokeball: " + Superbola);

                if (Captura > Superbola) {
                    System.out.println("El Pokemon se ha capturado");
                    JOptionPane.showMessageDialog(null, "Se atrapo el pokmemon");
                } else {
                    System.out.println("El Pokemon no se ha capturado");
                    JOptionPane.showMessageDialog(null, "Mo se atrapo el pokmemon");
                }
                
            } else if (selectedValue.equals("Ultraball")) {
                System.out.println("Se seleccionó una Ultraball.");
                
                Random rand = new Random();

                int Ultrabal = 8 + rand.nextInt(80);  // Número aleatorio de la Pokeball

                double Captura = CalcularCaptura(pokemonRival.getPuntosDeSalud(), (int) vidaRival, 150, 0);

                System.out.println(" ");
                System.out.println("Número generado por la fórmula: " + Captura);
                System.out.println("Número aleatorio de la Pokeball: " + Ultrabal);

                if (Captura > Ultrabal) {
                    System.out.println("El Pokemon se ha capturado");
                    JOptionPane.showMessageDialog(null, "Se atrapo el pokmemon");
                } else {
                    System.out.println("El Pokemon no se ha capturado");
                    JOptionPane.showMessageDialog(null, "No se atrapo el pokmemon");
                }
            } else if (selectedValue.equals("Maestro")) {
                    JOptionPane.showMessageDialog(null, "Lo has capturado");

            } else {
               
            }
        } else {
            System.out.println("No se ha seleccionado ningún elemento.");
        }


    }//GEN-LAST:event_BtnCapturarActionPerformed
    public int CalcularCaptura(int Hpm, int Hpr, int RatioC, int BonusEs) {
        final int numeroFormula = 3;
        final int numeroFormula1 = 2;

        int captura;
        if(pokemonRival.getIdPokemon()== 3 || pokemonRival.getIdPokemon()== 6 || pokemonRival.getIdPokemon()== 9 || pokemonRival.getIdPokemon()== 12 || pokemonRival.getIdPokemon()== 15 || pokemonRival.getIdPokemon()== 18 || pokemonRival.getIdPokemon()== 21 || pokemonRival.getIdPokemon()== 24 || pokemonRival.getIdPokemon()== 27 || pokemonRival.getIdPokemon()== 30 || pokemonRival.getIdPokemon()== 33 || pokemonRival.getIdPokemon()== 36  || pokemonRival.getIdPokemon()== 39 || pokemonRival.getIdPokemon()== 42 || pokemonRival.getIdPokemon()== 46 ){
            RatioC = 35;
        }
        if(pokemonRival.getIdPokemon()== 227 || pokemonRival.getIdPokemon()== 230 || pokemonRival.getIdPokemon()== 233 || pokemonRival.getIdPokemon()== 235  ){
            RatioC = 30;
        }
        if(pokemonRival.getIdPokemon()>=237){
          RatioC = 8;
        }

        captura = ((numeroFormula * Hpm - numeroFormula1 * Hpr) / (Hpm * numeroFormula1)) + RatioC + BonusEs;
        
        return captura;
    }

    public void AjustarImagen(JLabel imagen, String url) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(url));
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
            imagen.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
            // Manejar el error de acuerdo a tus necesidades.
        }
    }

    public void TamanosPokemon() {
        Pokemon1Jugador1.setSize(54, 54);
        Pokemon2Jugador1.setSize(54, 54);
        Pokemon3Jugador1.setSize(54, 54);
        Pokemon4Jugador1.setSize(54, 54);
        Pokemon5Jugador1.setSize(54, 54);
        Pokemon6Jugador1.setSize(54, 54);
        Pokemon1Jugador2.setSize(54, 54);
        Pokemon2Jugador2.setSize(54, 54);
        Pokemon3Jugador2.setSize(54, 54);
        Pokemon4Jugador2.setSize(54, 54);
        Pokemon5Jugador2.setSize(54, 54);
        Pokemon6Jugador2.setSize(54, 54);
        Pokemon1Jugador3.setSize(54, 54);
        Pokemon2Jugador3.setSize(54, 54);
        Pokemon3Jugador3.setSize(54, 54);
        Pokemon4Jugador3.setSize(54, 54);
        Pokemon5Jugador3.setSize(54, 54);
        Pokemon6Jugador3.setSize(54, 54);
        JLBlucha1.setSize(89, 105);
        JLBlucha2.setSize(89, 110);

    }

    public void OcultarAgregarBTN() {

        BTNAgregarPokemon1.setVisible(false);
        BTNAgregarPokemon2.setVisible(false);
        BTNAgregarPokemon3.setVisible(false);
        BTNAgregarPokemon4.setVisible(false);
        BTNAgregarPokemon5.setVisible(false);
        BTNAgregarPokemon6.setVisible(false);
        BTNAgregarPokemon7.setVisible(false);
        BTNAgregarPokemon8.setVisible(false);
        BTNAgregarPokemon9.setVisible(false);
        BTNAgregarPokemon10.setVisible(false);
        BTNAgregarPokemon11.setVisible(false);
        BTNAgregarPokemon12.setVisible(false);
        BTNAgregarPokemon13.setVisible(false);
        BTNAgregarPokemon14.setVisible(false);
        BTNAgregarPokemon15.setVisible(false);
        BTNAgregarPokemon16.setVisible(false);
        BTNAgregarPokemon17.setVisible(false);
        BTNAgregarPokemon18.setVisible(false);
        BtnLuchar.setEnabled(false);
        BtnCapturar.setEnabled(false);
        BTN_curarEquipoPokemon.setEnabled(false);
        BTN_curarEquipoPokemon2.setEnabled(false);
        BTN_curarEquipoPokemon3.setEnabled(false);

        //21.76
        //
    }

    public void mostrarIconoPokeball() {
        AjustarImagen(Pokemon1Jugador1, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon2Jugador1, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon3Jugador1, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon4Jugador1, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon5Jugador1, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon6Jugador1, "/RotomImagenes/pokeball.png");

        AjustarImagen(Pokemon1Jugador2, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon2Jugador2, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon3Jugador2, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon4Jugador2, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon5Jugador2, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon6Jugador2, "/RotomImagenes/pokeball.png");

        AjustarImagen(Pokemon1Jugador3, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon2Jugador3, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon3Jugador3, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon4Jugador3, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon5Jugador3, "/RotomImagenes/pokeball.png");
        AjustarImagen(Pokemon6Jugador3, "/RotomImagenes/pokeball.png");
        AjustarImagen(JLBlucha1, "/RotomImagenes/pokeball.png");
        AjustarImagen(JLBlucha2, "/RotomImagenes/pokeball.png");

    }

    public void Mostrararrays() {
        for (Pokemon iterar : equipoJugador1) {
            System.out.println(iterar.getNombrePokemon());

        }
        for (Pokemon iterar : equipoJugador2) {
            System.out.println(iterar.getNombrePokemon());

        }

        for (Pokemon iterar : equipoJugador3) {
            System.out.println(iterar.getNombrePokemon());

        }

    }

    public void cargarDatosJuegos() {
        if (ell == null) {
            ell = new EleccionPokemon(this);
            ell.CargarSprites();
        }

    }

    public void ventanaEmergente(JFrame parent) {
        JDialog dialog = new JDialog(parent, "Elige un Pokémon", true);

        btnDialogoEquipo1.setText("Equipo1");
        btnDialogoEquipo1.setBounds(50, 50, 100, 30); // Establece la posición y el tamaño de btnDialogoEquipo1

        btnDialogoEquipo2.setText("Equipo2");
        btnDialogoEquipo2.setBounds(170, 50, 100, 30); // Establece la posición y el tamaño de btnDialogoEquipo2

        btnDialogoEquipo3.setText("Equipo3");
        btnDialogoEquipo3.setBounds(290, 50, 100, 30);

        btnpokemon1J1.setVisible(false);
        btnpokemon2J1.setVisible(false);
        btnpokemon3J1.setVisible(false);
        btnpokemon4J1.setVisible(false);
        btnpokemon5J1.setVisible(false);
        btnpokemon6J1.setVisible(false);

        btnpokemon1J2.setVisible(false);
        btnpokemon2J2.setVisible(false);
        btnpokemon3J2.setVisible(false);
        btnpokemon4J2.setVisible(false);
        btnpokemon5J2.setVisible(false);
        btnpokemon6J2.setVisible(false);

        btnpokemon1J3.setVisible(false);
        btnpokemon2J3.setVisible(false);
        btnpokemon3J3.setVisible(false);
        btnpokemon4J3.setVisible(false);
        btnpokemon5J3.setVisible(false);
        btnpokemon6J3.setVisible(false);

// Oculta el botón inicialmente
        btnDialogoEquipo1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 6; i++) {
                    if (i < equipoJugador1.size()) {
                        String nombrePokemon = equipoJugador1.get(i).getNombrePokemon();
                        switch (i) {
                            case 0:
                                btnpokemon1J1.setText(nombrePokemon);
                                btnpokemon1J1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon1J1.setEnabled(true);
                                btnpokemon1J1.setVisible(true);
                                btnpokemon1J1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(0).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(0).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(0).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(0).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(0).getNombreMovimiento4());
                                        seleccion = 0;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador1.get(0).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 1:
                                btnpokemon2J1.setText(nombrePokemon);
                                btnpokemon2J1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon2J1.setEnabled(true);
                                btnpokemon2J1.setVisible(true);
                                btnpokemon2J1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(1).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(1).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(1).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(1).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(1).getNombreMovimiento4());
                                        seleccion = 1;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador1.get(1).getPuntosDeSalud()));
                                        String movimientoSeleccionado = (String) ComboMovimientoPokemon1.getSelectedItem();
                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 2:
                                btnpokemon3J1.setText(nombrePokemon);
                                btnpokemon3J1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon3J1.setEnabled(true);
                                btnpokemon3J1.setVisible(true);
                                btnpokemon3J1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(2).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(2).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(2).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(2).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(2).getNombreMovimiento4());
                                        seleccion = 2;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador1.get(2).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 3:
                                btnpokemon4J1.setText(nombrePokemon);
                                btnpokemon4J1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon4J1.setEnabled(true);
                                btnpokemon4J1.setVisible(true);
                                btnpokemon4J1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(3).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(3).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(3).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(3).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(3).getNombreMovimiento4());
                                        seleccion = 3;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador1.get(3).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 4:
                                btnpokemon5J1.setText(nombrePokemon);
                                btnpokemon5J1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon5J1.setEnabled(true);
                                btnpokemon5J1.setVisible(true);
                                btnpokemon5J1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(4).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(4).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(4).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(4).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(4).getNombreMovimiento4());
                                        seleccion = 4;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador1.get(4).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 5:
                                btnpokemon6J1.setText(nombrePokemon);
                                btnpokemon6J1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon6J1.setEnabled(true);
                                btnpokemon6J1.setVisible(true);
                                btnpokemon6J1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(5).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(5).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(5).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(5).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador1.get(5).getNombreMovimiento4());
                                        seleccion = 5;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador1.get(5).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                        }
                    } else {
                        switch (i) {
                            case 0:
                                btnpokemon1J1.setText("Sin pokemon");
                                btnpokemon1J1.setCursor(Cursor.getDefaultCursor());
                                btnpokemon1J1.setEnabled(false);
                                btnpokemon1J1.setVisible(true); // Mostrar el botón
                                break;
                            case 1:
                                btnpokemon2J1.setText("Sin pokemon");
                                btnpokemon2J1.setCursor(Cursor.getDefaultCursor());
                                btnpokemon2J1.setEnabled(false);
                                btnpokemon2J1.setVisible(true); // Mostrar el botón
                                break;
                            case 2:
                                btnpokemon3J1.setText("Sin pokemon");
                                btnpokemon3J1.setCursor(Cursor.getDefaultCursor());
                                btnpokemon3J1.setEnabled(false);
                                btnpokemon3J1.setVisible(true); // Mostrar el botón
                                break;
                            case 3:
                                btnpokemon4J1.setText("Sin pokemon");
                                btnpokemon4J1.setCursor(Cursor.getDefaultCursor());
                                btnpokemon4J1.setEnabled(false);
                                btnpokemon4J1.setVisible(true); // Mostrar el botón
                                break;
                            case 4:
                                btnpokemon5J1.setText("Sin pokemon");
                                btnpokemon5J1.setCursor(Cursor.getDefaultCursor());
                                btnpokemon5J1.setEnabled(false);
                                btnpokemon5J1.setVisible(true); // Mostrar el botón
                                break;
                            case 5:
                                btnpokemon6J1.setText("Sin pokemon");
                                btnpokemon6J1.setCursor(Cursor.getDefaultCursor());
                                btnpokemon6J1.setEnabled(false);
                                btnpokemon6J1.setVisible(true); // Mostrar el botón
                                break;
                        }
                    }
                }

                dialog.revalidate();
                dialog.repaint();
            }
        });

        btnDialogoEquipo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    if (i < equipoJugador2.size()) {
                        String nombrePokemon = equipoJugador2.get(i).getNombrePokemon();
                        switch (i) {
                            case 0:
                                btnpokemon1J2.setText(nombrePokemon);
                                btnpokemon1J2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon1J2.setEnabled(true);
                                btnpokemon1J2.setVisible(true); // Mostrar el botón

                                btnpokemon1J2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        imagenSprite = new ImageIcon(getClass().getResource(equipoJugador2.get(0).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(0).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(0).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(0).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(0).getNombreMovimiento4());
                                        seleccion = 6;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador2.get(0).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });

                                break;
                            case 1:
                                btnpokemon2J2.setText(nombrePokemon);
                                btnpokemon2J2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon2J2.setEnabled(true);
                                btnpokemon2J2.setVisible(true); // Mostrar el botón

                                btnpokemon2J2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        imagenSprite = new ImageIcon(getClass().getResource(equipoJugador2.get(1).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(1).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(1).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(1).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(1).getNombreMovimiento4());
                                        seleccion = 7;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador2.get(1).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 2:
                                btnpokemon3J2.setText(nombrePokemon);
                                btnpokemon3J2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon3J2.setEnabled(true);
                                btnpokemon3J2.setVisible(true);
                                btnpokemon3J2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador2.get(2).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(2).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(2).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(2).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(2).getNombreMovimiento4());
                                        seleccion = 8;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador2.get(2).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });

                                break;
                            case 3:
                                btnpokemon4J2.setText(nombrePokemon);
                                btnpokemon4J2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon4J2.setEnabled(true);
                                btnpokemon4J2.setVisible(true);
                                btnpokemon4J2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador2.get(3).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(3).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(3).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(3).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(3).getNombreMovimiento4());
                                        seleccion = 9;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador2.get(3).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 4:
                                btnpokemon5J2.setText(nombrePokemon);
                                btnpokemon5J2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon5J2.setEnabled(true);
                                btnpokemon5J2.setVisible(true); // Mostrar el botón
                                btnpokemon5J2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador2.get(4).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(4).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(4).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(4).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(4).getNombreMovimiento4());
                                        seleccion = 10;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador2.get(4).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 5:
                                btnpokemon6J2.setText(nombrePokemon);
                                btnpokemon6J2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon6J2.setEnabled(true);
                                btnpokemon6J2.setVisible(true);
                                btnpokemon6J2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador2.get(5).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(5).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(5).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(5).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador2.get(5).getNombreMovimiento4());
                                        seleccion = 11;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador2.get(5).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                        }
                    } else {
                        switch (i) {
                            case 0:
                                btnpokemon1J2.setText("Sin pokemon");
                                btnpokemon1J2.setCursor(Cursor.getDefaultCursor());
                                btnpokemon1J2.setEnabled(false);
                                btnpokemon1J2.setVisible(true);
                                break;
                            case 1:
                                btnpokemon2J2.setText("Sin pokemon");
                                btnpokemon2J2.setCursor(Cursor.getDefaultCursor());
                                btnpokemon2J2.setEnabled(false);
                                btnpokemon2J2.setVisible(true); // Mostrar el botón
                                break;
                            case 2:
                                btnpokemon3J2.setText("Sin pokemon");
                                btnpokemon3J2.setCursor(Cursor.getDefaultCursor());
                                btnpokemon3J2.setEnabled(false);
                                btnpokemon3J2.setVisible(true); // Mostrar el botón
                                break;
                            case 3:
                                btnpokemon4J2.setText("Sin pokemon");
                                btnpokemon4J2.setCursor(Cursor.getDefaultCursor());
                                btnpokemon4J2.setEnabled(false);
                                btnpokemon4J2.setVisible(true); // Mostrar el botón
                                break;
                            case 4:
                                btnpokemon5J2.setText("Sin pokemon");
                                btnpokemon5J2.setCursor(Cursor.getDefaultCursor());
                                btnpokemon5J2.setEnabled(false);
                                btnpokemon5J2.setVisible(true); // Mostrar el botón
                                break;
                            case 5:
                                btnpokemon6J2.setText("Sin pokemon");
                                btnpokemon6J2.setCursor(Cursor.getDefaultCursor());
                                btnpokemon6J2.setEnabled(false);
                                btnpokemon6J2.setVisible(true); // Mostrar el botón
                                break;
                        }
                    }
                }

                dialog.revalidate();
                dialog.repaint();
            }
        });

        btnDialogoEquipo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    if (i < equipoJugador3.size()) {
                        String nombrePokemon = equipoJugador3.get(i).getNombrePokemon();
                        switch (i) {
                            case 0:
                                btnpokemon1J3.setText(nombrePokemon);
                                btnpokemon1J3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon1J3.setEnabled(true);
                                btnpokemon1J3.setVisible(true);
                                btnpokemon1J3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador3.get(0).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(0).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(0).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(0).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(0).getNombreMovimiento4());
                                        seleccion = 12;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador3.get(0).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });

                                break;
                            case 1:
                                btnpokemon2J3.setText(nombrePokemon);
                                btnpokemon2J3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon2J3.setEnabled(true);
                                btnpokemon2J3.setVisible(true);
                                btnpokemon2J3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador3.get(1).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(1).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(1).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(1).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(1).getNombreMovimiento4());
                                        seleccion = 13;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador3.get(1).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 2:
                                btnpokemon3J3.setText(nombrePokemon);
                                btnpokemon3J3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon3J3.setEnabled(true);
                                btnpokemon3J3.setVisible(true);
                                btnpokemon3J3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador3.get(2).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(2).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(2).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(2).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(2).getNombreMovimiento4());
                                        seleccion = 14;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador3.get(2).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 3:
                                btnpokemon4J3.setText(nombrePokemon);
                                btnpokemon4J3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon4J3.setEnabled(true);
                                btnpokemon4J3.setVisible(true);
                                btnpokemon4J3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador3.get(3).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(3).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(3).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(3).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(3).getNombreMovimiento4());
                                        seleccion = 15;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador3.get(3).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 4:
                                btnpokemon5J3.setText(nombrePokemon);
                                btnpokemon5J3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon5J3.setEnabled(true);
                                btnpokemon5J3.setVisible(true);
                                btnpokemon5J3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador3.get(4).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(4).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(4).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(4).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(4).getNombreMovimiento4());
                                        seleccion = 16;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador3.get(4).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                            case 5:
                                btnpokemon6J3.setText(nombrePokemon);
                                btnpokemon6J3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                                btnpokemon6J3.setEnabled(true);
                                btnpokemon6J3.setVisible(true);
                                btnpokemon6J3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        ImageIcon imagenSprite = new ImageIcon(getClass().getResource(equipoJugador3.get(5).getSprite()));
                                        Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                                        ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                                        ComboMovimientoPokemon1.removeAllItems();
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(5).getNombreMovimiento1());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(5).getNombreMovimiento2());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(5).getNombreMovimiento3());
                                        ComboMovimientoPokemon1.addItem(equipoJugador3.get(5).getNombreMovimiento4());
                                        seleccion = 5;
                                        jLbVida.setText("PS: " + String.valueOf(equipoJugador3.get(5).getPuntosDeSalud()));

                                        setJLBlucha1(imagenEscaladaIcon);
                                    }
                                });
                                break;
                        }
                    } else {
                        switch (i) {
                            case 0:
                                btnpokemon1J3.setText("Sin pokemon");
                                btnpokemon1J3.setCursor(Cursor.getDefaultCursor());
                                btnpokemon1J3.setEnabled(false);
                                btnpokemon1J3.setVisible(true); // Mostrar el botón
                                break;
                            case 1:
                                btnpokemon2J3.setText("Sin pokemon");
                                btnpokemon2J3.setCursor(Cursor.getDefaultCursor());
                                btnpokemon2J3.setEnabled(false);
                                btnpokemon2J3.setVisible(true); // Mostrar el botón
                                break;
                            case 2:
                                btnpokemon3J3.setText("Sin pokemon");
                                btnpokemon3J3.setCursor(Cursor.getDefaultCursor());
                                btnpokemon3J3.setEnabled(false);
                                btnpokemon3J3.setVisible(true); // Mostrar el botón
                                break;
                            case 3:
                                btnpokemon4J3.setText("Sin pokemon");
                                btnpokemon4J3.setCursor(Cursor.getDefaultCursor());
                                btnpokemon4J3.setEnabled(false);
                                btnpokemon4J3.setVisible(true); // Mostrar el botón
                                break;
                            case 4:
                                btnpokemon5J3.setText("Sin pokemon");
                                btnpokemon5J3.setCursor(Cursor.getDefaultCursor());
                                btnpokemon5J3.setEnabled(false);
                                btnpokemon5J3.setVisible(true); // Mostrar el botón
                                break;
                            case 5:
                                btnpokemon6J3.setText("Sin pokemon");
                                btnpokemon6J3.setCursor(Cursor.getDefaultCursor());
                                btnpokemon6J3.setEnabled(false);
                                btnpokemon6J3.setVisible(true); // Mostrar el botón
                                break;
                        }
                    }
                }

                dialog.revalidate();
                dialog.repaint();
            }
        });

        JLabel mensaje = new JLabel("Elige Equipo");
        mensaje.setBounds(200, 10, 200, 30); // Establece la posición y el tamaño del JLabel
        btnpokemon1J1.setBounds(50, 110, 100, 30);
        btnpokemon2J1.setBounds(170, 110, 100, 30);
        btnpokemon3J1.setBounds(290, 110, 100, 30);
        btnpokemon4J1.setBounds(50, 160, 100, 30);
        btnpokemon5J1.setBounds(170, 160, 100, 30);
        btnpokemon6J1.setBounds(290, 160, 100, 30);

        btnpokemon1J2.setBounds(50, 110, 100, 30);
        btnpokemon2J2.setBounds(170, 110, 100, 30);
        btnpokemon3J2.setBounds(290, 110, 100, 30);
        btnpokemon4J2.setBounds(50, 160, 100, 30);
        btnpokemon5J2.setBounds(170, 160, 100, 30);
        btnpokemon6J2.setBounds(290, 160, 100, 30);

        btnpokemon1J3.setBounds(50, 110, 100, 30);
        btnpokemon2J3.setBounds(170, 110, 100, 30);
        btnpokemon3J3.setBounds(290, 110, 100, 30);
        btnpokemon4J3.setBounds(50, 160, 100, 30);
        btnpokemon5J3.setBounds(170, 160, 100, 30);
        btnpokemon6J3.setBounds(290, 160, 100, 30);
        JPanel panel = new JPanel(null); // Utiliza un AbsoluteLayout

        panel.add(mensaje);
        panel.add(btnpokemon1J1);
        panel.add(btnpokemon2J1);
        panel.add(btnpokemon3J1);
        panel.add(btnpokemon4J1);
        panel.add(btnpokemon5J1);
        panel.add(btnpokemon6J1);
        panel.add(btnpokemon1J2);
        panel.add(btnpokemon2J2);
        panel.add(btnpokemon3J2);
        panel.add(btnpokemon4J2);
        panel.add(btnpokemon5J2);
        panel.add(btnpokemon6J2);
        panel.add(btnpokemon1J3);
        panel.add(btnpokemon2J3);
        panel.add(btnpokemon3J3);
        panel.add(btnpokemon4J3);
        panel.add(btnpokemon5J3);
        panel.add(btnpokemon6J3);
        panel.add(btnDialogoEquipo2);
        panel.add(btnDialogoEquipo3);
        panel.add(btnDialogoEquipo1);

        dialog.add(panel);
        dialog.setSize(500, 300); // Establece el tamaño del JDialog
        panel.setSize(500, 300);
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
        dialog.revalidate();
        dialog.repaint();

    }

    public void EleccionPokemonAluchar() {
        // Declarar como final

        btnpokemon1J1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagenSprite = new ImageIcon(getClass().getResource(equipoJugador1.get(0).getSprite()));
                Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);
                ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                JLBlucha1.setSize(89, 105);
                setJLBlucha1(imagenEscaladaIcon);
            }
        });
    }

    public void combatePokemon() {

        HashMap<String, HashMap<String, Double>> efectividadTipos = new HashMap<>();

        // Efectividad de tipos para el tipo Fuego
        HashMap<String, Double> efectividadFuego = new HashMap<>();
        efectividadFuego.put("Planta", 1.3); // Super efectivo contra Planta
        efectividadFuego.put("Bicho", 1.3);  // Super efectivo contra Bicho
        efectividadFuego.put("Agua", 0.5);   // Poco efectivo contra Agua
        efectividadFuego.put("Fuego", 0.5);  // Poco efectivo contra Fuego
        efectividadFuego.put("Acero", 1.3);  // Neutro contra 
        efectividadFuego.put("Dragon", 0.5);
        efectividadFuego.put("Electrico", 1.0);
        efectividadFuego.put("Fantasma", 1.0);
        efectividadFuego.put("Hada", 1.0);
        efectividadFuego.put("Hielo", 1.3);
        efectividadFuego.put("Lucha", 1.0);
        efectividadFuego.put("Normal", 1.0);
        efectividadFuego.put("Psiquico", 1.0);
        efectividadFuego.put("Roca", 0.5);
        efectividadFuego.put("Siniestro", 1.0);
        efectividadFuego.put("Tierra", 1.0);
        efectividadFuego.put("Veneno", 1.0);
        efectividadFuego.put("Volador", 1.0);

        efectividadTipos.put("Fuego", efectividadFuego);

        // Efectividad de tipos para el tipo Planta
        HashMap<String, Double> efectividadPlanta = new HashMap<>();
        efectividadPlanta.put("Planta", 0.5);
        efectividadPlanta.put("Bicho", 0.5);
        efectividadPlanta.put("Agua", 1.3);
        efectividadPlanta.put("Fuego", 0.5);
        efectividadPlanta.put("Acero", 0.5);
        efectividadPlanta.put("Dragon", 0.5);
        efectividadPlanta.put("Electrico", 1.0);
        efectividadPlanta.put("Fantasma", 1.0);
        efectividadPlanta.put("Hada", 1.0);
        efectividadPlanta.put("Hielo", 1.0);
        efectividadPlanta.put("Lucha", 1.0);
        efectividadPlanta.put("Normal", 1.0);
        efectividadPlanta.put("Psiquico", 1.0);
        efectividadPlanta.put("Roca", 1.3);
        efectividadPlanta.put("Siniestro", 1.0);
        efectividadPlanta.put("Tierra", 1.3);
        efectividadPlanta.put("Veneno", 0.5);
        efectividadPlanta.put("Volador", 0.5);

        efectividadTipos.put("Planta", efectividadPlanta);

        // Efectividad de tipos para el tipo Planta
        HashMap<String, Double> efectividadAcero = new HashMap<>();
        efectividadAcero.put("Planta", 1.0);
        efectividadAcero.put("Bicho", 0.5);
        efectividadAcero.put("Agua", 0.5);
        efectividadAcero.put("Fuego", 0.5);
        efectividadAcero.put("Acero", 0.5);
        efectividadAcero.put("Dragon", 1.0);
        efectividadAcero.put("Electrico", 0.5);
        efectividadAcero.put("Fantasma", 1.0);
        efectividadAcero.put("Hada", 1.3);
        efectividadAcero.put("Hielo", 1.3);
        efectividadAcero.put("Lucha", 1.0);
        efectividadAcero.put("Normal", 1.0);
        efectividadAcero.put("Psiquico", 1.0);
        efectividadAcero.put("Roca", 1.3);
        efectividadAcero.put("Siniestro", 1.0);
        efectividadAcero.put("Tierra", 1.0);
        efectividadAcero.put("Veneno", 1.0);
        efectividadAcero.put("Volador", 1.0);

        efectividadTipos.put("Acero", efectividadAcero);

        HashMap<String, Double> efectividadAgua = new HashMap<>();
        efectividadAgua.put("Planta", 0.5);
        efectividadAgua.put("Bicho", 1.0);
        efectividadAgua.put("Agua", 0.5);
        efectividadAgua.put("Fuego", 1.3);
        efectividadAgua.put("Acero", 1.0);
        efectividadAgua.put("Dragon", 0.5);
        efectividadAgua.put("Electrico", 1.0);
        efectividadAgua.put("Fantasma", 1.0);
        efectividadAgua.put("Hada", 1.0);
        efectividadAgua.put("Hielo", 1.0);
        efectividadAgua.put("Lucha", 1.0);
        efectividadAgua.put("Normal", 1.0);
        efectividadAgua.put("Psiquico", 1.0);
        efectividadAgua.put("Roca", 1.3);
        efectividadAgua.put("Siniestro", 1.0);
        efectividadAgua.put("Tierra", 1.3);
        efectividadAgua.put("Veneno", 1.0);
        efectividadAgua.put("Volador", 1.0);

        efectividadTipos.put("Agua", efectividadAgua);

        HashMap<String, Double> efectividadBicho = new HashMap<>();
        efectividadBicho.put("Planta", 1.3);
        efectividadBicho.put("Bicho", 0.5);
        efectividadBicho.put("Agua", 1.0);
        efectividadBicho.put("Fuego", 0.5);
        efectividadBicho.put("Acero", 0.5);
        efectividadBicho.put("Dragon", 1.0);
        efectividadBicho.put("Electrico", 1.0);
        efectividadBicho.put("Fantasma", 0.5);
        efectividadBicho.put("Hada", 0.5);
        efectividadBicho.put("Hielo", 1.0);
        efectividadBicho.put("Lucha", 0.5);
        efectividadBicho.put("Normal", 1.0);
        efectividadBicho.put("Psiquico", 1.3);
        efectividadBicho.put("Roca", 1.0);
        efectividadBicho.put("Siniestro", 1.3);
        efectividadBicho.put("Tierra", 1.0);
        efectividadBicho.put("Veneno", 0.5);
        efectividadBicho.put("Volador", 0.5);

        efectividadTipos.put("Bicho", efectividadBicho);

        HashMap<String, Double> efectividadDragon = new HashMap<>();
        efectividadDragon.put("Planta", 1.0);
        efectividadDragon.put("Bicho", 1.0);
        efectividadDragon.put("Agua", 1.0);
        efectividadDragon.put("Fuego", 1.0);
        efectividadDragon.put("Acero", 0.5);
        efectividadDragon.put("Dragon", 1.3);
        efectividadDragon.put("Electrico", 1.0);
        efectividadDragon.put("Fantasma", 1.0);
        efectividadDragon.put("Hada", 0.0);
        efectividadDragon.put("Hielo", 1.0);
        efectividadDragon.put("Lucha", 1.0);
        efectividadDragon.put("Normal", 1.0);
        efectividadDragon.put("Psiquico", 1.0);
        efectividadDragon.put("Roca", 1.0);
        efectividadDragon.put("Siniestro", 1.0);
        efectividadDragon.put("Tierra", 1.0);
        efectividadDragon.put("Veneno", 1.0);
        efectividadDragon.put("Volador", 1.0);

        efectividadTipos.put("Dragon", efectividadDragon);

        HashMap<String, Double> efectividadElectrico = new HashMap<>();
        efectividadElectrico.put("Acero", 1.0);
        efectividadElectrico.put("Agua", 1.3);
        efectividadElectrico.put("Bicho", 1.0);
        efectividadElectrico.put("Dragon", 0.5);
        efectividadElectrico.put("Electrico", 0.5);
        efectividadElectrico.put("Fantasma", 1.0);
        efectividadElectrico.put("Fuego", 1.0);
        efectividadElectrico.put("Hada", 1.0);
        efectividadElectrico.put("Hielo", 1.0);
        efectividadElectrico.put("Lucha", 1.0);
        efectividadElectrico.put("Normal", 1.0);
        efectividadElectrico.put("Planta", 0.5);
        efectividadElectrico.put("Psiquico", 1.0);
        efectividadElectrico.put("Roca", 1.0);
        efectividadElectrico.put("Siniestro", 1.0);
        efectividadElectrico.put("Tierra", 0.0);
        efectividadElectrico.put("Veneno", 1.0);
        efectividadElectrico.put("Volador", 1.2);

        efectividadTipos.put("Electrico", efectividadElectrico);

        HashMap<String, Double> efectividadFantasma = new HashMap<>();
        efectividadFantasma.put("Acero", 1.0);
        efectividadFantasma.put("Agua", 1.0);
        efectividadFantasma.put("Bicho", 1.0);
        efectividadFantasma.put("Dragon", 1.0);
        efectividadFantasma.put("Electrico", 1.0);
        efectividadFantasma.put("Fantasma", 1.3);
        efectividadFantasma.put("Fuego", 1.0);
        efectividadFantasma.put("Hada", 1.0);
        efectividadFantasma.put("Hielo", 1.0);
        efectividadFantasma.put("Lucha", 1.0);
        efectividadFantasma.put("Normal", 0.0);
        efectividadFantasma.put("Planta", 1.0);
        efectividadFantasma.put("Psiquico", 1.3);
        efectividadFantasma.put("Roca", 1.0);
        efectividadFantasma.put("Siniestro", 0.5);
        efectividadFantasma.put("Tierra", 1.0);
        efectividadFantasma.put("Veneno", 1.0);
        efectividadFantasma.put("Volador", 1.0);

        efectividadTipos.put("Fantasma", efectividadFantasma);

        HashMap<String, Double> efectividadHada = new HashMap<>();
        efectividadHada.put("Acero", 0.5);
        efectividadHada.put("Agua", 1.0);
        efectividadHada.put("Bicho", 1.0);
        efectividadHada.put("Dragon", 1.3);
        efectividadHada.put("Electrico", 1.0);
        efectividadHada.put("Fantasma", 1.0);
        efectividadHada.put("Fuego", 0.5);
        efectividadHada.put("Hada", 1.0);
        efectividadHada.put("Hielo", 1.0);
        efectividadHada.put("Lucha", 1.3);
        efectividadHada.put("Normal", 1.0);
        efectividadHada.put("Planta", 1.0);
        efectividadHada.put("Psiquico", 1.0);
        efectividadHada.put("Roca", 1.0);
        efectividadHada.put("Siniestro", 1.3);
        efectividadHada.put("Tierra", 1.0);
        efectividadHada.put("Veneno", 0.5);
        efectividadHada.put("Volador", 1.0);

        efectividadTipos.put("Hada", efectividadHada);

        HashMap<String, Double> efectividadHielo = new HashMap<>();
        efectividadHielo.put("Acero", 0.5);
        efectividadHielo.put("Agua", 0.5);
        efectividadHielo.put("Bicho", 1.0);
        efectividadHielo.put("Dragon", 1.3);
        efectividadHielo.put("Electrico", 1.0);
        efectividadHielo.put("Fantasma", 1.0);
        efectividadHielo.put("Fuego", 0.5);
        efectividadHielo.put("Hada", 1.0);
        efectividadHielo.put("Hielo", 0.5);
        efectividadHielo.put("Lucha", 1.0);
        efectividadHielo.put("Normal", 1.0);
        efectividadHielo.put("Planta", 1.3);
        efectividadHielo.put("Psiquico", 1.0);
        efectividadHielo.put("Roca", 1.0);
        efectividadHielo.put("Siniestro", 1.0);
        efectividadHielo.put("Tierra", 1.3);
        efectividadHielo.put("Veneno", 1.0);
        efectividadHielo.put("Volador", 1.3);

        efectividadTipos.put("Hielo", efectividadHielo);

        HashMap<String, Double> efectividadLucha = new HashMap<>();
        efectividadLucha.put("Acero", 1.3);
        efectividadLucha.put("Agua", 1.0);
        efectividadLucha.put("Bicho", 0.5);
        efectividadLucha.put("Dragon", 1.0);
        efectividadLucha.put("Electrico", 1.0);
        efectividadLucha.put("Fantasma", 0.0);
        efectividadLucha.put("Fuego", 1.0);
        efectividadLucha.put("Hada", 0.5);
        efectividadLucha.put("Hielo", 1.3);
        efectividadLucha.put("Lucha", 1.0);
        efectividadLucha.put("Normal", 1.3);
        efectividadLucha.put("Planta", 1.0);
        efectividadLucha.put("Psiquico", 0.5);
        efectividadLucha.put("Roca", 1.3);
        efectividadLucha.put("Siniestro", 1.3);
        efectividadLucha.put("Tierra", 1.0);
        efectividadLucha.put("Veneno", 0.5);
        efectividadLucha.put("Volador", 0.5);

        efectividadTipos.put("Lucha", efectividadLucha);

        HashMap<String, Double> efectividadNormal = new HashMap<>();
        efectividadNormal.put("Acero", 0.5);
        efectividadNormal.put("Agua", 1.0);
        efectividadNormal.put("Bicho", 1.0);
        efectividadNormal.put("Dragon", 1.0);
        efectividadNormal.put("Electrico", 1.0);
        efectividadNormal.put("Fantasma", 0.0);
        efectividadNormal.put("Fuego", 1.0);
        efectividadNormal.put("Hada", 1.0);
        efectividadNormal.put("Hielo", 1.0);
        efectividadNormal.put("Lucha", 1.0);
        efectividadNormal.put("Normal", 1.0);
        efectividadNormal.put("Planta", 1.0);
        efectividadNormal.put("Psiquico", 1.0);
        efectividadNormal.put("Roca", 0.5);
        efectividadNormal.put("Siniestro", 1.0);
        efectividadNormal.put("Tierra", 1.0);
        efectividadNormal.put("Veneno", 1.0);
        efectividadNormal.put("Volador", 1.0);

        efectividadTipos.put("Normal", efectividadNormal);

        HashMap<String, Double> efectividadPsiquico = new HashMap<>();
        efectividadPsiquico.put("Acero", 0.5);
        efectividadPsiquico.put("Agua", 1.0);
        efectividadPsiquico.put("Bicho", 1.0);
        efectividadPsiquico.put("Dragon", 1.0);
        efectividadPsiquico.put("Electrico", 1.0);
        efectividadPsiquico.put("Fantasma", 0.0);
        efectividadPsiquico.put("Fuego", 1.0);
        efectividadPsiquico.put("Hada", 1.0);
        efectividadPsiquico.put("Hielo", 1.0);
        efectividadPsiquico.put("Lucha", 1.3);
        efectividadPsiquico.put("Normal", 1.0);
        efectividadPsiquico.put("Planta", 1.0);
        efectividadPsiquico.put("Psiquico", 0.5);
        efectividadPsiquico.put("Roca", 1.0);
        efectividadPsiquico.put("Siniestro", 0.0);
        efectividadPsiquico.put("Tierra", 1.0);
        efectividadPsiquico.put("Veneno", 1.3);
        efectividadPsiquico.put("Volador", 1.0);

        efectividadTipos.put("Psiquico", efectividadPsiquico);

        HashMap<String, Double> efectividadRoca = new HashMap<>();
        efectividadRoca.put("Acero", 0.5);
        efectividadRoca.put("Agua", 1.0);
        efectividadRoca.put("Bicho", 1.3);
        efectividadRoca.put("Dragon", 1.0);
        efectividadRoca.put("Electrico", 1.0);
        efectividadRoca.put("Fantasma", 1.0);
        efectividadRoca.put("Fuego", 1.3);
        efectividadRoca.put("Hada", 1.0);
        efectividadRoca.put("Hielo", 1.3);
        efectividadRoca.put("Lucha", 0.5);
        efectividadRoca.put("Normal", 1.0);
        efectividadRoca.put("Planta", 1.0);
        efectividadRoca.put("Psiquico", 1.0);
        efectividadRoca.put("Roca", 1.0);
        efectividadRoca.put("Siniestro", 1.0);
        efectividadRoca.put("Tierra", 0.5);
        efectividadRoca.put("Veneno", 1.0);
        efectividadRoca.put("Volador", 1.3);

        efectividadTipos.put("Roca", efectividadRoca);

        HashMap<String, Double> efectividadSiniestro = new HashMap<>();
        efectividadSiniestro.put("Acero", 1.0);
        efectividadSiniestro.put("Agua", 1.0);
        efectividadSiniestro.put("Bicho", 1.0);
        efectividadSiniestro.put("Dragon", 1.0);
        efectividadSiniestro.put("Electrico", 1.0);
        efectividadSiniestro.put("Fantasma", 1.3);
        efectividadSiniestro.put("Fuego", 1.0);
        efectividadSiniestro.put("Hada", 0.5);
        efectividadSiniestro.put("Hielo", 1.0);
        efectividadSiniestro.put("Lucha", 0.5);
        efectividadSiniestro.put("Normal", 1.0);
        efectividadSiniestro.put("Planta", 1.0);
        efectividadSiniestro.put("Psiquico", 1.3);
        efectividadSiniestro.put("Roca", 1.0);
        efectividadSiniestro.put("Siniestro", 0.5);
        efectividadSiniestro.put("Tierra", 1.0);
        efectividadSiniestro.put("Veneno", 1.0);
        efectividadSiniestro.put("Volador", 1.0);

        efectividadTipos.put("Siniestro", efectividadSiniestro);

        HashMap<String, Double> efectividadTierra = new HashMap<>();
        efectividadTierra.put("Acero", 1.3);
        efectividadTierra.put("Agua", 1.0);
        efectividadTierra.put("Bicho", 0.5);
        efectividadTierra.put("Dragon", 1.0);
        efectividadTierra.put("Electrico", 1.3);
        efectividadTierra.put("Fantasma", 1.0);
        efectividadTierra.put("Fuego", 1.3);
        efectividadTierra.put("Hada", 1.0);
        efectividadTierra.put("Hielo", 1.0);
        efectividadTierra.put("Lucha", 1.0);
        efectividadTierra.put("Normal", 1.0);
        efectividadTierra.put("Planta", 0.5);
        efectividadTierra.put("Psiquico", 1.0);
        efectividadTierra.put("Roca", 1.3);
        efectividadTierra.put("Siniestro", 1.0);
        efectividadTierra.put("Tierra", 1.0);
        efectividadTierra.put("Veneno", 1.3);
        efectividadTierra.put("Volador", 0.0);

        efectividadTipos.put("Tierra", efectividadTierra);

        HashMap<String, Double> efectividadVeneno = new HashMap<>();
        efectividadVeneno.put("Acero", 0.0);
        efectividadVeneno.put("Agua", 1.0);
        efectividadVeneno.put("Bicho", 1.0);
        efectividadVeneno.put("Dragon", 1.0);
        efectividadVeneno.put("Electrico", 1.0);
        efectividadVeneno.put("Fantasma", 0.5);
        efectividadVeneno.put("Fuego", 1.0);
        efectividadVeneno.put("Hada", 1.3);
        efectividadVeneno.put("Hielo", 1.0);
        efectividadVeneno.put("Lucha", 1.0);
        efectividadVeneno.put("Normal", 1.0);
        efectividadVeneno.put("Planta", 1.3);
        efectividadVeneno.put("Psiquico", 1.0);
        efectividadVeneno.put("Roca", 0.5);
        efectividadVeneno.put("Siniestro", 1.0);
        efectividadVeneno.put("Tierra", 0.5);
        efectividadVeneno.put("Veneno", 0.5);
        efectividadVeneno.put("Volador", 1.0);

        efectividadTipos.put("Veneno", efectividadVeneno);

        HashMap<String, Double> efectividadVolador = new HashMap<>();
        efectividadVolador.put("Acero", 0.5);
        efectividadVolador.put("Agua", 1.0);
        efectividadVolador.put("Bicho", 1.3);
        efectividadVolador.put("Dragon", 1.0);
        efectividadVolador.put("Electrico", 0.5);
        efectividadVolador.put("Fantasma", 1.0);
        efectividadVolador.put("Fuego", 1.0);
        efectividadVolador.put("Hada", 1.0);
        efectividadVolador.put("Hielo", 1.0);
        efectividadVolador.put("Lucha", 1.3);
        efectividadVolador.put("Normal", 1.0);
        efectividadVolador.put("Planta", 1.3);
        efectividadVolador.put("Psiquico", 1.0);
        efectividadVolador.put("Roca", 0.5);
        efectividadVolador.put("Siniestro", 1.0);
        efectividadVolador.put("Tierra", 1.0);
        efectividadVolador.put("Veneno", 1.0);
        efectividadVolador.put("Volador", 1.0);

        efectividadTipos.put("Volador", efectividadVolador);

        if (seleccion <= 5) {
            System.out.println(equipoJugador1.get(seleccion).getNombrePokemon());
            System.out.println(pokemonRival.getNombrePokemon());
            //EVALUA SI ES EL ATAQUE 1
            //CASO DE POKEMON DE EQUIPO MAS VELOZ QUE EL SALVAJE
            if (equipoJugador1.get(seleccion).getVelocidad() > pokemonRival.getVelocidad()) {
                System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " es mas veloz que " + pokemonRival.getNombrePokemon());

                if (equipoJugador1.get(seleccion).getNombreMovimiento1() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento1(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador1.get(seleccion).getCategoriaMovimiento1().equals("Estado")) {

                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento1();

                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento1() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento1()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                } else if (equipoJugador1.get(seleccion).getNombreMovimiento2() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento2(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento2().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento2();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento2() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento2()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");

                    }
                } else if (equipoJugador1.get(seleccion).getNombreMovimiento3() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento3(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento3() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento3()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (equipoJugador1.get(seleccion).getNombreMovimiento4() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento4(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento4().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento4() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento4()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                }

                //AHORA ATACA EL POKM SALVAJE
                if (pokemonRival.getNombreMovimiento1() == ComboMovimientoPokemon2.getSelectedItem()) {

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento1());
                    if (pokemonRival.getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento1();

                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento1() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento1()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento1(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento2() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento2());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento2().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento2();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento2() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento2()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento2(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento3() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento3());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento3();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento3() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento3()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento3(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento4() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento4());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento4().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento4();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento4() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento4()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento4(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                }

                //-------------------------------
            } //EVALUA SI ES EL ATAQUE 2
            else if (equipoJugador1.get(seleccion).getVelocidad() < pokemonRival.getVelocidad()) {

                if (pokemonRival.getNombreMovimiento1() == ComboMovimientoPokemon2.getSelectedItem()) {

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento1());
                    if (pokemonRival.getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento1();

                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento1() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento1()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento1(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento2() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento2());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento2().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento2();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento2() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento2()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento2(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento3() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento3());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento3();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento3() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento3()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento3(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento4() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador1.get(seleccion).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento4());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento4().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador1.get(seleccion).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador1.get(seleccion).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento4();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento4() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento4()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento4(), equipoJugador1.get(seleccion).getTipo1(), equipoJugador1.get(seleccion).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador1.get(seleccion).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador1.get(seleccion).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador1.get(seleccion).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                }

                //POKEMON DE EQUIPO
                if (equipoJugador1.get(seleccion).getNombreMovimiento1() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento1(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento1();

                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento1() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento1()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                } else if (equipoJugador1.get(seleccion).getNombreMovimiento2() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento2(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento2().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento2();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento2() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento2()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");

                    }
                } else if (equipoJugador1.get(seleccion).getNombreMovimiento3() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento3(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento3() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento3()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (equipoJugador1.get(seleccion).getNombreMovimiento4() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador1.get(seleccion).getTipoMovimiento4(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador1.get(seleccion).getCategoriaMovimiento4().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador1.get(seleccion).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador1.get(seleccion).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador1.get(seleccion).getTipo1() == equipoJugador1.get(seleccion).getTipoMovimiento4() || equipoJugador1.get(seleccion).getTipo2() == equipoJugador1.get(seleccion).getTipoMovimiento4()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador1.get(seleccion).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                }

            }

            //JUGADOR 2222222222222222222222222
        } else if (seleccion >= 6 && seleccion <= 11) {

            int seleccion2 = seleccion - 6;

            System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon());
            System.out.println(pokemonRival.getNombrePokemon());
            //EVALUA SI ES EL ATAQUE 1
            //CASO DE POKEMON DE EQUIPO MAS VELOZ QUE EL SALVAJE
            if (equipoJugador2.get(seleccion2).getVelocidad() > pokemonRival.getVelocidad()) {
                System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " es mas veloz que " + pokemonRival.getNombrePokemon());

                if (equipoJugador2.get(seleccion2).getNombreMovimiento1() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento1(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento1();

                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento1() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento1()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                } else if (equipoJugador2.get(seleccion2).getNombreMovimiento2() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento2(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento2().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador2.get(seleccion2).getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento2();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento2() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento2()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");

                    }
                } else if (equipoJugador2.get(seleccion2).getNombreMovimiento3() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento3(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador2.get(seleccion2).getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento3() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento3()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (equipoJugador2.get(seleccion2).getNombreMovimiento4() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento4(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento4().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador2.get(seleccion2).getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento4() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento4()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                }

                //AHORA ATACA EL POKM SALVAJE
                if (pokemonRival.getNombreMovimiento1() == ComboMovimientoPokemon2.getSelectedItem()) {

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento1());
                    if (pokemonRival.getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento1();

                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento1() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento1()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento1(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento2() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento2());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento2().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento2();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento2() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento2()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento2(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento3() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento3());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento3();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento3() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento3()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento3(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento4() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento4());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento4().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento4();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento4() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento4()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento4(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                }

                //-------------------------------
            } //EVALUA SI ES EL ATAQUE 2
            else if (equipoJugador2.get(seleccion2).getVelocidad() < pokemonRival.getVelocidad()) {

                if (pokemonRival.getNombreMovimiento1() == ComboMovimientoPokemon2.getSelectedItem()) {

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento1());
                    if (pokemonRival.getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento1();

                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento1() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento1()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento1(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento2() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento2());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento2().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento2();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento2() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento2()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento2(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento3() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento3());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento3();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento3() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento3()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento3(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento4() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador2.get(seleccion2).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento4());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento4().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador2.get(seleccion2).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento4();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento4() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento4()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento4(), equipoJugador2.get(seleccion2).getTipo1(), equipoJugador2.get(seleccion2).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador2.get(seleccion2).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador2.get(seleccion2).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador2.get(seleccion2).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                }

                //POKEMON DE EQUIPO
                if (equipoJugador2.get(seleccion2).getNombreMovimiento1() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento1(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento1();

                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento1() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento1()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                } else if (equipoJugador2.get(seleccion2).getNombreMovimiento2() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento2(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento2().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento2();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento2() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento2()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");

                    }
                } else if (equipoJugador2.get(seleccion2).getNombreMovimiento3() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento3(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento3() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento3()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (equipoJugador2.get(seleccion2).getNombreMovimiento4() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador2.get(seleccion2).getTipoMovimiento4(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador2.get(seleccion2).getCategoriaMovimiento4().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador2.get(seleccion2).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador2.get(seleccion2).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador2.get(seleccion2).getTipo1() == equipoJugador2.get(seleccion2).getTipoMovimiento4() || equipoJugador2.get(seleccion2).getTipo2() == equipoJugador2.get(seleccion2).getTipoMovimiento4()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador2.get(seleccion2).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                }

            }

            //ULTIMA PARTE, TERCER JUGADOR
        } else if (seleccion >= 12 && seleccion <= 17) {

            int seleccion3 = seleccion - 12;

            System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon());
            System.out.println(pokemonRival.getNombrePokemon());
            //EVALUA SI ES EL ATAQUE 1
            //CASO DE POKEMON DE EQUIPO MAS VELOZ QUE EL SALVAJE
            if (equipoJugador3.get(seleccion3).getVelocidad() > pokemonRival.getVelocidad()) {
                System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " es mas veloz que " + pokemonRival.getNombrePokemon());

                if (equipoJugador3.get(seleccion3).getNombreMovimiento1() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento1(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento1();

                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento1() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento1()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                } else if (equipoJugador3.get(seleccion3).getNombreMovimiento2() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento2(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento2().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador3.get(seleccion3).getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento2();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento2() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento2()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");

                    }
                } else if (equipoJugador3.get(seleccion3).getNombreMovimiento3() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento3(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador3.get(seleccion3).getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento3() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento3()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (equipoJugador3.get(seleccion3).getNombreMovimiento4() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento4(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento4().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (equipoJugador3.get(seleccion3).getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento4() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento4()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                }

                //AHORA ATACA EL POKM SALVAJE
                if (pokemonRival.getNombreMovimiento1() == ComboMovimientoPokemon2.getSelectedItem()) {

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento1());
                    if (pokemonRival.getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento1();

                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento1() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento1()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento1(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento2() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento2());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento2().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento2();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento2() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento2()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento2(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento3() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento3());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento3();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento3() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento3()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento3(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento4() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento4());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento4().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento4();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento4() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento4()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento4(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                }

                //-------------------------------
            } //EVALUA SI ES EL ATAQUE 2
            else if (equipoJugador3.get(seleccion3).getVelocidad() < pokemonRival.getVelocidad()) {

                if (pokemonRival.getNombreMovimiento1() == ComboMovimientoPokemon2.getSelectedItem()) {

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento1());
                    if (pokemonRival.getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento1();

                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento1() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento1()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento1(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento2() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento2());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento2().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento2();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento2() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento2()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento2(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento3() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento3());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento3();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento3() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento3()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento3(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (pokemonRival.getNombreMovimiento4() == ComboMovimientoPokemon2.getSelectedItem()) {//CAMBIAR ESTE

                    vidaAliada = equipoJugador3.get(seleccion3).getPuntosDeSalud();

                    System.out.println(pokemonRival.getCategoriaMovimiento4());//CAMBIAR ESTE
                    if (pokemonRival.getCategoriaMovimiento4().equals("Fisica")) {
                        ataqueRival = pokemonRival.getAtaqueFisico();

                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueRival = pokemonRival.getAtaqueEspecial();
                        defensaAliada = equipoJugador3.get(seleccion3).getDefensaEspecial();
                    }
                    potenciaMovimientoRival = pokemonRival.getPotenciaMovimiento4();//CAMBIAR ESTE

                    //CAMBIAR ESTE DE ABAJO
                    if (pokemonRival.getTipo1() == pokemonRival.getTipoMovimiento4() || pokemonRival.getTipo2() == pokemonRival.getTipoMovimiento4()) {
                        STABRival = true;
                    } else {
                        STABRival = false;
                    }
                    //CAMBIAR ESTE DE ABAJO
                    double efectividad = EFECTIVIDAD(pokemonRival.getTipoMovimiento4(), equipoJugador3.get(seleccion3).getTipo1(), equipoJugador3.get(seleccion3).getTipo2(), efectividadTipos);
                    vidaFinalAliada = calcularDanio(ataqueRival, potenciaMovimientoRival, defensaAliada, STABRival, efectividad);

                    vidaAliada -= vidaFinalAliada;
                    System.out.println("La vida restante de " + equipoJugador3.get(seleccion3).getNombrePokemon() + " es de " + vidaAliada);
                    jLbVida.setText("PS: " + vidaAliada);
                    equipoJugador3.get(seleccion3).setPuntosDeSalud((int) vidaAliada);
                    if (equipoJugador3.get(seleccion3).getPuntosDeSalud() <= 0) {
                        System.out.println(pokemonRival.getNombrePokemon() + " ha ganado el combate!!!");
                    }

                }

                //POKEMON DE EQUIPO
                if (equipoJugador3.get(seleccion3).getNombreMovimiento1() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento1(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento1().equals("Fisica")) {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento1().equals("Estado")) {
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento1();

                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento1() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento1()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                } else if (equipoJugador3.get(seleccion3).getNombreMovimiento2() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento2(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento2().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento2().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento2();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento2() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento2()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");

                    }
                } else if (equipoJugador3.get(seleccion3).getNombreMovimiento3() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento3(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento3().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento3().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento3() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento3()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");
                    }

                } else if (equipoJugador3.get(seleccion3).getNombreMovimiento4() == ComboMovimientoPokemon1.getSelectedItem()) {
                    double efectividad = EFECTIVIDAD(equipoJugador3.get(seleccion3).getTipoMovimiento4(), pokemonRival.getTipo1(), pokemonRival.getTipo2(), efectividadTipos);
                    //CAMBIAR ESTE DE ARRIBA

                    vidaRival = pokemonRival.getPuntosDeSalud();

                    if (equipoJugador3.get(seleccion3).getCategoriaMovimiento4().equals("Fisica")) {//CAMBIAR ESTE
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueFisico();

                        defensaRival = pokemonRival.getDefensaFisica();

                    } else if (pokemonRival.getCategoriaMovimiento4().equals("Estado")) {//CAMBIAR ESTE
                        System.out.println("No hace nada :D");
                    } else {
                        ataqueAliado = equipoJugador3.get(seleccion3).getAtaqueEspecial();
                        defensaRival = pokemonRival.getDefensaEspecial();
                    }
                    potenciaMovimientoAliado = equipoJugador3.get(seleccion3).getPotenciaMovimiento3();//CAMBIAR ESTE
                    //CAMBIAR ESTE DE ABAJO
                    if (equipoJugador3.get(seleccion3).getTipo1() == equipoJugador3.get(seleccion3).getTipoMovimiento4() || equipoJugador3.get(seleccion3).getTipo2() == equipoJugador3.get(seleccion3).getTipoMovimiento4()) {
                        STABAliado = true;
                    } else {
                        STABAliado = false;
                    }

                    vidaFinalRival = calcularDanio(ataqueAliado, potenciaMovimientoAliado, defensaRival, STABAliado, efectividad);

                    vidaRival -= vidaFinalRival;
                    System.out.println("La vida restante de " + pokemonRival.getNombrePokemon() + " es de " + vidaRival);
                    jLbVidaRival.setText("PS: " + vidaRival);
                    pokemonRival.setPuntosDeSalud((int) vidaRival);
                    if (pokemonRival.getPuntosDeSalud() <= 0) {
                        System.out.println(equipoJugador3.get(seleccion3).getNombrePokemon() + " ha ganado el combate!!!");
                    }
                }

            }

        }

        System.out.println(seleccion);

    }

    public void ObtenerPsOriginales1() {
        psPokemon.clear();

        for (int i = 0; i < equipoJugador1.size(); i++) {
            if (i < equipoJugador1.size()) {
                int puntosSalud = equipoJugador1.get(i).getPuntosDeSalud();
                psPokemon.add(puntosSalud);
            } else {

            }

        }

    }

    public void ObtenerPsOriginales2() {
        psPokemon2.clear();

        for (int i = 0; i < equipoJugador2.size(); i++) {
            if (i < equipoJugador2.size()) {
                int puntosSalud = equipoJugador2.get(i).getPuntosDeSalud();
                psPokemon2.add(puntosSalud);
            } else {

            }

        }

    }

    public void ObtenerPsOriginales3() {
        psPokemon3.clear();

        for (int i = 0; i < equipoJugador3.size(); i++) {
            if (i < equipoJugador3.size()) {
                int puntosSalud = equipoJugador3.get(i).getPuntosDeSalud();
                psPokemon3.add(puntosSalud);
            } else {

            }
        }

    }

    public void actulizarPuntosdeSalud() {
        for (int i = 0; i < psPokemon.size(); i++) {
            if (i < psPokemon.size()) {
                equipoJugador1.get(i).setPuntosDeSalud(psPokemon.get(i));
                jLbVida.setText(String.valueOf(equipoJugador1.get(i).getPuntosDeSalud()));
            }
        }

        System.out.println("Se han curado bien");
    }

    public void actulizarPuntosdeSalud2() {
        for (int i = 0; i < psPokemon2.size(); i++) {
            if (i < psPokemon2.size()) {
                equipoJugador2.get(i).setPuntosDeSalud(psPokemon2.get(i));
                jLbVida.setText("PS " + String.valueOf(equipoJugador2.get(i).getPuntosDeSalud()));
            }
        }

        System.out.println("Se han curado bien");
    }

    public void actulizarPuntosdeSalud3() {
        for (int i = 0; i < psPokemon3.size(); i++) {
            if (i < psPokemon3.size()) {
                equipoJugador3.get(i).setPuntosDeSalud(psPokemon3.get(i));
                jLbVida.setText("PS " + String.valueOf(equipoJugador3.get(i).getPuntosDeSalud()));
            }
        }

        System.out.println("Se han curado bien");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregarPokemon1;
    private javax.swing.JButton BTNAgregarPokemon10;
    private javax.swing.JButton BTNAgregarPokemon11;
    private javax.swing.JButton BTNAgregarPokemon12;
    private javax.swing.JButton BTNAgregarPokemon13;
    private javax.swing.JButton BTNAgregarPokemon14;
    private javax.swing.JButton BTNAgregarPokemon15;
    private javax.swing.JButton BTNAgregarPokemon16;
    private javax.swing.JButton BTNAgregarPokemon17;
    private javax.swing.JButton BTNAgregarPokemon18;
    private javax.swing.JButton BTNAgregarPokemon2;
    private javax.swing.JButton BTNAgregarPokemon3;
    private javax.swing.JButton BTNAgregarPokemon4;
    private javax.swing.JButton BTNAgregarPokemon5;
    private javax.swing.JButton BTNAgregarPokemon6;
    private javax.swing.JButton BTNAgregarPokemon7;
    private javax.swing.JButton BTNAgregarPokemon8;
    private javax.swing.JButton BTNAgregarPokemon9;
    private javax.swing.JButton BTN_curarEquipoPokemon;
    private javax.swing.JButton BTN_curarEquipoPokemon2;
    private javax.swing.JButton BTN_curarEquipoPokemon3;
    private javax.swing.JButton BtnCapturar;
    private javax.swing.JButton BtnLuchar;
    private javax.swing.JComboBox<String> ComboMovimientoPokemon1;
    private javax.swing.JComboBox<String> ComboMovimientoPokemon2;
    private javax.swing.JLabel JLBlucha1;
    private javax.swing.JLabel JLBlucha2;
    private javax.swing.JLabel LBLNombreJUgador1;
    private javax.swing.JLabel LBLNombreJugador2;
    private javax.swing.JLabel LBLversus;
    private javax.swing.JComboBox<String> ObjetosPokemon2;
    private javax.swing.JPanel Pane21Jugador1;
    private javax.swing.JPanel Pane31Jugador1;
    private javax.swing.JPanel Panel1Jugador1;
    private javax.swing.JPanel Panel1Jugador2;
    private javax.swing.JPanel Panel1Jugador3;
    private javax.swing.JPanel Panel2Jugador2;
    private javax.swing.JPanel Panel2Jugador3;
    private javax.swing.JPanel Panel3Jugador2;
    private javax.swing.JPanel Panel3Jugador3;
    private javax.swing.JPanel Panel4Jugador1;
    private javax.swing.JPanel Panel4Jugador2;
    private javax.swing.JPanel Panel4Jugador3;
    private javax.swing.JPanel Panel5Jugador1;
    private javax.swing.JPanel Panel5Jugador2;
    private javax.swing.JPanel Panel5Jugador3;
    private javax.swing.JPanel Panel6Jugador1;
    private javax.swing.JPanel Panel6Jugador2;
    private javax.swing.JPanel Panel6Jugador3;
    private javax.swing.JLabel Pokemon1Jugador1;
    private javax.swing.JLabel Pokemon1Jugador2;
    private javax.swing.JLabel Pokemon1Jugador3;
    private javax.swing.JLabel Pokemon2Jugador1;
    private javax.swing.JLabel Pokemon2Jugador2;
    private javax.swing.JLabel Pokemon2Jugador3;
    private javax.swing.JLabel Pokemon3Jugador1;
    private javax.swing.JLabel Pokemon3Jugador2;
    private javax.swing.JLabel Pokemon3Jugador3;
    private javax.swing.JLabel Pokemon4Jugador1;
    private javax.swing.JLabel Pokemon4Jugador2;
    private javax.swing.JLabel Pokemon4Jugador3;
    private javax.swing.JLabel Pokemon5Jugador1;
    private javax.swing.JLabel Pokemon5Jugador2;
    private javax.swing.JLabel Pokemon5Jugador3;
    private javax.swing.JLabel Pokemon6Jugador1;
    private javax.swing.JLabel Pokemon6Jugador2;
    private javax.swing.JLabel Pokemon6Jugador3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbVida;
    private javax.swing.JLabel jLbVidaRival;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> objetosJugador1;
    // End of variables declaration//GEN-END:variables

}
