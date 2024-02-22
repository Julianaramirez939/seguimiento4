package Ejercicio4;

public class ProductoPredecedero extends Product{
    private String fechaVencimiento;

    public ProductoPredecedero(String name, String description, int cost, int stock, String fechaVencimiento) {
        super(name, description, cost, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
