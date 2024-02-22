package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Client cliente = new Client("Juiana", 1091202939, "Bogotá");


        Theater salaCine = new Theater(1, 50);


        Screening proyeccion = new Screening("Movie 1", "3:00", salaCine, 20);


        List<Seat> asientosReservados = new ArrayList<>();
        asientosReservados.add(salaCine.getSeat(1, 1));
        asientosReservados.add(salaCine.getSeat(2, 3));


        Reserve reserva = new Reserve(cliente, proyeccion, asientosReservados);


        System.out.println(reserva.getReserveDetails());


        cliente.printHistoryReserves();


        Seat asientoOcupar = salaCine.getSeat(1, 1);
        asientoOcupar.ocupar();


        Seat asientoReservar = salaCine.getSeat(1, 2);
        asientoReservar.reservar();
    }
}