package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private List<Integer> list;
    private int i = 0;

    public EvenIterator(List<Integer> list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (i >= list.size()) {
            return false;
        }
        if (list.get(i) % 2 == 0) {
            return true;
        } else {
            i++;
            return hasNext();
        }
    }

    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer ret=list.get(i);
        i++;
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
        EvenIterator evenIterator = new EvenIterator(list);
//        while (evenIterator.hasNext()) {
//            System.out.println(evenIterator.next());
//        }
//        evenIterator.next();
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.next());
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.next());
        System.out.println(evenIterator.hasNext());
        System.out.println(evenIterator.next());
    }
}