package org.example.collections;

import java.util.*;

class App {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Алесь Мкртчян", "13.12.1999", "Экономический"));
        studentList.add(new Student("Макар Гаврилов", "16.11.1999", "Механический"));
        studentList.add(0, new Student("Жанна Крад", "11.09.2000", "Электрический"));
        System.out.println("Исключён " + studentList.get(2));
        studentList.remove(2);
        System.out.println("Остались " + studentList);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(studentList.get(0));
        studentSet.add(studentList.get(1));
        studentSet.add(studentList.get(0));
        System.out.println("Множество студентов: " + studentSet);
        studentSet.remove(studentList.get(1));
        System.out.println("Урезанное множество студентов: " + studentSet);

        Set<Student> studentLinkedSet = new LinkedHashSet<>();
        studentLinkedSet.add(studentList.get(0));
        studentLinkedSet.add(studentList.get(1));
        studentLinkedSet.add(studentList.get(0));
        System.out.println("Множество студентов по порядку: " + studentLinkedSet);
        studentLinkedSet.remove(studentList.get(0));
        System.out.println("убрали первую, остался " + studentLinkedSet);

        Set<Student> studentTreeSet = new TreeSet<>();
        Student studentToRemove = new Student("Ясь Канюшина", "23.12.1999", "Экономический");
        Student student1 = new Student("Ясь Молчун", "26.11.1999", "Механический");
        Student student2 = new Student("Йохан Кроль", "21.09.2000", "Электрический");
        studentTreeSet.add(studentToRemove);
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        System.out.println("Студенты в порядке возрастания: " + studentTreeSet);
        studentTreeSet.remove(studentToRemove);
        System.out.println("После удаления: " + studentTreeSet);

        Map<String, Student> map = new HashMap<>();
        map.put(studentToRemove.getKey(), studentToRemove);
        map.put(student1.getKey(), student1);
        map.put(student2.getKey(), student1);
        map.put(student2.getKey(), student2);
        System.out.println(map);
        map.remove(studentToRemove.getKey());
        System.out.println("Ищем удалённоый элемент " + map.get(studentToRemove.getKey()));
    }
}