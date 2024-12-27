import java.util.*;
class SortingExp1{
	public static void main(String[] args) {
		String [] arr = {"F","G","B","A","C","H","D"};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void bubbleSort(String [] arr){
		for (int i=0;i<arr.length ;i++ ) 
		{
			for(int j = i+1;j<arr.length;j++){
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}