//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt.SystemColor;
import java.awt.Font;
//import javax.swing.JTextField;
import java.awt.Color;
//import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
//import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class fan extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fan frame = new fan();
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
	public fan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/appoinment","root","");
			Statement st =con.createStatement();
			String sql="select * from one";
				ResultSet rs= st.executeQuery(sql);
				//t1.setModel(DbUtils.Ta);
				//Object DbUtils=null;
				while(rs.next())
				{
				String patientname = rs.getString("patientname");
				String doctorname = rs.getString("doctorname");
				String date = rs.getString("date");
				String  time = rs.getString("time");
				
				
				String tbData[]= {patientname,doctorname,date,time};
				DefaultTableModel tblModel = (DefaultTableModel)t3.getModel();
				tblModel.addRow(tbData);
				}
			}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		lblNewLabel_1.setBounds(0, 0, 220, 179);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\edit-user.png"));
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 195, 1178, 649);
		contentPane.add(scrollPane);
		
		t3 = new JTable();
		t3.setFont(new Font("Tahoma", Font.BOLD, 24));
		t3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"patientname", "doctorname",  "date", "time"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Integer.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		t3.getColumnModel().getColumn(0).setPreferredWidth(97);
		t3.getColumnModel().getColumn(2).setPreferredWidth(113);
		t3.getColumnModel().getColumn(3).setPreferredWidth(115);
		scrollPane.setViewportView(t3);
		t3.setRowHeight(30);
		JTableHeader header = t3.getTableHeader();
		header.setFont(new Font("Dialog",Font.BOLD,24));
		header.setForeground(Color.blue);
		
		
		JLabel lblNewLabel = new JLabel(" VIEW APPOINMENTS");
		prescription p1=new prescription();
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p1.setVisible(true);

				
				DefaultTableModel model = (DefaultTableModel)t3.getModel();
				int i= t3.getSelectedRow();
			if(i>=0)
				{
					
					String name= model.getValueAt(i, 0).toString();
				
					
					p1.textField.setText(name);
				
					
				}
				
			else
				{
					JOptionPane.showMessageDialog(null,"Error");
			}
				
		
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(208, 79, 532, 69);
		contentPane.add(lblNewLabel);
		
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\ok123.jpg"));
		lblNewLabel.setBounds(1061, 45, 235, 134);
		contentPane.add(lblNewLabel);
	}
}
