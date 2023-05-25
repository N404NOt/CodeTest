package code_LeetCode.code_2023_04_20.Test;

import java.sql.Struct;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class equals {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("极品小學生",18);
        Student s2 = new Student("极品小學生",18);

        set.add(s1);
        set.add(s2);
        System.out.println("Set 集合长度为： " + set.size());

        for (Student s : set) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
