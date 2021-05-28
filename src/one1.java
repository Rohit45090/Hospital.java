//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class one1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	@SuppressWarnings("unused")
	private JTextComponent textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					one1 frame = new one1();
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
	public one1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 128));
		textArea.setBounds(404, 102, 363, 339);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(149, 166, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 255, 146, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(149, 343, 146, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("qty");
		lblNewLabel.setBounds(56, 169, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrice = new JLabel("price");
		lblPrice.setBounds(56, 258, 69, 20);
		contentPane.add(lblPrice);
		
		JLabel lblAmount = new JLabel("amount");
		lblAmount.setBounds(56, 346, 69, 20);
		contentPane.add(lblAmount);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textField.getText();
				int a=Integer.parseInt(s);
			
				int b=a*200;
			String a1=String.valueOf(+b);
			textField_2.setText(a1);
				
				
			}

			@SuppressWarnings("unused")
			private void valueOf(int i) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(68, 433, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnPrint = new JButton("print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c = textField.getText();
				String d = textField_2.getText();
				textArea.setText((textArea.getText() +  "************************************************************************"        ));
				textArea.setText((textArea.getText()    + "\n"  ));
				textArea.setText((textArea.getText() +  "\t"        ));
				textArea.setText((textArea.getText()    + "BILL RECEIPT"  ));
				textArea.setText((textArea.getText()    + "\n"  ));
				textArea.setText((textArea.getText() +  "************************************************************************" ));
				textArea.setText((textArea.getText()    + "\n"  ));
				textArea.setText((textArea.getText() +  "\t"        ));
				textArea.setText((textArea.getText()    +"qty :"+"\t"+ c +  "\n"  ));
				textArea.setText((textArea.getText()    + "\n"  ));
				textArea.setText((textArea.getText()    + "\n"  ));
				textArea.setText((textArea.getText() +  "\t"        ));
				textArea.setText((textArea.getText()    +"amount :" +"\t"+ d +  "\n"  ));
				
			}
		});
		btnPrint.setBounds(223, 433, 115, 29);
		contentPane.add(btnPrint);
		
		
		
	}
}
