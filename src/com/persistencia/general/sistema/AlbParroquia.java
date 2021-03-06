package com.persistencia.general.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbParroquia generated by hbm2java
 */
public class AlbParroquia  implements java.io.Serializable {


     private Long parId;
     private String parNombre;
     private Integer parEstado;
     private AlbCanton albCanton;
     private Set albAlbergues = new HashSet(0);

    public AlbParroquia() {
    }

    public AlbParroquia(String parNombre, Integer parEstado, Set albAlbergues) {
       this.parNombre = parNombre;
       this.parEstado = parEstado;
       this.albAlbergues = albAlbergues;
    }
   
    public Long getParId() {
        return this.parId;
    }
    
    public void setParId(Long parId) {
        this.parId = parId;
    }
    public String getParNombre() {
        return this.parNombre;
    }
    
    public void setParNombre(String parNombre) {
        this.parNombre = parNombre;
    }
    public Integer getParEstado() {
        return this.parEstado;
    }
    
    public void setParEstado(Integer parEstado) {
        this.parEstado = parEstado;
    }
    public Set getAlbAlbergues() {
        return this.albAlbergues;
    }
    
    public void setAlbAlbergues(Set albAlbergues) {
        this.albAlbergues = albAlbergues;
    }

    public AlbCanton getAlbCanton() {
        return albCanton;
    }

    public void setAlbCanton(AlbCanton albCanton) {
        this.albCanton = albCanton;
    }
    
    

}


