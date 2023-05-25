package code_LeetCode.code_2023_04_22.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        Person person1 = new Person("Java", 6, 19);
        Person person2 = new Person("Python", 1, 77);
        Person person3 = new Person("C++", 99, 45);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        for (Person person : list) {
            System.out.print(person.getId() + " ");
            System.out.print(person.getAge() + " ");
            System.out.print(person.getName() + " ");
            System.out.println();
        }
    }
}

