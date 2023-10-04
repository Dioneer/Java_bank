package main.seminar4;

public class MyArrayList {
    private int[] array;
    private int lastElementIndex = -1;

    public int getCapacity(){
        return array.length;
    }

    public int getSize(){
        return lastElementIndex+1;
    }

    public MyArrayList(int[] array) {
        this.array = array;
    }
    public void add(int item){
        if(lastElementIndex+1 < array.length){
            array[++lastElementIndex] = item;
        }
    }
}
