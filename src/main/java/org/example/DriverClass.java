package org.example;

public class DriverClass {
    public static void main(String[] args) {
            //This creates a course while using the default constructor
        Course course1 = new Course();
            //This changes the information in the first course
        course1.setId(101);
        course1.setName("Data Structures & Algorithms");
        course1.setCode("CSC229");
            //This prints out the information for the first course
        System.out.println("Course 1");
        System.out.println("ID: " + course1.getId());
        System.out.println("Name: " + course1.getName());
        System.out.println("Code: " + course1.getCode());

        System.out.println();
            //This makes the second course from the overloaded constructor
        Course course2 = new Course(102, "Management Information Systems", "BCS300");
            //This prints out the information for the second course
        System.out.println("Course 2");
        System.out.println("ID: " + course2.getId());
        System.out.println("Name: " + course2.getName());
        System.out.println("Code: " + course2.getCode());
    }
}