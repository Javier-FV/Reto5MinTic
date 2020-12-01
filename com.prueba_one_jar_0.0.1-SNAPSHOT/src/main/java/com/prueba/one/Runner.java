/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.one;

import Controlador.PeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author usuario
 */
@Component
public class Runner implements CommandLineRunner {
    
   @Autowired
   private PeliculaRepo pelicularepo;

    @Override
    public void run(String... args) throws Exception {
        
       System.out.print("Test Conection BD");
       System.out.print("la tabla pelicula tiene" + pelicularepo.count() );
        
        
    }
    
    
    
}
