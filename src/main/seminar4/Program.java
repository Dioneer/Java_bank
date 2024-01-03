package main.seminar4;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        MyArrayList<Employee> arr = new MyArrayList<>(new Employee[5]);
        arr.add(new Employee("Ira", 35));
        arr.add(new Employee("Mira", 25));
        arr.add(new Employee("Kira", 15));
        System.out.println(arr);
        for(Employee i: arr){
            System.out.println(i);
        }
        Integer[] array1 = new Integer[] {1,2,3,4,5,6,7,8};
        String[] array2 = new String[] {"AAA","SSS","DDD","FFF"};
        ArrayUtils.replace(array1, 0, 4);
        System.out.println(Arrays.toString(array1));
        ArrayUtils.replace(array2, 0, 3);
        System.out.println(Arrays.toString(array2));
    }

}
