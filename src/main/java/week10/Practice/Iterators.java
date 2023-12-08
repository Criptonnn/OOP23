package week10.Practice;


import java.util.Iterator;
import java.util.NoSuchElementException;

class OddNumberIterator implements Iterator<Integer> {
    private int[] elements;
    private int index;

    public OddNumberIterator(int[] elements) {
        this.elements = elements;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < elements.length && elements[index] % 2 == 0) {
            index++;
        }
        return index < elements.length;
    }

    @Override
    public Integer next() {
        if(!(hasNext())) {
            throw new NoSuchElementException();
        }
        return elements[index++]; // returnamo elem[index] i onda incrementamo index jer ne mozemo poslije returna
    }
}
class Iterators {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 6, 8, 10, 7, 3};
        OddNumberIterator oddNumberIterator = new OddNumberIterator(numbers);
        while(oddNumberIterator.hasNext()) {
            System.out.println(oddNumberIterator.next());
        }
    }
}
