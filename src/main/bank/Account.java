package main.bank;

public abstract class Account<T extends PersonalData> {
    private double amount;
    private final T owner;

    public Account(double amount, T owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", owner=" + owner +
                '}';
    }
}
