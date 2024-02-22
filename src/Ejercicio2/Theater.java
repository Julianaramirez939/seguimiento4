package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private int number;
    private int capacity;
    private List<Seat> listSeats;

    public Theater(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.listSeats = new ArrayList<>();

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                listSeats.add(new Seat(row, column));
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public Seat getSeat(int row, int column) {
        for (Seat seat : listSeats) {
            if (seat.getFila() == row && seat.getColumna() == column) {
                return seat;
            }
        }
        return null;
    }
}