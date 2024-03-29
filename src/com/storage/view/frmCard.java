/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.view;

import com.storage.control.ClientTrs;
import com.storage.control.MyException;
import com.storage.model.Client;
import com.storage.model.StoreCard;
import java.awt.Frame;
import java.time.LocalDate;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Díaz
 */
public class frmCard extends javax.swing.JFrame {

    private ClientTrs ctrs = new ClientTrs();
    private List<Client> clients = ctrs.read();

    private void loadTable() {
        Object[] column = {"ID", "Code", "Cash", "Expiration Date", "Opening Date", "First Name", "ID Client"};
        DefaultTableModel model = new DefaultTableModel(column, 0);
        for (Client c : clients) {
            if (c.getStoreCard() != null) {
                String id = c.getStoreCard().getId();
                double cash = c.getStoreCard().getCash();
                String code = c.getStoreCard().getCode();
                LocalDate od = c.getStoreCard().getOpeningDate();
                LocalDate ed = c.getStoreCard().getExpirationDate();
                String nc = c.getLastName();
                String idc = c.getId();
                Object[] rows = {id, code, cash, od, ed, nc, idc};
                model.addRow(rows);
            } else {
                Object[] rows = {"empty", "empty", "empty", "empty", "empty", c.getFirstName(), c.getId()};
                model.addRow(rows);
            }
        }
        this.rSTableMetro1.setModel(model);
    }

    /**
     * Creates new form frmCard
     */
    public frmCard() {
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
        rSButton3 = new rojeru_san.RSButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        jPass = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jCash = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jIDc = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1150, 487));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 487));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 51, 77));

        rSButton1.setBackground(new java.awt.Color(25, 51, 77));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/back.png"))); // NOI18N
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
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/exit.png"))); // NOI18N
        rSButton2.setToolTipText("");
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

        rSButton3.setBackground(new java.awt.Color(25, 51, 77));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/minus.png"))); // NOI18N
        rSButton3.setToolTipText("");
        rSButton3.setColorHover(new java.awt.Color(255, 255, 255));
        rSButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButton3MouseExited(evt);
            }
        });
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1054, Short.MAX_VALUE)
                .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(25, 51, 77));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        rSTableMetro1.setEnabled(false);
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 850, 447));

        jLabel2.setText("Code:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jPass.setBackground(new java.awt.Color(255, 255, 255));
        jPass.setForeground(new java.awt.Color(102, 102, 102));
        jPass.setBorder(null);
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, 10));

        jLabel3.setText("Cash:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jCash.setBackground(new java.awt.Color(255, 255, 255));
        jCash.setForeground(new java.awt.Color(102, 102, 102));
        jCash.setBorder(null);
        jPanel1.add(jCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 150, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 10));

        jIDc.setBackground(new java.awt.Color(255, 255, 255));
        jIDc.setForeground(new java.awt.Color(102, 102, 102));
        jIDc.setBorder(null);
        jPanel1.add(jIDc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 150, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 10));

        jLabel4.setText("Id (Client):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, -1));

        rSButtonRiple1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/addC.png"))); // NOI18N
        rSButtonRiple1.setText("Add");
        rSButtonRiple1.setColorHover(new java.awt.Color(25, 51, 77));
        rSButtonRiple1.setColorText(new java.awt.Color(25, 51, 77));
        rSButtonRiple1.setIconTextGap(30);
        rSButtonRiple1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple1MouseExited(evt);
            }
        });
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 160, -1));

        rSButtonRiple2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/up2.png"))); // NOI18N
        rSButtonRiple2.setText("Update");
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
        jPanel1.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 160, -1));

        rSButtonRiple3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/delete2.png"))); // NOI18N
        rSButtonRiple3.setText("Delete");
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
        jPanel1.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple3MouseExited
        // TODO add your handling code here:
        rSButtonRiple3.setIcon(new ImageIcon("img\\delete2.png"));
    }//GEN-LAST:event_rSButtonRiple3MouseExited

    private void rSButtonRiple3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple3MouseEntered
        // TODO add your handling code here:
        rSButtonRiple3.setIcon(new ImageIcon("img\\delete.png"));
    }//GEN-LAST:event_rSButtonRiple3MouseEntered

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        // TODO add your handling code here:
        if (!(jIDc.getText().isEmpty() | jCash.getText().isEmpty())) {
            try {
                Client c = ctrs.searchClientByID(jIDc.getText());
                StoreCard sc = c.getStoreCard();
                sc.transfer(Double.parseDouble(jCash.getText()), "DEPOSIT");
                jIDc.setText(null);
                jCash.setText(null);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, false, ex.getMessage()).setVisible(true);
            } catch (NumberFormatException e) {
                new ErrorMessage(new Frame(), true, false, "Enter only numbers to save money to the card.").setVisible(true);
            } finally {
                loadTable();
            }

        } else if (!(jIDc.getText().isEmpty() | jPass.getText().isEmpty())) {
            Client c;
            try {
                c = ctrs.searchClientByID(jIDc.getText());
                StoreCard sc = c.getStoreCard();
                sc.setCode(jPass.getText());
                jIDc.setText(null);
                jPass.setText(null);
                ctrs.update(c);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, false, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Please, enter the ID & Cash or Pass. For Update").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void rSButtonRiple2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple2MouseExited
        // TODO add your handling code here:
        rSButtonRiple2.setIcon(new ImageIcon("img\\up2.png"));
    }//GEN-LAST:event_rSButtonRiple2MouseExited

    private void rSButtonRiple2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple2MouseEntered
        // TODO add your handling code here:
        rSButtonRiple2.setIcon(new ImageIcon("img\\up.png"));
    }//GEN-LAST:event_rSButtonRiple2MouseEntered

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        // TODO add your handling code here:
        if (!(jIDc.getText().isEmpty() | jCash.getText().isEmpty()
                | jPass.getText().isEmpty())) {
            try {
                Client c = ctrs.searchClientByID(jIDc.getText());
                c.setStoreCard(new StoreCard(jPass.getText(), Double.parseDouble(jCash.getText())));
                jIDc.setText(null);
                jPass.setText(null);
                jCash.setText(null);
                ctrs.update(c);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, false, ex.getMessage()).setVisible(true);
            } catch (NumberFormatException e) {
                new ErrorMessage(new Frame(), true, false, "Enter only numbers to save money ti the card.").setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, true, "Please, complete all fields.").setVisible(true);
        }

    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void rSButtonRiple1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple1MouseExited
        // TODO add your handling code here:
        rSButtonRiple1.setIcon(new ImageIcon("img\\addC.png"));
    }//GEN-LAST:event_rSButtonRiple1MouseExited

    private void rSButtonRiple1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple1MouseEntered
        // TODO add your handling code here:
        rSButtonRiple1.setIcon(new ImageIcon("img\\addC2.png"));
    }//GEN-LAST:event_rSButtonRiple1MouseEntered

    private void rSButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton3MouseExited
        // TODO add your handling code here:
        rSButton3.setIcon(new ImageIcon("img\\minus.png"));
    }//GEN-LAST:event_rSButton3MouseExited

    private void rSButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton3MouseEntered
        // TODO add your handling code here:
        rSButton3.setIcon(new ImageIcon("img\\min2.png"));
    }//GEN-LAST:event_rSButton3MouseEntered

    private void rSButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton2MouseExited
        // TODO add your handling code here:
        rSButton2.setIcon(new ImageIcon("img\\exit.png"));
    }//GEN-LAST:event_rSButton2MouseExited

    private void rSButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton2MouseEntered
        // TODO add your handling code here:
        rSButton2.setIcon(new ImageIcon("img\\close2.png"));
    }//GEN-LAST:event_rSButton2MouseEntered

    private void rSButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton1MouseExited
        // TODO add your handling code here:
        rSButton1.setIcon(new ImageIcon("img\\back.png"));
    }//GEN-LAST:event_rSButton1MouseExited

    private void rSButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButton1MouseEntered
        // TODO add your handling code here:
        rSButton1.setIcon(new ImageIcon("img\\back2.png"));
    }//GEN-LAST:event_rSButton1MouseEntered

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        // TODO add your handling code here:
        if (!jIDc.getText().isEmpty()) {
            try {
                Client c = ctrs.searchClientByID(jIDc.getText());
                c.setStoreCard(null);
                ctrs.update(c);
            } catch (MyException ex) {
                new ErrorMessage(new Frame(), true, false, ex.getMessage()).setVisible(true);
            } finally {
                loadTable();
            }
        } else {
            new ErrorMessage(new Frame(), true, false, "Complete the customer ID").setVisible(true);
        }
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAdmin().setVisible(true);
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_rSButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCash;
    private javax.swing.JTextField jIDc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojerusan.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
