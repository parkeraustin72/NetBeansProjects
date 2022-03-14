// PP9.3 - {age 447
package CH9PP93;


public class ReadingMaterial {
    protected String title, isbn;
    // The protected keyword is an access modifier used for attributes,
    //methods, and constructors, to make them accessible
    //in the same package and subclases

    public ReadingMaterial(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "ReadingMaterial{" + "title=" + title + ", isbn=" + isbn + '}';
    }
    
    
    public void content()
    {
        System.out.println("Title: " + title + "\n\tISBN: " + isbn);
        
    }
    
    
    
    
}
