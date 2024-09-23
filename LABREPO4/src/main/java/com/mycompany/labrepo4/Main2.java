
package com.mycompany.labrepo4;

class Person {
    private int age;
    private String Name;
    
    public Person(int age, String Name) {
        this.age = age;
        this.Name = Name;
    }
    
    public void AgeShow() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
    }
}

// student
class Student extends Person {
    private int semister;
    private int batch;
    
    public Student(int age1, String Name1, int semister, int batch) {
        super(age1, Name1);
        this.semister = semister;
        this.batch = batch;
    }
    
    public void StudentShow() {
        AgeShow();
        System.out.println("Semister: " + semister);
        System.out.println("Batch: " + batch);
    }
}

// teacher
class Teacher extends Person {
    private String subject;
    
    public Teacher(int age2, String Name2, String subject) {
        super(age2, Name2);
        this.subject = subject;
    }
    
    public void TeacherShow() {
        AgeShow();
        System.out.println("Teacher Subject: " + subject);
    }
}

public class Main2 {
     public static void main(String[] args) {
        System.out.println("Student Information:");
        Student me = new Student(22, "Nazim", 3, 33);
        me.StudentShow();
        
        System.out.println("\nTeacher Information:");
        Teacher teacher = new Teacher(40, "XYZ", "Math");
        teacher.TeacherShow();
    }
}
