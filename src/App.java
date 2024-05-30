import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class App {
    public static void main(String[] args) throws Exception {

        //Initializing aspects of starting window
        JFrame quickNotes = new JFrame("QuickNotes");
        JLabel label = new JLabel("Open a new note with the button.", SwingConstants.CENTER);
        JButton openNote = new JButton();
        JPanel panel = new JPanel();

        //configurations for
        quickNotes.add(panel);
        quickNotes.setSize(300, 150);
        quickNotes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quickNotes.setVisible(true);

        panel.add(openNote);
        panel.add(label);
        panel.setSize(100,300);
    }
}
