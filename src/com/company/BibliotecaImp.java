package com.company;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaImp implements Biblioteca {

    List<Libro> listarLibro = new ArrayList();
    //Libro libro = new Libro();

    List<Usuario> listarUsuarios = new ArrayList();
    Usuario usuario = new Usuario();





    @Override
    public String agregarLibro(Libro libro) {
    listarLibro.add(libro);


        return  "Libro registrado";
    }

    @Override
    public String eliminarLibro(String isbn) {
        return null;
    }

    @Override
    public List<Libro> listarLibros() {

        for (Libro str : listarLibro) {


                System.out.println( str.getTitulo()+"    "+ str.getAutor()+"    "+ str.getIsbn());
        }

        return null;
    }

    @Override
    public String registarUsusario(Usuario usuario) {
        listarUsuarios.add(usuario);

        return "Usuario Registrado";
    }

    @Override
    public List<Usuario> listarUsuarios() {
        for(Usuario usr: listarUsuarios){
            System.out.println( usr.getId()+"              "+usr.getNombre() );
        }

        return null;
    }

    @Override
    public String encontrarLibro(String titulo) {


        return null;
    }
}
