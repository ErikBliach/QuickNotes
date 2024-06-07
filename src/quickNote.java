import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class quickNote {
    public void newNote(){

    //initializing aspects of notes
    JFrame note = new JFrame("quickNote");
    JTextArea textArea = new JTextArea(8,8);
    JPanel thePanel = new JPanel(new BorderLayout());

    //configurations for frame of notes
    note.add(thePanel);
    note.setResizable(false);
    note.setSize(200, 195);
    note.setVisible(true);

    //configurations for panel that holds area for text and save note button
    thePanel.add(new JButton("Save"), BorderLayout.SOUTH);
    thePanel.add(textArea, BorderLayout.NORTH);

    textArea.setLineWrap(true); //prevents text from going off screen horizontally
    textArea.setWrapStyleWord(true); //prevents words from being cut off
    textArea.setBounds(0, 0, 180, 200); //size of text area
    }
}


