import java.util.*;
class Accenture2{
	public static void main(String[] args) {
		int[] arr = {5,5,2,2,1,3,1,4,4};
		int[] res = new int[arr.length];
        for (int i = 1; i < arr.length; i++) 
        {
            res[i] = arr[i];
        }
        int smallest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > smallest) {
                secondSmallest = smallest; 
                smallest = ele; 
            } else if (ele < secondSmallest && ele != smallest) {
                secondSmallest = ele;
            }
        }
        System.out.println("Second highest element: " + secondSmallest);

	}
}