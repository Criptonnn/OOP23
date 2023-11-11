package week06.Lab.Methods;

import java.util.Arrays;


public class Methods {
    public static int findSmallest(int[] array) {
        int smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for(int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestStartingFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for(int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length || index2 < 0 || index1 < 0) {
            System.out.println("Invalid input");
        } else {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void printElegantly(int[] array) {
        for(int i = 0; i <array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            }else {
                System.out.print(", " + array[i]);
            }
        }
    }


    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
//        System.out.println(findSmallest(values));
//        System.out.println(indexOfSmallest(values));
//        System.out.println(indexOfSmallestStartingFrom(values, 2));
//        swap(values, 1, 4);
//        for(int i : values) {
//            System.out.print(i + " ");
//        }

        int[] array = {1, 5, 6, 7, 9, 22, 51, 103};
//        int location = BinarySearch.search(array, 22);
//        System.out.println(location);

//        printElegantly(array);

//        NightSky nightSky = new NightSky(0.1, 10, 10);
//        nightSky.print();
//        nightSky.numberOfStarsInLastPrint();
//        nightSky.print();
//        nightSky.numberOfStarsInLastPrint();
    }
}
