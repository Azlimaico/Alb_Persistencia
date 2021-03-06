package com.persistencia.general.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1

import com.persistencia.albergue.AlbAlbergue;

/**
 * AlbVehiculo generated by hbm2java
 */
public class AlbVehiculo  implements java.io.Serializable {


     private Long vehId;
     private AlbAlbergue albAlbergue;
     private AlbTipoVehiculo albTipoVehiculo;
     private Integer vehCantidad;
     private Float vehKm;
     private String vehConductores;
     private Integer vehEstado;

    public AlbVehiculo() {
    }

    public AlbVehiculo(AlbAlbergue albAlbergue, AlbTipoVehiculo albTipoVehiculo, Integer vehCantidad, Float vehKm, String vehConductores, Integer vehEstado) {
       this.albAlbergue = albAlbergue;
       this.albTipoVehiculo = albTipoVehiculo;
       this.vehCantidad = vehCantidad;
       this.vehKm = vehKm;
       this.vehConductores = vehConductores;
       this.vehEstado = vehEstado;
    }
   
    public Long getVehId() {
        return this.vehId;
    }
    
    public void setVehId(Long vehId) {
        this.vehId = vehId;
    }
    public AlbAlbergue getAlbAlbergue() {
        return this.albAlbergue;
    }
    
    public void setAlbAlbergue(AlbAlbergue albAlbergue) {
        this.albAlbergue = albAlbergue;
    }
    public AlbTipoVehiculo getAlbTipoVehiculo() {
        return this.albTipoVehiculo;
    }
    
    public void setAlbTipoVehiculo(AlbTipoVehiculo albTipoVehiculo) {
        this.albTipoVehiculo = albTipoVehiculo;
    }
    public Integer getVehCantidad() {
        return this.vehCantidad;
    }
    
    public void setVehCantidad(Integer vehCantidad) {
        this.vehCantidad = vehCantidad;
    }
    public Float getVehKm() {
        return this.vehKm;
    }
    
    public void setVehKm(Float vehKm) {
        this.vehKm = vehKm;
    }
    public String getVehConductores() {
        return this.vehConductores;
    }
    
    public void setVehConductores(String vehConductores) {
        this.vehConductores = vehConductores;
    }
    public Integer getVehEstado() {
        return this.vehEstado;
    }
    
    public void setVehEstado(Integer vehEstado) {
        this.vehEstado = vehEstado;
    }




}


