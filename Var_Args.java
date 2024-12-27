import java.util.*;

class Var_Args{
	public static void main(String[] args) {
		int op1=m1(10,20);
        int op2=m1(10,20,30);
        int op3=m1(10,20,30,40);

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        //System.out.println(op4);
	}
	public static int m1(int ... a){
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
     

}
