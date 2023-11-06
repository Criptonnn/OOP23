package week05.Lab.Task03;

public class Main {
    public static void main(String[] args) throws IllegalAccessException{
        Thing t1 = new Thing("book", 1);
        Thing t2 = new Thing("pen", 5);

        MaxWeightBox maxWeightBox = new MaxWeightBox(5);
        maxWeightBox.add(t1);
        maxWeightBox.add(t2);
        System.out.println("MaxWeightBox: " + maxWeightBox.isInTheBox(t1));
        System.out.println("MaxWeightBox: " + maxWeightBox.isInTheBox(t2));

        OneThingBox oneThingBox = new OneThingBox();
        oneThingBox.add(t1);
        oneThingBox.add(t2);
        System.out.println("OneThingBox: " + oneThingBox.isInTheBox(t1));
        System.out.println("OneThingBox: " + oneThingBox.isInTheBox(t2));

        BlackHoleBox blackHoleBox = new BlackHoleBox();
        blackHoleBox.add(t1);
        blackHoleBox.add(t2);
        System.out.println("BlackHoleBox: " + blackHoleBox.isInTheBox(t2));

        Box maxBox = new MaxWeightBox(5);
        Box oneBox = new OneThingBox();
        Box blackBox = new BlackHoleBox();

        maxBox.add(t1);
        maxBox.add(t2);

        oneBox.add(t2);
        oneBox.add(t1);

        if(maxBox instanceof MaxWeightBox) {
            MaxWeightBox maxBox1 = (MaxWeightBox) maxBox;
            System.out.println("MAXBOX: " + maxBox1.isInTheBox(t2));
        }
        if(oneBox instanceof OneThingBox) {
            OneThingBox oneBox1 = (OneThingBox) oneBox;
            System.out.println("ONEBOX: " + oneBox1.isInTheBox(t2));
            System.out.println("ONEBOX: " + oneBox1.isInTheBox(t1));
        }
    }
}
