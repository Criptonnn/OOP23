package xPractice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week3AndStringMethods {

    public static String findSubstring(String str, String subStr) {
//        return str.indexOf(subStr); RETURNA POCETNI INDEX SUBSTRINGA
        if(!str.contains(subStr)) {
            return "";
        }
        return str.substring(str.indexOf(subStr), str.indexOf(subStr) + subStr.length()); // pravolijepdan lijep indexOf(subStr) = 5, length = 5
    }

    public static int returnIndexOfSecondSubstringOccurence(String str, String subString) {
        int firstIndex = str.indexOf(subString);
        int secondIndex = str.indexOf(subString, firstIndex + 1); // TRAZI SUBSTRING, ALI POCNE OD INDEXA firstIndex + 1

        return secondIndex;
    }

    public static void main(String[] args) {
//        System.out.println(findSubstring("pravolijepdan", "dan"));
        String str = "lijepdan333";
//        System.out.println(str.indexOf(String.valueOf(3)));

        String str2 = "danasjedanas";
//        System.out.println(returnIndexOfSecondSubstringOccurence(str2, "danas"));

//        System.out.println(Integer.valueOf("252")); // RETURNA 252
//        System.out.println(String.valueOf(252)); // RETURNA "252"

//        System.out.println(Arrays.asList(1,2,3,4,5));
//

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        list = Arrays.asList(1,2,3,4,5); MOZE I OVAKO, ZA ARRAY LIST NE MOZE

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
//        arrayList = Arrays.asList(6, 7, 8, 9, 10); OVDJE NE RADI

//        List<Integer> justList = new List<Integer>(1); List<> CANNOT BE INSTANTIATED
        List<Integer> justListV2 = List.of(1, 2, 3, 4, 5); // OVO RADI

        list.remove(1); // OVAKO REMOVEA BROJ NA INDEXU 1
        for(int n : list) {
            System.out.print(n);
        }

        System.out.println();

        arrayList.remove(1); // OVAKO REMOVEA BROJ NA INDEXU 1
        for(int n : arrayList) {
            System.out.print(n);
        }

        System.out.println();

        list.remove(Integer.valueOf(4)); // OVAKO REMOVEA PRVI OCCURENCE BROJA 4 U ARRAYU
        for(int n : list) {
            System.out.print(n);
        }

        System.out.println();

        arrayList.remove(Integer.valueOf(9)); // OVAKO REMOVEA PRVI OCCURENCE BROJA 9 U ARRAYLISTI
        for(int n : arrayList) {
            System.out.print(n);
        }
    }
}
