import java.util.*;
class Arrayex3{
	public static void main(String[] args) {
		int [] arr ={1,2,3,4,5,6,7,8,9};
		int elen = 0;
		int olen = 0;
		for (int ele : arr) 
		{
			if(ele%2==0)
				elen++;
			else
				olen++;	
		}
		int [] evenarr = new int[elen];
		int [] oddarr = new int[olen];

		for (int i=0,ei=0,oi=0;i<arr.length ;i++ )
		 {
		 	if(arr[i]%2==0)
		 		evenarr[ei++] = arr[i];
		 	else 
		 		oddarr[oi++] = arr[i];	
		}
		System.out.println(Arrays.toString(evenarr));
		System.out.println(Arrays.toString(oddarr));
	}
}