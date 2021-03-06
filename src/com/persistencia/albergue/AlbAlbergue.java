package com.persistencia.albergue;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1


import com.persistencia.damnificado.AlbDamnificado;
import com.persistencia.general.sistema.AlbProvincia;
import com.persistencia.general.sistema.AlbParroquia;
import com.persistencia.general.sistema.AlbCanton;
import com.persistencia.general.sistema.AlbAvanceImplementacion;
import com.persistencia.general.sistema.AlbTipoAlbergue;
import java.util.HashSet;
import java.util.Set;

/**
 * AlbAlbergue generated by hbm2java
 */
public class AlbAlbergue  implements java.io.Serializable {


     private Long albId;
     private AlbAvanceImplementacion albAvanceImplementacion;
     private AlbCanton albCanton;
     private AlbParroquia albParroquia;
     private AlbProvincia albProvincia;
     private String albNombre;
     private String albDireccion;
     private AlbTipoAlbergue albTipoAlbergue;
     private Float albArea;
     private Float albCoordx;
     private Float albCoordy;
     private String albObservaciones;
     private int albEstado;
     
     private Set<AlbDamnificado> damnificadoAlbergues = new HashSet <AlbDamnificado>();
     
     private Set albCarpas = new HashSet(0);
     private Set albVehiculos = new HashSet(0);
     private Set partediarioAlbergues = new HashSet(0);
     private Set servicioSituacionAlbergues = new HashSet(0);

    public AlbAlbergue() {
    }

    public AlbAlbergue(AlbAvanceImplementacion albAvanceImplementacion, AlbCanton albCanton, AlbParroquia albParroquia, AlbProvincia albProvincia, String albNombre, String albDireccion, AlbTipoAlbergue albTipoAlbergue, Float albArea, Float albCoordx, Float albCoordy, String albObservaciones,int albEstado , Set albCarpas, Set albVehiculos, Set partediarioAlbergues, Set damnificadoAlbergues, Set servicioSituacionAlbergues) {
       this.albAvanceImplementacion = albAvanceImplementacion;
       this.albCanton = albCanton;
       this.albParroquia = albParroquia;
       this.albProvincia = albProvincia;
       this.albNombre = albNombre;
       this.albDireccion = albDireccion;
       this.albTipoAlbergue = albTipoAlbergue;
       this.albArea = albArea;
       this.albCoordx = albCoordx;
       this.albCoordy = albCoordy;
       this.albObservaciones = albObservaciones;
       this.albEstado=albEstado;
       this.albCarpas = albCarpas;
       this.albVehiculos = albVehiculos;
       this.partediarioAlbergues = partediarioAlbergues;
       this.damnificadoAlbergues = damnificadoAlbergues;
       this.servicioSituacionAlbergues = servicioSituacionAlbergues;
    }
   
    public Long getAlbId() {
        return this.albId;
    }
    
    public void setAlbId(Long albId) {
        this.albId = albId;
    }
    public AlbAvanceImplementacion getAlbAvanceImplementacion() {
        return this.albAvanceImplementacion;
    }
    
    public void setAlbAvanceImplementacion(AlbAvanceImplementacion albAvanceImplementacion) {
        this.albAvanceImplementacion = albAvanceImplementacion;
    }
    public AlbCanton getAlbCanton() {
        return this.albCanton;
    }
    
    public void setAlbCanton(AlbCanton albCanton) {
        this.albCanton = albCanton;
    }
    public AlbParroquia getAlbParroquia() {
        return this.albParroquia;
    }
    
    public void setAlbParroquia(AlbParroquia albParroquia) {
        this.albParroquia = albParroquia;
    }
    public AlbProvincia getAlbProvincia() {
        return this.albProvincia;
    }
    
    public void setAlbProvincia(AlbProvincia albProvincia) {
        this.albProvincia = albProvincia;
    }
    public String getAlbNombre() {
        return this.albNombre;
    }
    
    public void setAlbNombre(String albNombre) {
        this.albNombre = albNombre;
    }
    public String getAlbDireccion() {
        return this.albDireccion;
    }
    
    public void setAlbDireccion(String albDireccion) {
        this.albDireccion = albDireccion;
    }

    public AlbTipoAlbergue getAlbTipoAlbergue() {
        return albTipoAlbergue;
    }

    public void setAlbTipoAlbergue(AlbTipoAlbergue albTipoAlbergue) {
        this.albTipoAlbergue = albTipoAlbergue;
    }
    
    public Float getAlbArea() {
        return this.albArea;
    }
    
    public void setAlbArea(Float albArea) {
        this.albArea = albArea;
    }
    public Float getAlbCoordx() {
        return this.albCoordx;
    }
    
    public void setAlbCoordx(Float albCoordx) {
        this.albCoordx = albCoordx;
    }
    public Float getAlbCoordy() {
        return this.albCoordy;
    }
    
    public void setAlbCoordy(Float albCoordy) {
        this.albCoordy = albCoordy;
    }
    public String getAlbObservaciones() {
        return this.albObservaciones;
    }
    
    public void setAlbObservaciones(String albObservaciones) {
        this.albObservaciones = albObservaciones;
    }
    public Set getAlbCarpas() {
        return this.albCarpas;
    }
    
    public void setAlbCarpas(Set albCarpas) {
        this.albCarpas = albCarpas;
    }
    public Set getAlbVehiculos() {
        return this.albVehiculos;
    }
    
    public void setAlbVehiculos(Set albVehiculos) {
        this.albVehiculos = albVehiculos;
    }
    public Set getPartediarioAlbergues() {
        return this.partediarioAlbergues;
    }
    
    public void setPartediarioAlbergues(Set partediarioAlbergues) {
        this.partediarioAlbergues = partediarioAlbergues;
    }

    public Set<AlbDamnificado> getDamnificadoAlbergues() {
        return damnificadoAlbergues;
    }

    public void setDamnificadoAlbergues(Set<AlbDamnificado> damnificadoAlbergues) {
        this.damnificadoAlbergues = damnificadoAlbergues;
    }
    public Set getServicioSituacionAlbergues() {
        return this.servicioSituacionAlbergues;
    }
    
    public void setServicioSituacionAlbergues(Set servicioSituacionAlbergues) {
        this.servicioSituacionAlbergues = servicioSituacionAlbergues;
    }

    public int getAlbEstado() {
        return albEstado;
    }

    public void setAlbEstado(int albEstado) {
        this.albEstado = albEstado;
    }

    public void addDamnificado(AlbDamnificado damnificado) {
        this.damnificadoAlbergues.add(damnificado);
    }
 


    
}


