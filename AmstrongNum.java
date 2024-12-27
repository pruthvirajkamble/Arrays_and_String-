import java.util.*;
class AmstrongNum{
	public static void main(String[] args) {
		int [] numbers = new int[5];
		for(int i=0;i<args.length;i++){
			numbers[i] = Integer.parseInt(args[i]);	
		}
		System.out.println(Arrays.toString(numbers ));
		for (int number : numbers) {
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
	}
	public static int isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); 

        while (num > 0) {
            int digit = num % 10; 
            sum += Math.pow(digit, digits); 
            num /= 10; 
        }
        return sum == originalNum;
	}

}