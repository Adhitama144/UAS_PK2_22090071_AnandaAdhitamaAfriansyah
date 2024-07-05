/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany._uas_anandaadhitamaa_4b;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author LENOVO
 */
public class Dashboard extends javax.swing.JInternalFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI decorate = (BasicInternalFrameUI) this.getUI();
        decorate.setNorthPane(null);
        rekomendasi.setSelected(true);
        konten.removeAll();
        RekomendasiMitra rekomendasiMitra = new RekomendasiMitra();
        try {
            rekomendasiMitra.setMaximum(true);
        } catch (Exception e) {}
        konten.add(rekomendasiMitra).setVisible(true);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mitra = new javax.swing.JToggleButton();
        rekomendasi = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        riwayat = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        konten = new javax.swing.JDesktopPane();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mitraku");

        mitra.setBackground(new java.awt.Color(204, 255, 0));
        mitra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mitra.setForeground(new java.awt.Color(51, 51, 51));
        mitra.setText("Daftar Mitra");
        mitra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitraActionPerformed(evt);
            }
        });

        rekomendasi.setBackground(new java.awt.Color(204, 255, 0));
        rekomendasi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rekomendasi.setForeground(new java.awt.Color(51, 51, 51));
        rekomendasi.setText("Rekomendasi Mitra");
        rekomendasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekomendasiActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        riwayat.setBackground(new java.awt.Color(204, 255, 0));
        riwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        riwayat.setForeground(new java.awt.Color(51, 51, 51));
        riwayat.setText("Riwayat SPK");
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mitra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rekomendasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(riwayat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(rekomendasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(riwayat)
                .addGap(10, 10, 10)
                .addComponent(mitra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        konten.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kontenLayout = new javax.swing.GroupLayout(konten);
        konten.setLayout(kontenLayout);
        kontenLayout.setHorizontalGroup(
            kontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        kontenLayout.setVerticalGroup(
            kontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(konten)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(konten)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Database.id = 0;
        Utama.display.removeAll();
        Login login = new Login();
        try {
            login.setMaximum(true);
        } catch (Exception e) {}
        Utama.display.add(login).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mitraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitraActionPerformed
        // TODO add your handling code here:
        rekomendasi.setSelected(false);
        riwayat.setSelected(false);
        konten.removeAll();
        DaftarMitra daftar_mitra = new DaftarMitra();
        try {
            daftar_mitra.setMaximum(true);
        } catch (Exception e) {}
        konten.add(daftar_mitra).setVisible(true);
    }//GEN-LAST:event_mitraActionPerformed

    private void rekomendasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekomendasiActionPerformed
        // TODO add your handling code here:
        riwayat.setSelected(false);
        mitra.setSelected(false);
        konten.removeAll();
        RekomendasiMitra rekomendasiMitra = new RekomendasiMitra();
        try {
            rekomendasiMitra.setMaximum(true);
        } catch (Exception e) {}
        konten.add(rekomendasiMitra).setVisible(true);
    }//GEN-LAST:event_rekomendasiActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        rekomendasi.setSelected(false);
        mitra.setSelected(false);
        konten.removeAll();
        RiwayatSPK riwayatSPK = new RiwayatSPK();
        try {
            riwayatSPK.setMaximum(true);
        } catch (Exception e) {}
        konten.add(riwayatSPK).setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDesktopPane konten;
    private javax.swing.JToggleButton mitra;
    private javax.swing.JToggleButton rekomendasi;
    private javax.swing.JToggleButton riwayat;
    // End of variables declaration//GEN-END:variables
}