package main.bank;

public class Entity implements PersonalData{
    private final String name;
    private final String inn;

    public Entity (String name, String inn) {
        this.name = name;
        this.inn = inn;
    }
    public String getName() {
        return name;
    }
    @Override
    public String getInn(){
        return inn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + name + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
