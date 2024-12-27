import java.util.*;
class BubbleSort{
	public static void main(String[] args) {
		int [] arr = {5,6,4,7,3,8,2,9,1};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("First largest element : "arr[0]);
		
	}
	public static void bubbleSort(int[] arr){
		for (int i=0;i<arr.length ;i++ ) 
		{
			for (int j=i+1;j<arr.length ;j++ ) 
			{
				//Ascending order
				// if(arr[i]>arr[j]){
				// 	int temp = arr[i];
				// 	arr[i] = arr[j];
				// 	arr[j] = temp;
				// }

				//Decending order
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
	}
}