package week06.Lab.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int sumUpEvenOdd(int[] list) { // STA TRAZI 1 ZADATAK TACNO???
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static <T> ArrayList<T> reverseList(ArrayList<T> originalList) {
        // <T> VAZDA IDE PRIJE RETURN TYPEA, STO JE U NASEM SLUCAJU ArrayList<T>, DA BISMO NAGLASILI PROGRAMU DA JE TO GENERICi
        ArrayList<T> newList = new ArrayList<>();
        for(int i = originalList.size() - 1; i >= 0; i--) {
            newList.add(originalList.get(Integer.valueOf(i)));
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<String> strList= new ArrayList<>();
        strList.add("Emir");
        strList.add("Amar");
        strList.add("Salih");

        ArrayList<String> reverseList = reverseList(strList);
        for(String str : reverseList) {
            System.out.println(str);
        }
    }
}
