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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Snapchat extends JFrame {

	protected static final AbstractButton txtsnapchat = null;
	protected static final AbstractButton txtFile = null;
	private JPanel contentPane;
	private JTable table;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Snapchat frame = new Snapchat();
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
	public Snapchat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 98, 307, 91);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"UserName", "Sehir", "TakıpcıSayısı"
			}
		));
		table.setBounds(248, 209, 142, -94);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("                    SNAPCHAT");
		lblNewLabel.setBounds(96, 38, 169, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SocialMedia1 sm1 = new SocialMedia1();
				sm1.snapchat = txtsnapchat.getText();
				
			}
		});
		btnNewButton.setBounds(215, 236, 85, 21);
		contentPane.add(btnNewButton);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"ALI", "MEHMET", "MURAT", "SEVDA", "SEYMA", "BUSE", "GOKCE", "FATIH", "SELIM"}));
		comboBox_2.setBounds(343, 213, 89, 21);
		//contentPane.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1 - 500", "500 - 1K", "1K - 5K", "5K - 50K", "50K - 500K", "500K - 10M", "10M - ......."}));
		comboBox_1.setBounds(387, 101, 71, 21);
		//contentPane.add(comboBox_1);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Istanbul", "Ankara", "Bursa", "Izm\u0131t", "Eskisehir", "Adana", "Urfa", "Gaziantep", "Mardin", "Izmir"}));
		comboBox.setBounds(354, 124, 93, 21);
		//contentPane.add(comboBox);
		
		table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(comboBox_2));	
		table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(comboBox));	
		table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(comboBox_1));
	
	
	}

	protected void writeFile(String text, SocialMedia1 sm1) {
		// TODO Auto-generated method stub
		
	}

	public static JTable getColumnModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
