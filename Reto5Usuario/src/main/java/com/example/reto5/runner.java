/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reto5;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author javie
 */

@Component
public class runner implements CommandLineRunner{
    
    @Autowired
    RepositorioContenido repositorioContenido;
    @Autowired
    RepositorioUsuario repositorioUsuario;
    @Autowired
    RepositorioPelicula repositorioPelicula;
    @Autowired
    RepositorioSerie repositorioSerie;
    
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola Mundo");
        System.out.println("La tabla grado tiene " + repositorioContenido.count() + " registros.");
        System.out.println("La tabla grado tiene " + repositorioUsuario.count() + " registros.");
        System.out.println("La tabla grado tiene " + repositorioPelicula.count() + " registros.");
        System.out.println("La tabla grado tiene " + repositorioSerie.count() + " registros.");
        System.out.println(repositorioContenido.findAll());
        System.out.println(repositorioUsuario.findAll());
        System.out.println(repositorioPelicula.findAll());
        System.out.println(repositorioSerie.findAll());
        if(repositorioPelicula.existsById(3))
            System.out.println("Si esta");
        
        Optional<Pelicula> avengers = repositorioPelicula.findById(1);
        if(avengers.isPresent()){
            System.out.println("Si esta");
            Pelicula obtenido = avengers.get();
            System.out.println("Nombre :" + obtenido.getPeliTitulo());
            
        //Contenido contenido = new Contenido(227,"Spiderman","Pelicula");
        //repositorioContenido.save(contenido);
        //repositorioContenido.delete(new Contenido(227,"borrar","Pelicula"));
        //System.out.println(repositorioUsuario.findAll());
    }
    
}
