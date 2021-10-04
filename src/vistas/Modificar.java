
package vistas;

import controladores.Controlador_modificar;
import javax.swing.JTextField;


public class Modificar extends javax.swing.JFrame {

   
    public Modificar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Label_correoInst = new javax.swing.JLabel();
        campo_correoInatitucional = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Label_correoPerso = new javax.swing.JLabel();
        Label_numeroCelular = new javax.swing.JLabel();
        Label_numeroFijo = new javax.swing.JLabel();
        Label_programaAcademico = new javax.swing.JLabel();
        campo_correoPersonal = new javax.swing.JTextField();
        campo_celular = new javax.swing.JTextField();
        campo_fijo = new javax.swing.JTextField();
        campo_programa = new javax.swing.JTextField();
        Button_modificar = new javax.swing.JButton();
        campo_respuesta = new javax.swing.JTextField();
        button_regresar = new javax.swing.JButton();
        jButton_ModificarOtro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Modificar estudiante");

        Label_correoInst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_correoInst.setText("Ingrese correo institucional");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Datos a modificar");

        Label_correoPerso.setText("Correo personal ");

        Label_numeroCelular.setText("Numero de celular");

        Label_numeroFijo.setText("Numero fijo");

        Label_programaAcademico.setText("Programa academico");

        Button_modificar.setBackground(new java.awt.Color(238, 124, 11));
        Button_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button_modificar.setText("MODIFICAR");
        Button_modificar.setBorderPainted(false);
        Button_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_modificarActionPerformed(evt);
            }
        });

        button_regresar.setBackground(new java.awt.Color(77, 148, 223));
        button_regresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_regresar.setText("VOLVER AL MENU");
        button_regresar.setBorderPainted(false);
        button_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_regresarActionPerformed(evt);
            }
        });

        jButton_ModificarOtro.setBackground(new java.awt.Color(77, 148, 223));
        jButton_ModificarOtro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ModificarOtro.setText("MODIFICAR OTRO ESTUDIANTE");
        jButton_ModificarOtro.setBorderPainted(false);
        jButton_ModificarOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarOtroActionPerformed(evt);
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
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_correoInst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_correoInatitucional, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Label_programaAcademico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campo_programa))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Label_correoPerso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campo_correoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_numeroCelular)
                                        .addComponent(Label_numeroFijo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campo_celular)
                                        .addComponent(campo_fijo))))
                            .addComponent(jButton_ModificarOtro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(Button_modificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(campo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_regresar)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label_correoInst)
                    .addComponent(campo_correoInatitucional, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_correoPerso)
                            .addComponent(campo_correoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_numeroCelular)
                            .addComponent(campo_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Label_numeroFijo))
                    .addComponent(campo_fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_programaAcademico)
                    .addComponent(campo_programa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_regresar)
                    .addComponent(jButton_ModificarOtro))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_modificarActionPerformed
        Controlador_modificar.modificar_alumno();
        
    }//GEN-LAST:event_Button_modificarActionPerformed

    private void button_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_regresarActionPerformed
        Controlador_modificar.regresar();
    }//GEN-LAST:event_button_regresarActionPerformed

    private void jButton_ModificarOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarOtroActionPerformed
        Controlador_modificar.limpiar();
    }//GEN-LAST:event_jButton_ModificarOtroActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    public JTextField getCampo_celular() {
        return campo_celular;
    }

    public JTextField getCampo_correoInatitucional() {
        return campo_correoInatitucional;
    }

    public JTextField getCampo_correoPersonal() {
        return campo_correoPersonal;
    }

    public JTextField getCampo_fijo() {
        return campo_fijo;
    }

    public JTextField getCampo_programa() {
        return campo_programa;
    }

    public JTextField getCampo_respuesta() {
        return campo_respuesta;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_modificar;
    private javax.swing.JLabel Label_correoInst;
    private javax.swing.JLabel Label_correoPerso;
    private javax.swing.JLabel Label_numeroCelular;
    private javax.swing.JLabel Label_numeroFijo;
    private javax.swing.JLabel Label_programaAcademico;
    private javax.swing.JButton button_regresar;
    private javax.swing.JTextField campo_celular;
    private javax.swing.JTextField campo_correoInatitucional;
    private javax.swing.JTextField campo_correoPersonal;
    private javax.swing.JTextField campo_fijo;
    private javax.swing.JTextField campo_programa;
    private javax.swing.JTextField campo_respuesta;
    private javax.swing.JButton jButton_ModificarOtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
