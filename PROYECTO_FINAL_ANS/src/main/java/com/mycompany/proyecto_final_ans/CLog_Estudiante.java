package com.mycompany.proyecto_final_ans;



import com.mycompany.proyecto_final_ans.CONEXION;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;








public class CLog_Estudiante {
    

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
int semestre;
String jornada;
String sala;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getNumeroducumento() {
        return numeroducumento;
    }

    public void setNumeroducumento(int numeroducumento) {
        this.numeroducumento = numeroducumento;
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

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }
    int idusuario;
    int numeroducumento;
    String nombres;
    String apellidos;
    String facultad;
    String tipousuario;

    public String getNumerocelular() {
        return numerocelular;
    }

    public void setNumerocelular(String numerocelular) {
        this.numerocelular = numerocelular;
    }

    public String getDependencias() {
        return dependencias;
    }

    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }
  String numerocelular;
  String dependencias;
    
  
}




