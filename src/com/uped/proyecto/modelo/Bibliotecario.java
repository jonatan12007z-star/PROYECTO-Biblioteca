package com.uped.proyecto.modelo;

public class Bibliotecario extends Persona {

    // CONSTRUCTOR
    public Bibliotecario(int id, String nombre, String correo, String telefono) {
        super(id, nombre, correo, telefono);
    }

    // METODO PROPIO
    public void registrarLibro() {
        System.out.println("El bibliotecario ha registrado un libro.");
    }

    // METODO PROPIO
    public void registrarUsuario() {
        System.out.println("El bibliotecario ha registrado un usuario.");
    }

    // METODO ABSTRACTO
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Bibliotecario");
    }
}

