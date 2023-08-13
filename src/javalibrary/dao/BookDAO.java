package javalibrary.dao;
import java.sql.*;
import javalibrary.entity.Book;
/**
 *
 * @author dilson
 */
public class BookDAO {
    private Connection conn;
    
    public BookDAO(){
        conn = ConnectionDB.getConnect();
    }
    
    public Book create(Book book){
        try {
            PreparedStatement stmt = this.conn.prepareStatement("INSERT INTO books (title,description,price,author) VALUES (?,?,?,?)");
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getDescription());
            stmt.setDouble(3, book.getPrice());
            stmt.setString(4, book.getAuthor());
            stmt.execute();
            stmt.close();
            this.conn.close();
   
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        return book;
        
    }
}
