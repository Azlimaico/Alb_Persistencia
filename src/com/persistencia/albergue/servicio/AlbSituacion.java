package com.persistencia.albergue.servicio;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1

import com.persistencia.albergue.ServicioSituacionAlbergue;




/**
 * AlbSituacion generated by hbm2java
 */
public class AlbSituacion  implements java.io.Serializable {


     private Long sitId;
     private ServicioSituacionAlbergue servicioSituacionAlbergue;
     private String sitMetProvision;
     private String sitMetProvisionInternet;
     private String sitAlmacenamiento;
     private String sitAguaBebible;
     private String sitAlcanceServicio;
     private String sitAlcanceInternet;
     private String sitServicioLavanderias;
     private String sitAlcantarillado;
     private Integer sitSanitarioFijoHombres;
     private Integer sitSanitarioFijoMujeres;
     private Integer sitSanitarioMovilIndividualHombres;
     private Integer sitSanitarioMovilIndividualMujeres;
     private Integer sitSanitarioMovilContinerHombres;
     private Integer sitSanitarioMovilConteinerMujeres;
     private Integer sitLetrinaFijaHombres;
     private Integer sitLetrinaFijaMujeres;
     private Integer sitLetrinaMovilHombres;
     private Integer sitLetrinaMovilMujeres;
     private Integer sitSanitarioDiscapacitadoHom;
     private Integer sitSanitarioDiscapacitadoMuj;
     private Integer sitDuchasHombres;
     private Integer sitDuchasMujeres;
     private Integer sitDuchasDiscapacitadosHom;
     private Integer sitDuchasDiscapacitadosMuj;
     private String sitInstalacionDisponible;
     private String sitTipoInstalacion;
     private String sitMetodoServicio;
     private String sitMetodoEvacuacion;
     private String sitCombustibleEmpleado;
     private String sitMediosEmpleados;
     private String sitDescripcion;
     private Integer sitEstado;

    public AlbSituacion() {
    }

    public AlbSituacion(ServicioSituacionAlbergue servicioSituacionAlbergue, String sitMetProvision, String sitAlmacenamiento, String sitAguaBebible, String sitAlcanceServicio, String sitServicioLavanderias, String sitAlcantarillado, Integer sitSanitarioFijoHombres, Integer sitSanitarioFijoMujeres, Integer sitSanitarioMovilIndividualHombres, Integer sitSanitarioMovilIndividualMujeres, Integer sitSanitarioMovilContinerHombres, Integer sitSanitarioMovilConteinerMujeres, Integer sitLetrinaFijaHombres, Integer sitLetrinaFijaMujeres, Integer sitLetrinaMovilHombres, Integer sitLetrinaMovilMujeres, Integer sitSanitarioDiscapacitadoHom, Integer sitSanitarioDiscapacitadoMuj, Integer sitDuchasHombres, Integer sitDuchasMujeres, Integer sitDuchasDiscapacitadosHom, Integer sitDuchasDiscapacitadosMuj, String sitInstalacionDisponible, String sitTipoInstalacion, String sitMetodoServicio, String sitMetodoEvacuacion, String sitCombustibleEmpleado, String sitMediosEmpleados, String sitDescripcion, Integer sitEstado) {
       this.servicioSituacionAlbergue = servicioSituacionAlbergue;
       this.sitMetProvision = sitMetProvision;
       this.sitAlmacenamiento = sitAlmacenamiento;
       this.sitAguaBebible = sitAguaBebible;
       this.sitAlcanceServicio = sitAlcanceServicio;
       this.sitServicioLavanderias = sitServicioLavanderias;
       this.sitAlcantarillado = sitAlcantarillado;
       this.sitSanitarioFijoHombres = sitSanitarioFijoHombres;
       this.sitSanitarioFijoMujeres = sitSanitarioFijoMujeres;
       this.sitSanitarioMovilIndividualHombres = sitSanitarioMovilIndividualHombres;
       this.sitSanitarioMovilIndividualMujeres = sitSanitarioMovilIndividualMujeres;
       this.sitSanitarioMovilContinerHombres = sitSanitarioMovilContinerHombres;
       this.sitSanitarioMovilConteinerMujeres = sitSanitarioMovilConteinerMujeres;
       this.sitLetrinaFijaHombres = sitLetrinaFijaHombres;
       this.sitLetrinaFijaMujeres = sitLetrinaFijaMujeres;
       this.sitLetrinaMovilHombres = sitLetrinaMovilHombres;
       this.sitLetrinaMovilMujeres = sitLetrinaMovilMujeres;
       this.sitSanitarioDiscapacitadoHom = sitSanitarioDiscapacitadoHom;
       this.sitSanitarioDiscapacitadoMuj = sitSanitarioDiscapacitadoMuj;
       this.sitDuchasHombres = sitDuchasHombres;
       this.sitDuchasMujeres = sitDuchasMujeres;
       this.sitDuchasDiscapacitadosHom = sitDuchasDiscapacitadosHom;
       this.sitDuchasDiscapacitadosMuj = sitDuchasDiscapacitadosMuj;
       this.sitInstalacionDisponible = sitInstalacionDisponible;
       this.sitTipoInstalacion = sitTipoInstalacion;
       this.sitMetodoServicio = sitMetodoServicio;
       this.sitMetodoEvacuacion = sitMetodoEvacuacion;
       this.sitCombustibleEmpleado = sitCombustibleEmpleado;
       this.sitMediosEmpleados = sitMediosEmpleados;
       this.sitDescripcion = sitDescripcion;
       this.sitEstado = sitEstado;
    }
   
    public Long getSitId() {
        return this.sitId;
    }
    
    public void setSitId(Long sitId) {
        this.sitId = sitId;
    }
    public ServicioSituacionAlbergue getServicioSituacionAlbergue() {
        return this.servicioSituacionAlbergue;
    }
    
    public void setServicioSituacionAlbergue(ServicioSituacionAlbergue servicioSituacionAlbergue) {
        this.servicioSituacionAlbergue = servicioSituacionAlbergue;
    }
    public String getSitMetProvision() {
        return this.sitMetProvision;
    }
    
    public void setSitMetProvision(String sitMetProvision) {
        this.sitMetProvision = sitMetProvision;
    }
    public String getSitAlmacenamiento() {
        return this.sitAlmacenamiento;
    }
    
    public void setSitAlmacenamiento(String sitAlmacenamiento) {
        this.sitAlmacenamiento = sitAlmacenamiento;
    }
 
    public String getSitAguaBebible() {
        return this.sitAguaBebible;
    }
    
    public void setSitAguaBebible(String sitAguaBebible) {
        this.sitAguaBebible = sitAguaBebible;
    }
    public String getSitAlcanceServicio() {
        return this.sitAlcanceServicio;
    }
    
    public void setSitAlcanceServicio(String sitAlcanceServicio) {
        this.sitAlcanceServicio = sitAlcanceServicio;
    }
    public String getSitServicioLavanderias() {
        return this.sitServicioLavanderias;
    }
    
    public void setSitServicioLavanderias(String sitServicioLavanderias) {
        this.sitServicioLavanderias = sitServicioLavanderias;
    }
    public String getSitAlcantarillado() {
        return this.sitAlcantarillado;
    }
    
    public void setSitAlcantarillado(String sitAlcantarillado) {
        this.sitAlcantarillado = sitAlcantarillado;
    }
    public Integer getSitSanitarioFijoHombres() {
        return this.sitSanitarioFijoHombres;
    }
    
    public void setSitSanitarioFijoHombres(Integer sitSanitarioFijoHombres) {
        this.sitSanitarioFijoHombres = sitSanitarioFijoHombres;
    }
    public Integer getSitSanitarioFijoMujeres() {
        return this.sitSanitarioFijoMujeres;
    }
    
    public void setSitSanitarioFijoMujeres(Integer sitSanitarioFijoMujeres) {
        this.sitSanitarioFijoMujeres = sitSanitarioFijoMujeres;
    }
    public Integer getSitSanitarioMovilIndividualHombres() {
        return this.sitSanitarioMovilIndividualHombres;
    }
    
    public void setSitSanitarioMovilIndividualHombres(Integer sitSanitarioMovilIndividualHombres) {
        this.sitSanitarioMovilIndividualHombres = sitSanitarioMovilIndividualHombres;
    }
    public Integer getSitSanitarioMovilIndividualMujeres() {
        return this.sitSanitarioMovilIndividualMujeres;
    }
    
    public void setSitSanitarioMovilIndividualMujeres(Integer sitSanitarioMovilIndividualMujeres) {
        this.sitSanitarioMovilIndividualMujeres = sitSanitarioMovilIndividualMujeres;
    }
    public Integer getSitSanitarioMovilContinerHombres() {
        return this.sitSanitarioMovilContinerHombres;
    }
    
    public void setSitSanitarioMovilContinerHombres(Integer sitSanitarioMovilContinerHombres) {
        this.sitSanitarioMovilContinerHombres = sitSanitarioMovilContinerHombres;
    }
    public Integer getSitSanitarioMovilConteinerMujeres() {
        return this.sitSanitarioMovilConteinerMujeres;
    }
    
    public void setSitSanitarioMovilConteinerMujeres(Integer sitSanitarioMovilConteinerMujeres) {
        this.sitSanitarioMovilConteinerMujeres = sitSanitarioMovilConteinerMujeres;
    }
    public Integer getSitLetrinaFijaHombres() {
        return this.sitLetrinaFijaHombres;
    }
    
    public void setSitLetrinaFijaHombres(Integer sitLetrinaFijaHombres) {
        this.sitLetrinaFijaHombres = sitLetrinaFijaHombres;
    }
    public Integer getSitLetrinaFijaMujeres() {
        return this.sitLetrinaFijaMujeres;
    }
    
    public void setSitLetrinaFijaMujeres(Integer sitLetrinaFijaMujeres) {
        this.sitLetrinaFijaMujeres = sitLetrinaFijaMujeres;
    }
    public Integer getSitLetrinaMovilHombres() {
        return this.sitLetrinaMovilHombres;
    }
    
    public void setSitLetrinaMovilHombres(Integer sitLetrinaMovilHombres) {
        this.sitLetrinaMovilHombres = sitLetrinaMovilHombres;
    }
    public Integer getSitLetrinaMovilMujeres() {
        return this.sitLetrinaMovilMujeres;
    }
    
    public void setSitLetrinaMovilMujeres(Integer sitLetrinaMovilMujeres) {
        this.sitLetrinaMovilMujeres = sitLetrinaMovilMujeres;
    }
    public Integer getSitSanitarioDiscapacitadoHom() {
        return this.sitSanitarioDiscapacitadoHom;
    }
    
    public void setSitSanitarioDiscapacitadoHom(Integer sitSanitarioDiscapacitadoHom) {
        this.sitSanitarioDiscapacitadoHom = sitSanitarioDiscapacitadoHom;
    }
    public Integer getSitSanitarioDiscapacitadoMuj() {
        return this.sitSanitarioDiscapacitadoMuj;
    }
    
    public void setSitSanitarioDiscapacitadoMuj(Integer sitSanitarioDiscapacitadoMuj) {
        this.sitSanitarioDiscapacitadoMuj = sitSanitarioDiscapacitadoMuj;
    }
    public Integer getSitDuchasHombres() {
        return this.sitDuchasHombres;
    }
    
    public void setSitDuchasHombres(Integer sitDuchasHombres) {
        this.sitDuchasHombres = sitDuchasHombres;
    }
    public Integer getSitDuchasMujeres() {
        return this.sitDuchasMujeres;
    }
    
    public void setSitDuchasMujeres(Integer sitDuchasMujeres) {
        this.sitDuchasMujeres = sitDuchasMujeres;
    }
    public Integer getSitDuchasDiscapacitadosHom() {
        return this.sitDuchasDiscapacitadosHom;
    }
    
    public void setSitDuchasDiscapacitadosHom(Integer sitDuchasDiscapacitadosHom) {
        this.sitDuchasDiscapacitadosHom = sitDuchasDiscapacitadosHom;
    }
    public Integer getSitDuchasDiscapacitadosMuj() {
        return this.sitDuchasDiscapacitadosMuj;
    }
    
    public void setSitDuchasDiscapacitadosMuj(Integer sitDuchasDiscapacitadosMuj) {
        this.sitDuchasDiscapacitadosMuj = sitDuchasDiscapacitadosMuj;
    }
    public String getSitInstalacionDisponible() {
        return this.sitInstalacionDisponible;
    }
    
    public void setSitInstalacionDisponible(String sitInstalacionDisponible) {
        this.sitInstalacionDisponible = sitInstalacionDisponible;
    }
    public String getSitTipoInstalacion() {
        return this.sitTipoInstalacion;
    }
    
    public void setSitTipoInstalacion(String sitTipoInstalacion) {
        this.sitTipoInstalacion = sitTipoInstalacion;
    }
    public String getSitMetodoServicio() {
        return this.sitMetodoServicio;
    }
    
    public void setSitMetodoServicio(String sitMetodoServicio) {
        this.sitMetodoServicio = sitMetodoServicio;
    }
    public String getSitMetodoEvacuacion() {
        return this.sitMetodoEvacuacion;
    }
    
    public void setSitMetodoEvacuacion(String sitMetodoEvacuacion) {
        this.sitMetodoEvacuacion = sitMetodoEvacuacion;
    }
    public String getSitCombustibleEmpleado() {
        return this.sitCombustibleEmpleado;
    }
    
    public void setSitCombustibleEmpleado(String sitCombustibleEmpleado) {
        this.sitCombustibleEmpleado = sitCombustibleEmpleado;
    }
    public String getSitMediosEmpleados() {
        return this.sitMediosEmpleados;
    }
    
    public void setSitMediosEmpleados(String sitMediosEmpleados) {
        this.sitMediosEmpleados = sitMediosEmpleados;
    }
    public String getSitDescripcion() {
        return this.sitDescripcion;
    }
    
    public void setSitDescripcion(String sitDescripcion) {
        this.sitDescripcion = sitDescripcion;
    }
    public Integer getSitEstado() {
        return this.sitEstado;
    }
    
    public void setSitEstado(Integer sitEstado) {
        this.sitEstado = sitEstado;
    }

    public String getSitMetProvisionInternet() {
        return sitMetProvisionInternet;
    }

    public void setSitMetProvisionInternet(String sitMetProvisionInternet) {
        this.sitMetProvisionInternet = sitMetProvisionInternet;
    }

    public String getSitAlcanceInternet() {
        return sitAlcanceInternet;
    }

    public void setSitAlcanceInternet(String sitAlcanceInternet) {
        this.sitAlcanceInternet = sitAlcanceInternet;
    }

}


