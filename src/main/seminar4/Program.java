package main.seminar4;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[8]);
        myArrayList.add(new Employee("AAA", 26));
        System.out.println(myArrayList.getCapacity());
        System.out.println(myArrayList.getSize());
        for (Employee item: myArrayList) {
            System.out.println(item);
        }
        Integer[] arr= new Integer[]{1,2,3,4,5,6};
        String[] arr2= new String[]{"aw", "asdad", "dasdasd", "ZXc"};
        ArrayUtils<Integer> arrayUtils = new ArrayUtils<>();
        Integer[] ares = arrayUtils.replaceElement(arr, 1, 3);
        System.out.println(Arrays.toString(ares));
    }
}
