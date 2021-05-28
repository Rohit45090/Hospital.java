//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
//import java.awt.TextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class medical extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMedicalBill;
	private JLabel lblNewLabel_2;
	private JLabel lblQuantity;
	private JLabel lblPrice;
	private JLabel lblGst;
	private JTextField textField;
	private JLabel lblTotalBill;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextArea textArea;
	private JTextField textField_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medical frame = new medical();
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
	public medical() {
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
		
		txtMedicalBill = new JTextField();
		txtMedicalBill.setFont(new Font("Tahoma", Font.BOLD, 31));
		txtMedicalBill.setForeground(SystemColor.text);
		txtMedicalBill.setText("                               Medical bill");
		txtMedicalBill.setBackground(SystemColor.textHighlight);
		txtMedicalBill.setBounds(219, 0, 802, 96);
		contentPane.add(txtMedicalBill);
		txtMedicalBill.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Tablet Name");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 211, 141, 44);
		contentPane.add(lblNewLabel_2);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(SystemColor.textHighlight); 
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuantity.setBounds(27, 294, 141, 44);
		contentPane.add(lblQuantity);
		
		lblPrice = new JLabel("Price");
		lblPrice.setForeground(SystemColor.textHighlight);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(27, 383, 141, 44);
		contentPane.add(lblPrice);
		
		lblGst = new JLabel("GST");
		lblGst.setForeground(SystemColor.textHighlight);
		lblGst.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGst.setBounds(27, 473, 141, 44);
		contentPane.add(lblGst);
		
		textField = new JTextField();
		textField.setBounds(171, 213, 172, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblTotalBill = new JLabel("Total");
		lblTotalBill.setForeground(SystemColor.textHighlight);
		lblTotalBill.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalBill.setBounds(27, 556, 141, 44);
		contentPane.add(lblTotalBill);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			
			
			@Override
			public void keyPressed(KeyEvent evt) {
				String Quantity=textField_1.getText();
				int length = Quantity.length();
				//char c= evt.getKeyChar();
				
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<4) {
						textField_1.setEditable(true);
					}
					else
					{
						textField_1.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField_1.setEditable(true);
					}
					else
					{
						textField_1.setEditable(false);
					}
				}
			//	if(Character.isLetter(c)) {
				//	textField.setEditable(false);
					//Label.setText("please enter number only");
				//}
			//	else
				//{
			//		textField.setEditable(true);
				//}
			
	
			
			}
		});
		textField_1.setBounds(171, 302, 146, 32);
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
		textField_4.setColumns(10);
		textField_4.setBounds(171, 562, 146, 37);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("PRINT");
		//bill b =new bill();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//b.setVisible(true);
				String a= textField.getText();
				String b= textField_1.getText();
				String f= textField_2.getText();
			
			//	String d= comboBox.getSelectedItem();
				String e= textField_4.getText();
				
		textArea.setText("****************************************************************************************************************"+"\n");
		textArea.setText(textArea.getText()+ "\t"+"\t"+"MEDICAL RECEIPT "+"\n"+"********************************************************************************************************************"+"\n"+"\n");
		textArea.setText(textArea.getText()+ "\t"+"TABLET NAME   :     "+a+"\t"+"\t"+""+"\n"+"\n");
		textArea.setText(textArea.getText()+ "\t"+"QUANTITY      :     "+b+"\t"+"\t"+""+"\n"+"\n");
		textArea.setText(textArea.getText()+ "\t"+"PRICE         :     "+f+"\t"+"\t"+""+"\n"+"\n");
	//	textArea.setText(textArea.getText()+ "\t"+"GST                    :     "+d+"\t"+"\t"+""+"\n"+"\n");
		textArea.setText(textArea.getText()+ "\t"+"BILL          :     "+e+"\t"+"\t"+""+"\n"+"\n");
		
		
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(0, 676, 141, 52);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(null);
				textField_2.setText(null);
				//c.setEditable(false);
				textField_4.setText(null);
				textField.setText(null);
				textArea.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnClear.setBounds(309, 676, 141, 52);
		contentPane.add(btnClear);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("0%");
		
		
		comboBox.addItem("10%");
		comboBox.addItem("20%");
	
		comboBox.setSelectedItem(null);
		
		comboBox.setBounds(171, 481, 146, 32);
		contentPane.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 24));
		textArea.setBounds(452, 140, 554, 588);
		contentPane.add(textArea);
		
		textField_3 = new JTextField();
		textField_3.setBounds(663, 410, 146, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(-12, 0, 1043, 760);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(464, 5, 115, 29);
		panel.add(btnNewButton_1);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textField_1.getText();
				int a=Integer.parseInt(s);
				String s3=textField_2.getText();
				int b=Integer.parseInt(s3);
			
				int s1=a*b;
			String a1=String.valueOf(s1);
			textField_4.setText(a1);
			}

			@SuppressWarnings("unused")
			private String valueof(int res) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnTotal.setBounds(171, 675, 141, 52);
		panel.add(btnTotal);
	}
}
