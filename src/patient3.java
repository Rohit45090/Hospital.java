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

public class patient3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patient3 frame = new patient3();
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
	public patient3() {
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
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/own","root","");
			Statement st =con.createStatement();
			String sql="select * from two";
				ResultSet rs= st.executeQuery(sql);
				//t1.setModel(DbUtils.Ta);
				//Object DbUtils=null;
				while(rs.next())
				{
				String PATIENTID = String.valueOf(rs.getInt("PATIENTID"));
				String NAME = rs.getString("NAME");
				String LASTNAME = rs.getString("LASTNAME");
				String  AGE= String.valueOf(rs.getInt("AGE"));
				String BEDNO = String.valueOf(rs.getInt("BEDNO"));
				String PATIENTTYPE = rs.getString("PATIENTTYPE");
				
				String tbData[]= {PATIENTID,NAME,LASTNAME,AGE,BEDNO,PATIENTTYPE};
				DefaultTableModel tblModel = (DefaultTableModel)t2.getModel();
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
		
		t2 = new JTable();
		t2.setFont(new Font("Tahoma", Font.BOLD, 24));
		t2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PATIENTID", "NAME", "LASTNAME", "AGE", "BEDNO", "PATIENTTYPE"
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
		t2.getColumnModel().getColumn(0).setPreferredWidth(97);
		t2.getColumnModel().getColumn(2).setPreferredWidth(113);
		t2.getColumnModel().getColumn(3).setPreferredWidth(115);
		scrollPane.setViewportView(t2);
		t2.setRowHeight(30);
		JTableHeader header = t2.getTableHeader();
		header.setFont(new Font("Dialog",Font.BOLD,24));
		header.setForeground(Color.blue);
		
		
		JLabel lblNewLabel = new JLabel(" VIEW PATIENTS DATA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(208, 79, 532, 69);
		contentPane.add(lblNewLabel);
		select3<Object> k = new select3<Object>();
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
               k.setVisible(true);
				
				DefaultTableModel model = (DefaultTableModel)t2.getModel();
				int i= t2.getSelectedRow();
			if(i>=0)
				{
					
					String name= model.getValueAt(i, 1).toString();
				
					
					k.textField.setText(name);
				
					
				}
				
			else
				{
					JOptionPane.showMessageDialog(null,"Error");
			}
				
		
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\ok123.jpg"));
		lblNewLabel_2.setBounds(1061, 45, 235, 134);
		contentPane.add(lblNewLabel_2);
	}
}
