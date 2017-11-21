package com.persistencia.seguridad.sistema;
// Generated 16/11/2017 7:51:59 by Hibernate Tools 4.3.1

import com.persistencia.albergue.AlbAlbergue;
import com.persistencia.seguridad.sistema.AlbPerfil;
import com.persistencia.seguridad.sistema.AlbPersonalAdministrativo;



/**
 * PerAdministrativoAlberguePerfil generated by hbm2java
 */
public class PerAdministrativoAlberguePerfil  implements java.io.Serializable {


     private Long padId;
     private AlbAlbergue albAlbergue;
     private AlbPersonalAdministrativo albPersonalAdministrativo;
     private AlbPerfil albPerfil;
     private String padUsuario;
     private String padContrasenia;
     private Integer padEstado;

    public PerAdministrativoAlberguePerfil() {
    }

	
    public PerAdministrativoAlberguePerfil(Long padId, AlbAlbergue albAlbergue, AlbPersonalAdministrativo albPersonalAdministrativo, AlbPerfil albPerfil, String padUsuario, String padContrasenia, Integer padEstado) {
       this.padId = padId;
       this.albAlbergue = albAlbergue;
       this.albPersonalAdministrativo = albPersonalAdministrativo;
       this.albPerfil = albPerfil;
       this.padUsuario = padUsuario;
       this.padContrasenia = padContrasenia;
       this.padEstado = padEstado;
    }
   
    public Long getPadId() {
        return this.padId;
    }
    
    public void setPadId(Long padId) {
        this.padId = padId;
    }

    public AlbAlbergue getAlbAlbergue() {
        return albAlbergue;
    }

    public void setAlbAlbergue(AlbAlbergue albAlbergue) {
        this.albAlbergue = albAlbergue;
    }

    public AlbPersonalAdministrativo getAlbPersonalAdministrativo() {
        return albPersonalAdministrativo;
    }

    public void setAlbPersonalAdministrativo(AlbPersonalAdministrativo albPersonalAdministrativo) {
        this.albPersonalAdministrativo = albPersonalAdministrativo;
    }

    public AlbPerfil getAlbPerfil() {
        return albPerfil;
    }

    public void setAlbPerfil(AlbPerfil albPerfil) {
        this.albPerfil = albPerfil;
    }
    
    public String getPadUsuario() {
        return this.padUsuario;
    }
    
    public void setPadUsuario(String padUsuario) {
        this.padUsuario = padUsuario;
    }
    public String getPadContrasenia() {
        return this.padContrasenia;
    }
    
    public void setPadContrasenia(String padContrasenia) {
        this.padContrasenia = padContrasenia;
    }
    public Integer getPadEstado() {
        return this.padEstado;
    }
    
    public void setPadEstado(Integer padEstado) {
        this.padEstado = padEstado;
    }




}

