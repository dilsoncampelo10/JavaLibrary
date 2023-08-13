package javalibrary.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dilson
 */
public class ConnectionDB {
    private static final String url = "jdbc:mysql://localhost:3306/academy_library";
    private static final String user = "root";
    private static final String password = "";
    
    private static Connection conn;
    
    public static Connection getConnect(){
        try {
            conn = DriverManager.getConnection(url,user,password);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
      
    }
    
    
}
