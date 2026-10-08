package com.uped.proyecto.modelo;

public class Biblioteca {

    // ATRIBUTOS
    private String nombre;
    private String direccion;
    private String telefono;
    private int cantidadLibros;
    private int cantidadUsuarios;

    // CONSTRUCTOR
    public Biblioteca(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadLibros = 0;
        this.cantidadUsuarios = 0;
    }

    // GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }

    // METODOS
    public void registrarLibro(Libro libro) {
        cantidadLibros++;
        System.out.println("El libro \"" + libro.getTitulo()
                + "\" ha sido registrado en la biblioteca.");
    }

    public void registrarUsuario(Usuario usuario) {
        cantidadUsuarios++;
        System.out.println("El usuario \""
                + usuario.getNombre()
                + "\" ha sido registrado en la biblioteca.");

    }

    public void registrarUsuario(Usuario usuario, String fechaRegistro) {
        System.out.println("Usuario registrado: " + usuario.getNombre());
        System.out.println("Fecha de registro: " + fechaRegistro);
    }

    public void buscarLibro(String titulo) {
        System.out.println("Buscando libro por título: " + titulo);
    }

    public void buscarLibro(String titulo, String autor) {
        System.out.println("Buscando libro por título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void mostrarInformacion() {
        System.out.println("===== INFORMACIÓN DE LA BIBLIOTECA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cantidad de libros: " + cantidadLibros);
        System.out.println("Cantidad de usuarios: " + cantidadUsuarios);
    }

}
