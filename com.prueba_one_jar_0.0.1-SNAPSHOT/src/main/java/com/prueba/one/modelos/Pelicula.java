/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.one.modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
/**
 *
 * @author usuario
 */
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {
    @Id
    @GeneratedValue
    @Column
    private long idpelicula ;
    
    @Column
    private String nombrepelicula;
    
    @Column
    private String resumenpelicula;
    
    @Column
    private int anopelicula;  

    public Pelicula(long idpelicula, String nombrepelicula, String resumenpelicula, int anopelicula) {
        this.idpelicula = idpelicula;
        this.nombrepelicula = nombrepelicula;
        this.resumenpelicula = resumenpelicula;
        this.anopelicula = anopelicula;
    }
    
    public Pelicula() {
       
    }
    
    

    public long getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(long idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    public String getResumenpelicula() {
        return resumenpelicula;
    }

    public void setResumenpelicula(String resumenpelicula) {
        this.resumenpelicula = resumenpelicula;
    }

    public int getAnopelicula() {
        return anopelicula;
    }

    public void setAnopelicula(int anopelicula) {
        this.anopelicula = anopelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idpelicula=" + idpelicula + ", nombrepelicula=" + nombrepelicula + ", resumenpelicula=" + resumenpelicula + ", anopelicula=" + anopelicula + '}';
    }

    
}
