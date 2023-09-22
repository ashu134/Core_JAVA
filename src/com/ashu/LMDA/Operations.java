package com.ashu.LMDA;

//Functional interface
@FunctionalInterface
public interface Operations<T> {
    T operate(T value1, T value2);
}

