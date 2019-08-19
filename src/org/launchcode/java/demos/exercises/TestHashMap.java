package org.launchcode.java.demos.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentsHashMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String student;
        int studentID = 1000;
        System.out.println("Enter Students");

        do {
            System.out.println("New Student:");
            student = in.nextLine();
            if (!student.equals("")) {
                studentID = studentID + 1;
                studentsHashMap.put(studentID, student);
            }
        } while (!student.equals(""));
        System.out.println(studentsHashMap);
        for (Map.Entry<Integer, String> nameOfStudent : studentsHashMap.entrySet()) {
            System.out.println(nameOfStudent.getKey() + " is the Student ID for " + nameOfStudent.getValue());
        }

    }
}
