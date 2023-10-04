package main.fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> list;

    public Box(ArrayList<T> list) {
        this.list = list;
    }
}
