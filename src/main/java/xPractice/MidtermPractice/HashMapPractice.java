package xPractice.MidtermPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "jedan");
        map.put(2, "dva");
        map.put(3, "tri");

        System.out.println(map.containsValue("jedan"));
    }
}
