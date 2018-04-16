package qa.tasks.lesson3;

public class Person2 {
    public static void main(String[] args) {

        Person p1 = new Person("Vasya", "Pypkin", "v.pypkin@email.com");
        Person p2 = new Person("Kolya", "Dyrkin", "k.dyrkin@email.com");

        System.out.println(p1.printPerson());
        System.out.println(p2.printPerson());

    }
}
