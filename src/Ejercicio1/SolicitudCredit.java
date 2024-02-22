package Ejercicio1;

public class SolicitudCredit {
    Ejercicio1.Client client;
    private String typeCredit;
    private int monto;
    private int plazo;
    private int tasaInteres;

    public SolicitudCredit(Client client, String typeCredit, int monto, int plazo, int tasaInteres) {
        this.client = client;
        this.typeCredit = typeCredit;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTypeCredit() {
        return typeCredit;
    }

    public void setTypeCredit(String typeCredit) {
        this.typeCredit = typeCredit;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}

