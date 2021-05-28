//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
//import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class receptionist extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPatientDetails;
	private JTextField t;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receptionist frame = new receptionist();
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
	public receptionist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 750, 800);;
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\logo receptionist.jpg"));
		lblNewLabel.setBounds(430, 0, 404, 176);
		contentPane.add(lblNewLabel);
		
		txtPatientDetails = new JTextField();
		txtPatientDetails.setForeground(SystemColor.text);
		txtPatientDetails.setBackground(SystemColor.textHighlight);
		txtPatientDetails.setText("   RECEPTIONIST DETAILS ");
		txtPatientDetails.setFont(new Font("Tahoma", Font.BOLD, 32));
		txtPatientDetails.setBounds(0, 0, 430, 93);
		contentPane.add(txtPatientDetails);
		txtPatientDetails.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("RECEPTIONISTID");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(15, 220, 244, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(new Color(0, 0, 128));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblName.setBounds(88, 301, 102, 20);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setForeground(new Color(0, 0, 128));
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAge.setBounds(88, 388, 102, 25);
		contentPane.add(lblAge);
		
		JLabel lblMobileNo = new JLabel("MOBILE");
		lblMobileNo.setForeground(new Color(0, 0, 128));
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblMobileNo.setBounds(88, 483, 129, 20);
		contentPane.add(lblMobileNo);
		
		JLabel lblTown = new JLabel("TOWN");
		lblTown.setForeground(new Color(0, 0, 128));
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTown.setBounds(99, 562, 102, 20);
		contentPane.add(lblTown);
		
		t = new JTextField();
		t.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String Patientid=t.getText();
				int length = Patientid.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='4')
				{
					if(length<5) {
						t.setEditable(true);
					}
					else
					{
						t.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						t.setEditable(true);
					}
					else
					{
						t.setEditable(false);
					}
				}
			}
		});
		t.setFont(new Font("Tahoma", Font.BOLD, 18));
		t.setBounds(245, 218, 218, 26);
		contentPane.add(t);
		t.setColumns(10);
		
		t3 = new JTextField();
		
				t3.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent evt) {
						String Age =t3.getText();
						int length = Age.length();
						//char c= evt.getKeyChar();
						
						if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
						{
							if(length<5) {
								t3.setEditable(true);
							}
							else
							{
								t3.setEditable(false);
							}
						}
						else
						{
							if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
							{
								t3.setEditable(true);
							}
							else
							{
								t3.setEditable(false);
							}
						}
					}
				});
			
		
		t3.setFont(new Font("Tahoma", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setBounds(245, 388, 129, 26);
		contentPane.add(t3);
		
		
		t4 = new JTextField();
		t4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String MobileNo=t4.getText();
				int length = MobileNo.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<10) {
						t4.setEditable(true);
					}
					else
					{
						t4.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
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
		t4.setFont(new Font("Tahoma", Font.BOLD, 19));
		t4.setColumns(10);
		t4.setBounds(245, 481, 218, 26);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma", Font.BOLD, 19));
		t5.setColumns(10);
		t5.setBounds(245, 559, 155, 26);
		contentPane.add(t5);
		
		JButton btnNewButton = new JButton("ADD  DATA");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Patientid = t.getText();
				String name = t1.getText();
				String Age = t3.getText();
				String MobileNo = t4.getText();
				String town = t5.getText();
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","");
					Statement stm =con.createStatement();
					String sql ="INSERT INTO sejal VALUES("+Patientid+",'"+name+"',"+Age+","+MobileNo+",'"+town+"')";
					stm.executeUpdate(sql);
					JOptionPane.showInputDialog(this,"record added succesfully");
					con.close();
				}
				catch(Exception e)
				{
				
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(177, 680, 223, 49);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(new Color(135, 206, 250));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t1.setText(null);
				t3.setText(null);
				t4.setText(null);
			//	textField_4.setText(null);
				t5.setText(null);
				//textField_6.setText(null);
				t.setText(null);
				
				
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(490, 679, 163, 49);
		contentPane.add(btnClear);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 19));
		t1.setColumns(10);
		t1.setBounds(245, 299, 218, 26);
		contentPane.add(t1);
	}
}
