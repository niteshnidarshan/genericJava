package org.example;

import org.example.generic.GenericJava;
import org.example.generic.GenericJava2;
import org.example.generic.GenericMethod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(" Jai ram G Ki! ");
        System.out.println( "Hello World!" );

        // Instance of type Integer
        GenericJava<Integer> itegerType = new GenericJava<>(100);
        System.out.println(itegerType.getTypeObject());

        // Instance of type String
        GenericJava<String> stringType = new GenericJava<>("Jai Ram G Ki!");
        System.out.println(stringType.getTypeObject());

        // Testing multiple generic type class
        GenericJava2<String, Double> stringAndDoubleType = new GenericJava2<>("Ram G", 10.2d);
        stringAndDoubleType.print();

        GenericJava2<Float, Boolean> floatBooleanType = new GenericJava2<>(11.1f, true);
        floatBooleanType.print();

        //Testing Generic methods
        GenericMethod.showGeneric("Jai Ram G Ki!");
        System.out.println(GenericMethod.showGeneric1(11));
        GenericMethod gm = new GenericMethod();
        gm.showGeneric2(22);
    }
}
