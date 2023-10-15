/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.Conexion;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Veronica
 */
public class Registro extends javax.swing.JFrame {

    Conexion conex = new Conexion();
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_NombreRegistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_ApellidoRegistro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jT_CorreoRegistro = new javax.swing.JTextField();
        jP_Clave1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jC_Perfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jP_Clave = new javax.swing.JPasswordField();
        jB_GenerarUsuario = new javax.swing.JButton();
        jB_IngresarSistema = new javax.swing.JButton();
        jB_SalirSistemaRegistro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Registro");
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(870, 680));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Registro de usuarios");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre :");

        jT_NombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NombreRegistroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Correo :");

        jP_Clave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jP_Clave1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Clave :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Perfil :");

        jC_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Jefe", " ", " " }));
        jC_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_PerfilActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Re ingrese clave :");

        jP_Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jP_ClaveActionPerformed(evt);
            }
        });

        jB_GenerarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jB_GenerarUsuario.setText("Generar Usuario");
        jB_GenerarUsuario.setMaximumSize(new java.awt.Dimension(164, 33));
        jB_GenerarUsuario.setMinimumSize(new java.awt.Dimension(164, 33));
        jB_GenerarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GenerarUsuarioActionPerformed(evt);
            }
        });

        jB_IngresarSistema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jB_IngresarSistema.setText("Ingresar al Sistema");
        jB_IngresarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_IngresarSistemaActionPerformed(evt);
            }
        });

        jB_SalirSistemaRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jB_SalirSistemaRegistro.setText("Salir del Sistema");
        jB_SalirSistemaRegistro.setMaximumSize(new java.awt.Dimension(164, 33));
        jB_SalirSistemaRegistro.setMinimumSize(new java.awt.Dimension(164, 33));
        jB_SalirSistemaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirSistemaRegistroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("(Clave de 4 a 8 caracteres)");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jP_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jT_ApellidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jP_Clave1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jT_NombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jC_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_CorreoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 140, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jB_IngresarSistema)
                        .addGap(179, 179, 179)
                        .addComponent(jB_SalirSistemaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jB_GenerarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_CorreoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jT_ApellidoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_NombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jP_Clave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jP_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jC_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(51, 51, 51)
                .addComponent(jB_GenerarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_IngresarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_SalirSistemaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_NombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NombreRegistroActionPerformed

    private void jC_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_PerfilActionPerformed

    private void jB_SalirSistemaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirSistemaRegistroActionPerformed
        
        int confirm = JOptionPane.showConfirmDialog(
        
                this,
            "¿Estás seguro de que quieres cerrar la aplicación?",
            "Confirmar Cierre",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            //System.exit(0);
            dispose();
            Login log=new Login();
            log.setVisible(true);
        }
        
    }//GEN-LAST:event_jB_SalirSistemaRegistroActionPerformed

    private void jB_IngresarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_IngresarSistemaActionPerformed
        
                    dispose();
                    VacunarGUI vista=new VacunarGUI();
                    vista.setVisible(true);
        
    }//GEN-LAST:event_jB_IngresarSistemaActionPerformed

    private void jP_Clave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jP_Clave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_Clave1ActionPerformed

    private void jP_ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jP_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_ClaveActionPerformed

    private void jB_GenerarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GenerarUsuarioActionPerformed
      
        String nombre=jT_NombreRegistro.getText();
        String apellido=jT_ApellidoRegistro.getText();
        String mail=jT_CorreoRegistro.getText();
        String pas1=jP_Clave1.getText();
        String pas=jP_Clave.getText();
        String tipoUsuario=jC_Perfil.getSelectedItem().toString();   
                        
         

    if (nombre.isEmpty() || apellido.isEmpty() || mail.isEmpty() || pas1.isEmpty() || pas.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Se deben completar todos los campos");
    } else if (tipoUsuario.equalsIgnoreCase("Seleccionar")) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de Perfil");
    } else if (!pas1.equals(pas)) {
        JOptionPane.showMessageDialog(null, "Las claves no son iguales");
    } else if (pas1.length() < 4 || pas1.length() > 8) {
        JOptionPane.showMessageDialog(null, "La clave debe tener entre 4 y 8 caracteres");
    } else {
        // Si todas las condiciones anteriores son verdaderas, entonces las claves son iguales
        String sql = "INSERT INTO usuario (Nombre, Apellido, mail, clave, perfil) VALUES ('" + nombre + "','" + apellido + "','" + mail + "','" + pas + "','" + tipoUsuario + "')";

        try {
            Connection conn = conex.Conexion_Maria();  // Asegúrate de obtener la conexión a la base de datos desde conex.Conexion_Maria()
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            limpiar();
            JOptionPane.showMessageDialog(null, "Usuario cargado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el usuario: " + e.getMessage());
        }
    }  
                                      
    }//GEN-LAST:event_jB_GenerarUsuarioActionPerformed

    void limpiar(){
    jT_NombreRegistro.setText("");
    jT_ApellidoRegistro.setText("");
    jT_CorreoRegistro.setText("");
    jP_Clave1.setText("");
    jP_Clave.setText("");
    jC_Perfil.setSelectedItem("Seleccionar");
    
    
    
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        FlatCarbonIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_GenerarUsuario;
    private javax.swing.JButton jB_IngresarSistema;
    private javax.swing.JButton jB_SalirSistemaRegistro;
    private javax.swing.JComboBox<String> jC_Perfil;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jP_Clave;
    private javax.swing.JPasswordField jP_Clave1;
    private javax.swing.JTextField jT_ApellidoRegistro;
    private javax.swing.JTextField jT_CorreoRegistro;
    private javax.swing.JTextField jT_NombreRegistro;
    // End of variables declaration//GEN-END:variables
}
