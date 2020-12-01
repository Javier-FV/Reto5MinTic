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
@Table(name="serie")
public class Serie {
    @Id
    @Column(name = "serie_id")
    Integer serieId;
    @Column(name = "serie_titulo")
    String serieTitulo;
    @Column(name = "serie_numepis")
    String serieNumepis;
    @Column(name = "serie_numtemp")
    String serieNumtemp;

    public Serie(Integer serieId, String serieTitulo, String serieNumepis, String serieNumtemp) {
        this.serieId = serieId;
        this.serieTitulo = serieTitulo;
        this.serieNumepis = serieNumepis;
        this.serieNumtemp = serieNumtemp;
    }
    
    public Serie(){
        
    }

    public Integer getSerieId() {
        return serieId;
    }

    public void setSerieId(Integer serieId) {
        this.serieId = serieId;
    }

    public String getSerieTitulo() {
        return serieTitulo;
    }

    public void setSerieTitulo(String serieTitulo) {
        this.serieTitulo = serieTitulo;
    }

    public String getSerieNumepis() {
        return serieNumepis;
    }

    public void setSerieNumepis(String serieNumepis) {
        this.serieNumepis = serieNumepis;
    }

    public String getSerieNumtemp() {
        return serieNumtemp;
    }

    public void setSerieNumtemp(String serieNumtemp) {
        this.serieNumtemp = serieNumtemp;
    }

    @Override
    public String toString() {
        return "Serie{" + "serieId=" + serieId + ", serieTitulo=" + serieTitulo + ", serieNumepis=" + serieNumepis + ", serieNumtemp=" + serieNumtemp + '}';
    }
    
}
