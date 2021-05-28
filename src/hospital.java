//import java.awt.BorderLayout;
import java.awt.EventQueue;

//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JLabel;
//import javax.swing.JLabel;

public class hospital extends JFrame {

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
					hospital frame = new hospital();
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
	public hospital() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		login1 d2=new login1();
		JLabel lblNewLabel = new JLabel("LOGIN AS");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(215, 16, 463, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\doctor.jpg"));
		lblNewLabel_1.setBounds(15, 98, 144, 127);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("DOCTOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				d2.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBounds(25, 241, 115, 51);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\patient1.jpg"));
		lblNewLabel_2.setBounds(215, 98, 162, 127);
		contentPane.add(lblNewLabel_2);
		login2 p1=new login2();
		JButton btnPatient = new JButton("PATIENT");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p1.setVisible(true);
			}
		});
		btnPatient.setForeground(new Color(0, 0, 128));
		btnPatient.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPatient.setBounds(240, 241, 115, 51);
		contentPane.add(btnPatient);
		login3 l=new login3();
		JButton btnNurse = new JButton("NURSE");
		btnNurse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				l.setVisible(true);
			}
		});
		
		btnNurse.setForeground(new Color(0, 0, 128));
		btnNurse.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNurse.setBounds(443, 241, 115, 51);
		contentPane.add(btnNurse);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\nurse43 (2).jpg"));
		label.setBounds(443, 80, 115, 142);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\admin.jpg"));
		label_1.setBounds(15, 337, 196, 150);
		contentPane.add(label_1);
		Admin a=new Admin();
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setVisible(true);
			}
		});
		btnAdmin.setForeground(new Color(0, 0, 128));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdmin.setBounds(240, 398, 115, 51);
		contentPane.add(btnAdmin);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\hospital2.jpg"));
		lblNewLabel_3.setBounds(0, 0, 795, 487);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
