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

import java.awt.Color;
import java.awt.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/**
 *
 * @author Veronica
 */
public class Login extends javax.swing.JFrame {

    Conexion conex = new Conexion();
    
    
    
    //public static Registro rg;
    
    public Login() {
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

        IF_Login = new javax.swing.JInternalFrame();
        jLabel14 = new javax.swing.JLabel();
        jT_Usuario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jB_Acceder = new javax.swing.JButton();
        jB_salirAplicacionLoguin = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jP_Contraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IF_Login.setClosable(true);
        IF_Login.setTitle("Login");
        IF_Login.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Login.setVisible(true);
        IF_Login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Usuario :");
        IF_Login.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));
        IF_Login.getContentPane().add(jT_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 190, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setText("Bienvenidos a");
        IF_Login.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Contraseña :");
        IF_Login.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jB_Acceder.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jB_Acceder.setText("Acceder");
        jB_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AccederActionPerformed(evt);
            }
        });
        IF_Login.getContentPane().add(jB_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jB_salirAplicacionLoguin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jB_salirAplicacionLoguin.setText("Salir");
        jB_salirAplicacionLoguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirAplicacionLoguinActionPerformed(evt);
            }
        });
        IF_Login.getContentPane().add(jB_salirAplicacionLoguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setText("VacunAR");
        IF_Login.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));
        IF_Login.getContentPane().add(jP_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena (1).png"))); // NOI18N
        IF_Login.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(IF_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(IF_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_salirAplicacionLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirAplicacionLoguinActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "¿Estás seguro de que quieres cerrar la aplicación?",
            "Confirmar Cierre",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            System.exit(0);
        }
    }//GEN-LAST:event_jB_salirAplicacionLoguinActionPerformed

    private void jB_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AccederActionPerformed

        String usuario = jT_Usuario.getText();
        String clave = jP_Contraseña.getText();

        
        if (!usuario.equals("") && !clave.equals("")) {
            try {
                String sql = "SELECT perfil FROM usuario WHERE mail= '" + usuario + "' AND clave= '" + clave + "'";
                PreparedStatement ps = null;

                ps = conex.Conexion_Maria().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    String tipoUsuario = rs.getString("perfil");
                    if (tipoUsuario.equalsIgnoreCase("empleado")) {

                        jT_Usuario.setText("");
                        jP_Contraseña.setText("");
                        dispose();
                        VacunarGUI vista = new VacunarGUI();
                        vista.setVisible(true);
                    } else if (tipoUsuario.equalsIgnoreCase("jefe")) {

                        FondoConsulta consulta = new FondoConsulta();
                        consulta.setVisible(true);

                        Object[] options = {"Administrar Usuarios ", "Ingresar al Sistema"};
                        int choice = JOptionPane.showOptionDialog(null,
                                "¿Qué quieres hacer?",
                                "Perfil Administrador, Elegir una opción",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                options[0]);

                        if (choice == JOptionPane.YES_OPTION) { //Opción que permite administrar usuarios

                            dispose();
                            consulta.setVisible(false);
                            Registro vista = new Registro();
                            vista.setVisible(true);

                        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite Ingresar al Sistema            

                            dispose();
                            consulta.setVisible(false);
                            VacunarGUI vista = new VacunarGUI();
                            vista.setVisible(true);
                        }
                                   
                
                } else if (tipoUsuario.equalsIgnoreCase("Sin Permisos")) {
                    
                    jT_Usuario.setText("");
                    jP_Contraseña.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario Sin Permisos para Acceder");
                
                }
                } else {
                    jT_Usuario.setText("");
                    jP_Contraseña.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error al iniciar cesión" + e);

            }

        } else {
            jT_Usuario.setText("");
            jP_Contraseña.setText("");
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    
    
    }//GEN-LAST:event_jB_AccederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        FlatCarbonIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame IF_Login;
    private javax.swing.JButton jB_Acceder;
    private javax.swing.JButton jB_salirAplicacionLoguin;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jP_Contraseña;
    private javax.swing.JTextField jT_Usuario;
    // End of variables declaration//GEN-END:variables
}
