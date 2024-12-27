import java.util.*;

class SwapChar {
    public static void main(String[] args) {
        String str = "ab@cd#e";
        System.out.println("Original String: " + str);
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String result = new String(arr);
        System.out.println("Reversed String: " + result);
    }
}
