package com.bedu.example1.repository;


import org.springframework.stereotype.Repository;


@Repository
public class RepositorioUsuario {

        public void guardarUsuario(){
            System.out.println("Guardando usuario");
        }

        public void eliminarUsuario(){
            System.out.println("Eliminando usuario");
        }

        public void actualizarUsuario(){
            System.out.println("Actualizando usuario");
        }

        public void buscarUsuario(){
            System.out.println("Buscando usuario");
        }
}
