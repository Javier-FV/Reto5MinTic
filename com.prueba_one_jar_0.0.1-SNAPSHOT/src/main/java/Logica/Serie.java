/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

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
@Table(name = "serie")
public class Serie implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private long idserie;
    
    @Column
    private String nombreserie;
    
    @Column
    private int temporadaserie;
    
    @Column
    private int episodioserie;

    public Serie(long idserie, String nombreserie, int temporadaserie, int episodioserie) {
        this.idserie = idserie;
        this.nombreserie = nombreserie;
        this.temporadaserie = temporadaserie;
        this.episodioserie = episodioserie;
    }
    
     public Serie() {
        
    }
    
    

    public long getIdserie() {
        return idserie;
    }

    public void setIdserie(long idserie) {
        this.idserie = idserie;
    }

    public String getNombreserie() {
        return nombreserie;
    }

    public void setNombreserie(String nombreserie) {
        this.nombreserie = nombreserie;
    }

    public int getTemporadaserie() {
        return temporadaserie;
    }

    public void setTemporadaserie(int temporadaserie) {
        this.temporadaserie = temporadaserie;
    }

    public int getEpisodioserie() {
        return episodioserie;
    }

    public void setEpisodioserie(int episodioserie) {
        this.episodioserie = episodioserie;
    }

    @Override
    public String toString() {
        return "Serie{" + "idserie=" + idserie + ", nombreserie=" + nombreserie + ", temporadaserie=" + temporadaserie + ", episodioserie=" + episodioserie + '}';
    }
}
