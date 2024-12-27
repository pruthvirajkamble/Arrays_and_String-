import java.util.*;
class RetainAll{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Collection <Integer> coll = new ArrayList<>();
		for(int i=0;i<=9;i++){
			coll.add(i);
		}
		System.out.println(coll);

		Collection <Integer> even = new ArrayList<>();
		for (Integer ele : coll ) {
			if(!(ele % 2==0))
				even.add(ele);
				
		}
		coll.retainAll(even);
		System.out.println(even);

	}
}