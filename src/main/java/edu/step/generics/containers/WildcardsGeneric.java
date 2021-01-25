package edu.step.generics.containers;

import java.util.Arrays;
import java.util.List;

public class WildcardsGeneric {

    /**
     * ? is a wildcard meaning anything
     * super Number means that instead of ? we can put Number or it's parent
     * @param objects {@link List}
     */
    public void test(List<? super Number> objects) {
        objects.forEach(o -> System.out.println(o));
    }
}

class WildcardsGenericDemo {
    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(1.0, 2.0, 1, -2, 2L);
        WildcardsGeneric object = new WildcardsGeneric();
        object.test(numbers);

        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
//        object.test(doubles); // Error: Double is not a parent of Number
    }
}

