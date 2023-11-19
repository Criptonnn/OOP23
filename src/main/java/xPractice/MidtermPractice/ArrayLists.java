package xPractice.MidtermPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,10));
        System.out.println(list.indexOf(10));
        list.remove(Integer.valueOf(10));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // TODO double every odd integer and return the list

    }

    public List<Integer> doubleOdd (ArrayList<Integer> numbers) {
        return numbers.stream()
                .map(number -> number%2==1 ? number * 2 : number).toList();

    }

    public Optional<Integer> findNumber(ArrayList<Integer> list, int target) {
        Integer index = null;
        for(Integer i : list) {
            if(i == target) {
                index = list.indexOf(i);
            }
        }
        return Optional.ofNullable(index);
    }

}
