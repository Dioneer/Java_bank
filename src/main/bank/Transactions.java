package main.bank;

public class Transactions<T extends Account> {
    private final T from;
    private final T to;
    private final double amount;

    public Transactions(T from, T t, double amount) {
        this.from = from;
        to = t;
        this.amount = amount;
    }
    public void executed(){
        if(from.getAmount()>=amount){
            from.setAmount(from.getAmount()-amount);
            to.setAmount(to.getAmount()+amount);
            System.out.println(from+" "+to);
        }else{
            System.out.println("Not enough money");
        }

    }
}
