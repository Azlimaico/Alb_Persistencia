package com.persistencia.damnificado;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1

import com.persistencia.albergue.AlbAlbergue;
import com.persistencia.general.sistema.AlbDiscapacidad;
import com.persistencia.general.sistema.AlbEstadoCivil;
import com.persistencia.general.sistema.AlbFamilia;
import com.persistencia.general.sistema.AlbInstruccion;
import com.persistencia.general.sistema.AlbProfesion;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AlbDamnificado generated by hbm2java
 */


public class AlbDamnificado  implements java.io.Serializable {


     private Long damId;
     private AlbDiscapacidad albDiscapacidad;
     private AlbEstadoCivil albEstadoCivil;
     private AlbFamilia albFamilia;
     private AlbInstruccion albInstruccion;
     private AlbProfesion albProfesion;
     private String damNombres;
     private String damApellidos;
     private Integer damCedula;
     private Integer damSexo;
     private String damLugarNacimiento;
     private Date damFechaNacimiento;
     private String damDireccionDomicilio;
     private String damDatosPadre;
     private String damDatosMadre;
     private Integer damCelular;
     private String damEmail;
     private Integer damEmbarazo;
     private String damObservaciones;
     private Integer damEstado;
     private Set<AlbDamnificado> damnificadoAlbergues = new HashSet <AlbDamnificado>(0);
     private Set damnificadoDiscapacidads = new HashSet(0);

    public AlbDamnificado() {
    }

    public AlbDamnificado(AlbDiscapacidad albDiscapacidad, AlbEstadoCivil albEstadoCivil, AlbFamilia albFamilia, AlbInstruccion albInstruccion, AlbProfesion albProfesion, String damNombres, String damApellidos, Integer damCedula, Integer damSexo, String damLugarNacimiento, Date damFechaNacimiento, String damDireccionDomicilio, String damDatosPadre, String damDatosMadre, Integer damCelular, String damEmail, Integer damEmbarazo, String damObservaciones, Integer damEstado, Set damnificadoAlbergues, Set damnificadoDiscapacidads) {
       this.albDiscapacidad = albDiscapacidad;
       this.albEstadoCivil = albEstadoCivil;
       this.albFamilia = albFamilia;
       this.albInstruccion = albInstruccion;
       this.albProfesion = albProfesion;
       this.damNombres = damNombres;
       this.damApellidos = damApellidos;
       this.damCedula = damCedula;
       this.damSexo = damSexo;
       this.damLugarNacimiento = damLugarNacimiento;
       this.damFechaNacimiento = damFechaNacimiento;
       this.damDireccionDomicilio = damDireccionDomicilio;
       this.damDatosPadre = damDatosPadre;
       this.damDatosMadre = damDatosMadre;
       this.damCelular = damCelular;
       this.damEmail = damEmail;
       this.damEmbarazo = damEmbarazo;
       this.damObservaciones = damObservaciones;
       this.damEstado = damEstado;
       this.damnificadoAlbergues = damnificadoAlbergues;
       this.damnificadoDiscapacidads = damnificadoDiscapacidads;
    }
   
    public Long getDamId() {
        return this.damId;
    }
    
    public void setDamId(Long damId) {
        this.damId = damId;
    }
    public AlbDiscapacidad getAlbDiscapacidad() {
        return this.albDiscapacidad;
    }
    
    public void setAlbDiscapacidad(AlbDiscapacidad albDiscapacidad) {
        this.albDiscapacidad = albDiscapacidad;
    }
    public AlbEstadoCivil getAlbEstadoCivil() {
        return this.albEstadoCivil;
    }
    
    public void setAlbEstadoCivil(AlbEstadoCivil albEstadoCivil) {
        this.albEstadoCivil = albEstadoCivil;
    }
    public AlbFamilia getAlbFamilia() {
        return this.albFamilia;
    }
    
    public void setAlbFamilia(AlbFamilia albFamilia) {
        this.albFamilia = albFamilia;
    }
    public AlbInstruccion getAlbInstruccion() {
        return this.albInstruccion;
    }
    
    public void setAlbInstruccion(AlbInstruccion albInstruccion) {
        this.albInstruccion = albInstruccion;
    }
    public AlbProfesion getAlbProfesion() {
        return this.albProfesion;
    }
    
    public void setAlbProfesion(AlbProfesion albProfesion) {
        this.albProfesion = albProfesion;
    }
    public String getDamNombres() {
        return this.damNombres;
    }
    
    public void setDamNombres(String damNombres) {
        this.damNombres = damNombres;
    }
    public String getDamApellidos() {
        return this.damApellidos;
    }
    
    public void setDamApellidos(String damApellidos) {
        this.damApellidos = damApellidos;
    }
    public Integer getDamCedula() {
        return this.damCedula;
    }
    
    public void setDamCedula(Integer damCedula) {
        this.damCedula = damCedula;
    }
    public Integer getDamSexo() {
        return this.damSexo;
    }
    
    public void setDamSexo(Integer damSexo) {
        this.damSexo = damSexo;
    }
    public String getDamLugarNacimiento() {
        return this.damLugarNacimiento;
    }
    
    public void setDamLugarNacimiento(String damLugarNacimiento) {
        this.damLugarNacimiento = damLugarNacimiento;
    }
    public Date getDamFechaNacimiento() {
        return this.damFechaNacimiento;
    }
    
    public void setDamFechaNacimiento(Date damFechaNacimiento) {
        this.damFechaNacimiento = damFechaNacimiento;
    }
    public String getDamDireccionDomicilio() {
        return this.damDireccionDomicilio;
    }
    
    public void setDamDireccionDomicilio(String damDireccionDomicilio) {
        this.damDireccionDomicilio = damDireccionDomicilio;
    }
    public String getDamDatosPadre() {
        return this.damDatosPadre;
    }
    
    public void setDamDatosPadre(String damDatosPadre) {
        this.damDatosPadre = damDatosPadre;
    }
    public String getDamDatosMadre() {
        return this.damDatosMadre;
    }
    
    public void setDamDatosMadre(String damDatosMadre) {
        this.damDatosMadre = damDatosMadre;
    }
    public Integer getDamCelular() {
        return this.damCelular;
    }
    
    public void setDamCelular(Integer damCelular) {
        this.damCelular = damCelular;
    }
    public String getDamEmail() {
        return this.damEmail;
    }
    
    public void setDamEmail(String damEmail) {
        this.damEmail = damEmail;
    }
    public Integer getDamEmbarazo() {
        return this.damEmbarazo;
    }
    
    public void setDamEmbarazo(Integer damEmbarazo) {
        this.damEmbarazo = damEmbarazo;
    }
    public String getDamObservaciones() {
        return this.damObservaciones;
    }
    
    public void setDamObservaciones(String damObservaciones) {
        this.damObservaciones = damObservaciones;
    }
    public Integer getDamEstado() {
        return this.damEstado;
    }
    
    public void setDamEstado(Integer damEstado) {
        this.damEstado = damEstado;
    }
    public Set getDamnificadoAlbergues() {
        return this.damnificadoAlbergues;
    }
    
    public void setDamnificadoAlbergues(Set damnificadoAlbergues) {
        this.damnificadoAlbergues = damnificadoAlbergues;
    }
    public Set getDamnificadoDiscapacidads() {
        return this.damnificadoDiscapacidads;
    }
    
    public void setDamnificadoDiscapacidads(Set damnificadoDiscapacidads) {
        this.damnificadoDiscapacidads = damnificadoDiscapacidads;
    }




}


