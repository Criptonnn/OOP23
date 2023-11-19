package xPractice.MidtermPractice;

import java.util.Calendar;
import java.util.Objects;

public class OldExams {

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(!(object instanceof OldExams)) return false;
        OldExams newObject = (OldExams) object;
        return Objects.equals(newObject, this);
    }


    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        a = a || b;
        b = a && !b;
        System.out.println(a + " " + b);

        System.out.println("Result: " + 1 + 2*3);

        int a1 = 8;
        int b1 = 2;
        while(a1 > 0) {
            a1 -= b1;
            if (a1 == 3) {
                continue;
            }
            else {
                b1++;
            }
        }
        System.out.println(a1 + b1);

        String str = new String("Lijep dan");
        str.toUpperCase();
        System.out.println(str);

        System.out.println(Calendar.getInstance().get(Calendar.MONTH) + 1);


    }
}
