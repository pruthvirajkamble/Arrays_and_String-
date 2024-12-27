import java.util.Arrays;
class ArrayRotation{
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int rotation = 3;
		// for(int i=1;i<=rotation;i++){
		// 	int temp = a[0];
		// 	for (int j=1;j<a.length ;j++ ) 
		// 	{ 
		// 		a[j-1] = a[j];	 
		// 	}
		// 	a[a.length-1] = temp;
		// }
		System.out.println(Arrays.toString(a));
		for (int i=0;i<=rotation ;i++ ) 
		{
			int temp = a[a.length-1];
			for (int j=a.length-2;j>=0 ;j-- ) 
			{
				a[j+1] = a[j];	
			}
			a[0] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}