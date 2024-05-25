package groupingby;

import java.util.Objects;

public class Student {
    String name;
    Integer marks;
    String division;
    public Student(String name, Integer marks, String division) {
        this.name = name;
        this.marks = marks;
        this.division = division;
    }
    public String getName() {
        return name;
    }
    public Integer getMarks() {
        return marks;
    }
    public String getDivision() {
        return division;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(marks, student.marks) && Objects.equals(division, student.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks, division);
    }
}
