package main.bank;

public class Person implements PersonalData{
    private final String fio;
    private final String inn;

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }
    public String getFio() {
        return fio;
    }
    @Override
    public String getInn(){
        return inn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
