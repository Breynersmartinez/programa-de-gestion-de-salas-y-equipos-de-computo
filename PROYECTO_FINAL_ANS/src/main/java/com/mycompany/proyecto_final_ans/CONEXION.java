/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_ans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yo breyner saul
 */
public class CONEXION {
     Connection conectar  = null;
     String usuario = "root";
     String contrasenia = "3103212753";
     String bd = "estudiantes_ucc";
     String ip = "localhost";
     String puerto = "3306";
     String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
     
     public Connection estableceConexion() throws SQLException{
         try {
            
             Class.forName("com.mysql.cj.jdbc.Driver");
             conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
                                   JOptionPane.showMessageDialog(null, "la conexion se realizo con exito. " );

         }catch (Exception e){
                      JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos. "  + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

         }
         return conectar;
     }
}
