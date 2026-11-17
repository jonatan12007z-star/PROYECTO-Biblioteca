package com.uped.proyecto.hilos;

public class RespaldoBiblioteca extends Thread {

    @Override
    public void run() {
        System.out.println("\n[HILO DE RESPALDO] Iniciando copia de seguridad de la biblioteca...");
        try {
            for (int i = 1; i <= 9; i++) {
                Thread.sleep(800); // Simula el tiempo de procesamiento del respaldo
                System.out.println("[HILO DE RESPALDO] Sincronizando datos... " + (i * 11) + "% completado.");
            }
            System.out.println("[HILO DE RESPALDO] ¡Respaldo de la base de datos finalizado con exito!\n");
        } catch (InterruptedException e) {
            System.out.println("[HILO DE RESPALDO] El proceso de respaldo fue interrumpido.");
        }
    }
}