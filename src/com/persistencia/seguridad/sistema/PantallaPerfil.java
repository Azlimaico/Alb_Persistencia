package com.persistencia.seguridad.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1

/**
 * PantallaPerfil generated by hbm2java
 */
public class PantallaPerfil implements java.io.Serializable {

    private Long PantallaPerfilId;
    private AlbPantalla albPantalla;
    private AlbPerfil albPerfil;

   
    public PantallaPerfil() {
    }

    public PantallaPerfil(AlbPantalla albPantalla, AlbPerfil albPerfil) {
        this.albPantalla = albPantalla;
        this.albPerfil = albPerfil;
    }

    public Long getPantallaPerfilId() {
        return PantallaPerfilId;
    }

    public void setPantallaPerfilId(Long PantallaPerfilId) {
        this.PantallaPerfilId = PantallaPerfilId;
    }

    public AlbPantalla getAlbPantalla() {
        return this.albPantalla;
    }

    public void setAlbPantalla(AlbPantalla albPantalla) {
        this.albPantalla = albPantalla;
    }

    public AlbPerfil getAlbPerfil() {
        return this.albPerfil;
    }

    public void setAlbPerfil(AlbPerfil albPerfil) {
        this.albPerfil = albPerfil;
    }




}


