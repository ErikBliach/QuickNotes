import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.MouseInfo;
import java.awt.Point;

public class quickNote {
    //so that these could be used in the main app
    public JTextArea textArea; 
    public String savedNote;
    public void newNote(){

    //initializing aspects of notes
    JFrame note = new JFrame("quickNote");
    JPanel thePanel = new JPanel(new BorderLayout());
    textArea = new JTextArea(8,8);
    JButton save = new JButton("Save");
    Random random = new Random();
    int colorNumber = random.nextInt(4);
    Point location = MouseInfo.getPointerInfo().getLocation(); //gets location of mouse
    colorNumber += 1;

    Color noteColorOne = new Color(245, 245, 149); 
    Color buttonColorOne = new Color(239, 235, 106);

    Color noteColorTwo = new Color(162, 234, 255);
    Color buttonColorTwo = new Color(135, 228, 255);

    Color noteColorThree = new Color(176, 255, 146);
    Color buttonColorThree = new Color(143, 255, 102);

    Color noteColorFour = new Color(255, 165, 250);
    Color buttonColorFour = new Color(255, 142, 248);

    //configurations for frame of notes
    note.add(thePanel);
    note.setResizable(false);
    note.setSize(200, 193);
    note.setVisible(true);
    note.setAlwaysOnTop(true);
    note.setLocation(location);//opens note right next to the mouse

    //layout configurations for panel that holds area for text and save note button
    thePanel.add(save, BorderLayout.SOUTH);
    thePanel.add(textArea, BorderLayout.NORTH);

    textArea.setLineWrap(true); //prevents text from going off screen horizontally
    textArea.setWrapStyleWord(true); //prevents words from being cut off
    textArea.setBounds(0, 0, 180, 200); //size of text area
    textArea.setPreferredSize(textArea.getPreferredSize()); //stops text area from expanding vertically

    //decides what color the note will be upon opening a new one
    if (colorNumber == 1){
        textArea.setBackground(noteColorOne);
        save.setBackground(buttonColorOne);
    }
    else if (colorNumber == 2){
        textArea.setBackground(noteColorTwo);
        save.setBackground(buttonColorTwo);
    }
    else if (colorNumber == 3){
        textArea.setBackground(noteColorThree);
        save.setBackground(buttonColorThree);
    }
    else{
        textArea.setBackground(noteColorFour);
        save.setBackground(buttonColorFour);
    }

    //saves what text is inside of the note that was saved
    save.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            savedNote = textArea.getText();
            JOptionPane.showMessageDialog(null, "Saved!");
        }
    });
    }
}