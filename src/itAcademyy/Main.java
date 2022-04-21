package itAcademyy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Audi");
        car.add("Mercedes");
        car.add("Renault");

        System.out.println(car);
        car.add(2, "Opel");
        System.out.println(car);
        car.remove(0);
        System.out.println(car);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0 && i <= 30) {
                numbers.add(i);
            } else if (i % 2 == 0 && i >= 300) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);

    }
}
