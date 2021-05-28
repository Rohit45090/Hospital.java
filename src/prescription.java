//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
//import java.awt.TextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class prescription extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JLabel lblQuantity;
	private JLabel lblPrice;
	private JLabel lblGst;
	JTextField textField;
	private JLabel lblTotalBill;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextArea txtrMorning;
	private JTextField textField_3;
	private JTextField textField_5;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField txtPriscription;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prescription frame = new prescription();
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
	public prescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 1043, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\download6.jpg"));
		lblNewLabel_1.setBounds(0, 0, 232, 176);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 211, 141, 44);
		contentPane.add(lblNewLabel_2);
		
		lblQuantity = new JLabel("tablet");
		lblQuantity.setForeground(new Color(0, 0, 128));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuantity.setBounds(27, 294, 141, 44);
		contentPane.add(lblQuantity);
		
		lblPrice = new JLabel("Morning");
		lblPrice.setForeground(new Color(0, 0, 128));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(27, 383, 141, 44);
		contentPane.add(lblPrice);
		
		lblGst = new JLabel("Night");
		lblGst.setForeground(new Color(0, 0, 128));
		lblGst.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGst.setBounds(27, 473, 141, 44);
		contentPane.add(lblGst);
		
		textField = new JTextField();
		textField.setBounds(171, 213, 172, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblTotalBill = new JLabel("Total");
		lblTotalBill.setForeground(new Color(0, 0, 128));
		lblTotalBill.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalBill.setBounds(27, 556, 141, 44);
		contentPane.add(lblTotalBill);
		
		textField_1 = new JTextField();
		
			
		textField_1.setBounds(171, 302, 146, 44);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String Quantity=textField_2.getText();
				int length = Quantity.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<=3) {
						textField_2.setEditable(true);
					}
					else
					{
						textField_2.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField_2.setEditable(true);
					}
					else
					{
						textField_2.setEditable(false);
					}
				
				}
			}
		});
		
		textField_2.setColumns(10);
		textField_2.setBounds(171, 389, 146, 37);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String Quantity=textField_4.getText();
				int length = Quantity.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<=3) {
						textField_4.setEditable(true);
					}
					else
					{
						textField_4.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField_4.setEditable(true);
					}
					else
					{
						textField_4.setEditable(false);
					}
			}
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(171, 562, 146, 37);
		contentPane.add(textField_4);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_2.setBounds(446, 107, 566, 621);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtrMorning = new JTextArea();
		txtrMorning.setForeground(new Color(0, 0, 128));
		txtrMorning.setBounds(6, 0, 554, 610);
		panel_2.add(txtrMorning);
		txtrMorning.setText(" Name       Morning        Night        total");
		txtrMorning.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		textField_3 = new JTextField();
		textField_3.setBounds(663, 410, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(-11, 0, 1043, 760);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String Quantity=textField_5.getText();
				int length = Quantity.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<=3) {
						textField_5.setEditable(true);
					}
					else
					{
						textField_5.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField_5.setEditable(true);
					}
					else
					{
						textField_5.setEditable(false);
					}
			}
			}
		});
		textField_5.setBounds(183, 476, 146, 39);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(298, 659, 141, 52);
		panel.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField_5.setText(null);
				textField_4.setText(null);
				textField.setText(null);
				//txtrMorning.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.setBounds(58, 659, 141, 52);
		panel.add(btnNewButton);
		//bill b =new bill();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//b.setVisible(true);
				//String a= textField.getText();
				String b= textField_1.getText();
				String f= textField_2.getText();
			
			//	String d= comboBox.getSelectedItem();
				String e= textField_4.getText();
				String e1= textField_5.getText();
				
	//	txtrMorning.setText("****************************************************************************************************************"+"\n");
		txtrMorning.setText(txtrMorning.getText()+"\n"+"\n");
		txtrMorning.setText(txtrMorning.getText()+ "\n");
		txtrMorning.setText(txtrMorning.getText() +b+"\t"+"\t"+f+"\t"+"\t"+ e1+"\t"+ e+"\n");
		
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(464, 141, 552, 586);
		panel.add(panel_1);
		
		txtPriscription = new JTextField();
		txtPriscription.setBackground(new Color(135, 206, 235));
		txtPriscription.setText("             PRESCRIPTION");
		txtPriscription.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		txtPriscription.setForeground(new Color(0, 0, 128));
		txtPriscription.setBounds(232, 0, 796, 99);
		panel.add(txtPriscription);
		txtPriscription.setColumns(10);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP !\\Pictures\\DOCTOR43.jpg"));
		lblNewLabel_4.setBounds(0, 0, 1043, 744);
		panel.add(lblNewLabel_4);
	}
}
