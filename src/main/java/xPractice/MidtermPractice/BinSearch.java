package xPractice.MidtermPractice;

public class BinSearch {
    public static int binarySearch(int[] list, int target) {
        int left = 0;
        int right = list.length - 1;

        while(left <= right) {
            int middle = left + (right-left)/2;

            if(target == list[middle]) return middle;
            if(target > list[middle]) left = middle + 1;
            if(target < list[middle]) right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(list, 7));
    }
}
