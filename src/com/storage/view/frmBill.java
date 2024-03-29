/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storage.view;

import com.storage.control.Useful;
import com.storage.model.Product;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Díaz
 */
public class frmBill extends javax.swing.JFrame {
    
    private Set<Product> products;
    
    private void loadFiles(Set products, Double total) {
        this.products = products;
        Object[] columns = {"Product", "Price", "Lot", "Total"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        for (Product p : this.products) {
            Object[] rows = {p.getNameProduct(), p.getPrice(), p.getUnits(), p.getPrice() * p.getUnits()};
            model.addRow(rows);
        }
        this.rSTableMetro1.setModel(model);
        this.jLabel17.setText("$" + total);
        this.jLabel10.setText("10% $" + (total * 0.10));
        this.jLabel11.setText("$" + (total - (total * 0.10)));
        this.jLabel5.setText("Shop Card :" + Useful.clientRegistred.getStoreCard().getId());
        String point = "";
        for (int i = 2; i < Useful.clientRegistred.getStoreCard().getCode().length(); i++) {
            point += "*";
        }
        this.jLabel6.setText("Code: " + Useful.clientRegistred.getStoreCard().getCode().charAt(0)
                + Useful.clientRegistred.getStoreCard().getCode().charAt(1) + point);
        this.jLabel7.setText("Client: " + Useful.clientRegistred.getFirstName());
        this.jLabel8.setText("Current balance $" + Useful.clientRegistred.getStoreCard().getCash());
        this.jLabel9.setText(String.valueOf(LocalDateTime.now()));
        this.jLabel19.setText("ID " + Useful.clientRegistred.getId());
    }

    /**
     * Creates new form frmBill
     */
    public frmBill(Set products, Double total) {
        initComponents();
        setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "img\\shopCard.png");
        loadFiles(products, total);
        jPanel2.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        rSTableMetro1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 672, 190));

        jPanel1.setBackground(new java.awt.Color(25, 51, 77));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/shopcart.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/ruble.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bill");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(167, 167, 167)
                .addComponent(jLabel2)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/por.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 50, 50));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("jLabel4");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 290, -1));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("jLabel4");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 290, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("jLabel4");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 290, -1));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("jLabel4");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 290, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("jLabel4");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, -1));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("jLabel4");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 140, -1));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("jLabel4");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 140, -1));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/mark.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 50, 50));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Entity Signature");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 120, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 610, 120, 10));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Customer Signature ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/dolar.png"))); // NOI18N
        jLabel15.setText("jLabel4");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 50, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/storage/view/icon/subT.png"))); // NOI18N
        jLabel16.setText("jLabel4");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 50, 50));

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("jLabel4");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 140, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 120, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 120, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 120, 10));

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("jLabel4");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jPanel2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private rojerusan.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
