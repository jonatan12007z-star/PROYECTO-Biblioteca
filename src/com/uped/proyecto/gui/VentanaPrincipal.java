package com.uped.proyecto.gui;

import com.uped.proyecto.excepciones.PrestamoNoDisponibleException;
import com.uped.proyecto.excepciones.RegistroOperaciones;
import com.uped.proyecto.modelo.Categoria;
import com.uped.proyecto.modelo.Libro;
import com.uped.proyecto.modelo.Usuario;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    // Objetos de prueba para nuestra interfaz
    private Categoria categoria;
    private Libro libro;
    private Usuario usuario;

    private JLabel lblEstadoLibro;
    private JTextField txtUsuario;
    private JTextField txtLibro;

    public VentanaPrincipal() {

        // Configuración basica de la ventana
        setTitle("Sistema de Gestion de Biblioteca - UPED");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializamos datos de ejemplo
        categoria = new Categoria(1, "Novela", "Obras narrativas de ficcion");
        libro = new Libro("L001", "Don Quijote de la Mancha", "Miguel de Cervantes", "Editorial Planeta", "Disponible", categoria);
        usuario = new Usuario(1, "Alex Valencia", "alex@gmail.com", "7070-6767");

        // Layout principal
        setLayout(new BorderLayout(10, 10));

        // Panel superior (Título)
        JPanel panelNorte = new JPanel();
        JLabel lblTitulo = new JLabel("Biblioteca - Control de Prestamos");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        panelNorte.add(lblTitulo);
        add(panelNorte, BorderLayout.NORTH);

        // Panel central (Formulario / Datos)
        JPanel panelCentro = new JPanel(new GridLayout(4, 2, 10, 10));
        panelCentro.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelCentro.add(new JLabel("Usuario actual:"));
        txtUsuario = new JTextField(usuario.getNombre());
        txtUsuario.setEditable(false);
        panelCentro.add(txtUsuario);

        panelCentro.add(new JLabel("Libro en sistema:"));
        txtLibro = new JTextField(libro.getTitulo());
        txtLibro.setEditable(false);
        panelCentro.add(txtLibro);

        panelCentro.add(new JLabel("Estado del Libro:"));
        lblEstadoLibro = new JLabel(libro.getEstado());
        lblEstadoLibro.setForeground(new Color(0, 128, 0)); // Verde inicial
        panelCentro.add(lblEstadoLibro);

        panelCentro.add(new JLabel("Accion requerida:"));
        JButton btnPrestar = new JButton("Solicitar Prestamo");
        panelCentro.add(btnPrestar);

        add(panelCentro, BorderLayout.CENTER);

        // Panel inferior (Boton de devolucion / salir)
        JPanel panelSur = new JPanel();
        JButton btnDevolver = new JButton("Devolver Libro");
        panelSur.add(btnDevolver);
        add(panelSur, BorderLayout.SOUTH);

        // EVENTOS CON EXPRESIONES LAMBDA Y MANEJO DE EXCEPCIONES

        // Accion del boton Prestar (Usa try-catch la excepcion checked y AutoCloseable)
        btnPrestar.addActionListener(e -> {
            // Uso de try-with-resources con la clase AutoCloseable
            try (RegistroOperaciones registro = new RegistroOperaciones()) {
                registro.registrar("Intento de prestamo para el usuario: " + usuario.getNombre());

                // Esto lanzara la excepcion si el libro ya esta prestado
                libro.prestar();

                lblEstadoLibro.setText(libro.getEstado());
                lblEstadoLibro.setForeground(new Color(200, 0, 0)); // Rojo (Prestado)
                JOptionPane.showMessageDialog(this,
                        "Prestamo realizado con exito para " + usuario.getNombre() + "!",
                        "Exito",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (PrestamoNoDisponibleException ex) {
                // Atrapamos la excepcion Checked con su dato extra
                JOptionPane.showMessageDialog(this,
                        ex.getMessage() + "\nEjemplares disponibles: " + ex.getEjemplaresDisponibles(),
                        "Error de Prestamo",
                        JOptionPane.WARNING_MESSAGE);
            } catch (Exception ex) {
                // Excepcion general por seguridad
                JOptionPane.showMessageDialog(this,
                        "Ocurrio un error inesperado: " + ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Accion del boton Devolver
        btnDevolver.addActionListener(e -> {
            libro.devolver();
            lblEstadoLibro.setText(libro.getEstado());
            lblEstadoLibro.setForeground(new Color(0, 128, 0)); // Verde (Disponible)
            JOptionPane.showMessageDialog(this,
                    "El libro ha sido devuelto y esta disponible nuevamente.",
                    "Devolucion Exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}
