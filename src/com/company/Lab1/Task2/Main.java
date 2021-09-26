package com.company.Lab1.Task2;

public class Main {
    public static void main(String[] args) {
        student student1 = new student();
        student1.name = "Ion";
        student1.age = 19;
        student1.mark = 8.522;
        student student2 = new student();
        student2.name = "Petrea";
        student2.age = 21;
        student2.mark = 7.66;
        student student3 = new student();
        student3.name = "Vasile";
        student3.age = 23;
        student3.mark = 6.66;
        student student4 = new student();
        student4.name = "Eugen";
        student4.age = 20;
        student4.mark = 9.23;
        student student5 = new student();
        student5.name = "Ana";
        student5.age = 23;
        student5.mark = 8.2;
        student student6 = new student();
        student6.name = "Olea";
        student6.age = 19;
        student6.mark = 6.98;
        university universityUTM = new university();
        universityUTM.name = "UTM";
        universityUTM.foundationYear = 1970;
        university universityUSM = new university();
        universityUSM.name = "USM";
        universityUSM.foundationYear = 1976;
        university universityULIM = new university();
        universityULIM.name = "ULIM";
        universityULIM.foundationYear = 1992;
        universityUTM.students = new student[]{student1, student2};
        universityUSM.students = new student[]{student3, student6};
        universityULIM.students = new student[]{student4, student5};
    }
}