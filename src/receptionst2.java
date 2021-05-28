//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class receptionst2 extends JFrame {

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
					receptionst2 frame = new receptionst2();
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
	public receptionst2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		search1 n1=new search1();
		JButton btnNewButton = new JButton("DOCTOR AVAILIBILTY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n1.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(55, 226, 300, 54);
		contentPane.add(btnNewButton);
		patient3 n=new patient3();
		JButton btnPatientAvailibilty = new JButton("PATIENT AVAILIBILTY");
		btnPatientAvailibilty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				n.setVisible(true);
				
			}
		});
		btnPatientAvailibilty.setForeground(Color.BLACK);
		btnPatientAvailibilty.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPatientAvailibilty.setBackground(new Color(135, 206, 235));
		btnPatientAvailibilty.setBounds(55, 361, 289, 54);
		contentPane.add(btnPatientAvailibilty);
		select3<Object> s=new select3<Object>();
		JButton btnCreateAppoinment = new JButton("CREATE APPOINMENT");
		btnCreateAppoinment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s.setVisible(true);
			}
		});
		btnCreateAppoinment.setForeground(Color.BLACK);
		btnCreateAppoinment.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCreateAppoinment.setBackground(new Color(135, 206, 235));
		btnCreateAppoinment.setBounds(63, 482, 281, 54);
		contentPane.add(btnCreateAppoinment);
		
		JLabel lblNewLabel = new JLabel("RECEPTIONIST PORTAL");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(156, 16, 630, 129);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\receptiionist.jpg"));
		lblNewLabel_1.setBounds(0, 0, 978, 644);
		contentPane.add(lblNewLabel_1);
	}

}
