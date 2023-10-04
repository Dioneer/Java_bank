package main.bank;

public class Personal implements PersonalData{
    private final String inn;
    private final String fio;

    public Personal(String inn, String fio) {
        this.inn = inn;
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString(){
        return String.format("%s, %s", inn, fio);
    }
}
