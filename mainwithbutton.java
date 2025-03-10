

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainwithbutton {

	protected static final int sad = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					mainwithbutton window = new mainwithbutton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainwithbutton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
		JButton btnDontClickMe = new JButton("Don't Click me");
		btnDontClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				popupforever.Popup.main(null);
			}
		});
		frame.getContentPane().add(btnDontClickMe, BorderLayout.WEST);
	}

}
