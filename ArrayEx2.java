class ArrayEx2{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int evensum = Sumofeven(arr);
		int oddsum = SumofOdd(arr);
		System.out.println(evensum);
		System.out.println(oddsum);
	}

	public static int Sumofeven(int [] arr){
		int evensum = 0;
		for (int i : arr ) 
		{
			if(arr[i]%2==0)
				evensum+=i;
		}
		return evensum
	}
	public static int SumofOdd(int [] arr){
		int oddsum =0;
		for (int ele :arr )
		 {
			if(ele%2!=0)
				oddsum+=ele;
			return oddsum;
		}
	}
}