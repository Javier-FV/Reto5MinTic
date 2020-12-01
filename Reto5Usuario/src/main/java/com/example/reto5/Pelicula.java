/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author javie
 */
@Entity
@Table(name = "pelicula")
public class Pelicula {
    
    @Id
    @Column(name = "peli_id")
    Integer peliId;
    @Column(name = "peli_titulo")
    String peliTitulo;
    @Column(name = "peli_resumen")
    String userApellido;
    @Column(name = "peli_anno")
    String useEmail;
    @Column(name = "peli_director")
    String userCelular;

    public Pelicula(Integer peliId, String peli, String userApellido, String useEmail, String userCelular) {
        this.peliId = peliId;
        this.peliTitulo = peli;
        this.userApellido = userApellido;
        this.useEmail = useEmail;
        this.userCelular = userCelular;
    }
    
    public Pelicula(){
        
    }

    public Integer getPeliId() {
        return peliId;
    }

    public void setPeliId(Integer peliId) {
        this.peliId = peliId;
    }

    public String getPeliTitulo() {
        return peliTitulo;
    }

    public void setPeliTitulo(String peli) {
        this.peliTitulo = peli;
    }

    public String getUserApellido() {
        return userApellido;
    }

    public void setUserApellido(String userApellido) {
        this.userApellido = userApellido;
    }

    public String getUseEmail() {
        return useEmail;
    }

    public void setUseEmail(String useEmail) {
        this.useEmail = useEmail;
    }

    public String getUserCelular() {
        return userCelular;
    }

    public void setUserCelular(String userCelular) {
        this.userCelular = userCelular;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "peliId=" + peliId + ", peli=" + peliTitulo + ", userApellido=" + userApellido + ", useEmail=" + useEmail + ", userCelular=" + userCelular + '}';
    }
    
    
}
