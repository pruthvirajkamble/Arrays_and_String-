// class ArrayEx2
// {
// 	public static void main(String[] args) 
// 	{
// 		int [] arr = {1,2,3,4,5,6,7,8,9};
// 		int evenSum = Sumofeven(arr);
// 		int oddSum = SumofOdd(arr);
// 		System.out.println(evenSum);
// 		System.out.println(oddSum);
// 	}

// 	public static int Sumofeven(int [] arr)
// 	{
// 		int evensum = 0;
// 		for (int i : arr ) 
// 		{
// 			if(arr[i]%2==0)
// 				evensum+=i;
// 		}
// 		return evensum;
// 	}
// 	public static int SumofOdd(int [] arr)
// 	{
// 		int oddsum =0;
// 		for (int ele :arr )
// 		 {
// 			if(ele%2!=0)
// 				oddsum+=ele;
// 			return oddsum;
// 	     }
// 	}	
// }

class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int evenSum = Sumofeven(arr);
        int oddSum = SumofOdd(arr);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static int Sumofeven(int[] arr) {
        int evensum = 0;
        for (int ele : arr) {
            if (ele % 2 == 0) { // Check if the element is even
                evensum += ele;
            }
        }
        return evensum;
    }

    public static int SumofOdd(int[] arr) {
        int oddsum = 0;
        for (int ele : arr) {
            if (ele % 2 != 0) { // Check if the element is odd
                oddsum += ele;
            }
        }
        return oddsum;
    }
}
