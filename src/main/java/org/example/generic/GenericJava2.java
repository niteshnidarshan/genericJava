package org.example.generic;

/**
 * Multiple type parameters in Java Generics.
 *
 * @param <A>
 * @param <Z>
 */
public class GenericJava2 <A, Z>{

    A objType1; // An object of type A
    Z objType2; // An object of type Z

    // Constructor
    public GenericJava2(A obj1, Z obj2) {
        this.objType1 = obj1;
        this.objType2 = obj2;
    }

    // To print object of types A & Z
    public void print() {
        System.out.println(objType1);
        System.out.println(objType2);
    }
}
