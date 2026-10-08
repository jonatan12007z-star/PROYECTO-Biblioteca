package com.uped.proyecto.modelo;

public class Usuario extends Persona implements Gestionable {

    // CONSTRUCTOR
    public Usuario(int id, String nombre, String correo, String telefono) {
        super(id, nombre, correo, telefono);
    }

    // METODO PROPIO DE USUARIO
    public void solicitarPrestamo() {
        System.out.println("El usuario ha solicitado un préstamo.");
    }

    // METODO PROPIO DE USUARIO
    public void consultarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Teléfono: " + getTelefono());
    }

    // SOBRESCRITURA DEL METODO ABSTRACTO
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Usuario de la biblioteca");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del usuario:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Telefono: " + getTelefono());
    }
}

