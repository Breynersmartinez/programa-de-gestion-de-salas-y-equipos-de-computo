/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_ans;

import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author yo breyner saul
 */
public class CInvitados {

      int idusuario;
    int numerodocumento;
    String nombres;
    String apellidos;
    String programa;
    
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(int numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

  
    
public  void InsertarInvitados (JTextField paramNumerodocumento, JTextField paramNombres, JTextField paramApellidos,JTextField paramprograma){
    
    
    /*  String identificacion_user = numerodocumento.getText();

        try {
        int identificacion = Integer.parseInt(identificacion_user);*/
      try {
    String setNumerodocumento = paramNumerodocumento.getText();
    int identidad = Integer.parseInt(setNumerodocumento);
    setNombres(paramNombres.getText());
    setApellidos(paramApellidos.getText());
        setPrograma(paramprograma.getText());
 
     CONEXION objetoConexion =  new CONEXION();
    String consulta ="INSERT INTO usuario  VALUES (NULL,?,?,?,NULL,NUll,?,'Invitado','','','');";
   
   try{
       CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
       
       cs.setInt(1,identidad);
       cs.setString(2, getNombres());
              cs.setString(3, getApellidos());
                     cs.setString(4, getPrograma());

cs.execute();   
 JOptionPane.showMessageDialog(null, "Se insertó correctamente el Invitado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se insertó el invitado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error, el número de documento debe ser un valor numérico.", "Error", JOptionPane.ERROR_MESSAGE);
    

 JOptionPane.showMessageDialog(null, " Se inserto correctamente el Invitado" );
   }catch (Exception e){
      
                       JOptionPane.showMessageDialog(null, " Error no se inserto el invitado"  + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

   
   }
  

}

}