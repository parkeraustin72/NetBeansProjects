
package CH9PP93;


public class TextBook extends Book{
    protected boolean answers;

    public TextBook(String author, String title, String isbn, boolean answers) {
        super(author, title, isbn);
        this.answers = answers;
    }

    public boolean isAnswers() {
        return answers;
    }

    public void setAnswers(boolean answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        String result = super.toString();
        if (!answers)
            result += "no";
        result+= "answers are given";
        return result;
    }
    
    public void content()
    {
        super.content();
        System.out.println("\tAnswers provided: " + answers);
    }
    
    
}
