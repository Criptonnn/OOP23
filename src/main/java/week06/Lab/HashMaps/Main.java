package week06.Lab.HashMaps;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        HashMap<String, String> map = new HashMap<>();
//        map.put("matti", "mage");
//        map.put("mikael", "mixu");
//        map.put("arto", "arppa");
//
//        System.out.println(map.get("mikael"));

//        PromissoryNote promissoryNote = new PromissoryNote();
//        promissoryNote.setLoan("Amar", 500.0);
//        promissoryNote.setLoan("Amar", 300.0);
//
//        System.out.println(promissoryNote.howMuchInDebt("Amar"));
//        System.out.println(promissoryNote.howMuchInDebt("Emir"));

        Dictionaryy dictionaryy = new Dictionaryy(); // Dictionary SE VEC KORISTI
        dictionaryy.add("Sljiva", "Plum");
        dictionaryy.add("Ograda", "Fence");
//        System.out.println(dictionaryy.getTranslation("Sljiva"));
//        System.out.println(dictionaryy.getTranslation("Jabuka"));
//        System.out.println(dictionaryy.getAmountOfWords());

        ArrayList<String> translationList = dictionaryy.translationList();
//        for(String item : translationList) {
//            System.out.println(item);
//        }


        TextUserInterface textUserInterface = new TextUserInterface(new Scanner(System.in), dictionaryy);
        textUserInterface.start();
    }

}
