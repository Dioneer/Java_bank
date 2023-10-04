package main.seminar4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
    private final E[] array;
    private int lastElementIndex = -1;

    public int getCapacity(){
        return array.length;
    }

    public int getSize(){
        return lastElementIndex+1;
    }

    public MyArrayList(E[] array) {
        this.array = array;
    }
    public void add(E item){
        if(lastElementIndex+1 < array.length){
            array[++lastElementIndex] = item;
        }
    }

    @Override
    public Iterator<E> iterator() {
            return new MyArrayListIterator();
    }
    class MyArrayListIterator implements Iterator<E>{
        Iterator<E> iterator = Arrays.stream(array).iterator();
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public E next() {
            return iterator.next();
        }
    }
}

