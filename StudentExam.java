import java.util.*;
class StudentExam{
	public static void main(String[] args) {
		int [] sem1 = {40,60,35,48,68,80};
	int [] sem2 = {20,80,70,68,90,50};
	int [] res = new int[sem1.length];
	int cnt = 3;

	for (int i=0;i<sem1.length ;i++ ){
		res[i] = sem2[i]-sem1[i];
	}

	Arrays.sort(res);
	int totalMark = 0;
	for(int i=res.length-1;i>=0;i--)
	{
		if(res[i]>0 && cnt!=0){
			totalMark += res[i];
			cnt--;
		}
	}
	if(totalMark>=35)
		System.out.println("Pass " + totalMark);
	else 
		System.out.println("Fail "+ totalMark);
	}
	

}