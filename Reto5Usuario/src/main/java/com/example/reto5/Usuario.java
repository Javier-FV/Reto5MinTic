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
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "user_id")
    String userId;
    @Column(name = "user_nombre")
    String userNombre;
    @Column(name = "user_apellido")
    String userApellido;
    @Column(name = "user_email")
    String userEmail;
    @Column(name = "user_celular")
    String userCelular;
    @Column(name = "user_contrasena")
    String userContrasena;
    @Column(name = "user_fechanaci")
    String userFechanaci;

    public Usuario(String userId, String userNombre, String userApellido, String useEmail, String userCelular, String userContrasena, String userFechanaci) {
        this.userId = userId;
        this.userNombre = userNombre;
        this.userApellido = userApellido;
        this.userEmail = useEmail;
        this.userCelular = userCelular;
        this.userContrasena = userContrasena;
        this.userFechanaci = userFechanaci;
    }
    
    public Usuario(){
        
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNombre() {
        return userNombre;
    }

    public void setUserNombre(String userNombre) {
        this.userNombre = userNombre;
    }

    public String getUserApellido() {
        return userApellido;
    }

    public void setUserApellido(String userApellido) {
        this.userApellido = userApellido;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCelular() {
        return userCelular;
    }

    public void setUserCelular(String userCelular) {
        this.userCelular = userCelular;
    }

    public String getUserContrasena() {
        return userContrasena;
    }

    public void setUserContrasena(String userContrasena) {
        this.userContrasena = userContrasena;
    }

    public String getUserFechanaci() {
        return userFechanaci;
    }

    public void setUserFechanaci(String userFechanaci) {
        this.userFechanaci = userFechanaci;
    }

    @Override
    public String toString() {
        return "Usuario{" + "userId=" + userId + ", userNombre=" + userNombre + ", userApellido=" + userApellido + ", useEmail=" + userEmail + ", userCelular=" + userCelular + ", userContrasena=" + userContrasena + ", userFechanaci=" + userFechanaci + '}';
    }
    
    
}
