/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author javie
 */
@Entity
@Table(name="contenido")



public class Contenido {

    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contenido")
    Integer id_contenido;
    @Column(name = "titulo_contenido")
    String titulo_contenido;
    @Column(name = "tipo_contenido")
    String tipo_contenido;
    
    public Contenido(Integer id_contenido, String titulo_contenido, String tipo_contenido) {
        this.id_contenido = id_contenido;
        this.titulo_contenido = titulo_contenido;
        this.tipo_contenido = tipo_contenido;
    }
    public Contenido(){
        
    }

    public Integer getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(Integer id_contenido) {
        this.id_contenido = id_contenido;
    }

    public String getTitulo_contenido() {
        return titulo_contenido;
    }

    public void setTitulo_contenido(String titulo_contenido) {
        this.titulo_contenido = titulo_contenido;
    }

    public String getTipo_contenido() {
        return tipo_contenido;
    }

    public void setTipo_contenido(String tipo_contenido) {
        this.tipo_contenido = tipo_contenido;
    }

    @Override
    public String toString() {
        return "contenido{" + "id_contenido=" + id_contenido + ", titulo_contenido=" + titulo_contenido + ", tipo_contenido=" + tipo_contenido + '}';
    }
    
    
}
