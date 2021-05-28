//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
//import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
//import java.awt.SystemColor;
import javax.swing.ImageIcon;
//import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class roy extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt;
	private JTextField PasswordField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtWelcome;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roy frame = new roy();
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
	@SuppressWarnings("unused")
	public roy() {
		String un,pass;
		hospital h=new hospital();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 750, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
	//	contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(399, 320, 86, 92);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\logo0.jpg"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel);
		
		txt = new JTextField();
		txt.setBounds(508, 346, 246, 42);
		txt.setForeground(Color.BLACK);
		txt.setBackground(Color.WHITE);
		txt.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(txt);
		txt.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(508, 491, 246, 42);
		PasswordField.setBackground(Color.WHITE);
		PasswordField.setFont(new Font("Tahoma", Font.BOLD, 25));
		PasswordField.setForeground(new Color(0, 0, 0));
		PasswordField.setColumns(10);
		contentPane.add(PasswordField);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setBounds(415, 479, 140, 61);
		lblPassword.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\ro (4).jpg"));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(502, 606, 197, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String un=txt.getText();
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
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("USERNAME");
		lblNewLabel_2.setForeground(new Color(0, 0, 139));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_2.setBounds(538, 300, 181, 37);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(542, 443, 157, 20);
		contentPane.add(lblNewLabel_3);
		
		txtWelcome = new JTextField();
		txtWelcome.setBackground(new Color(0, 206, 209));
		txtWelcome.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtWelcome.setText("               SUMITRA HOSPITAL");
		txtWelcome.setForeground(Color.BLACK);
		txtWelcome.setBounds(38, 52, 697, 100);
		contentPane.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\surgery1.jpg"));
		lblNewLabel_1.setBounds(0, 0, 750, 700);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);
	}
}
