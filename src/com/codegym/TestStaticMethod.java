package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Linh");
        Student s2 = new Student(222, "Nguyen");
        Student s3 = new Student(333, "Thu");
        s1.display();
        s2.display();
        s3.display();
    }
}
