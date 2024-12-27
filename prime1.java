import java.util.*;

class prime1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
