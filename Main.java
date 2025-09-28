import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // задание 1: 2
        Person p1 = new Person("Клеопатра", 152);
        Person p2 = new Person("Пушкин", 167);
        Person p3 = new Person("Владимир", 189);
        Person p4 = new Person("Криштиану", 187);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // задание 1: 3
        Name n1 = new Name("Клеопатра");
        Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name n3 = new Name("Маяковский", "Владимир");
        Name n4 = new Name("Роналду", "Криштиану");
        System.out.println("");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        // задание 2: 2
        PersonName pn1 = new PersonName(n1, 152);
        PersonName pn2 = new PersonName(n2, 167);
        PersonName pn3 = new PersonName(n3, 189);
        PersonName pn4 = new PersonName(n4, 187);
        System.out.println("");

        System.out.println(pn1);
        System.out.println(pn2);
        System.out.println(pn3);
        System.out.println(pn4);

        // задание 3: 3
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");
        System.out.println("");

        a.addPath(b, 5).addPath(f, 1).addPath(d, 6);
        b.addPath(a, 5).addPath(c, 3);
        c.addPath(b, 3).addPath(d, 4);
        d.addPath(a, 6).addPath(e, 2).addPath(c, 4);
        e.addPath(f, 2);
        f.addPath(b, 1).addPath(e, 2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("");

        // задание 4: 8
        City48 a48 = new City48("A");
        City48 b48 = new City48("B");
        City48 c48 = new City48("C");

        List<Path48> b48Paths = new ArrayList<>();
        b48Paths.add(new Path48(c48, 7));
        City48 b48WithPaths = new City48("B", b48Paths);

        a48.addPath(b48, 5).addPath(c48, 10);

        System.out.println(a48);        // A: B:5, C:10
        System.out.println(b48WithPaths); // B: C:7
        System.out.println(c48);        // C:

    }
}