package com.persistencia.general.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AlbRango generated by hbm2java
 */
public class AlbRango  implements java.io.Serializable {


     private Long ranId;
     private String ranRango;
     private Integer ranEstado;
     private Set albPersonalAdministrativos = new HashSet(0);

    public AlbRango() {
    }

    public AlbRango(String ranRango, Integer ranEstado, Set albPersonalAdministrativos) {
       this.ranRango = ranRango;
       this.ranEstado = ranEstado;
       this.albPersonalAdministrativos = albPersonalAdministrativos;
    }
   
    public Long getRanId() {
        return this.ranId;
    }
    
    public void setRanId(Long ranId) {
        this.ranId = ranId;
    }
    public String getRanRango() {
        return this.ranRango;
    }
    
    public void setRanRango(String ranRango) {
        this.ranRango = ranRango;
    }
    public Integer getRanEstado() {
        return this.ranEstado;
    }
    
    public void setRanEstado(Integer ranEstado) {
        this.ranEstado = ranEstado;
    }
    public Set getAlbPersonalAdministrativos() {
        return this.albPersonalAdministrativos;
    }
    
    public void setAlbPersonalAdministrativos(Set albPersonalAdministrativos) {
        this.albPersonalAdministrativos = albPersonalAdministrativos;
    }




}


