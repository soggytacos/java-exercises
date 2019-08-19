package org.launchcode.java.demos.exercises.school;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String courseID;
    private double credits;
    private String department;
    private ArrayList<String> prerequisites;

//    public String toString(){
//        return courseName + "(" + department + ": " + courseID + ")" + ": " + credits + " credits";
//    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

//    public boolean equals(Object o){
//        if (o == this) {
//            return true;
//        }
//        if (o == null) {
//            return false;
//        }
//        if (o.getClass() != getClass()) {
//            return false;
//        }
//        Course theCourse = (Course) o;
//        return theCourse.getCourseID() == getCourseID();
//    }
}
