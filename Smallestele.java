import java.util.*;
class Smallestele
{
	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i=1,indx=0;i<=10 ;i++)
		{
			int num = (int)(Math.random()*1000);
			if(num>100)
				arr[indx++]=num;
			else 
				i--;
		}
		System.out.println(Arrays.toString(arr));
		int smallest = Integer.MIN_VALUE; 
		for(int ele : arr){
			if(smallest<ele)
				smallest=ele;
		}
		System.out.println(smallest);
	}

}