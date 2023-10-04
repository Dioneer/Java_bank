package main.bank;

public abstract class Acount<E extends PersonalData> {
    private final E data;

    public Acount(E data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    private double amount;

    public E getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Account{"+ "data= " +'\''+data+'\''+", amount = " + amount +'}';
    }
}
