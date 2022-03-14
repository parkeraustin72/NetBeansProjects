
package CH9PP93;


public class Magazine extends ReadingMaterial {
    protected String editor;

    public Magazine(String editor, String title, String isbn) {
        super(title, isbn);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Magazine{" + "editor=" + editor + '}';
    }
    public void content(){
        super.content();
        System.out.println("Editor: " + editor);
    }
}
