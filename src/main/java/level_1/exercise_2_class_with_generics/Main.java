package level_1.exercise_2_class_with_generics;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Fernando","Alonso", 45);
        GenericMethods.printElements(person, "Campeon del mundo", 33);
    }
}
