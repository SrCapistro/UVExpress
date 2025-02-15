/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uv.expressit.view;

import com.uv.expressit.DAO.DAOUsuario;
import com.uv.expressit.POJO.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo DA
 */
public class GUIRegistraModificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form GUIRegistraModificarUsuario
     */
    
    private static boolean esNuevo;
    
    public GUIRegistraModificarUsuario(boolean esNuevo) {
        initComponents();
        this.setTitle("Ingresar datos");
        //Se comprueba si el usuario sera nuevo o uno ya existente
        
        Usuario usuario = GUIlogin.usuarioLogeado;
        
        this.esNuevo = esNuevo;
        
        if(esNuevo){
            this.btnCambiarFoto.setVisible(false);
        }
        else{
           cargarDatosUsuario(usuario);
          
        }
        
    }
    
    public void cargarDatosUsuario(Usuario usuario){
        this.txtNombreUsuario.setText(usuario.getNombreUsuario());
        this.txtNombreCompleto.setText(usuario.getNombreCompletoUsuario());
        this.txtFechaDia.setText(usuario.getFechaNacUsuario());
        this.txtCorreoElectronico.setText(usuario.getCorreoUsuario());
        this.txtDescripcion.setText(usuario.getDescripcionUsuario());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtFechaDia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnCambiarFoto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarModificacion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNombreArchivo = new javax.swing.JLabel();
        txtFechaMes = new javax.swing.JTextField();
        txtFechaAño = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(13, 13, 13));

        txtNombreUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de usuario");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("@");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre completo");

        txtNombreCompleto.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo electrónico");

        txtCorreoElectronico.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        txtFechaDia.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txtFechaDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaDiaKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");

        txtPassword.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Repetir contraseña");

        txtConfirmPassword.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripción");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnCambiarFoto.setBackground(new java.awt.Color(0, 116, 158));
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarFotoMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cambiar foto");

        javax.swing.GroupLayout btnCambiarFotoLayout = new javax.swing.GroupLayout(btnCambiarFoto);
        btnCambiarFoto.setLayout(btnCambiarFotoLayout);
        btnCambiarFotoLayout.setHorizontalGroup(
            btnCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        btnCambiarFotoLayout.setVerticalGroup(
            btnCambiarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnGuardarModificacion.setBackground(new java.awt.Color(0, 116, 158));
        btnGuardarModificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarModificacionMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Guardar");

        javax.swing.GroupLayout btnGuardarModificacionLayout = new javax.swing.GroupLayout(btnGuardarModificacion);
        btnGuardarModificacion.setLayout(btnGuardarModificacionLayout);
        btnGuardarModificacionLayout.setHorizontalGroup(
            btnGuardarModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        btnGuardarModificacionLayout.setVerticalGroup(
            btnGuardarModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCancelar.setBackground(new java.awt.Color(120, 0, 14));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        lbNombreArchivo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lbNombreArchivo.setForeground(new java.awt.Color(255, 255, 255));

        txtFechaMes.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txtFechaMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaMesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaMesKeyTyped(evt);
            }
        });

        txtFechaAño.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txtFechaAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaAñoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaAñoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreCompleto)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreUsuario))
                        .addGap(42, 42, 42)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txtFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaAño))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343)
                        .addComponent(btnGuardarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                        .addComponent(btnCambiarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNombreArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNombreArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambiarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarModificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarModificacionMouseClicked
       if(comprobarDatos() == 1){
           JOptionPane.showMessageDialog(this, "Debe ingresar todos los datos para registrarse", "Datos faltantes", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           if(!esNuevo){
               Usuario usuarioModificar = new Usuario();
               usuarioModificar.setNombreUsuario(this.txtNombreUsuario.getText());
               usuarioModificar.setFechaNacUsuario(this.txtFechaDia.getText()+"/"+this.txtFechaMes.getText()+"/"+this.txtFechaAño.getText());
               usuarioModificar.setIdUsuario(GUIlogin.usuarioLogeado.getIdUsuario());
               usuarioModificar.setCorreoUsuario(this.txtCorreoElectronico.getText());
               usuarioModificar.setDescripcionUsuario(this.txtDescripcion.getText());
               usuarioModificar.setContraseñaUsuario(this.txtPassword.getPassword().toString());
               
           }else{
               if(this.txtCorreoElectronico.getText().contains("@")){
               if(this.txtFechaDia.getText().length() == 2 && this.txtFechaMes.getText().length() == 2 && this.txtFechaAño.getText().length() == 4){
                   try {
                    Usuario usuarioRegistrar = new Usuario();
                    usuarioRegistrar.setNombreUsuario(this.txtNombreUsuario.getText());
                    usuarioRegistrar.setNombreCompletoUsuario(this.txtNombreCompleto.getText());
                    usuarioRegistrar.setCorreoUsuario(this.txtCorreoElectronico.getText());
                    usuarioRegistrar.setDescripcionUsuario(this.txtDescripcion.getText());
                    usuarioRegistrar.setContraseñaUsuario(this.txtPassword.getPassword().toString());
                    usuarioRegistrar.setFechaNacUsuario(this.txtFechaDia.getText());
                    String mensaje = DAOUsuario.registrarUsuario(usuarioRegistrar);
                    JOptionPane.showMessageDialog(this, mensaje, "Registro", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error de registro"+ex.getMessage(), "Registro", JOptionPane.INFORMATION_MESSAGE);
                }
               }else{
                   JOptionPane.showMessageDialog(this, "Formato de fecha incórrecto", "Formato incorrecto", JOptionPane.ERROR_MESSAGE);
               }
           }else{
               JOptionPane.showMessageDialog(this, "Formato de correo electrónico inavlido", "Formato incorrecto", JOptionPane.ERROR_MESSAGE);
           }
           }
       }
    }//GEN-LAST:event_btnGuardarModificacionMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCambiarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarFotoMouseClicked
       GUICargarArchivo Buscador = new GUICargarArchivo();  
        FileNameExtensionFilter format = new FileNameExtensionFilter("JPG, PNG, GIF, MP4, AVI, MKV, FLV, MOV", 
                                                            "jpg", "jpeg", "png", "gif");
        File archivo;
        int resultado;
               
        Buscador.fcBuscador.setFileFilter(format);    
        resultado = Buscador.fcBuscador.showOpenDialog(null);
        
        if(JFileChooser.APPROVE_OPTION == resultado){
            
            archivo = Buscador.fcBuscador.getSelectedFile();
            this.lbNombreArchivo.setText(archivo.getName());
    
            //Aquie se subira la imagen o video
            
            
        }
    }//GEN-LAST:event_btnCambiarFotoMouseClicked

   
    
    private void txtFechaMesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaMesKeyPressed
        if(this.txtFechaMes.getText().length() == 1){
            this.txtFechaAño.grabFocus();
        }
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
           this.txtFechaMes.setEditable(true);
       }else{
           this.txtFechaMes.setEditable(false);
       }
        
    }//GEN-LAST:event_txtFechaMesKeyPressed

    private void txtFechaMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaMesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMesKeyTyped

    private void txtFechaAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaAñoKeyPressed
        if(this.txtFechaAño.getText().length() == 3){
            this.txtPassword.grabFocus();
        }
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
           this.txtFechaAño.setEditable(true);
       }else{
           this.txtFechaAño.setEditable(false);
       }
    }//GEN-LAST:event_txtFechaAñoKeyPressed

    private void txtFechaAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaAñoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaAñoKeyTyped

    private void txtFechaDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDiaKeyPressed
       if(this.txtFechaDia.getText().length() == 1){
           this.txtFechaMes.grabFocus();
       }
       if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
           this.txtFechaDia.setEditable(true);
       }else{
           this.txtFechaDia.setEditable(false);
       }
    }//GEN-LAST:event_txtFechaDiaKeyPressed

    public int comprobarDatos(){
        if(this.txtNombreUsuario.getText().isBlank() || this.txtNombreCompleto.getText().isBlank() ||
                this.txtCorreoElectronico.getText().isBlank() || this.txtFechaDia.getText().isBlank() ||
                this.txtPassword.getPassword().toString().isBlank()){
            return 1;
        }
        return 0;
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
            java.util.logging.Logger.getLogger(GUIRegistraModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistraModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistraModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistraModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistraModificarUsuario(esNuevo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCambiarFoto;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardarModificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNombreArchivo;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFechaAño;
    private javax.swing.JTextField txtFechaDia;
    private javax.swing.JTextField txtFechaMes;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
