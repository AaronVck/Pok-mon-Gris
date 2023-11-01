
package rotom_guia_dex;

/**
 *
 * @author Kevin
 */
public class main {
    public static void main(String[] args) {
        Rotom_guia app = new Rotom_guia();
        InsertarDatos update = new InsertarDatos();
        
        Mysql_Connection con = new Mysql_Connection();
      // con.getConection();
        app.setVisible(true);
        
       // update.agregarSprite();
        
      
       
    }
}
