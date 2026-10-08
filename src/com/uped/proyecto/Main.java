import com.uped.proyecto.modelo.*;

public class Main {

    public static void main(String[] args) {

        // CREAMOS UN USUARIO
        Usuario usuario1 = new Usuario(
                1,
                "Alex Valencia",
                "alexValencia@gmail.com",
                "7070-6767"
        );

        // CREAMOS BIBLIOTEARIO
        Bibliotecario bibliotecario1 = new Bibliotecario(
                2,
                "Maria Lopez",
                "maria@gmail.com",
                "7000-1111"
        );

        // CREAMOS UNA CATEGORIA
        Categoria categoria1 = new Categoria(
                1,
                "Novela",
                "Libros relacionados con obras narrativas de ficción."
        );

        // CREAMOS UN LIBRO
        Libro libro1 = new Libro(
                "L001",
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                "Editorial Planeta",
                "Disponible",
                categoria1
        );

        // CREAMOS LA BIBLIOTECA
        Biblioteca biblioteca1 = new Biblioteca(
                "Biblioteca Nacional BINAES",
                "San Salvador",
                "2281-2378"
        );

        biblioteca1.registrarUsuario(usuario1);
        biblioteca1.registrarUsuario(usuario1, "07/10/2026");

        biblioteca1.buscarLibro("Cien años de soledad");
        biblioteca1.buscarLibro("Cien años de soledad", "Gabriel Garcia Marquez");

        // MOSTRAMOS INFORMACION

        // DEL USUARIO
        System.out.println("===== INFORMACION DEL USUARIO =====");
        usuario1.consultarInformacion();

        System.out.println();

        // DEL BIBLIOTECARIO
        System.out.println("===== INFORMACION DEL BIBLIOTECARIO =====");
        bibliotecario1.mostrarRol();
        bibliotecario1.mostrarInformacion();
        bibliotecario1.registrarLibro();
        bibliotecario1.registrarUsuario();

        System.out.println();

        // POLIMORFISMO
        System.out.println("===== POLIMORFISMO =====");
        Persona persona1 = usuario1;
        Persona persona2 = bibliotecario1;

        persona1.mostrarRol();
        persona2.mostrarRol();

        System.out.println();

        // POLI DE GESTIONABLE
        Gestionable objeto1 = usuario1;
        Gestionable objeto2 = libro1;

        objeto1.mostrarInformacion();

        System.out.println();

        objeto2.mostrarInformacion();

        System.out.println();

        // DEL LIBRO
        System.out.println("===== INFORMACION DEL LIBRO =====");
        libro1.consultarInformacion();

        System.out.println();

        // DE LA CATEGORIA
        System.out.println("===== INFORMACIÓN DE LA CATEGORÍA =====");
        categoria1.mostrarInformacion();

        System.out.println();

        // REGISTRO MOSTRADO EN LA BIBLIOTECA
        System.out.println("===== REGISTRO EN LA BIBLIOTECA =====");
        biblioteca1.registrarUsuario(usuario1);
        biblioteca1.registrarLibro(libro1);

        System.out.println();

        // MOSTRAR INFO DE LA BIBLIOTECA
        biblioteca1.mostrarInformacion();

        System.out.println();

        // MOSTRAR INFO NUEVA BIBLOTECA LAB 2
        System.out.println("===== SOBRE CARGA DE METODOS =====");
        biblioteca1.registrarUsuario(usuario1);
        biblioteca1.registrarUsuario(usuario1, "07/10/2026");

        biblioteca1.buscarLibro("Cien años de soledad");
        biblioteca1.buscarLibro("Cien años de soledad", "Gabriel Garcia Marquez");

        System.out.println();

        // SOLICITAR EL PRESTAMO
        System.out.println("===== SOLICITUD DE PRESTAMO =====");
        usuario1.solicitarPrestamo();

        // PRESTAR EL LIBRO (ACCION)
        libro1.prestar();

        System.out.println();

        // CREAR EL PRESTAMO
        Prestamo prestamo1 = new Prestamo(
                1,
                "25/08/2026",
                usuario1,
                libro1
        );

        // CONSULTAR EL PRESTAMO
        prestamo1.consultarPrestamo();

        System.out.println();

        // INTENTO DE PRESTAR EL MISMO LIBRO
        System.out.println("===== SEGUNDO INTENTO DE PRESTAMO =====");
        libro1.prestar();

        System.out.println();

        // FINALIZA EL PRESTAMO
        System.out.println("===== DEVOLUCION DEL LIBRO =====");
        prestamo1.finalizarPrestamo("30/08/2026");

        System.out.println();

        // CONSULTA EL PRESTAMO OTRA VEZ
        prestamo1.consultarPrestamo();

        System.out.println();

        // CONSULTAMOS EL ESTADO FINAL DEL LIBRO
        System.out.println("===== ESTADO FINAL DEL LIBRO =====");
        libro1.consultarInformacion();

        System.out.println();

        // MOSTRAR LA INFO DE LA BIBLIOTECA Y FINAL
        biblioteca1.mostrarInformacion();

    }
}