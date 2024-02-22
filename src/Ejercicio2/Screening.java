package Ejercicio2;

public class Screening {
    String movie;
    String horaInicio;
    Ejercicio2.Theater theater;
    int precioEntrada;

    public Screening(String movie, String horaInicio, Ejercicio2.Theater theater, int precioEntrada) {
        this.movie = movie;
        this.horaInicio = horaInicio;
        this.theater = theater;
        this.precioEntrada = precioEntrada;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Ejercicio2.Theater getTheater() {
        return theater;
    }

    public void setTheater(Ejercicio2.Theater theater) {
        this.theater = theater;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int obtenerNumeroSala() {
        return theater.getNumber();
    }
}
