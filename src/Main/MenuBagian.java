/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;


/**
 *
 * @author rizan
 */
public class MenuBagian extends javax.swing.JPanel{

    /**
     * Creates new form MenuDashboard
     */

    public MenuBagian(){
        initComponents();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_Tambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Bagian = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        pn_Main.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setText("Menu Bagian");

        bt_Tambah.setText("Tambah Bagian");
        bt_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TambahActionPerformed(evt);
            }
        });

        tb_Bagian.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Bagian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_BagianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Bagian);

        javax.swing.GroupLayout pn_MainLayout = new javax.swing.GroupLayout(pn_Main);
        pn_Main.setLayout(pn_MainLayout);
        pn_MainLayout.setHorizontalGroup(
            pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
                    .addGroup(pn_MainLayout.createSequentialGroup()
                        .addGroup(pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(bt_Tambah))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_MainLayout.setVerticalGroup(
            pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bt_Tambah)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pn_Main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TambahActionPerformed

    }//GEN-LAST:event_bt_TambahActionPerformed

    private void tb_BagianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_BagianMouseClicked

    }//GEN-LAST:event_tb_BagianMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_Main;
    private javax.swing.JTable tb_Bagian;
    // End of variables declaration//GEN-END:variables

}
