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
public class select2<User> extends JFrame {

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
	private JTable table;
	private JTextField textFieldsearch;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("rawtypes")
					select2 frame = new select2();
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
	public select2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(455, 192, 558, 437);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				textField_1.setText(model.getValueAt(selectedRowIndex,0).toString());
				textField_2.setText(model.getValueAt(selectedRowIndex,1).toString());
				textField_3.setText(model.getValueAt(selectedRowIndex,2).toString());
				textField_4.setText(model.getValueAt(selectedRowIndex,3).toString());
				textField_5.setText(model.getValueAt(selectedRowIndex,4).toString());
			}
		});
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
		b1.setBounds(345, 79, 115, 29);
		contentPane.add(b1);
		
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i= table.getSelectedRow();
				if(i>=0)
				{
					model.setValueAt(textField_1.getText(),i,0);
					model.setValueAt(textField_2.getText(),i,1);
					model.setValueAt(textField_3.getText(),i,2);
					model.setValueAt(textField_4.getText(),i,3);
					model.setValueAt(textField_5.getText(),i,4);
					JOptionPane.showMessageDialog(null,"record updated sucessfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Error");
				}
				}
		
			});
	
		btnNewButton.setBounds(513, 79, 115, 29);
		contentPane.add(btnNewButton);
		
		textFieldsearch = new JTextField();
		
		textFieldsearch.setBounds(111, 80, 146, 26);
		contentPane.add(textFieldsearch);
		textFieldsearch.setColumns(10);
		
		JButton btnNext = new JButton("next");
		kareena k = new kareena();
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k.setVisible(true);
				
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
		btnNext.setBounds(678, 79, 115, 29);
		contentPane.add(btnNext);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		
		
				 
		
		comboBox.addItem("Physician");
		comboBox.addItem("Gynachologist");
		comboBox.addItem("Surgon");
		comboBox.setSelectedItem(null);
		
		comboBox.setBounds(860, 80, 92, 26);
		contentPane.add(comboBox);
	}
}
