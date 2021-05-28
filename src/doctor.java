//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import javax.swing.JTextPane;
import java.awt.Color;
//import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

public class doctor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctor frame = new doctor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	//	roy r=new roy();
		JLabel lblNewLabel_1 = new JLabel("             WELCOME  DOCTORS PORTAL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(-113, 34, 708, 90);
		contentPane.add(lblNewLabel_1);
		fan f1=new fan();
		JButton btnNewButton = new JButton("Appoinments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setBounds(50, 311, 215, 55);
		contentPane.add(btnNewButton);
		patient3 q=new patient3();
		JButton btnPatientsDetails = new JButton("patients details");
		btnPatientsDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				q.setVisible(true);
			}
		});
		btnPatientsDetails.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnPatientsDetails.setBounds(385, 311, 280, 55);
		contentPane.add(btnPatientsDetails);
		//login1 l1=new login1();
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//l1.setVisible(true);
			}
		});
		
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnLogout.setBounds(774, 311, 163, 55);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\DOCTOR43.jpg"));
		lblNewLabel.setBounds(0, 0, 1039, 466);
		contentPane.add(lblNewLabel);
	}
}
