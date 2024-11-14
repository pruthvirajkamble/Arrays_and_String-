class Example
{
	// public static void main(String[] args) {
	// 	int [] arr = {10,20,30,40,50,60,70,80};
	// 	for(int i=0;i<arr.length;i++)
	// 	{
	// 		System.out.print(arr[i] + " ");
	// 	}
	// }

	// public static void main(String[] args) {
	// 	int [] arr = {10,20,30,40,50,60,70,80};
	// 	int len = 0;
	// 	for(int i : arr)
	// 		len++;
	// 	System.out.print(len);
	// }

	public static void main(String[] args) {
		int [] arr = {10,20,30,40};
		int len = arr.length;
		for(int i=0; ;i++)
		{
			try{
				System.out.print(arr[i]);
				len++;
			}catch(ArrayIndexOutOfBoundsException a){
				break;
			}
		}
		System.out.println(len);

	}
}
