import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

@SuppressWarnings({ "serial", "unused" })
public class Instagram extends JFrame {

	protected static final AbstractButton txtinstagran = null;
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
	private JLabel lblI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instagram frame = new Instagram();
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
	public Instagram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 68, 326, 128);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"UserName", "Şehir", "Takipci Sayisi"
			}
		));
		table.setBounds(242, 79, 184, 154);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ALI", "MEHMET", "MURAT", "SEVDA", "SEYMA", "BUSE", "GOKCE", "FATIH", "SELIM"}));
		comboBox.setBounds(48, 206, 83, 21);
		//contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Istanbul", "Ankara", "Bursa", "Izm\u0131t", "Eskisehir", "Adana", "Urfa", "Gaziantep", "Mardin", "Izmir"}));
		comboBox_1.setBounds(48, 232, 83, 21);
		//contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1 - 500", "500 - 1K", "1K - 5K", "5K - 50K", "50K - 500K", "500K - 10M", "10M - ......."}));
		comboBox_2.setBounds(48, 263, 83, 21);
		//contentPane.add(comboBox_2);
		
		btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SocialMedia1 sm1 = new SocialMedia1();
				sm1.instagram = txtinstagran.getText();
				
			}
		});
		btnNewButton.setBounds(232, 232, 85, 21);
		contentPane.add(btnNewButton);
		
		lblI = new JLabel("INSTAGRAM");
		lblI.setBounds(166, 31, 67, 21);
		contentPane.add(lblI);
		
		
		
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
