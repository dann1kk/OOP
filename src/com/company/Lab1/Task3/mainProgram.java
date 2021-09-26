package com.company.Lab1.Task3;
import java.util.Scanner;

public class mainProgram {

    public static void  readData(university university) {
        Scanner scanObj = new Scanner(System.in);
        // Wanted number of students
        System.out.println(" Enter the number of students you want to register in " + university.name + ":");
        int studentCount = scanObj.nextInt(); scanObj.nextLine();
        //Initialization of Array of students for the university required
        university.students =  new student[studentCount] ;
        // INtroducing name+age+mark data
        for ( int i = 0; i < studentCount; i++ ) {
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
    // Average Media per University
    public static float average(university university) {
        int limit = university.students.length;
        float sum = 0;
        for ( int i = 0; i < limit; i++ ) {
            sum += university.students[i].mark;
        }
        float avg = sum/limit;
        return avg;
    }

    //Main Program
    public static void main(String[] args) {
        // data Initialization for universities
        university universityUTM = new university();
        universityUTM.name = "UTM";
        universityUTM.foundationYear = 1970;
        university universityUSM = new university();
        universityUSM.name = "USM";
        universityUSM.foundationYear = 1976;
        university universityULIM = new university();
        universityULIM.name = "ULIM";
        universityULIM.foundationYear = 1992;
        // Asks the user for number of students in each university and their name+age+mark as inputs.
        readData(universityUTM);
        readData(universityUSM);
        readData(universityULIM);
        // Average Media per University
        float avg1 = average(universityUTM);
        System.out.println
                ("Average media for " + universityUTM.name + " is: " + avg1 + ";");
        float avg2 = average(universityUSM);
        System.out.println("Average media  for " + universityUSM.name + " is: " + avg2 + ";");
        float avg3 = average(universityULIM);
        System.out.println("Average media for " + universityULIM.name + " is: " + avg3 + ";");
        // total average media for all 3
        float avgTotal = (avg1 + avg2 + avg3) / 3;
        System.out.println("Average media for all 3 Universities is: " + avgTotal + ";");
    }}