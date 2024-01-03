package main.seminar4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
    private E[] array;
    private int index = -1;
    public int getCapacity(){
        return array.length;
    }
    public int getSize(){
        return index+1;
    }
    public MyArrayList(E[] array) {
        this.array = array;
    }
    public void add(E item){
        if(index+1<array.length){
            array[++index] = item;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator(0);
    }
    class MyIterator implements Iterator<E>{
        int current;

        public MyIterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current<getCapacity();
        }

        @Override
        public E next() {
            return array[current++];
        }
    }
}
