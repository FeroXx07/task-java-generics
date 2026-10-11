package level_1.exercise_2_class_with_generics;

public class GenericMethods {
    public static <T1,T2,T3> void printElements(T1 el, T2 el2, T3 el3) {
        IO.println(el);
        IO.println(el2);
        IO.println(el3);
    }
}
