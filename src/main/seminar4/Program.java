package main.seminar4;

public class Program {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new int[100]);
        System.out.println(myArrayList.getCapacity());
        System.out.println(myArrayList.getSize());
        myArrayList.add(4);
        myArrayList.add(11);
        System.out.println(myArrayList.getCapacity());
        System.out.println(myArrayList.getSize());
    }
}
