package com.uped.proyecto.excepciones;

public class UsuarioNoEncontradoException extends RuntimeException {

    // excepcion unchecked
    // heredara de RuntimeException

    public UsuarioNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

// si alguien intenta buscar al usuario con el nombre "Oscar"
// pero ese usuario no esta registrado en nuestra biblioteca.

//Podriamos lanzar nuestra excepcion con este mensaje:
// "El usuario Oscar no esta registrado"