package lista6.exercicio2;
import java.util.*;

public class ListOfNumbers {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> unicos = new HashSet<>();

        for (Integer n : numeros) {
            unicos.add(n);
        }
        System.out.println(unicos);
    }
}

