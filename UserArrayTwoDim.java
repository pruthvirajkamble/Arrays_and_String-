import java.util.*;
class UserArrayTwoDim{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First dim array size : ");
		int size1 = sc.nextInt();
		int [][] arr = new int[size1][];


		for(int i=0;i<size1;i++){
			System.out.print("Enter the 2nd dim size for "+ (i+1)+" array : ");
			int size2 = sc.nextInt();
			arr[i] = new int[size2];
		}

		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<size1;i++){
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter the "+(j+1)+"element of "+(i+1)+" array: ");
				int ele = sc.nextInt();
				arr[i][j]= ele;

			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}