package Ejercicio1;
public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Juliana", 1091202939, "Bogotá", "Good", 60000);


        Propierty propiedadHipotecario = new Propierty("Medellin", 12100);

        Propierty propiedadPersonal = new Propierty("Bogotá", 20000);


        SolicitudCredit solicitudHipotecario = new SolicitudCredit(client1, "Hipotecario", 80000, 40, 10);
        CreditHipotecario creditoHipotecario = new CreditHipotecario(solicitudHipotecario, "pendiente", propiedadHipotecario);


        creditoHipotecario.evaluarSolicitud();


        System.out.println(client1.getName() + ", su crédito hipotecario ha sido: " + creditoHipotecario.getState());

        SolicitudCredit solicitudPersonal = new SolicitudCredit(client1, "Personal", 10000, 12, 5);
        Credit creditoPersonal = new Credit(solicitudPersonal, "pendiente");

        creditoPersonal.evaluarSolicitud();

        System.out.println(client1.getName() + ", su crédito personal ha sido: " + creditoPersonal.getState());
    }
}
