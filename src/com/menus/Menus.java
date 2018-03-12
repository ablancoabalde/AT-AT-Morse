package com.menus;

import com.metodos.*;

public class Menus extends javax.swing.JFrame {

    Visual objVis = new Visual();
    Metodos objMet = new Metodos();

    // Variable para saber si invertir está seleccionada
    Boolean vInvertir = false;

    /**
     * Creates new form Menus
     */
    public Menus() {
        initComponents();
        jPTraductor.setVisible(true);
        jPComunes.setVisible(false);
        jPAdmin.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTraductor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaTraducido = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTraducir = new javax.swing.JTextArea();
        jBtn_traducir = new javax.swing.JButton();
        jTBInvertir = new javax.swing.JToggleButton();
        jPComunes = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPAdmin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenus = new javax.swing.JMenuBar();
        jMTraductor = new javax.swing.JMenu();
        jMComunes = new javax.swing.JMenu();
        jMAdmin = new javax.swing.JMenu();
        jMI1 = new javax.swing.JMenuItem();
        jMI2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTraductor.setName("jPTraductor"); // NOI18N
        jPTraductor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTAreaTraducido.setEditable(false);
        jTAreaTraducido.setColumns(20);
        jTAreaTraducido.setRows(5);
        jScrollPane1.setViewportView(jTAreaTraducido);

        jPTraductor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 120));

        jTTraducir.setColumns(20);
        jTTraducir.setRows(5);
        jScrollPane2.setViewportView(jTTraducir);

        jPTraductor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 120));

        jBtn_traducir.setText("Traducir");
        jBtn_traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_traducirActionPerformed(evt);
            }
        });
        jPTraductor.add(jBtn_traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jTBInvertir.setText("Invertir");
        jTBInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBInvertirActionPerformed(evt);
            }
        });
        jPTraductor.add(jTBInvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        getContentPane().add(jPTraductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jPComunes.setName("jPComunes"); // NOI18N
        jPComunes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Comunes");
        jPComunes.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Palabra", "Morse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable);

        jPComunes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 300));

        getContentPane().add(jPComunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jPAdmin.setName("jPAdmin"); // NOI18N
        jPAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Admin");
        jPAdmin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 110, 110, 90));

        getContentPane().add(jPAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        jMTraductor.setText("Traductor");
        jMTraductor.setName("Btn_Traductor"); // NOI18N
        jMTraductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMTraductorMouseClicked(evt);
            }
        });
        jMenus.add(jMTraductor);

        jMComunes.setText("Comunes");
        jMComunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMComunesMouseClicked(evt);
            }
        });
        jMenus.add(jMComunes);

        jMAdmin.setText("Admin");
        jMAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMAdminMouseClicked(evt);
            }
        });

        jMI1.setText("Configuración");
        jMI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI1ActionPerformed(evt);
            }
        });
        jMAdmin.add(jMI1);

        jMI2.setText("Insertar idioma");
        jMAdmin.add(jMI2);

        jMenus.add(jMAdmin);

        setJMenuBar(jMenus);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMTraductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMTraductorMouseClicked
        // Limpia el Panel
        //jMTraductor.removeAll();
        objMet.limpiar();
        objVis.verPanelesMenus(jPTraductor.getName());

    }//GEN-LAST:event_jMTraductorMouseClicked

    private void jMComunesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMComunesMouseClicked
        
        objMet.limpiar();
        objVis.verPanelesMenus(jPComunes.getName());
    }//GEN-LAST:event_jMComunesMouseClicked

    private void jMAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMAdminMouseClicked
       
        objMet.limpiar();
        objVis.verPanelesMenus(jPAdmin.getName());
        
    }//GEN-LAST:event_jMAdminMouseClicked

    private void jBtn_traducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_traducirActionPerformed

        jTAreaTraducido.setText(objMet.traduciraMorse(jTTraducir.getText(), vInvertir));

    }//GEN-LAST:event_jBtn_traducirActionPerformed

    private void jTBInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBInvertirActionPerformed
        objMet.limpiar();

        vInvertir = jTBInvertir.isSelected();
    }//GEN-LAST:event_jTBInvertirActionPerformed

    private void jMI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMI1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_traducir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JMenu jMAdmin;
    private javax.swing.JMenu jMComunes;
    private javax.swing.JMenuItem jMI1;
    private javax.swing.JMenuItem jMI2;
    private javax.swing.JMenu jMTraductor;
    public static javax.swing.JMenuBar jMenus;
    public static javax.swing.JPanel jPAdmin;
    public static javax.swing.JPanel jPComunes;
    public static javax.swing.JPanel jPTraductor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextArea jTAreaTraducido;
    private javax.swing.JToggleButton jTBInvertir;
    public static javax.swing.JTextArea jTTraducir;
    public static javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
