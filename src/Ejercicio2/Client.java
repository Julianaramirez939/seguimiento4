package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private List<Reserve> historyReserves;

    public List<Reserve> getHistoryReserves() {
        return historyReserves;
    }

    public void setHistoryReserves(List<Reserve> historyReserves) {
        this.historyReserves = historyReserves;
    }

    public Client(String name, int id, String address) {
        super(name, id, address);
        this.historyReserves = new ArrayList<>();
    }

    public void addReserveToHistory(Reserve reserve) {
        historyReserves.add(reserve);
    }
    public void printHistoryReserves() {
        System.out.println("Historial de reservas del cliente:");
        for (Reserve reserva : historyReserves) {
            System.out.println(reserva.getReserveDetails());}}}
