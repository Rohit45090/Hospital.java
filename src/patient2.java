

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class patient2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblPatientTyoe;
	private JTextField t6;
	private JLabel lblNewLabel_5;
	private JTextField txtPatientDetails;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JTextField t9;
	private JLabel lblPatientidToDelete;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patient2 frame = new patient2();
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
	public patient2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 21));
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String MobileNo=t1.getText();
				int length = MobileNo.length();
				//char c= evt.getKeyChar();
				
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9')
				{
					if(length<3) {
						t1.setEditable(true);
					}
					else
					{
						t1.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						t1.setEditable(true);
					}
					else
					{
						t1.setEditable(false);
					}
				}
			}
		});
		t1.setBounds(229, 198, 276, 40);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PATIENTID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(26, 206, 179, 20);
		contentPane.add(lblNewLabel);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 21));
		t2.setColumns(10);
		t2.setBounds(229, 294, 276, 40);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.BOLD, 21));
		t3.setColumns(10);
		t3.setBounds(237, 397, 268, 40);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("Tahoma", Font.BOLD, 21));
		t4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String MobileNo=t4.getText();
				int length = MobileNo.length();
				//char c= evt.getKeyChar();
				
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9')
				{
					if(length<3) {
						t4.setEditable(true);
					}
					else
					{
						t4.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						t4.setEditable(true);
					}
					else
					{
						t4.setEditable(false);
					}
				}
			}
		});
		t4.setColumns(10);
		t4.setBounds(237, 488, 268, 40);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma", Font.BOLD, 21));
		t5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String MobileNo=t5.getText();
				int length = MobileNo.length();
				//char c= evt.getKeyChar();
				
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9')
				{
					if(length<4) {
						t5.setEditable(true);
					}
					else
					{
						t5.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						t5.setEditable(true);
					}
					else
					{
						t5.setEditable(false);
					}
				}
			}
		});
		t5.setColumns(10);
		t5.setBounds(246, 587, 259, 40);
		contentPane.add(t5);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(new Color(0, 0, 128));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblName.setBounds(26, 302, 119, 20);
		contentPane.add(lblName);
		
		JLabel lblLastname = new JLabel("LASTNAME");
		lblLastname.setForeground(new Color(0, 0, 128));
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblLastname.setBounds(15, 405, 146, 20);
		contentPane.add(lblLastname);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setForeground(new Color(0, 0, 128));
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblAge.setBounds(26, 491, 119, 30);
		contentPane.add(lblAge);
		
		JLabel lblBedNo = new JLabel("BEDNO");
		lblBedNo.setForeground(new Color(0, 0, 128));
		lblBedNo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblBedNo.setBounds(15, 590, 119, 30);
		contentPane.add(lblBedNo);
		
		JButton btnNewButton = new JButton("ADD PATIENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String P = t1.getText();
				String name = t2.getText();
				String Age = t3.getText();
				String MobileNo = t4.getText();
				String town = t5.getText();
				String o = t6.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/own","root","");
					Statement stm =con.createStatement();
					String sql ="INSERT INTO two VALUES("+P+",'"+name+"','"+Age+"',"+MobileNo+","+town+",'"+o+"')";
					stm.executeUpdate(sql);
					JOptionPane.showInputDialog(this,"record added succesfully");
					con.close();
		}
				catch(Exception e)
				{
				
			}
			}
		});
		
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(759, 478, 214, 56);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\patient-icon-14.png"));
		lblNewLabel_1.setBounds(928, 388, 268, 192);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\patient78.jpg"));
		lblNewLabel_3.setBounds(990, 0, 268, 254);
		contentPane.add(lblNewLabel_3);
		
		
		
		lblPatientTyoe = new JLabel("PATIENTTYPE");
		lblPatientTyoe.setForeground(new Color(0, 0, 128));
		lblPatientTyoe.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPatientTyoe.setBounds(15, 715, 190, 30);
		contentPane.add(lblPatientTyoe);
		
		t6 = new JTextField();
		t6.setFont(new Font("Tahoma", Font.BOLD, 21));
		t6.setBounds(256, 703, 249, 45);
		contentPane.add(t6);
		t6.setColumns(10);
		
		lblNewLabel_5 = new JLabel("New label");
		
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\ok123.jpg"));
		lblNewLabel_5.setBounds(959, 712, -113, 116);
		contentPane.add(lblNewLabel_5);
		
		txtPatientDetails = new JTextField();
		txtPatientDetails.setBackground(new Color(0, 206, 209));
		txtPatientDetails.setText("                                PATIENT DETAILS");
		txtPatientDetails.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtPatientDetails.setForeground(Color.RED);
		txtPatientDetails.setBounds(0, 0, 990, 135);
		contentPane.add(txtPatientDetails);
		txtPatientDetails.setColumns(10);
		patient3 m=new patient3();
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\ok123.jpg"));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				m.setVisible(true);
				
			}
		});
		lblNewLabel_4.setBounds(1053, 705, 125, 149);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\clear button1.jpg"));
		lblNewLabel_2.setBounds(1013, 571, 159, 126);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				t6.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setForeground(new Color(0, 0, 128));
		btnNewButton_1.setBounds(808, 607, 146, 56);
		contentPane.add(btnNewButton_1);
		
		t9 = new JTextField();
		t9.setFont(new Font("Tahoma", Font.BOLD, 21));
		t9.setColumns(10);
		t9.setBounds(834, 329, 139, 40);
		contentPane.add(t9);
		
		lblPatientidToDelete = new JLabel("patientid to delete");
		lblPatientidToDelete.setForeground(new Color(0, 0, 128));
		lblPatientidToDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPatientidToDelete.setBounds(597, 332, 268, 30);
		contentPane.add(lblPatientidToDelete);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/own","root","");
		//Statement st =con.createStatement();
			
			String sql="delete from two where PATIENTID = ?";
			PreparedStatement st1 =con.prepareStatement(sql);
				 st1.setInt(1,Integer.parseInt(t9.getText()));
				 st1.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Record deleted sucessfully");
				}
			
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		
				
		
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\Close-icon.png"));
		lblNewLabel_6.setBounds(1034, 270, 138, 129);
		contentPane.add(lblNewLabel_6);
	}
}
