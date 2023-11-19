package xPractice.MidtermPractice;

import java.util.ArrayList;

interface ToStore {
    // Interface methods
}

class CD implements ToStore {
    // CD class implementation
}

class Book implements ToStore {
    // Book class implementation
}

class Box {
    public ArrayList<ToStore> storeList;

    public Box() {
        storeList = new ArrayList<>();
    }
}

class Week05Recap {
    public static void main(String[] args) {
        Box box = new Box();

        // Creating instances of CD and Book
        CD cd = new CD();
        Book book = new Book();

        // Adding CD and Book to the storeList
        box.storeList.add(cd);
        box.storeList.add(book);

        // Accessing elements in the storeList
        for (ToStore item : box.storeList) {
            if (item instanceof CD) {
                System.out.println("CD found in the storeList");
            } else if (item instanceof Book) {
                System.out.println("Book found in the storeList");
            }
        }
    }
}

