package org.launchcode.java.demos.exercises.school;

public class Student {

    private String studentName;
    private int studentID;
    private double numberOfCredits;
    private double studentGPA;
    private static int nextStudentID = 1;

//    public String toString() {
//        return studentName + " (Credits: " + numberOfCredits + ", GPA: " + studentGPA + ")";
//    }

    public Student(String StudentName, int studentID, double numberOfCredits, double studentGPA) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.numberOfCredits = numberOfCredits;
        this.studentGPA = studentGPA;
    }

//    public Student(String studentName, int studentID) {
//        this(studentName, studentID, 0, 0);
//    }
//
//    public Student(String studentName) {
//        this(studentName, nextStudentID);
//        nextStudentID++;
//    }

    public void addGrade(int courseCredits, double grade) {
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        double qualityScore = studentGPA * numberOfCredits;
        qualityScore = qualityScore + (courseCredits * grade);
        this.studentGPA = qualityScore / this.numberOfCredits;

    }

    public String getGradLevel() {
        String gradeLevel = null;
        if (this.numberOfCredits > 30) {
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits < 29 && this.numberOfCredits > 60) {
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits < 59 && this.numberOfCredits > 90) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits < 89) {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String aName){
        studentName = aName;
    }

    private int getStudentID() {
        return studentID;
    }

    private void setStudentID(int id){
        studentID = id;
    }

    public double getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(double credits) {
        numberOfCredits = credits;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(int gpa) {
        studentGPA = gpa;
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
//        Student theStudent = (Student) o;
//        return theStudent.getStudentID() == getStudentID();
//    }
}
