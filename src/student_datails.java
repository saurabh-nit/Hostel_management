import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurabh Mishra
 */
public class student_datails extends javax.swing.JFrame {

    /**
     * Creates new form student_datails
     */
    public student_datails() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        studentname = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        rollno = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        name6 = new javax.swing.JLabel();
        choosefile = new javax.swing.JButton();
        photopath = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        name7 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        date = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 540));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setText("New Student Details");

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Gender :");

        studentname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        studentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnameActionPerformed(evt);
            }
        });

        name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Date of Birth :");

        name2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name2.setText("Branch :");

        name3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name3.setText("Room No :");

        name4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name4.setText("Roll No :");

        name5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("Full Address :");

        branch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });

        rollno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnoActionPerformed(evt);
            }
        });

        roomno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnoActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        name6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name6.setText("Add Photo :");

        choosefile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        choosefile.setText("Choose File");
        choosefile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choosefileMouseClicked(evt);
            }
        });
        choosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosefileActionPerformed(evt);
            }
        });

        photopath.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        photopath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photopathActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        save.setBackground(new java.awt.Color(51, 51, 255));
        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        name7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name7.setText("Name :");

        gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Image should not be more than 200X200 resolution.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(name7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(choosefile)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(photopath, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2)
                    .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choosefile)
                    .addComponent(photopath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnameActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed

    private void rollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnoActionPerformed

    private void roomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnoActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void choosefileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosefileMouseClicked
       new filechooser().setVisible(true);
    }//GEN-LAST:event_choosefileMouseClicked

    private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosefileActionPerformed
        String n1 = studentname.getText();
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        photopath.setText(filename);
       //String NewPath = photopath.getText();        
      /*  try {
              Class.forName("oracle.jdbc.OracleDriver");
              Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","saurabh","mca713209");
              PreparedStatement pst = con.prepareStatement("insert into images values(?)");
             // pst.setString(1,"n1");
              FileInputStream fin=new FileInputStream(NewPath);
              pst.setBinaryStream(1,fin,fin.available());
              int i = pst.executeUpdate();
              con.close();
            } 
        catch (SQLException ex) {
                Logger.getLogger(student_datails.class.getName()).log(Level.SEVERE, null, ex);
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(student_datails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(student_datails.class.getName()).log(Level.SEVERE, null, ex);
        }
      */  
        
        
             
    }//GEN-LAST:event_choosefileActionPerformed

    private void photopathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photopathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photopathActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
    Connection con = null; 
          String n = studentname.getText();
       String roll = rollno.getText();
         String br = branch.getText();
        String gen = gender.getText();
        String add = address.getText();
          int room = Integer.parseInt(roomno.getText());
          
        Date oDate = date.getDate();
     DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
          String d = df.format(oDate);
    String NewPath = photopath.getText();
    
          
         
          
      PreparedStatement pst=null;
        try {
              Class.forName("oracle.jdbc.OracleDriver");
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","saurabh","mca713209");
             
              
              pst = con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?)");
             
             FileInputStream fin=new FileInputStream(NewPath);
             pst.setString(1,roll);
             pst.setString(2,n);
             pst.setString(3,br);
             pst.setString(4,gen);
             pst.setString(5,add);
             pst.setInt(6, room);
             pst.setString(7,d);
             pst.setBinaryStream(8,fin,fin.available());
             int i=pst.executeUpdate();
             con.close();
            }
        catch (SQLException ex)
               {
                ex.printStackTrace();
               } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(student_datails.class.getName()).log(Level.SEVERE, null, ex);
        } 
       catch (FileNotFoundException ex) {
            Logger.getLogger(student_datails.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(student_datails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        setVisible(false);
        new after_login().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        {
         System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       showMessageDialog(null,"Details Added Successfully.");
        
    }//GEN-LAST:event_saveMouseClicked

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
            java.util.logging.Logger.getLogger(student_datails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_datails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_datails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_datails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new student_datails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField branch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton choosefile;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JButton exit;
    private javax.swing.JTextField gender;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JTextField photopath;
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField roomno;
    private javax.swing.JButton save;
    private javax.swing.JTextField studentname;
    // End of variables declaration//GEN-END:variables
}
