import java.util.*;
class SecondSmallestEle {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1, indx = 0; i <= 10; i++) {
            int num = (int) (Math.random() * 1000);
            if (num >= 100)
                arr[indx++] = num;
            else
                i--;
        }

        System.out.println("Generated array: " + Arrays.toString(arr));
        int smallest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > smallest) {
                secondSmallest = smallest; 
                smallest = ele; 
            } else if (ele > secondSmallest && ele != smallest) {
                secondSmallest = ele;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
