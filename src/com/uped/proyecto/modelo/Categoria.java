package com.uped.proyecto.modelo;

public class Categoria {

    // ATRIBUTOS
    private int id;
    private String nombre;
    private String descripcion;

    // CONSTRUCTOR
    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // METODOS
    public void mostrarInformacion() {
        System.out.println("ID de categoria: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("El nombre de la categoria ha sido actualizado.");
    }
}
