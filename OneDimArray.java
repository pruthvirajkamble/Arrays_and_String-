import java.util.*;
class OneDimArray
{
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("_____________________________");

		int i =0;
		while(i<a.length){
			System.out.println(a[i]);
			i++;
		}
		System.out.println();
		System.out.println("_____________________________");

		int j=0;
		do{
			System.out.println(a[j]);
			j++;
		}while(j<a.length);

		System.out.println();
		System.out.println("_____________________________");

		for (int ele :a )
	   {   
	   	System.out.println(ele);	
		}

		System.out.println();
		System.out.println("_____________________________");

		System.out.println(Arrays.toString(a));
	}

}