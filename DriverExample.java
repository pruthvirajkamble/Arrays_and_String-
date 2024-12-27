import java.util.*;
class Student{
	int sid;
	String sname;
	String branch;
	int yop;
	double cgpa;
	Student(int sid, String sname, String branch, int yop, double cgpa){
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.yop = yop;
		this.cgpa = cgpa;

	}
	@Override
	public String toString(){
		return sid +" ."+ sname +", Branch : "+branch + " ,YOP:"+yop +", Cgpa : "+cgpa;
	}
}
 class DriverExample 
 {
 	public static void main(String[] args) 
 	{
 		Student [] a = new Student[5];
 		a[0] = new Student(3, "ANIMESH", "IT",2024,7.87);
 		a[1] = new Student(1, "ABHISHEK", "CS",2024,8.20);
 		a[2] = new Student(5, "VIKAS", "CS",2024,7.77);
 		a[3] = new Student(2, "PARAS", "CS",2024,8.01);
 		a[4] = new Student(4, "DHIRENDRA", "CS",2024,7.55);
 		bubbleSort(a);
 		for (Student student : a )
 		 {
 		 	System.out.println(student);	
 		}
 	}
 	public static void bubbleSort(Student[]a)
 	{
 		for(int i=0;i<a.length;i++)
 		{
 			for(int j=i+1;j<a.length;j++)
 			{
 				if((a[i].sid)>(a[j].sid))
 				{
 					Student temp = a[i];
 					a[i] = a[j];
 					a[j] = temp;
 				}
 			}
 		}
 	}
 }