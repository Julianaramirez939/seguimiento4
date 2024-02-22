package Ejercicio1;

public class Client extends Person{
    private String historyCredit;
    private int income;

    public Client(String name, int id, String address, String historyCredit, int income) {
        super(name, id, address);
        this.historyCredit = historyCredit;
        this.income = income;
    }

    public String getHistoryCredit() {
        return historyCredit;
    }

    public void setHistoryCredit(String historyCredit) {
        this.historyCredit = historyCredit;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
