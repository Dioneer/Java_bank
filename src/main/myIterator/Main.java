package main.myIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        for(Integer i:Range.fromTo(5,25)){
            System.out.println(i);
        }
    }
    private static class Range implements Iterable<Integer>{
        private final int start;
        private final int end;
        public static Range fromTo(int start, int end){
            return new Range(start,end);
        }
        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public Iterator<Integer> iterator() {
            return new MyCount(start);
        }
        private class MyCount implements Iterator<Integer>{
            int start;
            public MyCount(int start) {
                this.start = start;
            }
            @Override
            public boolean hasNext() {
                return start<=end;
            }

            @Override
            public Integer next() {
                return start++;
            }
        }
    }
}
