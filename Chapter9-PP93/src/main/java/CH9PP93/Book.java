// PP 9.3 - page 447
package CH9PP93;


public class Book extends ReadingMaterial{
    protected String author;

    public Book(String author, String title, String isbn) {
        super(title, isbn);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" + "author=" + author + '}';
    }
    
    public void content()
    {
        super.content();
        System.out.println("\tAuthor: " + author);
    }
    
}
