package main.seminar4;

public class ArrayUtils{
    public static <E> E[] replace(E[] arr, int index1, int index2){
        if(arr==null){
            throw new NullPointerException();
        }
        if(index1>= arr.length||index2>=arr.length||index1<0||index2<0){
            throw new IndexOutOfBoundsException();
        }
        E item = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = item;
        return arr;
    }
}
