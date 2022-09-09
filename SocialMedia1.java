import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextPane;

@SuppressWarnings({ "serial", "unused" })
public class SocialMedia1 extends JFrame {

	private JPanel contentPane;
	protected Object instagram;
	protected Object facebook;
	protected Object twitter;
	protected Object snapchat;
	private JPanel Twitter;
	private JPanel Shapchat;
	private JPanel Instagram;
	private JPanel Facebook;
	private JLayeredPane layeredPane;
	protected JPanel Snapchat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SocialMedia1 frame = new SocialMedia1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public SocialMedia1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(40, 116, 577, 231);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		Facebook = new JPanel();
		layeredPane.add(Facebook, "name_196690461861800");
		Facebook.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 10, 557, 211);
		Facebook.add(textPane);
		
		Instagram = new JPanel();
		layeredPane.add(Instagram, "name_196692775811600");
		Instagram.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 10, 557, 211);
		Instagram.add(textPane_1);
		
		Shapchat = new JPanel();
		layeredPane.add(Shapchat, "name_196694875656400");
		Shapchat.setLayout(null);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(10, 10, 557, 211);
		Shapchat.add(textPane_2);
		
		Twitter = new JPanel();
		layeredPane.add(Twitter, "name_196696951988200");
		Twitter.setLayout(null);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(10, 10, 557, 211);
		Twitter.add(textPane_3);
		
		JButton btnFacebook = new JButton("Instagram");
		btnFacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Instagram);
			}
		});
		btnFacebook.setBounds(201, 39, 96, 21);
		contentPane.add(btnFacebook);
		
		JButton btnInstagram = new JButton("Facebook");
		btnInstagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Facebook);
			}
		});
		btnInstagram.setBounds(45, 39, 96, 21);
		contentPane.add(btnInstagram);
		
		JButton btnSnapchat = new JButton("Snapchat");
		btnSnapchat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Snapchat);
			}
		});
		btnSnapchat.setBounds(358, 39, 96, 21);
		contentPane.add(btnSnapchat);
		
		JButton btnTwitter = new JButton("Twitter");
		btnTwitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Twitter);
			}
		});
		btnTwitter.setBounds(512, 39, 96, 21);
		contentPane.add(btnTwitter);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(131, 429, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(283, 429, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(438, 429, 85, 21);
		contentPane.add(btnNewButton_2);
	}

	public static TableModel resultSetToTableModel(ResultSet res) {
		return null;
	}
}
