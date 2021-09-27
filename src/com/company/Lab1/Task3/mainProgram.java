package com.company.Lab1.Task3;
import java.util.Scanner; // to get input

public class mainProgram {
    public static float average(university university) {
        int limit = university.students.length;
        float sum = 0;
        for (int i=0; i< limit; i++) {
            sum = sum + university.students[i].mark;
        }
        float average = sum/limit;
        return average;
    }
    public static void  universities(university university) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println(" Enter the number of students " + university.name + ":");
        int StudentNumber = scanObj.nextInt();
        scanObj.nextLine();
        university.students =  new student[StudentNumber] ;
        for (int i=0; i < StudentNumber; i++) {
            student student = new student();
            System.out.println("Enter the student" + (i+1) +" name:");
            student.name =scanObj.nextLine();
            System.out.println("Enter the student" + (i+1) +" age:");
            student.age =scanObj.nextInt();
            System.out.println("Enter the student" + (i+1) +" mark:");
            student.mark =scanObj.nextInt(); scanObj.nextLine();
            university.students[i] = student;
        }
    }
    public static void main(String[] args) {
        university universityUTM = new university();
        universityUTM.name = "UTM";
        universityUTM.foundationYear = 1970;
        universities(universityUTM);
        university universityUSM = new university();
        universityUSM.name = "USM";
        universityUSM.foundationYear = 1976;
        universities(universityUSM);
        university universityULIM = new university();
        universityULIM.name = "ULIM";
        universityULIM.foundationYear = 1992;
        universities(universityULIM);
        float average1 = average(universityUTM);
        System.out.println
                ("Average media for " + universityUTM.name + " is: " + average1);
        float average2 = average(universityUSM);
        System.out.println(
                "Average media  for " + universityUSM.name + " is: " + average2);
        float average3 = average(universityULIM);
        System.out.println(
                "Average media for " + universityULIM.name + " is: " + average3);
        float total = average1 + average2 + average3;
        float averageTotal = total/3;
        System.out.println(
                "Average media for all 3 Universities is: " + averageTotal );
    }

}