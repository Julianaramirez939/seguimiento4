package Ejercicio1; // Asegúrate de que el nombre del paquete esté escrito correctamente



public class Credit {
    private SolicitudCredit solicitudCredit;
    private String state;

    public Credit(SolicitudCredit solicitudCredit, String state) {
        this.solicitudCredit = solicitudCredit;
        this.state = state;
    }

    public SolicitudCredit getSolicitudCredit() {
        return solicitudCredit;
    }

    public void setSolicitudCredit(SolicitudCredit solicitudCredit) {
        this.solicitudCredit = solicitudCredit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void aprobar() {
        this.state = "aprobado";
    }

    public void rechazar() {
        this.state = "rechazado";
    }

    public void evaluarSolicitud() {
        if (getSolicitudCredit().getClient().getHistoryCredit().equals("Good")
                && getSolicitudCredit().getMonto() <= getSolicitudCredit().getClient().getIncome()) {
            aprobar();
        } else {
            rechazar();
        }
    }
}


