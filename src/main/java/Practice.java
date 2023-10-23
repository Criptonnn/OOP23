public class Practice {
    public static void main(String[] args) {
        simetricPyramid(5);


    }

    public static void simetricPyramid(int n) {
        //    *
        //   ***
        //  *****
        // *******
        //*********
        for(int i = 1; i <= n*2; i+=2) {
            for(int j = 0; j < (2*n - i)/2; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightPyramid(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightPyramidReversed(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");

            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
