import java.util.*;
class MultiDimArray{
	public static void main(String[] args) {
		int [][] a = {{10,20,30,40},{50,60,70,80,90}};
		//foreach loop
		for (int[] m : a ) {
			for (int n : m ) {
				System.out.println(n+" ");
			}
			System.out.println();	
		}
		System.out.println();
		System.out.println("_______________");
		System.out.println(Arrays.deepToString(a));
	}
}