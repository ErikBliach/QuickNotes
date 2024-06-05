import javax.swing.JFrame;
import javax.swing.JTextArea;

public class quickNote {
    public void newNote(){

    //initializing aspects of notes
    JFrame note = new JFrame("quickNote");
    JTextArea textArea = new JTextArea();
    
    //configurations for frame of notes
    note.setResizable(false);
    note.add(textArea);
    note.setSize(200, 200);
    note.setVisible(true);

    //prevents text from going off the screen horizontally, or wrapping in weird ways
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    }
}
