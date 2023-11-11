package week06.Lesson;

import java.util.Arrays;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        int[] cars = {1,2,3};
        int[] cars2 = new int[10];
        cars2[0] = 1;
        cars2[1] = 2;

        for(int i = 0; i < 10; i++) {
            System.out.println(cars2[i]);
            String haki = "haki";
        }

        Person p = new Person();
        System.out.println(Person.personCount);

        int[] array1 = {1,2,3,4,5,6,7};
        System.out.println(Arr.binarySearch(array1, 6));

        HashMap<Integer, String> names = new HashMap<>();
        names.put(0, "Riki");
        names.put(1, "Emir");

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }




    }

}

class Person {
    public static int personCount = 0;

    public Person() {
        personCount++;
        // NECE RADIT this.person JER STATIC NIJE VEZAN ZA OBJEKAT(INSTANCE), NEGO ZA KLASU
    }
}

class Arr {
    private int[] sortedList;

    public Arr() {

    }

    public static int binarySearch(int[] sortedList, int target) {
        int left = 0;
        int right = sortedList.length - 1;

        Arrays.sort(sortedList);

        while (left <= right) { // 4 <= 6
            int middle = left + (right - left) / 2; // 4 + (6-4)/2 = 4 + 1 = 5

            if(sortedList[middle] == target) {
                return middle; // 1 2 3 4 5 6 7   6   left:0, 4    right:6    middle: 3
            }
            if(sortedList[middle] < target) { // 4 < 6
                left = middle + 1;
            }
            if(sortedList[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;

    }
}

