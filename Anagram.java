import java.util.*;
class Anagram{
	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "ACB";
		// char [] arr1 = str.toCharArray();
		// Arrays.sort(arr1);
		// char [] arr2 = str1.toCharArray();
		// Arrays.sort(arr2);
		// if(arr1.length==arr2.length){
		// 	boolean flag = true;
		// 	for(int i=0;i<arr1.length;i++){
		// 		if(arr1[i]!=arr2[i]){
		// 			flag = false;
		// 			break;
		// 		}
		// 	}
		// 	if(flag)
		// 		System.out.println(str+" is Anagram");
		// 	else 
		// 		System.out.println(str+" is not Anagram");
		// }
		// else 
		// 	System.out.println(str+ " is not Anagram");
		int a = 0;
		for(int i=0;i<str.length();i++)
			a += (str.charAt(i)-str1.charAt(i));
		
		System.out.println((a==0)?str1+" is Anagram": str1+" is not Anagram");
	}
}