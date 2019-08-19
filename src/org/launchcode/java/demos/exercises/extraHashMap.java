package org.launchcode.java.demos.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class extraHashMap {

    public static void main (String[] args) {

        HashMap<String, Integer> studentList = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        int newGrade;

        do {
            System.out.println("Enter a new student:");
            newStudent = in.nextLine();
            if(!newStudent.equals("")){
                System.out.println("Grade:");
                newGrade = in.nextInt();
                studentList.put(newStudent, newGrade);
                in.nextLine();
            }
        }while(!newStudent.equals(""));
        for (Map.Entry<String, Integer> student : studentList.entrySet()) {
            System.out.println(student.getKey() + " : " + student.getValue());
        }
    }




}
