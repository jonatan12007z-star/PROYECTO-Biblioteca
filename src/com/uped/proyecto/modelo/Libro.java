package com.uped.proyecto.modelo;

public class Libro implements Gestionable {

    // ATRIBUTOS
    private String codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private String estado;
    private Categoria categoria;

    // CONSTRUCTOR
    public Libro(String codigo, String titulo, String autor, String editorial, String estado, Categoria categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.estado = estado;
        this.categoria = categoria;
    }

    // GETTERS y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // METODOS

    // METODO 1
    public void prestar() {
        if (estado.equals("Disponible")) {
            estado = "Prestado";
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no esta disponible.");
        }
    }

    // METODO 2
    public void devolver() {
        estado = "Disponible";
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
    }

    // METODO 3
    public void consultarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Estado: " + estado);
        System.out.println("Categoria: " + categoria.getNombre());
    }

    // METODO GESTIONABLE
    @Override
    public void mostrarInformacion() {
        System.out.println("Información del libro:");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Estado: " + estado);
    }
}
