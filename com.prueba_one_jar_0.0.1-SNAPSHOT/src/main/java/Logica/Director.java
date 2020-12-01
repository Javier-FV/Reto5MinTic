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
@Table(name = "director")
public class Director implements Serializable {
    
    @Id
    @GeneratedValue
    @Column
    private long dir_id;
    
    @Column
    private String dir_nombre;
    
    @Column
    private String dir_apellido;
    
    @Column
    private String dir_nacionalidad; 

    public Director(long dir_id, String dir_nombre, String dir_apellido, String dir_nacionalidad) {
        this.dir_id = dir_id;
        this.dir_nombre = dir_nombre;
        this.dir_apellido = dir_apellido;
        this.dir_nacionalidad = dir_nacionalidad;
    }
    public Director() {
        
    }

    public long getDir_id() {
        return dir_id;
    }

    public void setDir_id(long dir_id) {
        this.dir_id = dir_id;
    }

    public String getDir_nombre() {
        return dir_nombre;
    }

    public void setDir_nombre(String dir_nombre) {
        this.dir_nombre = dir_nombre;
    }

    public String getDir_apellido() {
        return dir_apellido;
    }

    public void setDir_apellido(String dir_apellido) {
        this.dir_apellido = dir_apellido;
    }

    public String getDir_nacionalidad() {
        return dir_nacionalidad;
    }

    public void setDir_nacionalidad(String dir_nacionalidad) {
        this.dir_nacionalidad = dir_nacionalidad;
    }

    @Override
    public String toString() {
        return "Director{" + "dir_id=" + dir_id + ", dir_nombre=" + dir_nombre + ", dir_apellido=" + dir_apellido + ", dir_nacionalidad=" + dir_nacionalidad + '}';
    }

    
}
