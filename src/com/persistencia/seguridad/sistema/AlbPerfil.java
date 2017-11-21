package com.persistencia.seguridad.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbPerfil generated by hbm2java
 */
public class AlbPerfil  implements java.io.Serializable {


     private Long perId;
     private String perNombre;
     private Integer perEstado;
     private Set<PantallaPerfil> pantallaPerfils = new HashSet<PantallaPerfil>(0);
     
    public AlbPerfil() {
    }

    public AlbPerfil(String perNombre, Integer perEstado, Set<PantallaPerfil> pantallaPerfils) {
        this.perNombre = perNombre;
        this.perEstado = perEstado;
        this.pantallaPerfils=pantallaPerfils;
    }
   
   
    public Long getPerId() {
        return this.perId;
    }
    
    public void setPerId(Long perId) {
        this.perId = perId;
    }
    public String getPerNombre() {
        return this.perNombre;
    }
    
    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }
    
    public Integer getPerEstado() {
        return this.perEstado;
    }
    
    public void setPerEstado(Integer perEstado) {
        this.perEstado = perEstado;
    }

    public Set<PantallaPerfil> getPantallaPerfils() {
        return pantallaPerfils;
    }

    public void setPantallaPerfils(Set<PantallaPerfil> pantallaPerfils) {
        this.pantallaPerfils = pantallaPerfils;
    }

   
}


