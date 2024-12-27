import java.util.*;
class Panagram1{
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean flag = true;
		for(char i='A';i<='Z';i++){
			if(!(str.contains(i+""))){
				flag = false;
				break;
			}
		}
		System.out.println(flag?str+" it's panagaram":str+" it's not panagram");
	}
}