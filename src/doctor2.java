//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
//import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
//import javax.swing.JComboBox;


public class doctor2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDoctorsData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctor2 frame = new doctor2();
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
	public doctor2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 750, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\doctor32.jpg"));
		lblNewLabel.setBounds(507, 0, 221, 216);
		contentPane.add(lblNewLabel);
		
		txtDoctorsData = new JTextField();
		txtDoctorsData.setBackground(SystemColor.textHighlight);
		txtDoctorsData.setForeground(Color.WHITE);
		txtDoctorsData.setFont(new Font("Tahoma", Font.BOLD, 26));
		txtDoctorsData.setText("              DOCTORS DATA");
		txtDoctorsData.setBounds(0, 16, 505, 84);
		contentPane.add(txtDoctorsData);
		txtDoctorsData.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DOCTORID ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(10, 120, 149, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(new Color(0, 0, 128));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(30, 232, 109, 35);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("LASTNAME");
		lblLastName.setForeground(new Color(0, 0, 128));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLastName.setBounds(15, 341, 138, 35);
		contentPane.add(lblLastName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setForeground(new Color(0, 0, 128));
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(15, 438, 109, 35);
		contentPane.add(lblAge);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String Doctorid=textField.getText();
				int length = Doctorid.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<5) {
						textField.setEditable(true);
					}
					else
					{
						textField.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField.setEditable(true);
					}
					else
					{
						textField.setEditable(false);
					}
				}
			}
		});
		textField.setBounds(154, 120, 200, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(152, 232, 200, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(152, 341, 200, 35);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String Age=textField_3.getText();
				int length = Age.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<4) {
						textField_3.setEditable(true);
					}
					else
					{
						textField_3.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField_3.setEditable(true);
					}
					else
					{
						textField_3.setEditable(false);
					}
				}
			}
		});
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(154, 438, 200, 35);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("ADD DOCTORS DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Doctorid = textField.getText();
				String rollno = textField_1.getText();
				String Name = textField_2.getText();
				String age = textField_3.getText();
				String special = textField_4.getText();
				
			//	comboBox.addSelectedItem("specialisation");
				
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");
					Statement stm =con.createStatement();
					String sql ="INSERT INTO rohit VALUES("+Doctorid+",'"+rollno+"','"+Name+"',"+age+",'"+special+"')";
					stm.executeUpdate(sql);
					JOptionPane.showInputDialog(this,"record added succesfully");
					con.close();
				}
					
				
				catch(Exception e)
				{
				
			}
			}
		});
	
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(431, 296, 305, 52);
		contentPane.add(btnNewButton);
		JButton button = new JButton("CLEAR");
		button.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				
				
			}
		});
		button.setForeground(new Color(0, 0, 128));
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBackground(Color.WHITE);
		button.setBounds(485, 405, 243, 52);
		contentPane.add(button);
		
		JLabel lblSpecialisation = new JLabel("SPECIALISATION");
		lblSpecialisation.setForeground(new Color(0, 0, 128));
		lblSpecialisation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSpecialisation.setBounds(9, 541, 175, 35);
		contentPane.add(lblSpecialisation);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(199, 540, 200, 35);
		contentPane.add(textField_4);
		search1 m=new search1();
		JButton button_1 = new JButton("NEXT ->");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m.setVisible(true);
			}
		});
		button_1.setForeground(new Color(0, 0, 128));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(480, 528, 256, 52);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");
		//Statement st =con.createStatement();
			
			String sql="delete from rohit where DOCTORID = ?";
			PreparedStatement st1 =con.prepareStatement(sql);
				 st1.setInt(1,Integer.parseInt(textField_5.getText()));
				 st1.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Record deleted sucessfully");
				}
			
				catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBounds(526, 651, 202, 52);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER DOCTORID TO DELETE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(61, 661, 338, 33);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField_5.setBounds(402, 661, 109, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		
		
		
	}
}
