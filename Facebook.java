import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

@SuppressWarnings({ "serial", "unused" })
public class Facebook extends JFrame {

	protected static final AbstractButton txtFile = null;
	protected static final AbstractButton txtfacebook = null;
	protected static final Component sm1 = null;
	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facebook frame = new Facebook();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Facebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 700, 235);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"UserName", "Sehir", "TakipciSayisi"
			}
		));
		table.setBounds(313, 222, 97, -91);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				SocialMedia1 sm1 = new SocialMedia1();
				sm1.facebook = txtfacebook.getText();
				//sm. = txtSurname.getText();
				//sm.age = Integer.parseInt(txtAge.getText());
				//sm.department = txtDept.getText();
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(347, 403, 85, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("                          FACEBOOK");
		lblNewLabel.setBounds(238, 48, 180, 36);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ALI", "MEHMET", "MURAT", "SEVDA", "SEYMA", "BUSE", "GOKCE", "FATIH", "SELIM"}));
		comboBox.setBounds(64, 403, 85, 21);
		//contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Istanbul", "Ankara", "Bursa", "Izm\u0131t", "Eskisehir", "Adana", "Urfa", "Gaziantep", "Mardin", "Izmir"}));
		comboBox_1.setBounds(64, 434, 85, 21);
		//contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1 - 500", "500 - 1K", "1K - 5K", "5K - 50K", "50K - 500K", "500K - 10M", "10M - ......."}));
		comboBox_2.setBounds(63, 460, 86, 21);
		//contentPane.add(comboBox_2);
		
		table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(comboBox_2));	
		table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(comboBox));	
		table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(comboBox_1));
	
	}

	protected void writeFile(String text, SocialMedia1 sm1) {
		// TODO Auto-generated method stub
		
	}

	public static JTable getColumnModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
