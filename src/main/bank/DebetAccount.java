package main.bank;

public class DebetAccount <T extends PersonalData> extends Account<T>{
    public DebetAccount(double amount, T owner) {
        super(amount, owner);
    }
}
