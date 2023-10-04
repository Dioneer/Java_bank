package main.bank;

public class Entity implements PersonalData{
    private final String inn;
    private final String name;

    public Entity(String inn, String name) {
        this.inn = inn;
        this.name = name;
    }

    public String getFio() {
        return name;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString(){
        return String.format("%s, %s", inn, name);
    }
}
