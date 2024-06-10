import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class quickNote {
    public void newNote(){

    //initializing aspects of notes
    JFrame note = new JFrame("quickNote");
    JTextArea textArea = new JTextArea(8,8);
    JPanel thePanel = new JPanel(new BorderLayout());
    JButton save = new JButton("Save");
    Color noteColor = new Color(245, 245, 149);
    Color buttonColor = new Color(239, 235, 106);

    //configurations for frame of notes
    note.add(thePanel);
    note.setResizable(false);
    note.setSize(200, 193);
    note.setVisible(true);

    //configurations for panel that holds area for text and save note button
    thePanel.add(save, BorderLayout.SOUTH);
    thePanel.add(textArea, BorderLayout.NORTH);

    save.setBackground(buttonColor); //sets color of button

    textArea.setLineWrap(true); //prevents text from going off screen horizontally
    textArea.setWrapStyleWord(true); //prevents words from being cut off
    textArea.setBounds(0, 0, 180, 200); //size of text area
    textArea.setPreferredSize(textArea.getPreferredSize()); //stops text area from expanding vertically
    textArea.setBackground(noteColor); //sets color of text area
    }
}


