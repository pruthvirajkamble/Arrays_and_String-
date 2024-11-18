class RevString
{
	public static void main(String[] args) {
		String str = "heloooo";
		String rev = "";
		// for(int i=0;i<str.length();i++){
		// 	rev = str.charAt(i)+rev;
		// }
		// System.out.println(rev);

		// for(int i=str.length()-1;i>=0;i--){
		// 	rev += str.charAt(i);
		// }
		// System.out.println(rev);

		System.out.println(new StringBuffer(str).reverse());
	}
}