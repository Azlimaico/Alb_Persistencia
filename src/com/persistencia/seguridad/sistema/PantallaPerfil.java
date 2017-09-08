package com.persistencia.seguridad.sistema;
// Generated 03/06/2017 12:49:18 by Hibernate Tools 4.3.1

/**
 * PantallaPerfil generated by hbm2java
 */
public class PantallaPerfil  implements java.io.Serializable {


     private PantallaPerfilId id;
     private AlbPantalla albPantalla;
     private AlbPerfil albPerfil;

    public PantallaPerfil() {
    }

	
    public PantallaPerfil(PantallaPerfilId id) {
        this.id = id;
    }
    public PantallaPerfil(PantallaPerfilId id, AlbPantalla albPantalla, AlbPerfil albPerfil) {
       this.id = id;
       this.albPantalla = albPantalla;
       this.albPerfil = albPerfil;
    }
   
    public PantallaPerfilId getId() {
        return this.id;
    }
    
    public void setId(PantallaPerfilId id) {
        this.id = id;
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

