In Java, `compare` and `compareTo` are methods used for comparing objects, but they are used in different contexts and are part of different interfaces. Here’s a comparison between the two, along with examples:

### `compareTo` Method
- **Part of:** `Comparable` interface
- **Purpose:** Used for natural ordering of objects
- **Signature:** `int compareTo(T o)`
- **Implementation:** The class itself implements `Comparable` and overrides the `compareTo` method to define the natural ordering.

#### Example of `compareTo`
```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Natural ordering by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
```

### `compare` Method
- **Part of:** `Comparator` interface
- **Purpose:** Used for custom ordering of objects
- **Signature:** `int compare(T o1, T o2)`
- **Implementation:** A separate class implements `Comparator` and overrides the `compare` method to define the custom ordering.

#### Example of `compare`
```java
import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Custom ordering by name
        return p1.getName().compareTo(p2.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people, new NameComparator());

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
```

### Summary
- **`compareTo` (Comparable):** Used for natural ordering within the class itself. Implemented by the class that needs to be compared.
- **`compare` (Comparator):** Used for custom ordering, often defined outside the class. Implemented by a separate class or as an anonymous class.