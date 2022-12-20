package org.example.generic;

/**
 *
 * What is Generics
 * =========================
 * Generics means parameterized types.
 * The idea is to allow type (Integer, String, … etc., and user-defined types)
 * to be a parameter to methods, classes, and interfaces.
 *
 * Using Generics, it is possible to create classes that work with different data types.
 * An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
 *
 * Why Generics
 * =======================
 * The Object is the superclass of all other classes,
 * and Object reference can refer to any object.
 * These features lack type safety. Generics add that type of safety feature.
 * classes like HashSet, ArrayList, HashMap, etc., use generics very well.
 *
 * Types of Java Generics
 * ==========================
 * Generic Method : Generic Java method takes a parameter and returns some value after performing a task.
 *                  It is exactly like a normal function, however, a generic method has type parameters
 *                  that are cited by actual type.
 *                  This allows the generic method to be used in a more general way.
 *                  The compiler takes care of the type of safety which enables programmers
 *                  to code easily since they do not have to perform long, individual type castings.
 * Generic Classes : A generic class is implemented exactly like a non-generic class.
 *                  The only difference is that it contains a type parameter section.
 *                  There can be more than one type of parameter, separated by a comma.
 *                  The classes, which accept one or more parameters, are known as parameterized classes
 *                  or parameterized types.
 *
 * Note: In Parameter type we can not use primitives like ‘int’,’char’ or ‘double’.
 *
 * Generics Work Only with Reference Types
 * ===========================================
 * When we declare an instance of a generic type,
 * the type argument passed to the type parameter must be a reference type.
 * We cannot use primitive data types like int, char.
 * for e.g.:
 * GenericJava<int> obj = new GenericJava<int>(20);
 * The above line results in a compile-time error that can be resolved using type wrappers to encapsulate a primitive type.
 *
 * But primitive type arrays can be passed to the type parameter because arrays are reference types.
 * ArrayList<int[]> a = new ArrayList<>();
 *
 * Type Parameters in Java Generics
 * ===================================
 * We use below conventions for Generic types:
 * T – Type
 * E – Element
 * K – Key
 * N – Number
 * V – Value
 *
 * Advantages of Generics:
 * 1. Code Reuse
 * 2. Type Safety
 * 3. Implementing Generic Algorithms
 *
 *
 *
 *
 * User Defined Generic classes
 * use < > to specify parameter type
 * @param <T>
 */
public class GenericJava<T> {

    // An object of Type T declared.
    T obj;

    //constructor
    public GenericJava(T type) {
        this.obj = type;
    }

    public T getTypeObject() {
        return obj;
    }

}
