package com.persistencia.general.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbProvincia generated by hbm2java
 */
public class AlbProvincia  implements java.io.Serializable {


     private Long proId;
     private String proNombre;
     private Integer proEstado;
     private Set albAlbergues = new HashSet(0);

    public AlbProvincia() {
    }

    public AlbProvincia(String proNombre, Integer proEstado,  Set albAlbergues) {
       this.proNombre = proNombre;
       this.proEstado = proEstado;
       this.albAlbergues = albAlbergues;
      
    }
   
    public Long getProId() {
        return this.proId;
    }
    
    public void setProId(Long proId) {
        this.proId = proId;
    }
    public String getProNombre() {
        return this.proNombre;
    }
    
    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }
    public Integer getProEstado() {
        return this.proEstado;
    }
    
    public void setProEstado(Integer proEstado) {
        this.proEstado = proEstado;
    }
    public Set getAlbAlbergues() {
        return this.albAlbergues;
    }
    
    public void setAlbAlbergues(Set albAlbergues) {
        this.albAlbergues = albAlbergues;
    }

}

