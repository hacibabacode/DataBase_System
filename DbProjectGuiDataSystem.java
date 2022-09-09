import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;







@SuppressWarnings({ "serial", "unused" })
public class DbProjectGuiDataSystem extends javax.swing.JFrame {
  private static final JTextField chckbx = null;
private static final JTextField chckbx1 = null;
private static final JTextField chckbx2 = null;
private static final JTextField chckbx3 = null;
protected Connection conn = null; //Bağlantı nesnemiz
    protected Statement command = null;// Komut nesnemiz
    protected String url = "jdbc:mysql://localhost:3306/";//veritabanının adresi ve portu
    protected String dbName = "test"; //veritabanının ismi   
    protected String driver = "com.mysql.jdbc.Driver";//MySQL-Java bağlantısını sağlayan JDBC sürücüsü
    protected String userName = "root"; //veritabanı için kullanıcı adı
    protected String password = ""; //kullanıcı şifresi
    protected ResultSet res; // sorgulardan dönecek kayıtlar (sonuç kümesi) bu nesne içerisinde tutulacak
    private PreparedStatement Statement1;
    /**
     * Creates new form DbProjectGui
     */
    public DbProjectGuiDataSystem() {
        initComponents();
    }
@SuppressWarnings("deprecation")
private void baglantiAc() throws Exception {

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url + dbName, userName, password);//bağlantı açılıyor       
        command = conn.createStatement();
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldLName = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jButtonFetchData = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButton2Update = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1 - 500", "500 - 1K", "1K - 5K", "5K - 50K", "50K - 500K", "500K - 10M", "10M - ......."}));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Instagram", "Facebook", "Snapchat", "Twitter"
            }
        ));
      //  Facebook.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(chckbx));	
	//	Instagram.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(chckbx1));	
	//	Snapchat.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(chckbx2));
	//	Twitter.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(chckbx3));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
                
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Name:");

        jLabel3.setText("LName:");

        jLabel4.setText("UserName:");

        jLabel5.setText("followers:");

        jTextFieldLName.setToolTipText("");

        jButtonFetchData.setText("Social Media");
        jButtonFetchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFetchDataActionPerformed(evt);
            }
        });

        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButton2Update.setText("Update");
        jButton2Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2UpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        
        JCheckBox chckbx = new JCheckBox("Yes");
        
        JCheckBox chckbx1 = new JCheckBox("Yes");
        
        JCheckBox chckbx2 = new JCheckBox("Yes");
        
        JCheckBox chckbx3 = new JCheckBox("Yes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel4)
        								.addComponent(jLabel3))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextFieldAge)
        								.addComponent(jTextFieldLName, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        								.addComponent(jTextFieldName, Alignment.TRAILING)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel5)
        							.addGap(18)
        							.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(chckbx, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        						.addComponent(chckbx1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        						.addComponent(chckbx2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        						.addComponent(chckbx3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        					.addGap(67)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton2Update, Alignment.TRAILING)
        						.addComponent(jButtonInsert)
        						.addComponent(jButtonDelete))))
        			.addGap(66)
        			.addComponent(jButtonFetchData)
        			.addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonFetchData))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(11)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButtonInsert)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButton2Update)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButtonDelete))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel2)
        								.addComponent(jTextFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel3)
        								.addComponent(jTextFieldLName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel4)
        								.addComponent(jTextFieldAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel5)
        								.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(chckbx)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(chckbx1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(chckbx2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(chckbx3)))
        			.addContainerGap(58, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFetchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchDataActionPerformed
        filltable();
    }//GEN-LAST:event_jButtonFetchDataActionPerformed
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        String select = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        try {
            baglantiAc();
        } catch (Exception ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
              
           Statement1 = conn.prepareStatement("select * from people where id=?");
           Statement1.setString(1, select);
           ResultSet res1 = Statement1.executeQuery();
             if (res1.next()) {
                    jTextFieldName.setText(res1.getString("name"));
                    jTextFieldLName.setText(res1.getString("Lname"));
                    jTextFieldAge.setText(res1.getString("UserName"));
                    if (res1.getInt("followers")==0) {
                     jComboBox1.setSelectedItem("1 - 500\r\n" + 
                     		"500 - 1K\r\n" + 
                     		"1K - 5K\r\n" + 
                     		"5K - 50K\r\n" + 
                     		"50K - 500K\r\n" + 
                     		"500K - 10M\r\n" + 
                     		"10M - .......");
                 }
             }
        } catch (SQLException ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
                  try {
            baglantiAc();
        } catch (Exception ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           String select = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
           Statement1 = conn.prepareStatement("DELETE FROM test.people WHERE id=?");
           Statement1.setString(1, select);
           Statement1.execute();
        } catch (Exception ex) {
 String Error="Row is not selected for deleting operation.Please select data on the table.";
JOptionPane.showMessageDialog(null,Error);
        }
        filltable();
        jTextFieldName.setText("");
        jTextFieldLName.setText("");
        jTextFieldAge.setText("");
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton2UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2UpdateActionPerformed
            try {
                
            baglantiAc();
        } catch (Exception ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //burada tablodan seçilen değerin değerini string olarak aldık.
           String select = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
           Statement1 = conn.prepareStatement("Update people SET name=?,Lname=?,UserName=?,followers=? where id=?");
           // burada sql e join yapmak için parametre yolladık. (id)
           Statement1.setString(5, select);
           Statement1.setString(1, jTextFieldName.getText());
           Statement1.setString(2, jTextFieldLName.getText());
           Statement1.setString(3, jTextFieldAge.getText());
           int comboboxselectedindex = jComboBox1.getSelectedIndex();
           Statement1.setString(4, String.valueOf(comboboxselectedindex));
           Statement1.execute();
        } catch (Exception ex) {
             String Error="Data is not selected for updating operation.Please select data on the table.";
JOptionPane.showMessageDialog(null,Error);
        }   
                filltable();
        
        
    }//GEN-LAST:event_jButton2UpdateActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
 try {
            baglantiAc();
        } catch (Exception ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           Statement1 = conn.prepareStatement("INSERT INTO people (`ID`, `name`, `Lname`, `UserName`, `followers`) VALUES (NULL,?,?,?,?)");
          // sql ifadesine parametreleri ekliyoruz.
           Statement1.setString(1, jTextFieldName.getText());
           Statement1.setString(2, jTextFieldLName.getText());
           Statement1.setString(3, jTextFieldAge.getText());
           int comboboxselectedindex = jComboBox1.getSelectedIndex();
           Statement1.setString(4, String.valueOf(comboboxselectedindex));
           Statement1.execute();
        }catch (Exception ex) {
 String Error="Please Fill empty TextField area.";
JOptionPane.showMessageDialog(null,Error);
        }  
        
                filltable();
    
    }//GEN-LAST:event_jButtonInsertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbProjectGuiDataSystem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Update;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonFetchData;
    private javax.swing.JButton jButtonInsert;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldLName;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    private void filltable() { 
    try {
            baglantiAc();
        } catch (Exception ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            res = command.executeQuery("select * from people");
        } catch (SQLException ex) {
            Logger.getLogger(DbProjectGuiDataSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                 jTable1.setModel(SocialMedia1.resultSetToTableModel(res));
    }
}
