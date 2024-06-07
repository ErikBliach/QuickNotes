import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {

        //Initializing aspects of starting window
        JFrame quickNotes = new JFrame("QuickNotes");
        JLabel label = new JLabel("<html>Welcome to QuickNotes!<p>Open a new note with the New note button.<p>Check your saved notes with the Saved notes button.</html>", SwingConstants.CENTER);//<html> and <p> allow the text to be shown on multiple lines
        JButton noteButton = new JButton("New note");
        JButton savedNotes = new JButton("Saved notes");
        JPanel panel = new JPanel(new BorderLayout());
        JPanel labelPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        //configurations for frame of window to open a note
        quickNotes.setResizable(false);
        quickNotes.add(panel);
        quickNotes.setSize(350, 150);
        quickNotes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quickNotes.setVisible(true);

        //placing buttons and labels in their own panels to change their layout in the frame
        buttonPanel.add(noteButton);
        buttonPanel.add(savedNotes);
        labelPanel.add(label);

        //positions for panels within frame
        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.add(labelPanel, BorderLayout.NORTH);
        panel.setSize(300,150);

        //to open a new note whenever the button is pressed
        noteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quickNote newNote = new quickNote();
                newNote.newNote();
            }
        });
    }
}

