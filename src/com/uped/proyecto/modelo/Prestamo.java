package com.uped.proyecto.modelo;

public class Prestamo {

    // ATRIBUTOS
    private int id;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String estado;
    private Usuario usuario;
    private Libro libro;

    // CONSTRUCTOR
    public Prestamo(int id, String fechaPrestamo, Usuario usuario, Libro libro) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = "";
        this.estado = "Activo";
        this.usuario = usuario;
        this.libro = libro;
    }

    // GETTERS y SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    // METODOS
    public void finalizarPrestamo(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        this.estado = "Finalizado";
        libro.devolver();

        System.out.println("El prestamo #" + id + " ha sido finalizado.");
    }

    public void consultarPrestamo() {
        System.out.println("===== INFORMACION DEL PRESTAMO =====");
        System.out.println("ID del prestamo: " + id);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha de prestamo: " + fechaPrestamo);
        System.out.println("Fecha de devolucion: " +
                (fechaDevolucion.isEmpty() ? "Pendiente" : fechaDevolucion));
        System.out.println("Estado: " + estado);
    }
}
