/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.one;
import com.prueba.one.modelos.Pelicula;
import com.prueba.one.modelos.Usuario;
import com.prueba.one.repos.DirectorRepo;
import com.prueba.one.repos.PeliculaRepo;
import com.prueba.one.repos.SerieRepo;
import com.prueba.one.repos.UsuarioRepo;
//import com.prueba.one.vista.Usuario;
import java.util.Optional;
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
   @Autowired
   private DirectorRepo directorRepo;
   @Autowired
   private SerieRepo serieRepo;
   @Autowired
   private UsuarioRepo usuarioRepo;



    @Override
    public void run(String... args) throws Exception {
        
       System.out.print("Test Conection BD");
       System.out.print("la tabla pelicula tiene" + pelicularepo.count() );
       
       Optional<Pelicula> avengers = pelicularepo.findById(1L);
        if(avengers.isPresent()){
            System.out.println("Si esta");
            Pelicula obtenido = avengers.get();//Lectura del titulo de la pelicula
            System.out.println("Nombre :" + obtenido.getNombrepelicula());//imprime el titulo
            obtenido.setNombrepelicula("Javier");//cambiar el titulo de la pelicula
            pelicularepo.save(obtenido);//guarda el nombre cambiado en la Base de datos
            
       Optional<Usuario> usuario = usuarioRepo.findOne("diva"<String>);
        if(usuario.isPresent()){
            System.out.println("Si esta");
            Usuario obtenido2 = usuario.get();//Lectura del titulo de la pelicula
            System.out.println("Nombre :" + obtenido2.getNombreusuario());//imprime el titulo
            obtenido2.setNombreusuario("Javier");//cambiar el titulo de la pelicula
            usuarioRepo.save(obtenido2);//guarda el nombre cambiado en la Base de datos
        
        
    }
    
    
    
}
