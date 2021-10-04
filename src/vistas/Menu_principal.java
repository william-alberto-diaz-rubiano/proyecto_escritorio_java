
package vistas;

import controladores.controlador_menu_principal;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu_principal extends javax.swing.JFrame {

    Fondopanel fondo=new Fondopanel();
    
    public Menu_principal() 
    {
        this.setContentPane(fondo);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Label_titulo = new javax.swing.JLabel();
        button_ingresar = new javax.swing.JButton();
        Button_consultar = new javax.swing.JButton();
        button_modificar = new javax.swing.JButton();
        button_eliminar = new javax.swing.JButton();
        button_directorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 76, 49));

        Label_titulo.setBackground(new java.awt.Color(221, 221, 221));
        Label_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_titulo.setText("INSTITUTO LA FLORESTA");
        Label_titulo.setOpaque(true);

        button_ingresar.setBackground(new java.awt.Color(17, 93, 31));
        button_ingresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_ingresar.setForeground(new java.awt.Color(250, 250, 250));
        button_ingresar.setText("Ingresar estudiante");
        button_ingresar.setBorderPainted(false);
        button_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ingresarActionPerformed(evt);
            }
        });

        Button_consultar.setBackground(new java.awt.Color(17, 93, 31));
        Button_consultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_consultar.setForeground(new java.awt.Color(250, 250, 250));
        Button_consultar.setText("Consultas");
        Button_consultar.setBorderPainted(false);
        Button_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_consultarActionPerformed(evt);
            }
        });

        button_modificar.setBackground(new java.awt.Color(17, 93, 31));
        button_modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_modificar.setForeground(new java.awt.Color(250, 250, 250));
        button_modificar.setText("Modificar estudiante");
        button_modificar.setBorderPainted(false);
        button_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modificarActionPerformed(evt);
            }
        });

        button_eliminar.setBackground(new java.awt.Color(17, 93, 31));
        button_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_eliminar.setForeground(new java.awt.Color(250, 250, 250));
        button_eliminar.setText("Eliminar estudiante");
        button_eliminar.setBorderPainted(false);
        button_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_eliminarActionPerformed(evt);
            }
        });

        button_directorio.setBackground(new java.awt.Color(17, 93, 31));
        button_directorio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_directorio.setForeground(new java.awt.Color(250, 250, 250));
        button_directorio.setText("Directorio de estudiantes");
        button_directorio.setBorderPainted(false);
        button_directorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_directorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button_ingresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_consultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_directorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(button_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Button_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(button_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ingresarActionPerformed
        controlador_menu_principal.ingresar_estudiante();
    }//GEN-LAST:event_button_ingresarActionPerformed

    private void Button_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_consultarActionPerformed
        controlador_menu_principal.consultas();
    }//GEN-LAST:event_Button_consultarActionPerformed

    private void button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificarActionPerformed
        controlador_menu_principal.modificar();
    }//GEN-LAST:event_button_modificarActionPerformed

    private void button_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminarActionPerformed
        controlador_menu_principal.eliminar();
    }//GEN-LAST:event_button_eliminarActionPerformed

    private void button_directorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_directorioActionPerformed
        controlador_menu_principal.directorio();
    }//GEN-LAST:event_button_directorioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_consultar;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JButton button_directorio;
    private javax.swing.JButton button_eliminar;
    private javax.swing.JButton button_ingresar;
    private javax.swing.JButton button_modificar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

class Fondopanel extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen=new ImageIcon(getClass().getResource("/imagenes/imagenmenu.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
}
