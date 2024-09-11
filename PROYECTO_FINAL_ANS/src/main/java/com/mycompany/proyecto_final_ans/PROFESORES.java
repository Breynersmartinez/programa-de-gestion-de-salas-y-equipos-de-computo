/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_final_ans;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yo breyner saul
 */
public class PROFESORES extends javax.swing.JFrame {

    /**
     * Creates new form PROFESORES
     */
    public PROFESORES() {
        initComponents();
         getContentPane().setBackground(Color.DARK_GRAY);
          mostrarHoraActual();
         actualizarHora(); 
        setLocationRelativeTo(null);
    }
private void mostrarHoraActual() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a"); 
        String horaActual = dateFormat.format(new Date()); 

       
        hora_entrada.setText(horaActual);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        hora_entrada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hora_salida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        horaactual = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        aceptar1 = new javax.swing.JButton();
        regresar1 = new javax.swing.JButton();
        aceptar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numerodocumento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBestudiante = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        aceptar3 = new javax.swing.JButton();
        ubicacion = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 204, 255));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRE SU HORA  DE INGRESO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 260, -1));

        hora_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora_entradaActionPerformed(evt);
            }
        });
        getContentPane().add(hora_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 40));

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRE SU HORA  DE SALIDA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 250, -1));

        hora_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora_salidaActionPerformed(evt);
            }
        });
        getContentPane().add(hora_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 300, 40));

        jLabel8.setBackground(new java.awt.Color(51, 204, 255));
        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Actualiza la hora:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 130, -1));

        horaactual.setBackground(new java.awt.Color(51, 204, 255));
        horaactual.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        horaactual.setForeground(new java.awt.Color(255, 255, 255));
        horaactual.setText("REFRESCAR HORA");
        horaactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaactualActionPerformed(evt);
            }
        });
        getContentPane().add(horaactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        regresar.setBackground(new java.awt.Color(51, 204, 255));
        regresar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("REGRESAR");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        aceptar1.setBackground(new java.awt.Color(51, 204, 255));
        aceptar1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        aceptar1.setForeground(new java.awt.Color(255, 255, 255));
        aceptar1.setText("ACEPTAR");
        aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar1ActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 177, -1));

        regresar1.setBackground(new java.awt.Color(51, 204, 255));
        regresar1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        regresar1.setForeground(new java.awt.Color(255, 255, 255));
        regresar1.setText("REGRESAR");
        regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        aceptar2.setBackground(new java.awt.Color(51, 204, 255));
        aceptar2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        aceptar2.setForeground(new java.awt.Color(255, 255, 255));
        aceptar2.setText("ACEPTAR");
        aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar2ActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 177, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 770, 40));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 60, 40));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIGITE SU NUMERO DE DOCUMENTO DE IDENTIDAD ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 400, 36));
        getContentPane().add(numerodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 370, 40));

        TBestudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDusuario", "Numerodocumento", "Nombres", "Apellidos", "Semestre", "Jornada", "Programa", "Tipousuario", "Facultad", "Numeroelular", "Dependencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TBestudiante);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1150, 60));

        jLabel18.setBackground(new java.awt.Color(51, 204, 255));
        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("HAGA CLIC EN EL BOTON 'VALIDAR INFORMACION' DESPUES DE DIGITAR SU IDENTIFICACION");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 570, 20));

        aceptar3.setBackground(new java.awt.Color(51, 204, 255));
        aceptar3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        aceptar3.setForeground(new java.awt.Color(255, 255, 255));
        aceptar3.setText("VALIDAR INFORMACION");
        aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar3ActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 260, -1));

        ubicacion.setBackground(new java.awt.Color(51, 204, 255));
        ubicacion.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        ubicacion.setForeground(new java.awt.Color(255, 255, 255));
        ubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala 301", "Sala 304", "Sala 305", "OFICINA_Auxiliares_TI", "Biblioteca_UCC" }));
        ubicacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 153, 255)));
        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        getContentPane().add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 340, -1));

        jLabel20.setBackground(new java.awt.Color(51, 204, 255));
        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ELIJA SU SALA ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hora_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hora_entradaActionPerformed

    private void hora_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hora_salidaActionPerformed

    private void horaactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaactualActionPerformed
        actualizarHora();
    }//GEN-LAST:event_horaactualActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        dispose();
        INICIO inicio = new INICIO();
        inicio.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar1ActionPerformed
        String identificacion_user = numerodocumento.getText();
      
        try {

            String entrada_p = hora_entrada.getText();
            String hora_salida_p = hora_salida.getText();
                   String ubicacionSeleccionada = ubicacion.getSelectedItem().toString(); // Obtener la ubicación seleccionada

            int identificacion = Integer.parseInt(identificacion_user);
           
            //identifica cuando el usuario no llena todos los campos
            if ( entrada_p.isEmpty()||hora_salida_p.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                Date fechaActual = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String fechaFormateada = dateFormat.format(fechaActual);

                String datosAGuardar =  identificacion + "       " + entrada_p + "      " + hora_salida_p+ "      " + ubicacionSeleccionada+"      "+fechaFormateada ;

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_PROFESORES_MODULO_SALAS.txt", true))) {
                    writer.write(datosAGuardar);
                    writer.newLine();
                    JOptionPane.showMessageDialog(this, "Registro exportado exitosamente. " );
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al exportar el registro."  + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                
                numerodocumento.setText("");
                hora_entrada.setText("");
                hora_salida.setText("");
               
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese números válidos en el campo 'Numero de identificacion'.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptar1ActionPerformed

    private void regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar1ActionPerformed
        dispose();
        INICIO inicio = new INICIO();
        inicio.setVisible(true);
    }//GEN-LAST:event_regresar1ActionPerformed

    private void aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar2ActionPerformed
        String identificacion_user = numerodocumento.getText();

        try {
            int identificacion = Integer.parseInt(identificacion_user);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese números válidos en el campo 'Numero de identificacion'.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptar2ActionPerformed

    private void aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar3ActionPerformed

        int numerodoc = 0;

        try {
            numerodoc = Integer.parseInt(numerodocumento.getText());

            CONEXION objetoConexion = new CONEXION();
            String consulta = "SELECT idusuario, numerodocumento, nombres, apellidos, semestre, jornada, programa, tipousuario, facultad, numerocelular, dependencia FROM usuario WHERE numerodocumento = ?";

            try {
                CallableStatement ps = objetoConexion.estableceConexion().prepareCall(consulta);
                ps.setInt(1, numerodoc);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    // Usuario encontrado en la base de datos
                    JOptionPane.showMessageDialog(null, "Usuario encontrado en la base de datos");

                    // Clear existing rows in the table

                    DefaultTableModel model = (DefaultTableModel) TBestudiante.getModel();
                    model.setRowCount(0);

                    // Add the found user data to the table
                    model.addRow(new Object[]{
                        rs.getInt("idusuario"),
                        rs.getInt("numerodocumento"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getInt("semestre"),
                        rs.getString("jornada"),
                        rs.getString("programa"),
                        rs.getString("tipousuario"),
                        rs.getString("facultad"),
                        rs.getString("numerocelular"),
                        rs.getString("dependencia")
                    });

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al verificar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de documento válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*------------------------------------------------sala_equipo-----------------------------------*/

        // ... Otros métodos y propiedades ...
    }//GEN-LAST:event_aceptar3ActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed

    }//GEN-LAST:event_ubicacionActionPerformed

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
            java.util.logging.Logger.getLogger(PROFESORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROFESORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROFESORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROFESORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROFESORES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBestudiante;
    private javax.swing.JButton aceptar1;
    private javax.swing.JButton aceptar2;
    private javax.swing.JButton aceptar3;
    private javax.swing.JTextField hora_entrada;
    private javax.swing.JTextField hora_salida;
    private javax.swing.JButton horaactual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numerodocumento;
    private javax.swing.JButton regresar;
    private javax.swing.JButton regresar1;
    private javax.swing.JComboBox<String> ubicacion;
    // End of variables declaration//GEN-END:variables

    private void actualizarHora() {
          SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a"); 
    String horaActual = sdf.format(new Date());
    
    
    hora_entrada.setText(horaActual);
    }
}
