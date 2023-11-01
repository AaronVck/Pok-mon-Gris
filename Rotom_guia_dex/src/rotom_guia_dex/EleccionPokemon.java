/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rotom_guia_dex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kevin
 */
public class EleccionPokemon extends javax.swing.JFrame {

    Mysql_Connection con = new Mysql_Connection();

    Connection connector = con.getConection();//Obtenemos la conexion a la base de datos

    private int numeroPokemonelegido = 0;
    ArrayList<ImageIcon> listaDeImagenes = new ArrayList<>();
    ArrayList<Pokemon> equipoPokemon = new ArrayList<>();

    //El equipo del Jugador 1
    ArrayList<Pokemon> pokemonElegido = new ArrayList<>(6);
    //El equipo del Jugador 2
    ArrayList<Pokemon> pokemonElegido2 = new ArrayList<>(6);
    //El equipo del Jugador 3
    ArrayList<Pokemon> pokemonElegido3 = new ArrayList<>(6);
    
    Pokemon pokemonrival = new Pokemon();

    //Consultas Mysql
    JPanel panel1 = new JPanel();
    ComienzaAventura cv = null;

    public EleccionPokemon(ComienzaAventura cv) {
        this.cv = cv;
        initComponents();
        jScrollPane1.setSize(300, 300);
        CargarSprites();
        mostrarSprite();

    }

    public EleccionPokemon() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);

    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public void CargarSprites() {

        panel1.setLayout(new GridLayout(49, 5)); // 49 filas y 5 columnas

        for (int idPokemon = 1; idPokemon <= 243; idPokemon++) {
            String urlPokemon = "/SpritePokemon/" + idPokemon + ".png";
            try {
                BufferedImage image = ImageIO.read(getClass().getResource(urlPokemon));
                Image scaledImage = image.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(scaledImage);
                listaDeImagenes.add(imageIcon);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error cargando imagen para Pokemon " + idPokemon);
            }
        }

    }

    private void mostrarSprite() {
        this.cv = cv;

        for (ImageIcon imageIcon : listaDeImagenes) {
            JLabel label = new JLabel(imageIcon);
            label.setOpaque(true);
            label.setBackground(Color.red);
            label.setPreferredSize(new Dimension(60, 60)); // Tamaño de 60x60 para el JLabel
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            label.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    numeroPokemonelegido = listaDeImagenes.indexOf(imageIcon); // Índice del Pokémon
                    equipoPokemon = todosLosPokemon();
                     pokemonrival = equipoPokemon.get(numeroPokemonelegido);
                    boolean verificar = cv.isPresionado();
                    equipoPokemon.get(numeroPokemonelegido);
                    VerificarPosPokemon();
                    cv.setEquipoJugador1(pokemonElegido);
                    cv.setEquipoJugador2(pokemonElegido2);
                    cv.setEquipoJugador3(pokemonElegido3);
                    cv.setPokemonRival(pokemonrival);
                    PonerImagenesPokemon();

                }
            });

            panel1.add(label);
        }

        jScrollPane1.setViewportView(panel1);
    }

    public ArrayList<Pokemon> todosLosPokemon() {
        ArrayList<Pokemon> pokemones = new ArrayList<>();

        String consulta = "SELECT "
                + "   p.ID_pokemon, "
                + "   p.Nombre, "
                + "   p.Tipo1, "
                + "   p.Tipo2, "
                + "   m1.Id_movimiento AS ID_movimiento1, "
                + "   m1.NombreMovimiento AS Movimiento1, "
                + "   m1.Potencia AS PotenciaMovimiento1, "
                + "   m1.PrecisionN AS PrecisionMovimiento1, "
                + "   m1.Tipo AS TipoMovimiento1, "
                + "   m1.Efecto AS EfectoMovimiento1,"
                + "   m1.Categoria AS CategoriaMovimiento1, "
                + "   m2.Id_movimiento AS ID_movimiento2, "
                + "   m2.NombreMovimiento AS Movimiento2, "
                + "   m2.Potencia AS PotenciaMovimiento2, "
                + "   m2.PrecisionN AS PrecisionMovimiento2, "
                + "   m2.Tipo AS TipoMovimiento2, "
                + "   m2.Efecto AS EfectoMovimiento2, "
                + "   m2.Categoria AS CategoriaMovimiento2,"
                + "   m3.Id_movimiento AS ID_movimiento3, "
                + "   m3.NombreMovimiento AS Movimiento3, "
                + "   m3.Potencia AS PotenciaMovimiento3, "
                + "   m3.PrecisionN AS PrecisionMovimiento3, "
                + "   m3.Tipo AS TipoMovimiento3, "
                + "   m3.Efecto AS EfectoMovimiento3,"
                + "   m3.Categoria AS CategoriaMovimiento3, "
                + "   m4.Id_movimiento AS ID_movimiento4, "
                + "   m4.NombreMovimiento AS Movimiento4, "
                + "   m4.Potencia AS PotenciaMovimiento4, "
                + "   m4.PrecisionN AS PrecisionMovimiento4, "
                + "   m4.Tipo AS TipoMovimiento4, "
                + "   m4.Efecto AS EfectoMovimiento4,"
                + "   m4.Categoria AS CategoriaMovimiento4, "
                + "   p.PuntosSalud AS PuntosDeSalud, "
                + "   p.AtaqueFisico AS AtaqueFisico, "
                + "   p.AtaqueEspecial AS AtaqueEspecial, "
                + "   p.DefensaFisica AS DefensaFisica, "
                + "   p.DefensaEspecial AS DefensaEspecial, "
                + "   p.Velocidad AS Velocidad, "
                + "   p.Descripcion, "
                + "   p.Sprite "
                + "FROM pokemon AS p "
                + "INNER JOIN movimiento AS m1 ON p.movimiento1 = m1.ID_movimiento "
                + "INNER JOIN movimiento AS m2 ON p.movimiento2 = m2.ID_movimiento "
                + "INNER JOIN movimiento AS m3 ON p.movimiento3 = m3.ID_movimiento "
                + "INNER JOIN movimiento AS m4 ON p.movimiento4 = m4.ID_movimiento";

        try (Statement statement = connector.createStatement(); ResultSet resultSet = statement.executeQuery(consulta)) {
            while (resultSet.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setIdPokemon(resultSet.getInt("ID_pokemon"));
                pokemon.setNombrePokemon(resultSet.getString("Nombre"));
                pokemon.setTipo1(resultSet.getString("Tipo1"));
                pokemon.setTipo2(resultSet.getString("Tipo2"));
                pokemon.setNombreMovimiento1(resultSet.getString("Movimiento1"));
                pokemon.setPotenciaMovimiento1(resultSet.getInt("PotenciaMovimiento1"));
                pokemon.setPrecisionMovimiento1(resultSet.getInt("PrecisionMovimiento1"));
                pokemon.setTipoMovimiento1(resultSet.getString("TipoMovimiento1"));
                pokemon.setEfectoMovimiento1(resultSet.getBoolean("EfectoMovimiento1"));
                pokemon.setCategoriaMovimiento1(resultSet.getString("CategoriaMovimiento1"));

                pokemon.setNombreMovimiento2(resultSet.getString("Movimiento2"));
                pokemon.setPotenciaMovimiento2(resultSet.getInt("PotenciaMovimiento2"));
                pokemon.setPrecisionMovimiento2(resultSet.getInt("PrecisionMovimiento2"));
                pokemon.setTipoMovimiento2(resultSet.getString("TipoMovimiento2"));
                pokemon.setEfectoMovimiento2(resultSet.getBoolean("EfectoMovimiento2"));
                pokemon.setCategoriaMovimiento2(resultSet.getString("CategoriaMovimiento2"));

                pokemon.setNombreMovimiento3(resultSet.getString("Movimiento3"));
                pokemon.setPotenciaMovimiento3(resultSet.getInt("PotenciaMovimiento3"));
                pokemon.setPrecisionMovimiento3(resultSet.getInt("PrecisionMovimiento3"));
                pokemon.setTipoMovimiento3(resultSet.getString("TipoMovimiento3"));
                pokemon.setEfectoMovimiento3(resultSet.getBoolean("EfectoMovimiento3"));
                pokemon.setCategoriaMovimiento3(resultSet.getString("CategoriaMovimiento3"));

                pokemon.setNombreMovimiento4(resultSet.getString("Movimiento4"));
                pokemon.setPotenciaMovimiento4(resultSet.getInt("PotenciaMovimiento4"));
                pokemon.setPrecisionMovimiento4(resultSet.getInt("PrecisionMovimiento4"));
                pokemon.setTipoMovimiento4(resultSet.getString("TipoMovimiento4"));
                pokemon.setEfectoMovimiento4(resultSet.getBoolean("EfectoMovimiento4"));
                pokemon.setCategoriaMovimiento4(resultSet.getString("CategoriaMovimiento4"));

                pokemon.setPuntosDeSalud(resultSet.getInt("PuntosDeSalud"));
                pokemon.setAtaqueFisico(resultSet.getInt("AtaqueFisico"));
                pokemon.setAtaqueEspecial(resultSet.getInt("AtaqueEspecial"));
                pokemon.setDefensaFisica(resultSet.getInt("DefensaFisica"));
                pokemon.setDefensaEspecial(resultSet.getInt("DefensaEspecial"));
                pokemon.setVelocidad(resultSet.getInt("Velocidad"));
                pokemon.setDescripcion(resultSet.getString("Descripcion"));
                pokemon.setSprite(resultSet.getString("Sprite"));

                pokemones.add(pokemon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pokemones;
    }

    public void mostrarInformacionPokemon() {
        Pokemon pokemonSeleccionado = equipoPokemon.get(numeroPokemonelegido);

        System.out.println("Nombre: " + pokemonSeleccionado.getNombrePokemon());
        System.out.println("Tipo 1: " + pokemonSeleccionado.getTipo1());
        System.out.println("Tipo 2: " + pokemonSeleccionado.getTipo2());
        System.out.println("Puntos de Salud: " + pokemonSeleccionado.getPuntosDeSalud());
        System.out.println("Ataque Físico: " + pokemonSeleccionado.getAtaqueFisico());
        System.out.println("Ataque Especial: " + pokemonSeleccionado.getAtaqueEspecial());
        System.out.println("Defensa Física: " + pokemonSeleccionado.getDefensaFisica());
        System.out.println("Defensa Especial: " + pokemonSeleccionado.getDefensaEspecial());
        System.out.println("Velocidad: " + pokemonSeleccionado.getVelocidad());

        System.out.println("Movimiento 1: " + pokemonSeleccionado.getNombreMovimiento1());
        System.out.println("Tipo de Ataque Movimiento 1: " + pokemonSeleccionado.getTipoMovimiento1());
        System.out.println("Potencia Movimiento 1: " + pokemonSeleccionado.getPotenciaMovimiento1());
        System.out.println("Precisión Movimiento 1: " + pokemonSeleccionado.getPrecisionMovimiento1());
        System.out.println("Efecto Movimiento 1: " + (pokemonSeleccionado.isEfectoMovimiento1() ? "Sí" : "No"));
        System.out.println("Categoria Movimiento 1: "+ (pokemonSeleccionado.getCategoriaMovimiento1()));

        System.out.println("Movimiento 2: " + pokemonSeleccionado.getNombreMovimiento2());
        System.out.println("Tipo de Ataque Movimiento 2: " + pokemonSeleccionado.getTipoMovimiento2());
        System.out.println("Potencia Movimiento 2: " + pokemonSeleccionado.getPotenciaMovimiento2());
        System.out.println("Precisión Movimiento 2: " + pokemonSeleccionado.getPrecisionMovimiento2());
        System.out.println("Efecto Movimiento 2: " + (pokemonSeleccionado.isEfectoMovimiento2() ? "Sí" : "No"));

        System.out.println("Movimiento 3: " + pokemonSeleccionado.getNombreMovimiento3());
        System.out.println("Tipo de Ataque Movimiento 3: " + pokemonSeleccionado.getTipoMovimiento3());
        System.out.println("Potencia Movimiento 3: " + pokemonSeleccionado.getPotenciaMovimiento3());
        System.out.println("Precisión Movimiento 3: " + pokemonSeleccionado.getPrecisionMovimiento3());
        System.out.println("Efecto Movimiento 3: " + (pokemonSeleccionado.isEfectoMovimiento3() ? "Sí" : "No"));

        System.out.println("Movimiento 4: " + pokemonSeleccionado.getNombreMovimiento4());
        System.out.println("Tipo de Ataque Movimiento 4: " + pokemonSeleccionado.getTipoMovimiento4());
        System.out.println("Potencia Movimiento 4: " + pokemonSeleccionado.getPotenciaMovimiento4());
        System.out.println("Precisión Movimiento 4: " + pokemonSeleccionado.getPrecisionMovimiento4());
        System.out.println("Efecto Movimiento 4: " + (pokemonSeleccionado.isEfectoMovimiento4() ? "Sí" : "No"));

        System.out.println("Descripción: " + pokemonSeleccionado.getDescripcion());
        System.out.println("Sprite: " + pokemonSeleccionado.getSprite());
        System.out.println();
    }

    public void VerificarPosPokemon() {
        boolean verificar = cv.isPresionado();
        boolean verificar2 = cv.isPresionado2();
        boolean verificar3 = cv.isPresionado3();
        boolean verificar4 = cv.isPresionado4();
        boolean verificar5 = cv.isPresionado5();
        boolean verificar6 = cv.isPresionado6();
        boolean verificar7 = cv.isPresionado7();
        boolean verificar8 = cv.isPresionado8();
        boolean verificar9 = cv.isPresionado9();
        boolean verificar10 = cv.isPresionado10();
        boolean verificar11 = cv.isPresionado11();
        boolean verificar12 = cv.isPresionado12();
        boolean verificar13 = cv.isPresionado13();
        boolean verificar14 = cv.isPresionado14();
        boolean verificar15 = cv.isPresionado15();
        boolean verificar16 = cv.isPresionado16();
        boolean verificar17 = cv.isPresionado17();
        boolean verificar18 = cv.isPresionado18();
        boolean verificar19 = cv.isPresionado19();
        

        if (verificar) {
            if (pokemonElegido.isEmpty() || pokemonElegido.size() == 0) {
                pokemonElegido.add(equipoPokemon.get(numeroPokemonelegido));

            } else {
                pokemonElegido.set(0, equipoPokemon.get(numeroPokemonelegido));

            }
        }

        if (verificar2) {
            if (pokemonElegido.size() <= 1) {
                pokemonElegido.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido.set(1, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar3) {

            if (pokemonElegido.size() <= 2) {
                pokemonElegido.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido.set(2, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar4) {

            if (pokemonElegido.size() <= 3) {
                pokemonElegido.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido.set(3, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar5) {

            if (pokemonElegido.size() <= 4) {
                pokemonElegido.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido.set(4, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar6) {

            if (pokemonElegido.size() <= 5) {
                pokemonElegido.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido.set(5, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar7) {
            if (pokemonElegido2.isEmpty() || pokemonElegido2.size() == 0) {
                pokemonElegido2.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido2.set(0, equipoPokemon.get(numeroPokemonelegido));
            }
        }
        if (verificar8) {
            if (pokemonElegido2.size() <= 1) {
                pokemonElegido2.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido2.set(1, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar9) {
            if (pokemonElegido2.size() <= 2) {
                pokemonElegido2.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido2.set(2, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar10) {

            if (pokemonElegido2.size() <= 3) {
                pokemonElegido2.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido2.set(3, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar11) {

            if (pokemonElegido2.size() <= 4) {
                pokemonElegido2.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido2.set(4, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar12) {

            if (pokemonElegido2.size() <= 5) {
                pokemonElegido2.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido2.set(5, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar13) {
            if (pokemonElegido3.isEmpty() || pokemonElegido3.size() == 0) {
                pokemonElegido3.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido3.set(0, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar14) {
            if (pokemonElegido3.size() <= 1) {
                pokemonElegido3.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido3.set(1, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar15) {
            if (pokemonElegido3.size() <= 2) {
                pokemonElegido3.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido3.set(2, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar16) {
            if (pokemonElegido3.size() <= 3) {
                pokemonElegido3.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido3.set(3, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar17) {
            if (pokemonElegido3.size() <= 4) {
                pokemonElegido3.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido3.set(4, equipoPokemon.get(numeroPokemonelegido));
            }
        }

        if (verificar18) {
            if (pokemonElegido3.size() <= 5) {
                pokemonElegido3.add(equipoPokemon.get(numeroPokemonelegido));
            } else {
                pokemonElegido3.set(5, equipoPokemon.get(numeroPokemonelegido));
            }
        }
        
        if (verificar19) {
            cv.setTextoJLabelLucha2("PS: "+String.valueOf(pokemonrival.getPuntosDeSalud()));
            cv.setPokemonRival(pokemonrival);
        }

    }

    public void PonerImagenesPokemon() {
        this.cv = cv;
        boolean verificar = cv.isPresionado();
        boolean verificar2 = cv.isPresionado2();
        boolean verificar3 = cv.isPresionado3();
        boolean verificar4 = cv.isPresionado4();
        boolean verificar5 = cv.isPresionado5();
        boolean verificar6 = cv.isPresionado6();
        boolean verificar7 = cv.isPresionado7();
        boolean verificar8 = cv.isPresionado8();
        boolean verificar9 = cv.isPresionado9();
        boolean verificar10 = cv.isPresionado10();
        boolean verificar11 = cv.isPresionado11();
        boolean verificar12 = cv.isPresionado12();
        boolean verificar13 = cv.isPresionado13();
        boolean verificar14 = cv.isPresionado14();
        boolean verificar15 = cv.isPresionado15();
        boolean verificar16 = cv.isPresionado16();
        boolean verificar17 = cv.isPresionado17();
        boolean verificar18 = cv.isPresionado18();
        boolean verificar19 = cv.isPresionado19();
        ImageIcon imagenSprite = null; // Declarar la variable fuera del if
        
        if (verificar) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido.get(0).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon1Jugador1(imagenEscaladaIcon);
        }

        if (verificar2) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido.get(1).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon2Jugador1(imagenEscaladaIcon);
        }

        if (verificar3) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido.get(2).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon3Jugador1(imagenEscaladaIcon);
        }

        if (verificar4) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido.get(3).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon4Jugador1(imagenEscaladaIcon);
        }

        if (verificar5) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido.get(4).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon5Jugador1(imagenEscaladaIcon);
        }

        if (verificar6) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido.get(5).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon6Jugador1(imagenEscaladaIcon);
        }
        if (verificar7) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido2.get(0).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon1Jugador2(imagenEscaladaIcon);
        }
        if (verificar8) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido2.get(1).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon2Jugador2(imagenEscaladaIcon);
        }
        if (verificar9) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido2.get(2).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon3Jugador2(imagenEscaladaIcon);
        }
        if (verificar10) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido2.get(3).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon4Jugador2(imagenEscaladaIcon);
        }
        if (verificar11) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido2.get(4).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon5Jugador2(imagenEscaladaIcon);
        }
        if (verificar12) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido2.get(5).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon6Jugador2(imagenEscaladaIcon);
        }

        if (verificar13) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido3.get(0).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon1Jugador3(imagenEscaladaIcon);
        }
        if (verificar14) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido3.get(1).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon2Jugador3(imagenEscaladaIcon);
        }

        if (verificar15) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido3.get(2).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon3Jugador3(imagenEscaladaIcon);
        }

        if (verificar16) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido3.get(3).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon4Jugador3(imagenEscaladaIcon);
        }
        if (verificar17) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido3.get(4).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon5Jugador3(imagenEscaladaIcon);
        }
        if (verificar18) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonElegido3.get(5).getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.setPokemon6Jugador3(imagenEscaladaIcon);
        }
        
         if (verificar19) {
            imagenSprite = new ImageIcon(getClass().getResource(pokemonrival.getSprite()));

            Image imagenEscalada = imagenSprite.getImage().getScaledInstance(89, 105, Image.SCALE_SMOOTH);

            ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
            cv.borrarElementosComboMovimientoPokemon2();
            cv.setElementoComboMovimientoPokemon2(pokemonrival.getNombreMovimiento1());
            cv.setElementoComboMovimientoPokemon2(pokemonrival.getNombreMovimiento2());
            cv.setElementoComboMovimientoPokemon2(pokemonrival.getNombreMovimiento3());
            cv.setElementoComboMovimientoPokemon2(pokemonrival.getNombreMovimiento4());
            cv.setJLBlucha2(imagenEscaladaIcon);
            cv.setBtnLuchar();
            cv.setBtnCapturar();
            cv.setBTNCurar();
            cv.setBTNCurar2();
            cv.setBTNCurar3();

        }

    }

    public ImageIcon cargarSpriteDesdeURL(String url) {
        try {
            URL imageURL = new URL(url);
            BufferedImage image = ImageIO.read(imageURL);
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EleccionPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleccionPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleccionPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleccionPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
            new EleccionPokemon().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
