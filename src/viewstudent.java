
import static com.sun.deploy.uitoolkit.impl.fx.ui.MixedCodeInSwing.show;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.BLOB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.BLOB;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import oracle.sql.BLOB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh Mishra
 */
public class viewstudent extends javax.swing.JFrame {

    /**
     * Creates new form viewstudent
     */
    public viewstudent() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewlist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        printArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        viewlist.setBackground(new java.awt.Color(85, 187, 85));
        viewlist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewlist.setForeground(new java.awt.Color(148, 117, 110));
        viewlist.setText("View Student List");
        viewlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlistActionPerformed(evt);
            }
        });

        viewtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROLLNUMBER", "NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewtable.getTableHeader().setReorderingAllowed(false);
        viewtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewtable);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 121, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT  DETAILS");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        printArea.setBackground(new java.awt.Color(243, 243, 180));
        printArea.setColumns(20);
        printArea.setFont(new java.awt.Font("Sylfaen", 0, 13)); // NOI18N
        printArea.setRows(5);
        jScrollPane2.setViewportView(printArea);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 21, 11));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(101, 136, 151));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(viewlist, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlistActionPerformed
        DefaultTableModel model = (DefaultTableModel)viewtable.getModel();
         Connection con = null; 
          PreparedStatement pst=null;
          ResultSet rs;
          try{
           Class.forName("oracle.jdbc.OracleDriver");
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","saurabh","mca713209");
              pst = con.prepareStatement("select rollno,sname from students");
              rs=pst.executeQuery();
              while(rs.next())
               {
                String roll = rs.getString("rollno");
                String name = rs.getString("sname");
                
                
                model.addRow(new Object[] {roll ,name});
               }
          } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewlistActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        new after_login().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void viewtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtableMouseClicked
            String data = null;
            if(viewtable.getSelectedRow()!=-1 && viewtable.getSelectedColumn()!=-1)
             {
              data = viewtable.getValueAt(viewtable.getSelectedRow(),viewtable.getSelectedColumn()).toString();
             }
           
              
            //output.setText(data);
             
          
            Connection con =null;
            PreparedStatement pst;
            ResultSet rs;
             
            String roll=null , name=null , dob =null ,br=null, add=null ,sex=null;
            int room = 0;
            BLOB pic = null;
            BufferedInputStream pics = null;
            
           
          try  {
                 Class.forName("oracle.jdbc.OracleDriver");
                 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","saurabh","mca713209");
                 
                 pst = con.prepareStatement("select * from students where rollno='"+data+"'");
                
                rs = pst.executeQuery();
              
                 while(rs.next())
                  {
                   roll = rs.getString("rollno");
                   name = rs.getString("sname");
                     br = rs.getString("branch");
                    sex = rs.getString("gender");
                    add = rs.getString("address");
                   room = rs.getInt("roomnumber");
                    dob = rs.getString("birthdate");
                    pic = (BLOB)rs.getBlob("photograph");
                  }
                 pics=new BufferedInputStream(pic.getBinaryStream());
                 Image raw = ImageIO.read(pics);
                 img.setIcon(new ImageIcon(raw));
                 printArea.setText("Name :\t"+name+"\n\n");
                 printArea.append("Roll Number :\t"+roll+"\n\n");
                 printArea.append("Branch :\t"+br+"\n\n");
                 printArea.append("Gender :\t"+sex+"\n\n");
                 printArea.append("Address :\t"+add+"\n\n");
                 printArea.append("Room Number :"+room+"\n\n");
                 printArea.append("Date of Birth :     "+dob+"\n\n");
                 
          
                } 
       catch(ClassNotFoundException ex)
                {
                  Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
                } 
       catch(SQLException ex)
                {
                 Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) { 
            Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewtableMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         printArea.setText(null);
         img.setSize(0,0);
         DefaultTableModel model = (DefaultTableModel)viewtable.getModel();
         while(model.getRowCount()>0)
         {
          for(int i=0;i<model.getRowCount();i++)
            {
             model.removeRow(i);
            }
         }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String data1 = null;
            if(viewtable.getSelectedRow()!=-1 && viewtable.getSelectedColumn()!=-1)
             {
                 data1 = viewtable.getValueAt(viewtable.getSelectedRow(),viewtable.getSelectedColumn()).toString();
           
                Connection con = null;
                Statement stmt =null;
         
                try {
                Class.forName("oracle.jdbc.OracleDriver");
               con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","saurabh","mca713209");
               stmt = con.createStatement();
               String SQL = "delete from students where rollno = '"+data1+"' ";
               stmt.executeUpdate(SQL);
               
              }
           
           catch (ClassNotFoundException ex)
           {
               Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
           } 
           catch (SQLException ex) {
            Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
           }
        try {
            con.close();
            showMessageDialog(null,"Record has been deleted.");
           } 
        catch (SQLException ex) {
            Logger.getLogger(viewstudent.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
      else
        showMessageDialog(null,"Please select a record.");      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         setVisible(false);
         new Update_Details().setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
    }//GEN-LAST:event_jButton4ActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea printArea;
    private javax.swing.JButton viewlist;
    private javax.swing.JTable viewtable;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
