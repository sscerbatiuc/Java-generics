package edu.step.generics.containers;

import edu.step.generics.contract.IContainer;

public class NumberContainer<T extends Number> implements IContainer<T> {

    private T value;

    public NumberContainer(T value) {
        this.value = value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public T getValue(T value) {
        return value;
    }
}

class NumberContainerDemo {
    public static void main(String[] args) {
        NumberContainer<Integer> integer1 = new NumberContainer<>(1);
        NumberContainer<Integer> integer2 = new NumberContainer<>(-10);
        NumberContainer<Double> double1 = new NumberContainer<>(-1.0);
        NumberContainer<Double> double2 = new NumberContainer<>(10.0);
//        NumberContainer<String> string = new NumberContainer<String>("String"); // Error: String <-X-> Number
//        NumberContainer<Object> object = new NumberContainer<Object>(new Object()); // Error: Object <-X-> Number
    }
}
