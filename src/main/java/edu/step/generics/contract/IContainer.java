package edu.step.generics.contract;

public interface IContainer<T> {

    void setValue(T value);
    T getValue(T value);
}
