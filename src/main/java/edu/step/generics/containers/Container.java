package edu.step.generics.containers;

import java.util.Arrays;
import java.util.List;

/**
 * @param <T> is a placeholder for any given type
 */
public class Container<T> {

    T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class GenericContainerDemo {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello");
        Container<Integer> integerContainer = new Container<>(1);
        Container<Double> doubleContainer = new Container<>(2.0);


        List<Container<?>> containerList = Arrays.asList(stringContainer, integerContainer, doubleContainer);
        containerList.forEach(container -> System.out.println(container.getValue()));
    }
}
