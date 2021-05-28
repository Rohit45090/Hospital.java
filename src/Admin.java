//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

public class Admin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		receptionist r1=new receptionist();
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				r1.setVisible(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\logo receptionist.jpg"));
		lblNewLabel.setBounds(648, 20, 315, 231);
		contentPane.add(lblNewLabel);
		doctor2 d2=new doctor2();
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				d2.setVisible(true);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\doctor32.jpg"));
		lblNewLabel_1.setBounds(364, 20, 225, 231);
		contentPane.add(lblNewLabel_1);
		patient2 p3=new patient2();
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				p3.setVisible(true);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\patient.jpg"));
		lblNewLabel_2.setBounds(358, 440, 217, 224);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADMIN PORTAL");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_3.setBounds(15, 16, 308, 87);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DOCTOR PORTAL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(368, 279, 209, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblReceptionistPortal = new JLabel("RECEPTIONIST PORTAL");
		lblReceptionistPortal.setForeground(Color.BLACK);
		lblReceptionistPortal.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblReceptionistPortal.setBounds(670, 279, 361, 20);
		contentPane.add(lblReceptionistPortal);
		
		JLabel lblPatientPortal = new JLabel("PATIENT PORTAL");
		lblPatientPortal.setForeground(Color.BLACK);
		lblPatientPortal.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPatientPortal.setBounds(333, 691, 290, 20);
		contentPane.add(lblPatientPortal);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP !\\Downloads\\background img.jpg"));
		lblNewLabel_5.setBounds(0, 0, 978, 744);
		contentPane.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 6), null));
		panel.setBounds(0, 0, 978, 744);
		contentPane.add(panel);
	}
}
