package javalibrary.entity;

/**
 *
 * @author dilson
 */
public class Book {
    private Integer id;
    private String title;
    private String description;
    private Double price;
    private String author;
    
    public Book(){
        
    }

    public Book(Integer id, String title, String description, Double price, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
    }
    
    public Book(String title, String description, Double price, String author) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
