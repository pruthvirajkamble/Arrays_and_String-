import java.util.*;
class Frequency
{
	public static void main(String[] args) {
		int [] arr = {5,3,2,1,3,4,2,2,4,7};
		int len = arr.length;
		boolean [] barr = new boolean[len];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(barr));

		for (int i=0;i<len ;i++ ) 
		{
			int icnt = 0;
			for (int j=0;j<len ;j++ ) 
			{
				if(arr[i]==arr[j] && barr[j]==false)
				{
					icnt++;
					barr[j]=true;
				}	
			}
			// if(icnt!=0)
			// 	System.out.println(arr[i]+" : "+icnt);
			// if (icnt == 1)
			// 	System.out.println(arr[i]);
			if(icnt>1)
				System.out.println(arr[i]);
			
		}
	}
}