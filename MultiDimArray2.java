import java.util.*;
class MultiDimArray2{
	public static void main(String[] args) {
		int [][] a = {{10,20,30,40},{50,60,70,80,90,100}};

		//forloop
		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}

		// while loop
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length){
              System.out.printpl(a[i][j]);
              j++;
			}
			System.out.println();
			i++;
		}

		//do while
		// int n=0;
		// do{
		// 	int m=0;
		// 	do{
		// 		System.out.println(a[n][m]);
		// 		m++;
		// 	}while(m<a[n].length);
		// 	n++;
		// }while(n<a.length);
	}
}