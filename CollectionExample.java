import java.util.*;

class Employee implements Comparable<Employee>{
	int empid;
	String ename;
	double salary;
	public Employee(int empid, String ename, double salary){
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "empid =" + empid +", ename="+ ename + ", salary=" +salary;
	}
	@Override
	public int compareTo(Employee emp2){
		if(this.ename.compareTo(emp2.ename)>0)
			return 1;
		else if(this.ename.compareTo(emp2.ename)<0)
			return -1;
		else 
			return 0;
	}
}
class CollectionExample{
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(4, "RAMESH",30000));
		list.add(new Employee(3, "SURESH",40000));
		list.add(new Employee(1, "MUKESH",50000));
		list.add(new Employee(7, "GANESH",60000));
		list.add(new Employee(5, "MAHESH",70000));
		list.add(new Employee(2, "RAJESH",35000));
		list.add(new Employee(6, "RAKESH",32000));

		Collections.sort(list);

		ListIterator<Employee> li = list.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}


	}
}