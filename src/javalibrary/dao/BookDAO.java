package javalibrary.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javalibrary.entity.Book;

/**
 *
 * @author dilson
 */
public class BookDAO {

    private Connection conn;

    public BookDAO() {
        conn = ConnectionDB.getConnect();
    }

    public Book create(Book book) {
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

    public List<Book> findAll() {
        List<Book> books = new ArrayList();
        try {
            PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM books");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setDescription(rs.getString("description"));
                book.setPrice(rs.getDouble("price"));
                books.add(book);

            }
            stmt.close();
            this.conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return books;
    }
}
