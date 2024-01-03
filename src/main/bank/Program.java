package main.bank;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("F1010", "2001123212");
        Entity entity = new Entity("F1011", "2001123212");
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(100, person);
        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(100000, entity);
        Transactions<Account> transactions = new Transactions<>(debetAccount1,creditAccount1, 25000);
        transactions.executed();
    }
}
