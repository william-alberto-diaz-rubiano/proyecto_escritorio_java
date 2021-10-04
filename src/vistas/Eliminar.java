/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.Controlador_eliminar;
import javax.swing.JTextField;

/**
 *
 * @author William Diaz
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_correoInstitucional = new javax.swing.JTextField();
        Button_eliminar = new javax.swing.JButton();
        campo_respuesta = new javax.swing.JTextField();
        Button_eliminarOtro = new javax.swing.JButton();
        Button_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ELIMINAR ESTUDIANTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Ingresar correo institucional");

        Button_eliminar.setBackground(new java.awt.Color(238, 124, 11));
        Button_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_eliminar.setText("ELIMINAR");
        Button_eliminar.setBorderPainted(false);
        Button_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_eliminarActionPerformed(evt);
            }
        });

        Button_eliminarOtro.setBackground(new java.awt.Color(77, 148, 223));
        Button_eliminarOtro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_eliminarOtro.setText("ELIMINAR OTRO ESTUDIANTE");
        Button_eliminarOtro.setBorderPainted(false);
        Button_eliminarOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_eliminarOtroActionPerformed(evt);
            }
        });

        Button_regresar.setBackground(new java.awt.Color(77, 148, 223));
        Button_regresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_regresar.setText("VOLVER AL MENU");
        Button_regresar.setBorderPainted(false);
        Button_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(Button_eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(campo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(campo_correoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_eliminarOtro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_regresar)
                                .addGap(16, 16, 16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_correoInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(Button_eliminar)
                .addGap(18, 18, 18)
                .addComponent(campo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_eliminarOtro)
                    .addComponent(Button_regresar))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_eliminarActionPerformed
        Controlador_eliminar.eliminar();
    }//GEN-LAST:event_Button_eliminarActionPerformed

    private void Button_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_regresarActionPerformed
        Controlador_eliminar.regresar();
    }//GEN-LAST:event_Button_regresarActionPerformed

    private void Button_eliminarOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_eliminarOtroActionPerformed
        Controlador_eliminar.limpiar();
    }//GEN-LAST:event_Button_eliminarOtroActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    public JTextField getCampo_correoInstitucional() {
        return campo_correoInstitucional;
    }

    public JTextField getCampo_respuesta() {
        return campo_respuesta;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_eliminar;
    private javax.swing.JButton Button_eliminarOtro;
    private javax.swing.JButton Button_regresar;
    private javax.swing.JTextField campo_correoInstitucional;
    private javax.swing.JTextField campo_respuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}