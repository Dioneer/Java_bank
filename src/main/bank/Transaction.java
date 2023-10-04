package main.bank;

public class Transaction<E extends Acount> {
    private final E from;
    private final E to;
    private final int amount;
    public Transaction(E from, E to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
    public void execute(){
        if(from.getAmount() >= amount){
            System.out.printf("from %s: %d\n",from.getData(), amount);
            System.out.printf("from %s: %d\n",to.getData(), amount);
            System.out.println("Your transaction done");
            from.setAmount(from.getAmount()-amount);
            to.setAmount(to.getAmount()+amount);
            System.out.printf("from %s: %.2f\n",from.getData(),from.getAmount());
            System.out.printf("from %s: %.2f\n",to.getData(), to.getAmount());
        }else{
            System.out.println("Not enough money");
        }

    }
}
