package model;

import java.util.List;

public class Course {
    private String name;
    private int StartDate;
    private List<Student> students;

    public Course(String name, int startDate, List<Student> students) {
        this.name = name;
        StartDate = startDate;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getStartDate() {
        return StartDate;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void printInfo(){
        System.out.println("Course: " + name + "starting from " + StartDate);
        System.out.println("Students of this course:");

        for (Student student : students){
            System.out.println(student.getFullName());
        }
    }
    public void addStudent(Student studentToAdd){
        students.add(studentToAdd);
    }
}
