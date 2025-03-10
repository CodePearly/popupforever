package popupforever;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.util.Random;

public class Popup {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Popup window = new Popup();
                    window.frame.setVisible(true);
                    System.out.println("This is a popup");
                    popupforever.Popup.main(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Popup() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        // Initialize the frame
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add random positioning logic
        Random random = new Random();
        int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        int x = random.nextInt(screenWidth - frame.getWidth());
        int y = random.nextInt(screenHeight - frame.getHeight());
        frame.setLocation(x, y);

        // Add a scroll pane with a text pane
        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JTextPane txtpnThisIsA = new JTextPane();
        txtpnThisIsA.setText("This is a popup");
        scrollPane.setViewportView(txtpnThisIsA);
    }
}
