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
@Table(name = "usuario")
public class Usuario implements Serializable  {
    
    @Id
    @GeneratedValue
    @Column
    private long idusuario;
    
    @Column
    private String nombreusuario;
    
    @Column
    private String apellidousuario;

    public Usuario(long idusuario, String nombreusuario, String apellidousuario) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.apellidousuario = apellidousuario;
    }
    public Usuario() {
        
    }
    
    

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", nombreusuario=" + nombreusuario + ", apellidousuario=" + apellidousuario + '}';
    }

    
        
    
}
