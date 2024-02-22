package Ejercicio2;

public class Seat {
    private int fila;
    private int columna;
    private String estado;

    public Seat(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "disponible";
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void reservar() {
        if (estado.equals("disponible")) {
            estado = "reservado";
        } else {
            System.out.println("El asiento no está disponible para reservar.");
        }
    }

    public void ocupar() {
        if (estado.equals("reservado")) {
            estado = "ocupado";
        } else {
            System.out.println("El asiento no está reservado para ser ocupado.");
        }
    }
}