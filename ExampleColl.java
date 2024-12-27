import java.util.*;
class ExampleColl{
	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
		coll.add(10);
		coll.add(20);
		coll.add(30);
		coll.add(40);
		System.out.println(coll);

		Object [] arr = coll.toArray();
		System.out.println(Arrays.toString(arr));

	}
}