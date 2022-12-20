package org.example.generic;

/**
 * Demonstration of Java Generic Methods
 *
 * We can also write generic functions that can be called with
 * different types of arguments based on the type of arguments passed
 * to the generic method. The compiler handles each method.
 */
public class GenericMethod {
    public static <E> void showGeneric(E element) {
        System.out.println(element.getClass().getName()+" = "+element);
    }

    public static <X> String showGeneric1(X x) {
        return "RAM G! "+x;
    }

    public <Y> void showGeneric2(Y value) {
        System.out.println(value);
    }
}
