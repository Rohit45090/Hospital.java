//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import javax.swing.JButton;

public class search2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					search2 frame = new search2();
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
	public search2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");
		//Statement st =con.createStatement();
				 
	String sql="SELECT * FROM `rohit` WHERE `DOCTORID` = ?" ;
			PreparedStatement st1 =con.prepareStatement(sql);
				 st1.setInt(1,Integer.parseInt(textField_1.getText()));
				 
				
				 ResultSet rs= st1.executeQuery(sql);
				 if(rs.next()==false)
				 {  
					 textField_1.setText("");
					 textField_2.setText("");
					 textField_3.setText("");
					 textField_4.setText("");
				 }
				 else
				 {
					String id = rs.getString("DOCTORID");
					textField_1.setText(id);
					String id1 = rs.getString("NAME");
					textField_2.setText(id1);
					String id2 = rs.getString("LASTNAME");
					textField_3.setText(id2);
					String id3 = rs.getString("AGE");
					textField_4.setText(id3);
					String id4 = rs.getString("SPECIALISATION");
					textField_5.setText(id4);
				 }
					 
				 }
				
			
				catch(Exception e1) 
				{
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}
		});
		
		
		textField_1.setBounds(198, 186, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10); 
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(198, 250, 146, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(198, 329, 146, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(198, 408, 146, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(198, 507, 146, 26);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("DOCTORID");
		lblNewLabel_1.setBounds(72, 189, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(72, 253, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblSirname = new JLabel("SIRNAME");
		lblSirname.setBounds(72, 332, 69, 20);
		contentPane.add(lblSirname);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(72, 411, 69, 20);
		contentPane.add(lblAge);
		
		JLabel lblSpecialisation = new JLabel("SPECIALISATION");
		lblSpecialisation.setBounds(72, 510, 69, 20);
		contentPane.add(lblSpecialisation);
	}
}
