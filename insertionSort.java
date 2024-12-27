// import java.util.*;
// class insertionSort{
// 	public static void main(String[] args) {
// 		String [] arr = {1,5,8,2,6,3};
// 		System.out.println(Arrays.toString(arr));

// 		for (int i=1;i<arr.length ;i++ ) 
// 		{
// 			int key = arr[i];
// 			int j = i-1;
// 			while(j>=0 && arr[j]>key)
// 			{
// 				key = arr[j];
// 				j--;
// 			}
// 			arr[i] = arr[j];	
			
// 		}
// 		System.out.println(Arrays.toString(arr));
// 	}
// }
import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6, 3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

              
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
