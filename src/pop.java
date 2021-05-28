//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
//import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
//import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pop extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pop frame = new pop();
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
	public pop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				try {
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/own","root","");
				//Statement st =con.createStatement();
					//	
		String	id = t1.getText();
			 String sql=("select * from two where id = ?");
						PreparedStatement st1 =con.prepareStatement(sql);
						ResultSet rs= st1.executeQuery(sql);
				
					
						st1.setString(1,id);
						
						 st1.executeQuery();
						 
						 
						 if(rs.next()==false)
							{
							 JOptionPane.showMessageDialog(null, " record not found ");
							}
						 else
						 {
							String PATIENTID = String.valueOf(rs.getInt("PATIENTID"));
							String NAME = rs.getString("NAME");
							String LASTNAME = rs.getString("LASTNAME");
							String  AGE= String.valueOf(rs.getInt("AGE"));
							String BEDNO = String.valueOf(rs.getInt("BEDNO"));
							String PATIENTTYPE = rs.getString("PATIENTTYPE");
							
							String tbData[]= {PATIENTID,NAME,LASTNAME,AGE,BEDNO,PATIENTTYPE};
							DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
							tblModel.addRow(tbData);
							//DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
						//	table.setM
						
						}
				}
						
					catch(Exception e)
						{
							JOptionPane.showMessageDialog(null, e);
						}
			}
		});
		t1.setBounds(193, 80, 248, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(149, 150, 752, 268);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
				Integer.class, String.class, Object.class, Integer.class, Integer.class, String.class
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
		scrollPane.setViewportView(table);
	}

}
