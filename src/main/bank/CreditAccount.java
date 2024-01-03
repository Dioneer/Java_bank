package main.bank;

public class CreditAccount<T extends PersonalData> extends Account<T>{
    public CreditAccount(double amount, T owner) {
        super(amount, owner);
    }
}
