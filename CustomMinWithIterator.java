import java.util.*;

public class CustomMinWithIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(40);
        list.add(15);

        int min = customMin(list);
        System.out.println("Minimum: " + min);
    }

    // Find minimum using an Iterator
    public static int customMin(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int min = iterator.next(); // Initialize with the first element

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
}
