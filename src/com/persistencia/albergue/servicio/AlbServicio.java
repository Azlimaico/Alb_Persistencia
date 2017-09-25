package com.persistencia.albergue.servicio;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import com.persistencia.general.sistema.AlbEmpresa;
import java.util.HashSet;
import java.util.Set;

public class AlbServicio  implements java.io.Serializable {


     private Long serId;
     private AlbEmpresa albEmpresa;
     private String serNombre;
     private Integer serEstado;
     private Set servicioSituacionAlbergues = new HashSet(0);

    public AlbServicio() {
    }

    public AlbServicio(AlbEmpresa albEmpresa, String serNombre, Integer serEstado, Set servicioSituacionAlbergues) {
        this.albEmpresa= albEmpresa;
        this.serNombre = serNombre;
       this.serEstado = serEstado;
       this.servicioSituacionAlbergues = servicioSituacionAlbergues;
    }
   
    public Long getSerId() {
        return this.serId;
    }
    
    public void setSerId(Long serId) {
        this.serId = serId;
    }
    public String getSerNombre() {
        return this.serNombre;
    }
    
    public void setSerNombre(String serNombre) {
        this.serNombre = serNombre;
    }
    public Integer getSerEstado() {
        return this.serEstado;
    }
    
    public void setSerEstado(Integer serEstado) {
        this.serEstado = serEstado;
    }
    public Set getServicioSituacionAlbergues() {
        return this.servicioSituacionAlbergues;
    }
    
    public void setServicioSituacionAlbergues(Set servicioSituacionAlbergues) {
        this.servicioSituacionAlbergues = servicioSituacionAlbergues;
    }

    public AlbEmpresa getAlbEmpresa() {
        return albEmpresa;
    }

    public void setAlbEmpresa(AlbEmpresa albEmpresa) {
        this.albEmpresa = albEmpresa;
    }

    
}


