import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;

public class toy3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel NewLabel_1;
	private JLabel Label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toy3 frame = new toy3();
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
	public toy3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				String phonenumber=textField.getText();
			//	char c=evt.getKeyChar();
				int length =phonenumber.length();
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
				{
					if(length<10) {
						textField.setEditable(true);
					}
					else
					{
						textField.setEditable(false);
					}
				}
				else
				{
					if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE  )
					{
						textField.setEditable(true);
					}
					else
					{
						textField.setEditable(false);
					}
				}
			//	if(Character.isLetter(c)) {
				//	textField.setEditable(false);
					Label.setText("please enter number only");
				//}
			//	else
				//{
			//		textField.setEditable(true);
				//}
			}
		});
			
		textField.setBounds(229, 58, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("phone no");
		lblNewLabel.setBounds(134, 61, 69, 20);
		contentPane.add(lblNewLabel);
		
		NewLabel_1 = new JLabel("");
		NewLabel_1.setBounds(220, 88, 120, 20);
		contentPane.add(NewLabel_1);
		
		Label = new JLabel("New label");
		Label.setBounds(239, 100, 148, 20);
		contentPane.add(Label);
	}
}
