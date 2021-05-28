//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;import javax.swing.RowFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
//import javax.swing.JButton;

@SuppressWarnings("unused")
public class select3<User> extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("rawtypes")
					select3 frame = new select3();
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
	public select3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(470, 74, 558, 437);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DOCTORID", "NAME", "LASTNAME", "AGE", "SPECIALISATION"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton b1 = new JButton("VIEW");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");
			Statement st =con.createStatement();
			String sql="select * from rohit";
				ResultSet rs= st.executeQuery(sql);
				//t1.setModel(DbUtils.Ta);
				//Object DbUtils=null;
				while(rs.next())
				{
				String DOCTORID = String.valueOf(rs.getInt("DOCTORID"));
				String NAME = rs.getString("NAME");
				String LASTNAME = rs.getString("LASTNAME");
				String  AGE= String.valueOf(rs.getInt("AGE"));
				String SPECIALISATION = rs.getString("SPECIALISATION");
				String tbData[]= {DOCTORID,NAME,LASTNAME,AGE,SPECIALISATION};
				DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
				tblModel.addRow(tbData);
				}
			}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		b1.setBounds(586, 27, 115, 29);
		contentPane.add(b1);
		
		JButton btnNext = new JButton("next");
		kareena k = new kareena();
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k.setVisible(true);
				String s=textField.getText().toString();
				k.textField.setText(s);
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i= table.getSelectedRow();
			if(i>=0)
				{
					
					String name= model.getValueAt(i, 1).toString();
				
					
					k.textField_1.setText(name);
				
					
				}
				
			else
				{
					JOptionPane.showMessageDialog(null,"Error");
			}
				
		
				
			}
		});
		btnNext.setBounds(898, 16, 115, 29);
		contentPane.add(btnNext);
		
		textField = new JTextField();
		textField.setBounds(159, 80, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
