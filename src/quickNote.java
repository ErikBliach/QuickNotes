import javax.swing.JFrame;
import javax.swing.JTextArea;

public class quickNote {
    public void newNote(){
    JFrame note = new JFrame("quickNote");
    JTextArea textArea= new JTextArea();
    
    //configurations for frame
    note.setResizable(false);
    note.add(textArea);
    note.setSize(200, 200);
    note.setVisible(true);
    }
}
