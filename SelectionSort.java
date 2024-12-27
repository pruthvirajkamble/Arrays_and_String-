import java.util.*;
class SelectionSort{
	public static void main(String[] args) {
		String [] arr = {"MANISH","PRATIK","VIVEK","AMEY"};
		System.out.println(Arrays.toString(arr));

		for (int i=0;i<arr.length ;i++ ) 
		{
			int indx = i;
			for (int j=i+1;j<arr.length ;j++ ) 
			{
				if(arr[indx].compareTo(arr[j])>0)
				indx = j;
				
			}
			String temp = arr[i];
			arr[i] = arr[indx];
			arr[indx] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}