package main.bank;

public class Credit<E extends PersonalData> extends Acount<E> {
    public Credit(E data, double amount) {
        super(data, amount);
    }

    public void getTest(){
        System.out.println("Test");
    }
}
