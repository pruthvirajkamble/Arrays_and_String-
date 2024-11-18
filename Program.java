import java.util.*;
class Program{
	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "BAC";
		char [] arr1 = str1.toCharArray();//char [] ch = str1.toCharArray();
		Arrays.sort(arr1);
		char [] arr2 = str2.toCharArray();//char []ch1 = str2.toCharArray();
		                                  //Arrays.sort(ch);
		                                  //Arrays.sort(ch1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		if(arr1.length == arr2.length)//if(ch.length==ch1.length){
		{ 
			boolean flag = true;
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(str2+" anagram");
			else 
				System.out.println(str2+" not anagram");
 
		}
		else 
			System.out.println(str2+" not anagram");

	}
}