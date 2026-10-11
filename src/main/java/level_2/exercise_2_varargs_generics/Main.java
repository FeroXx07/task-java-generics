package level_2.exercise_2_varargs_generics;


import level_1.exercise_2_class_with_generics.Person;
import level_2.exercise_1_partial_generics.GenericMethods;

public class Main {
    static void main(String[] args) {
        Person person = new Person("Fernando","Alonso", 45);
        GenericMethods.printAllElements("Campeon del mundo", person, 33);
    }
}
