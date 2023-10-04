package main.bank;

public class Deposit<E extends PersonalData> extends Acount<E>{
    public Deposit(E data, double amount) {
        super(data, amount);
    }
    public void getTest(){
        System.out.println("Test");
    }
}
