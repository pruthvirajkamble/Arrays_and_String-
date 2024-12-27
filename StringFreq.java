import java.util.*;
class StringFreq{
	public static void main(String[] args) {
		String str = "hi java hi sql hi python hi java hello java ";
		String [] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		boolean [] barr = new boolean[arr.length];
		System.out.println(Arrays.toString(barr));

		for(int i=0;i<arr.length;i++){
			int icnt = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i].equals(arr[j]) && barr[j]==false){
					icnt++;
					barr[j] = true;
				}
			}
		  // if(icnt>0)
		// 		System.out.println(arr[i]+" : " +icnt);	
			// if(icnt>1)
			// 	System.out.println(arr[i]);

			// if(icnt==1)
			// 	System.out.println(arr[i]+":"+icnt);
			
		}
	}
}