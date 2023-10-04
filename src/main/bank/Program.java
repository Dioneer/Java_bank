package main.bank;

public class Program {
    public static void main(String[] args) {
        Acount<Personal> acc1 = new Deposit<>(new Personal("123", "Pupkin Andrey"), 500);
        Acount<Entity> acc2 = new Credit<>(new Entity("123", "Roga&Kopyta"), 500);
        Transaction<Acount> transaction1 = new Transaction<>(acc1, acc2, 250);
        transaction1.execute();
    }
}
