

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class kareena extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField textField;
	JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kareena frame = new kareena();
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
	public kareena() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(277, 156, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(277, 227, 146, 26);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Patient Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(92, 157, 191, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblDoctorName = new JLabel("Doctor name");
		lblDoctorName.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblDoctorName.setBounds(92, 228, 157, 20);
		contentPane.add(lblDoctorName);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTime.setBounds(109, 387, 157, 20);
		contentPane.add(lblTime);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.addItem("1 AM");
		comboBox.addItem("2 AM");
		comboBox.addItem("3 AM");
		comboBox.addItem("4 AM");
		comboBox.addItem("5 AM");
		comboBox.addItem("6 AM");
		comboBox.addItem("7 AM");
		comboBox.addItem("8 AM");
		comboBox.addItem("9 AM");
		comboBox.addItem("10 AM");
		comboBox.addItem("11 AM");
		comboBox.addItem("12 AM");
		comboBox.addItem("1 PM");
		comboBox.addItem("2 PM");
		comboBox.addItem("3 PM");
		comboBox.addItem("4 PM");
		comboBox.addItem("5 PM");
		comboBox.addItem("6 PM");
		comboBox.addItem("7 PM");
		comboBox.addItem("8 PM");
		comboBox.addItem("9 PM");
		comboBox.addItem("10 AM");
		comboBox.addItem("11 AM");
		comboBox.addItem("12 AM");
		comboBox.setSelectedItem(null);
		
		comboBox.setBounds(277, 384, 146, 26);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Doctorid = textField.getText();
				String rollno = textField_1.getText();
				String age = textField_2.getText();
				String Name = (String) comboBox.getSelectedItem();
			//	
				//String special = textField_4.getText();
				
			//	comboBox.addSelectedItem("specialisation");
				
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/appoinment","root","");
					Statement stm =con.createStatement();
					String sql ="INSERT INTO one VALUES('"+Doctorid+"','"+rollno+"','"+age+"','"+Name+"')";
					stm.executeUpdate(sql);
					JOptionPane.showInputDialog(this,"record added succesfully");
					con.close();
				}  
					
				
				catch(Exception e)
				{
				
			}
			}
		});
		btnNewButton.setBounds(230, 484, 115, 29);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(277, 308, 146, 26);
		contentPane.add(textField_2);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblDate.setBounds(92, 313, 157, 20);
		contentPane.add(lblDate);
	}
}
