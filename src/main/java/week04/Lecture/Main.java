package week04.Lecture;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CredditCard rikijevaKarta = new CredditCard(10240, new Date(System.currentTimeMillis()), 100, "cvc", CardType.DEBIT, CardIssuer.VISA);
        // rikijevaKarta.printCardIssuer();
        System.out.println(rikijevaKarta.toString());
    }
}