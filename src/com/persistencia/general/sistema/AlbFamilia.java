package com.persistencia.general.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbFamilia generated by hbm2java
 */
public class AlbFamilia  implements java.io.Serializable {


     private Long famId;
     private Integer famNumIntegrantes;
     private Integer famEstado;
     private Set albDamnificados = new HashSet(0);

    public AlbFamilia() {
    }

    public AlbFamilia(Integer famNumIntegrantes, Integer famEstado, Set albDamnificados) {
       this.famNumIntegrantes = famNumIntegrantes;
       this.famEstado = famEstado;
       this.albDamnificados = albDamnificados;
    }
   
    public Long getFamId() {
        return this.famId;
    }
    
    public void setFamId(Long famId) {
        this.famId = famId;
    }
    public Integer getFamNumIntegrantes() {
        return this.famNumIntegrantes;
    }
    
    public void setFamNumIntegrantes(Integer famNumIntegrantes) {
        this.famNumIntegrantes = famNumIntegrantes;
    }
    public Integer getFamEstado() {
        return this.famEstado;
    }
    
    public void setFamEstado(Integer famEstado) {
        this.famEstado = famEstado;
    }
    public Set getAlbDamnificados() {
        return this.albDamnificados;
    }
    
    public void setAlbDamnificados(Set albDamnificados) {
        this.albDamnificados = albDamnificados;
    }




}


