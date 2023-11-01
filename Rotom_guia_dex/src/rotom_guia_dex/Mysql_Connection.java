
package rotom_guia_dex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Mysql_Connection {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USUARIO = "root";
    private static final String CONTRA = "marioparty100";
    private static final String URL = "jdbc:mysql://localhost:3307/pokedex";

   
    private Connection con;
    

    public Connection getConection() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USUARIO, CONTRA);
            
            // Si la conexión fue exitosa, devuelve la conexión
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Cargando los datos del Juego. Espere.");
                return con;
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo cargar el driver JDBC.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        
        //si no se retorno devomvmos null
        return null;
    }
}
