package com.example;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("261", "Rwiddhi Bagchi", "A++");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Parimal Raha");
        controller.setStudentGrade("A");

        controller.updateView();
    }
}
