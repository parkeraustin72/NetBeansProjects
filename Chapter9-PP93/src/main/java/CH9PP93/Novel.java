
package CH9PP93;


public class Novel extends Book {
    protected String [] characters;

    public Novel( String author, String title, String isbn, String[] characters) {
        super(author, title, isbn);
        this.characters = characters;
    }

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }
    
    public String toString()
    {
        String result = super.toString();
        for (int index = 0; index< characters.length; index++)
            result += "\n\t" + characters[index];
        
        return result;
        
    }
    
    public void content(){
        super.content();
        
        for(int i =0; i < characters.length; i++){
            System.out.println(characters[i]);
        }
    }
    
}
