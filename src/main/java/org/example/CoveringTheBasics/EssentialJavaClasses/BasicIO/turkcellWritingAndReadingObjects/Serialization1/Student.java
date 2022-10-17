package org.example.CoveringTheBasics.EssentialJavaClasses.BasicIO.turkcellWritingAndReadingObjects.Serialization1;

import java.io.Serializable;

public class Student implements Serializable {

    private int no;
    private String firstName;
    private String lastName;
    private String classNo;


    public Student() {
    }

    public Student(int no, String firstName, String lastName, String classNo) {
        this.no = no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classNo = classNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNo='" + classNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.no == student.no;
    }
}
