/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.view;

import com.storage.control.ClientTrs;
import com.storage.control.MyException;
import com.storage.model.Client;
import java.awt.Frame;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Díaz
 */
public class frmClientt extends javax.swing.JFrame {
    
    private ClientTrs ctrs = new ClientTrs();
    private List<Client> clients = ctrs.read();
    
    private void loadTable() {
        Object[] colum = {"ID", "First Name", "Last Name", "Password", "E-mail"};
        DefaultTableModel model = new DefaultTableModel(colum, 0);
        for (Client c : clients) {
            String id = c.getId();
            String fn = c.getFirstName();
            String ln = c.getLastName();
            String pass = c.getPassword();
            String mail = c.getEmail();
            Object[] row = {id, fn, ln, pass, mail};
            model.addRow(row);
        }
        this.rSTableMetro1.setModel(model);
    }

    /**
     * Creates new form frmClientt
     */
    public frmClientt() {
        initComponents();
        setLocationRelativeTo(this);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jFirst = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLast = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPass = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        rSButtonRiple4 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clients");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 51, 77));

        rSButton1.setBackground(new java.awt.Color(25, 51, 77));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/exit.png"))); // NOI18N
        rSButton1.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton1MouseExited(evt);
            }
        });
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        rSButton2.setBackground(new java.awt.Color(25, 51, 77));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/minus.png"))); // NOI18N
        rSButton2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton2MouseExited(evt);
            }
        });
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });

        rSButton4.setBackground(new java.awt.Color(25, 51, 77));
        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/back.png"))); // NOI18N
        rSButton4.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton4MouseExited(evt);
            }
        });
        rSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 924, Short.MAX_VALUE)
                .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(25, 51, 77));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setEnabled(false);
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 690, 460));

        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jID.setBackground(new java.awt.Color(255, 255, 255));
        jID.setForeground(new java.awt.Color(102, 102, 102));
        jID.setBorder(null);
        jPanel1.add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 160, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 160, 10));

        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 20, -1));

        jFirst.setBackground(new java.awt.Color(255, 255, 255));
        jFirst.setForeground(new java.awt.Color(102, 102, 102));
        jFirst.setBorder(null);
        jPanel1.add(jFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 10));

        jLast.setBackground(new java.awt.Color(255, 255, 255));
        jLast.setForeground(new java.awt.Color(102, 102, 102));
        jLast.setBorder(null);
        jPanel1.add(jLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, 10));

        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        jPass.setBackground(new java.awt.Color(255, 255, 255));
        jPass.setForeground(new java.awt.Color(102, 102, 102));
        jPass.setBorder(null);
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, -1));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 160, 10));

        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, -1));

        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 70, -1));

        jEmail.setBackground(new java.awt.Color(255, 255, 255));
        jEmail.setForeground(new java.awt.Color(102, 102, 102));
        jEmail.setBorder(null);
        jPanel1.add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 160, -1));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 160, 10));

        rSButtonRiple2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/delete2.png"))); // NOI18N
        rSButtonRiple2.setText("Delete");
        rSButtonRiple2.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple2.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple2.setIconTextGap(30);
        rSButtonRiple2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple2MouseExited(evt);
            }
        });
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, -1));

        rSButtonRiple3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/add.png"))); // NOI18N
        rSButtonRiple3.setText("Add");
        rSButtonRiple3.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple3.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple3.setIconTextGap(30);
        rSButtonRiple3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple3MouseExited(evt);
            }
        });
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 170, -1));

        rSButtonRiple4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/up2.png"))); // NOI18N
        rSButtonRiple4.setText("Uptade");
        rSButtonRiple4.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple4.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple4.setIconTextGap(30);
        rSButtonRiple4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple4MouseExited(evt);
            }
        });
        rSButtonRiple4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton1MouseEntered
        // TODO add your handling code here:
        rSButton1.setIcon(new ImageIcon("img\\close2.png"));
    }//GEN-LAST:event_rSButton1MouseEntered

    private void rSButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton1MouseExited
        // TODO add your handling code here:
        rSButton1.setIcon(new ImageIcon("img\\exit.png"));
    }//GEN-LAST:event_rSButton1MouseExited

    private void rSButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton2MouseEntered
        // TODO add your handling code here:
        rSButton2.setIcon(new ImageIcon("img\\min2.png"));
    }//GEN-LAST:event_rSButton2MouseEntered

    private void rSButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton2MouseExited
        // TODO add your handling code here:
        rSButton2.setIcon(new ImageIcon("img\\minus.png"));
    }//GEN-LAST:event_rSButton2MouseExited

    private void rSButtonRiple3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple3MouseEntered
        // TODO add your handling code here:
        rSButtonRiple3.setIcon(new ImageIcon("img\\add2.png"));
    }//GEN-LAST:event_rSButtonRiple3MouseEntered

    private void rSButtonRiple3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple3MouseExited
        // TODO add your handling code here:
        rSButtonRiple3.setIcon(new ImageIcon("img\\add.png"));
    }//GEN-LAST:event_rSButtonRiple3MouseExited

    private void rSButtonRiple4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple4MouseEntered
        // TODO add your handling code here:
        rSButtonRiple4.setIcon(new ImageIcon("img\\up.png"));
    }//GEN-LAST:event_rSButtonRiple4MouseEntered

    private void rSButtonRiple4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple4MouseExited
        // TODO add your handling code here:
        rSButtonRiple4.setIcon(new ImageIcon("img\\up2.png"));
    }//GEN-LAST:event_rSButtonRiple4MouseExited

    private void rSButtonRiple2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple2MouseEntered
        // TODO add your handling code here:
        rSButtonRiple2.setIcon(new ImageIcon("img\\delete.png"));
    }//GEN-LAST:event_rSButtonRiple2MouseEntered

    private void rSButtonRiple2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple2MouseExited
        // TODO add your handling code here:
        rSButtonRiple2.setIcon(new ImageIcon("img\\delete2.png"));
    }//GEN-LAST:event_rSButtonRiple2MouseExited

    private void rSButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton4MouseEntered
        // TODO add your handling code here:
        rSButton4.setIcon(new ImageIcon("img\\back2.png"));
    }//GEN-LAST:event_rSButton4MouseEntered

    private void rSButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton4MouseExited
        // TODO add your handling code here:
        rSButton4.setIcon(new ImageIcon("img\\back.png"));
    }//GEN-LAST:event_rSButton4MouseExited

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        // TODO add your handling code here:
        if (!(jID.getText().isEmpty() | jLast.getText().isEmpty() | jFirst.getText().isEmpty() | jEmail.getText().isEmpty()
                | jPass.getText().isEmpty())) {
            try {
                ctrs.create(new Client(jID.getText(), jFirst.getText(), jLast.getText(), jPass.getText(), jEmail.getText()));
                jID.setText(null);
                jLast.setText(null);
                jFirst.setText(null);
                jEmail.setText(null);
                jPass.setText(null);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, false, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Please, complete all fields.").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void rSButtonRiple4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple4ActionPerformed
        // TODO add your handling code here:
        if (!(jID.getText().isEmpty() | jEmail.getText().isEmpty())) {
            try {
                ctrs.update(new Client(jID.getText(), ctrs.searchClientByID(jID.getText()).getFirstName(),
                        ctrs.searchClientByID(jID.getText()).getLastName(), jPass.getText(), jEmail.getText()));
                jID.setText(null);
                jEmail.setText(null);
                jPass.setText(null);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, false, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Complete the field of the id you are going \nto update, along with your password or email.")
                    .setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple4ActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        // TODO add your handling code here:
        if (!(jID.getText().isEmpty())) {
            try {
                ctrs.delete(new Client(jID.getText(), null, null, null, "abcdef@hhhhot.com"));
                jID.setText(null);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, true, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Enter the id you want to delete").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAdmin().setVisible(true);
    }//GEN-LAST:event_rSButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmClientt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jFirst;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jLast;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSButtonRiple rSButtonRiple4;
    private rojerusan.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
