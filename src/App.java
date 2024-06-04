import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.*;


public class App {
    public static void main(String[] args) throws Exception {

        //Initializing aspects of starting window
        JFrame quickNotes = new JFrame("QuickNotes");
        JLabel label = new JLabel("Open a new note with the button.", SwingConstants.CENTER);
        JButton noteButton = new JButton("Note");
        JPanel panel = new JPanel();

        //configurations for frame
        quickNotes.setResizable(false);
        quickNotes.add(panel);
        quickNotes.setSize(300, 150);
        quickNotes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quickNotes.setVisible(true);

        //configurations for panel within frame, panel contains text and button
        panel.add(noteButton);
        panel.add(label);
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

