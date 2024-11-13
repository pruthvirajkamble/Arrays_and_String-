//Array Declaration in jagged array
 class ArrayEx1{
	public static void main(String[] args) {
		int [][]a= new int[3][];
		a[0]=new int[2];
		a[1]=new int[2];
		a[2]=new int[4];

		// Array Declaration in Matrix array
 		int [][]a1 = new int[2][2];
 		System.out.println("hello");

 		//Creation and Declaration
 		//ex1
 		byte[] a2 = new byte[3];
 		//ex2
 		int [][] a3= new int[3][];
 		a3[0]= new int[1];
 		a3[1]= new int[2];
 		a3[2]= new int[2];

 		//array initialization, declaration,creation
 		int [] arr = new int[3];
 		arr[0] = 10;
 		arr[1] = 20;
 		arr[2] = 30;

 		char [][] arr1 = new char[2][];
 		arr1 [0]= new char[2];
 		arr1 [1]= new char[3];
 		arr1[0][0]= 'a';
 	    arr1[0][1]= 'b';
 	    arr1[1][0]='c';
 	    arr1[1][1]='d';
 	    arr1[1][2]='e';

 	    // Declaretion in another way
 	    int [] arr2 = {10,20,30};
 	    char[][] ch = {{'a','b'},{'c','d','e'}}
	}
}
