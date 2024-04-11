package org.example.collections;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String birthDate;
    private String faculty;

    public Student(String name, String birthDate, String faculty) {
        this.name = name;
        this.birthDate = birthDate;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getKey() {
        return name + " " + birthDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj ||
                (obj != null && obj.getClass() == getClass()
                        && ((Student) obj).getName().equals(name)
                        && ((Student) obj).getBirthDate().equals(birthDate));
    }

    @Override
    public String toString() {
        return name + " " + birthDate + ", " + faculty;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
