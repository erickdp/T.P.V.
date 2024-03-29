/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.view;

import AppPackage.AnimationClass;
import com.storage.control.Useful;
import javax.swing.ImageIcon;

/**
 *
 * @author Erick Díaz
 */
public class frmAdmin extends javax.swing.JFrame {
    
    private AnimationClass ac = new AnimationClass();
    
    private void sliderShow() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int nb = 0;
                try {
                    while (true) {
                        switch (nb) {
                            case 0:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -500, 12, 10, jLabel3);
                                ac.jLabelXLeft(500, 0, 12, 10, jLabel4);
                                ac.jLabelXLeft(1000, 500, 12, 10, jLabel5);
                                nb++;
                            case 1:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(-500, -1000, 12, 10, jLabel3);
                                ac.jLabelXLeft(0, -500, 12, 10, jLabel4);
                                ac.jLabelXLeft(500, 0, 12, 10, jLabel5);
                                nb++;
                            case 2:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-1000, -500, 12, 10, jLabel3);
                                ac.jLabelXRight(-500, 0, 12, 10, jLabel4);
                                ac.jLabelXRight(0, 500, 12, 10, jLabel5);
                                nb++;
                            case 3:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-500, 0, 12, 10, jLabel3);
                                ac.jLabelXRight(0, 500, 12, 10, jLabel4);
                                ac.jLabelXRight(500, 1000, 12, 10, jLabel5);
                                nb = 0;
                        }
                    }
                } catch (Exception e) {
                }
            }
            
        }).start();
    }
    
    private void loadImg() {
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "img\\super.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "img\\super2.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5, "img\\super4.jpg");
    }

    /**
     * Creates new form frmAdmin
     */
    public frmAdmin() {
        initComponents();
        setLocationRelativeTo(this);
        loadImg();
        sliderShow();
        this.jLabel1.setText(Useful.adminRegistred.getFirstName() + " " + Useful.adminRegistred.getLastName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        jSeparator1 = new javax.swing.JSeparator();
        rSButtonRiple5 = new rojeru_san.RSButtonRiple();
        rSButtonRiple6 = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();
        rSButtonRiple7 = new rojeru_san.RSButtonRiple();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(187, 187, 187));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple1.setBackground(new java.awt.Color(187, 187, 187));
        rSButtonRiple1.setForeground(new java.awt.Color(187, 187, 187));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/menu.png"))); // NOI18N
        rSButtonRiple1.setColorHover(new java.awt.Color(187, 187, 187));
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 68, 49));

        rSButton1.setBackground(new java.awt.Color(187, 187, 187));
        rSButton1.setForeground(new java.awt.Color(187, 187, 187));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/minus.png"))); // NOI18N
        rSButton1.setToolTipText("");
        rSButton1.setColorHover(new java.awt.Color(25, 51, 77));
        jPanel3.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));

        rSButton2.setBackground(new java.awt.Color(187, 187, 187));
        rSButton2.setForeground(new java.awt.Color(187, 187, 187));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/exit.png"))); // NOI18N
        rSButton2.setColorHover(new java.awt.Color(25, 51, 77));
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 190, 33));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcom Back ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 33));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        jPanel4.setBackground(new java.awt.Color(25, 51, 77));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple2.setBackground(new java.awt.Color(187, 187, 187));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/admin.png"))); // NOI18N
        rSButtonRiple2.setText("Admin");
        rSButtonRiple2.setColorHover(new java.awt.Color(37, 77, 116));
        rSButtonRiple2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonRiple2.setIconTextGap(38);
        rSButtonRiple2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple2ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, -1));

        rSButtonRiple3.setBackground(new java.awt.Color(187, 187, 187));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/client.png"))); // NOI18N
        rSButtonRiple3.setText("Client");
        rSButtonRiple3.setColorHover(new java.awt.Color(37, 77, 116));
        rSButtonRiple3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonRiple3.setIconTextGap(38);
        rSButtonRiple3.setRippleColor(new java.awt.Color(0, 51, 51));
        rSButtonRiple3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple3ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 23, 124, 10));

        rSButtonRiple5.setBackground(new java.awt.Color(187, 187, 187));
        rSButtonRiple5.setBorder(null);
        rSButtonRiple5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/out1.png"))); // NOI18N
        rSButtonRiple5.setText("Log out");
        rSButtonRiple5.setColorHover(new java.awt.Color(153, 0, 0));
        rSButtonRiple5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonRiple5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonRiple5.setIconTextGap(38);
        rSButtonRiple5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRiple5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRiple5MouseExited(evt);
            }
        });
        rSButtonRiple5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple5ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonRiple5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 210, -1));

        rSButtonRiple6.setBackground(new java.awt.Color(187, 187, 187));
        rSButtonRiple6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/card.png"))); // NOI18N
        rSButtonRiple6.setText("Shop Card");
        rSButtonRiple6.setColorHover(new java.awt.Color(37, 77, 116));
        rSButtonRiple6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonRiple6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonRiple6.setIconTextGap(38);
        rSButtonRiple6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple6ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonRiple6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 78, 33));

        rSButtonRiple7.setBackground(new java.awt.Color(187, 187, 187));
        rSButtonRiple7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/product.png"))); // NOI18N
        rSButtonRiple7.setText("Product");
        rSButtonRiple7.setColorHover(new java.awt.Color(37, 77, 116));
        rSButtonRiple7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonRiple7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonRiple7.setIconTextGap(38);
        rSButtonRiple7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple7ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonRiple7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 500));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setInheritsPopupMenu(false);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jLabel4.setText("jLabel3");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jLabel5.setText("jLabel3");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 500, 500));
        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        // TODO add your handling code here:
        int posicion = this.jPanel4.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -210, 3, 3, jPanel4);
        } else {
            Animacion.Animacion.mover_derecha(-210, 0, 3, 3, jPanel4);
        }
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void rSButtonRiple3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmClientt().setVisible(true);
    }//GEN-LAST:event_rSButtonRiple3ActionPerformed

    private void rSButtonRiple5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_rSButtonRiple5ActionPerformed

    private void rSButtonRiple6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmCard().setVisible(true);
    }//GEN-LAST:event_rSButtonRiple6ActionPerformed

    private void rSButtonRiple2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmAdminA().setVisible(true);
    }//GEN-LAST:event_rSButtonRiple2ActionPerformed

    private void rSButtonRiple5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple5MouseEntered
        // TODO add your handling code here:
        rSButtonRiple5.setIcon(new ImageIcon("img\\out.png"));
    }//GEN-LAST:event_rSButtonRiple5MouseEntered

    private void rSButtonRiple5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRiple5MouseExited
        // TODO add your handling code here:
        rSButtonRiple5.setIcon(new ImageIcon("img\\out2.png"));
    }//GEN-LAST:event_rSButtonRiple5MouseExited

    private void rSButtonRiple7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmProducts().setVisible(true);
    }//GEN-LAST:event_rSButtonRiple7ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSButtonRiple rSButtonRiple5;
    private rojeru_san.RSButtonRiple rSButtonRiple6;
    private rojeru_san.RSButtonRiple rSButtonRiple7;
    // End of variables declaration//GEN-END:variables
}
