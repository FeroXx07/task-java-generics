package level_2.exercise_1_partial_generics;

public class GenericMethods {
    public static <T2,T3> void printElements(String el, T2 el2, T3 el3) {
        IO.println(el);
        IO.println(el2);
        IO.println(el3);
    }

    public static <T> void printAllElements(T... elements) {
        for (T t : elements) {
            IO.println(t);
        }
    }
}
