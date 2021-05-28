//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

public class login2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWelcomeToPatient;
	private JTextField textField;
	//private JTextField textField_1;
	private JPasswordField PasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login2 frame = new login2();
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
	public login2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToPatient = new JTextField();
		txtWelcomeToPatient.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtWelcomeToPatient.setText("               WELCOME TO PATIENT LOGIN");
		txtWelcomeToPatient.setForeground(Color.WHITE);
		txtWelcomeToPatient.setBackground(SystemColor.textHighlight);
		txtWelcomeToPatient.setBounds(0, 16, 728, 102);
		contentPane.add(txtWelcomeToPatient);
		txtWelcomeToPatient.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME :");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(31, 273, 168, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPassword.setForeground(new Color(0, 0, 128));
		lblPassword.setBounds(15, 423, 184, 35);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setBounds(231, 271, 292, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(231, 420, 292, 42);
		PasswordField.setBackground(Color.WHITE);
		PasswordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		PasswordField.setForeground(new Color(0, 0, 0));
		PasswordField.setColumns(10);
		contentPane.add(PasswordField);
		
		patient2 p=new patient2();
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String un=textField.getText();
				@SuppressWarnings("deprecation")
				String pass=PasswordField.getText();
				if(un.equals("rohit@123") && pass.equals("rohit@12"))
				{
					//JOptionPane.showMessageDialog(null,"login is sucessful");
					p.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login or password");
				}
			}
		});
		
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(270, 551, 147, 54);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\patient login portal2.jpg"));
		lblNewLabel_1.setBounds(0, 0, 728, 744);
		contentPane.add(lblNewLabel_1);
	}

}
