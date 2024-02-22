package Ejercicio2;

import java.util.List;

public class Reserve {
    private Client client;
    private Screening screening;
    private List<Seat> listSeats;

    public Reserve(Client client, Screening screening, List<Seat> listSeats) {
        this.client = client;
        this.screening = screening;
        this.listSeats = listSeats;


        client.addReserveToHistory(this);
    }

    public Client getClient() {
        return client;
    }

    public Screening getScreening() {
        return screening;
    }

    public List<Seat> getListSeats() {
        return listSeats;
    }

    public String getReserveDetails() {
        return "Reserva realizada por: " + client.getName() + "\n" +
                "Película: " + screening.getMovie() + "\n" +
                "Asientos reservados: \n" +
                getSeatsDetails();
    }

    private String getSeatsDetails() {
        String seatsDetails = "";
        for (Seat seat : listSeats) {
            seatsDetails += "Fila: " + seat.getFila() + ", Columna: " + seat.getColumna() + "\n";
        }
        return seatsDetails;
    }
}
