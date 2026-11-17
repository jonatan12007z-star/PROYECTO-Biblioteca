package com.uped.proyecto.excepciones;

public class PrestamoNoDisponibleException extends Exception {

    // excepcion checked
    // una excepcion que Java obliga a manejar o declarar mediante throws

    private int ejemplaresDisponibles;

    public PrestamoNoDisponibleException(String mensaje, int ejemplaresDisponibles) {
        super(mensaje);
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }
}

// si un usuario intenta pedir prestado un libro, pero no quedan ejemplares disponibles.
// nuestra excepcion podria guardar:

// mensaje: "No hay ejemplares disponibles para realizar el prestamo"
// ejemplares disponibles: 0