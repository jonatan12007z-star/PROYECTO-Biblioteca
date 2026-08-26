package com.uped.proyecto.modelo;

public class Usuario {

    // ATRIBUTOS
    private int id;
    private String nombre;
    private String correo;
    private String telefono;

    // CONSTRUCTOR
    public Usuario(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    // GETTERS y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // METODOS

    // METODO 1
    public void solicitarPrestamo() {
        System.out.println(nombre + " ha solicitado un prestamo.");
    }

    // METODO 2
    public void consultarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
    }

}
