import java.util.*;
class CumstomMax{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int var = MaxCus(list);
		System.out.println(var);

	}
	public static int MaxCus(List<Integer> list){
		Iterator<Integer> iterator = list.iterator();
		int max = iterator.next();
		while(iterator.hasNext()){
			int curr = iterator.next();
			if(curr>max){
				max = curr;
			}
		}
		return max;
	}
}