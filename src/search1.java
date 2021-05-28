//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.JTableHeader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
//import javax.swing.border.LineBorder;
//simport java.awt.Color;
import javax.swing.table.DefaultTableModel;
//import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;

//import net.proteamit.sql.DbUtils;
public class search1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search1 frame = new search1();
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
	public search1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 750, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VIEW DOCTOR");
		btnNewButton.setBackground(SystemColor.blue);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
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
				DefaultTableModel tblModel = (DefaultTableModel)t1.getModel();
				tblModel.addRow(tbData);
				}
			}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton.setBounds(186, 84, 252, 46);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 146, 728, 624);
		contentPane.add(scrollPane);
		
		t1 = new JTable();
		
		t1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		t1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DOCTORID", "NAME", "LASTNAME", "AGE", "SPECIALISATION"
			}
		));
		t1.getColumnModel().getColumn(0).setPreferredWidth(66);
		t1.getColumnModel().getColumn(2).setPreferredWidth(96);
		t1.getColumnModel().getColumn(4).setPreferredWidth(151);
		scrollPane.setViewportView(t1);
		t1.setRowHeight(30);
		JTableHeader header = t1.getTableHeader();
		header.setFont(new Font("Dialog",Font.BOLD,20));
		header.setForeground(Color.blue);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\doctor.jpg"));
		lblNewLabel.setBounds(0, 0, 146, 143);
		contentPane.add(lblNewLabel);
		
		JButton btnClearRecord = new JButton("CLEAR RECORD");
		btnClearRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel dm = (DefaultTableModel)t1.getModel();
				while(dm.getRowCount() > 0)
				{
				    dm.removeRow(0);
				}
				
			}
				
	
		});
		btnClearRecord.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClearRecord.setBackground(Color.blue);
		btnClearRecord.setForeground(Color.WHITE);
		btnClearRecord.setBounds(448, 84, 237, 46);
		contentPane.add(btnClearRecord);
		
	}
}
