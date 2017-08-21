package com.persistencia.seguridad.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbMenu generated by hbm2java
 */
public class AlbMenu  implements java.io.Serializable {


     private Long menId;
     private String menNombre;
     private Integer menEstado;
     private Set albPantallas = new HashSet(0);

    public AlbMenu() {
    }

    public AlbMenu(String menNombre, Integer menEstado, Set albPantallas) {
       this.menNombre = menNombre;
       this.menEstado = menEstado;
       this.albPantallas = albPantallas;
    }
   
    public Long getMenId() {
        return this.menId;
    }
    
    public void setMenId(Long menId) {
        this.menId = menId;
    }
    public String getMenNombre() {
        return this.menNombre;
    }
    
    public void setMenNombre(String menNombre) {
        this.menNombre = menNombre;
    }
    public Integer getMenEstado() {
        return this.menEstado;
    }
    
    public void setMenEstado(Integer menEstado) {
        this.menEstado = menEstado;
    }
    public Set getAlbPantallas() {
        return this.albPantallas;
    }
    
    public void setAlbPantallas(Set albPantallas) {
        this.albPantallas = albPantallas;
    }




}


