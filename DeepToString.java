import java.util.*;
class DeepToString{
	public static void main(String[] args) {
		String[][] datalist = {{"1","Ramesh Kumar"},{"2","Suresh Kumar"},{"3","Mahesh Kumar"}};
		System.out.println(Arrays.deepToString(datalist));

		//foreach
		for (String[] i : datalist ) {
			System.out.println(Arrays.toString(i));
			
		}
	}
}