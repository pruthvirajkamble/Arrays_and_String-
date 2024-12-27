import java.util.*;
class Student{
	int sid;
	String sname;
	long contact;
	String graduation;
	String branch;
	int yop;
	double cgpa;

   public Student(int sid, String sname, long contact,String graduation,
   	String branch, int yop, double cgpa){
   	super();
   	this.sid = sid;
   	this.sname = sname;
   	this.contact = contact;
   	this.graduation = graduation;
   	this.branch = branch;
   	this.yop = yop;
   	this.cgpa = cgpa;
   }
   @Override
   public String toString(){
   	return "sid : "+ sid +", sname :" + sname + ", contact :" + contact + ", graduation :"+ graduation
   	+ ", branch : "+ branch + ", yop : " + yop +", cgpa: "+ cgpa;
   }
}

class SortById implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2){
		//return s2.sid - s1.sid;
		if(s1.sid > s2.sid)
			return 1;
		else if (s1.sid < s2.sid)
			return -1;
		else 
			return 0;
	}
}

class SortByName implements Comparator<Student> {
	// @Override
	// public int compare(Student s1, Student s2){
	// 	return s2.sname.compareTo(s1.name);
	// }
	@Override
	public int compare(Student s1, Student s2){
		if(s1.sname.compareTo(s2.sname)>0)
			return 1;
		else if(s1.sname.compareTo(s2.sname)<0)
			return -1;
		else 
			return 0;
	}
}

class SortByBranch implements Comparator<Student> {
	// @Override
	// public int compare(Student s1, Student s2){
	// 	return s2.branch.compareTo(s1.branch);
	// }
	@Override
	public int compare(Student s1, Student s2){
		if(s1.branch.compareTo(s2.branch)>0)
			return -1;
		else if(s1.branch.compareTo(s2.branch)<0)
			return 1;
		else 
			return 0;
	}
}

class SortByYop implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2){
		//return s2.yop - s1.yop;
		if(s1.yop > s2.yop)
			return -1;
		else if (s1.yop < s2.yop)
			return 1;
		else 
			return 0;
	}
}

class SortByCgpa implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2){
		//return s2.cgpa - s1.cgpa;
		if(s1.cgpa > s2.cgpa)
			return -1;
		else if (s1.cgpa < s2.cgpa)
			return 1;
		else 
			return 0;
	}
}
public class CollectionExample1{
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "RAMESH", 98799432101l, "BE", "CIVIL", 2024, 9.71));
		list.add(new Student(4, "SURESH", 80765432101l, "BE", "MECHANICAL", 2024, 8.7)); 
		list.add(new Student(2, "GANESH", 98765432101l, "BE", "ELECTRICAL", 2023, 7.9));
		list.add(new Student(6, "RAJESH", 99965432101l, "BE", "MECHANICAL", 2024, 9.13));
		list.add(new Student(5, "ANIMESH",67765432101l, "BE", "CIVIL", 2022, 8.3));
		list.add(new Student(1, "OKESH",  86765432101l, "BE", "ELECTRONICS", 2023, 8.7)); 
		list.add(new Student(7, "KAMLESH",77765432101l, "BE", "ELECTRICAL", 2023, 6.7));

		Collections.sort(list, new SortById());
		Collections.sort(list, new SortByName());
		Collections.sort(list, new SortByBranch());
		Collections.sort(list, new SortByYop());
		Collections.sort(list, new SortByCgpa());

		//Collections.sort(list, (sl,#21-582.yop-s-yp):

		//Collections.sort(list, (si, z.branch.compareTo(=l.branch));

		ListIterator<Student> li =  list.listIterator();
		while (li.hasNext()){
			System.out.println(li.next());
		}
	}
}