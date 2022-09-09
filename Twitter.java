import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

@SuppressWarnings({ "serial", "unused" })
public class Twitter extends JFrame {

	protected static final AbstractButton txttwitter = null;
	protected static final AbstractButton txtFile = null;
	private JPanel contentPane;
	private JTable table;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Twitter frame = new Twitter();
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
	public Twitter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(110, 86, 423, 128);
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
		table.setBounds(244, 97, 129, 134);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ALI", "MEHMET", "MURAT", "SEVDA", "SEYMA", "BUSE", "GOKCE", "FATIH", "SELIM"}));
		comboBox.setBounds(76, 227, 92, 21);
		//contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Istanbul", "Ankara", "Bursa", "Izm\u0131t", "Eskisehir", "Adana", "Urfa", "Gaziantep", "Mardin", "Izmir"}));
		comboBox_1.setBounds(76, 258, 92, 21);
		//contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1 - 500", "500 - 1K", "1K - 5K", "5K - 50K", "50K - 500K", "500K - 10M", "10M - ......."}));
		comboBox_2.setBounds(76, 289, 92, 21);
		//contentPane.add(comboBox_2);
		
		btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SocialMedia1 sm1 = new SocialMedia1();
				sm1.twitter = txttwitter.getText();
				
			}
		});
		btnNewButton.setBounds(344, 258, 85, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("TWITTER");
		lblNewLabel.setBounds(255, 35, 55, 13);
		contentPane.add(lblNewLabel);
		
		
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
