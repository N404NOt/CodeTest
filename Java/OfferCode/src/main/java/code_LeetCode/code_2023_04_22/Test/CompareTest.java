package code_LeetCode.code_2023_04_22.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {

        Person person1 = new Person("Java",6,19);
        Person person2 = new Person("Python",1,77);
        Person person3  = new Person("C++",99,45);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        Collections.sort(list);
        for (Person person : list) {
            System.out.print(person.getId() + " ");
            System.out.print(person.getAge() + " ");
            System.out.print(person.getName() + " ");
            System.out.println();
        }

    }
}

class Person implements Comparable<Person> {
    public String name;
    public Integer age;
    public Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public int compareTo(Person o) {
        return o.getAge() - this.getAge();
    }
}
