package lista6.exercise2;
import java.util.*;

public class ListOfNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> unique = new HashSet<>();

        for (Integer n : numbers) {
            unique.add(n);
        }
        System.out.println(unique);
    }
}

