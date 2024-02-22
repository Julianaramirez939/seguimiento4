package Ejercicio1;

public class CreditHipotecario extends Credit {
    Ejercicio1.Propierty propierty;

    public Propierty getPropierty() {
        return propierty;
    }

    public void setPropierty(Propierty propierty) {
        this.propierty = propierty;
    }

    public CreditHipotecario(SolicitudCredit solicitudCredit, String state, Propierty propierty) {
        super(solicitudCredit, state);
        this.propierty = propierty;
    }
}


