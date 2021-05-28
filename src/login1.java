//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
//import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class login1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					login1 frame = new login1();
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
	public login1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 750, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                  LOGIN AS DOCTOR !!");
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(31, 32, 588, 76);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_2.setBounds(102, 267, 169, 31);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(323, 269, 246, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(323, 399, 246, 42);
		PasswordField.setBackground(Color.WHITE);
		PasswordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		PasswordField.setForeground(new Color(0, 0, 0));
		PasswordField.setColumns(10);
		contentPane.add(PasswordField);
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 128));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblPassword.setBounds(102, 401, 180, 31);
		contentPane.add(lblPassword);
		doctor h=new doctor();
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String un=textField.getText();
				@SuppressWarnings("deprecation")
				String pass=PasswordField.getText();
				if(un.equals("rohit@123") && pass.equals("rohit@12"))
				{
					//JOptionPane.showMessageDialog(null,"login is sucessful");
					h.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login or password");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(334, 553, 115, 55);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\background13.jpg"));
		lblNewLabel_1.setBounds(0, 0, 728, 744);
		contentPane.add(lblNewLabel_1);
	}
}
