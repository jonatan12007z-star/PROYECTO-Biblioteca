package com.uped.proyecto.excepciones;

public class RegistroOperaciones implements AutoCloseable {
    public RegistroOperaciones() {
        System.out.println("[LOG] Abriendo el registro de operaciones de la biblioteca...");
    }

    public void registrar(String operacion) {
        System.out.println("[LOG REGISTRADO]: " + operacion);
    }

    @Override
    public void close() {
        System.out.println("[LOG] Cerrando y guardando el registro de operaciones automaticamente (AutoCloseable).\n");
    }
}
