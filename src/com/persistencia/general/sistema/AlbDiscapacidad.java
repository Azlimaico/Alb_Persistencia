package com.persistencia.general.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbDiscapacidad generated by hbm2java
 */
public class AlbDiscapacidad  implements java.io.Serializable {


     private Long disId;
     private String disTipo;
     private Integer disEstado;
     private Set albDamnificados = new HashSet(0);
     private Set damnificadoDiscapacidads = new HashSet(0);

    public AlbDiscapacidad() {
    }

    public AlbDiscapacidad(String disTipo, Integer disEstado, Set albDamnificados, Set damnificadoDiscapacidads) {
       this.disTipo = disTipo;
       this.disEstado = disEstado;
       this.albDamnificados = albDamnificados;
       this.damnificadoDiscapacidads = damnificadoDiscapacidads;
    }
   
    public Long getDisId() {
        return this.disId;
    }
    
    public void setDisId(Long disId) {
        this.disId = disId;
    }
    public String getDisTipo() {
        return this.disTipo;
    }
    
    public void setDisTipo(String disTipo) {
        this.disTipo = disTipo;
    }
    public Integer getDisEstado() {
        return this.disEstado;
    }
    
    public void setDisEstado(Integer disEstado) {
        this.disEstado = disEstado;
    }
    public Set getAlbDamnificados() {
        return this.albDamnificados;
    }
    
    public void setAlbDamnificados(Set albDamnificados) {
        this.albDamnificados = albDamnificados;
    }
    public Set getDamnificadoDiscapacidads() {
        return this.damnificadoDiscapacidads;
    }
    
    public void setDamnificadoDiscapacidads(Set damnificadoDiscapacidads) {
        this.damnificadoDiscapacidads = damnificadoDiscapacidads;
    }




}


