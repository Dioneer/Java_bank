package main.seminar4;

import java.util.Arrays;

public class ArrayUtils<E> {
    public E[] replaceElement(E[] array, int index1, int index2){
        if(array == null){
            throw new NullPointerException();
        }
        if(index1>=array.length || index2 >= array.length || index1 < 0 ||index2 < 0){
            throw new IndexOutOfBoundsException();
        }
        E[] obj2 = array.clone();
        E obj = obj2[index1];
        obj2[index1] = obj2[index2];
        obj2[index2] = obj;

        return obj2;
    }

}
