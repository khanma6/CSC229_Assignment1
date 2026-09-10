package org.example;

    //Has the information for a course
public class Course {

        //These are the variables
    private int id;
    private String name;
    private String code;
        //this is the default constructor
    public Course() {
        id = 0;
        name = "";
        code = "";
    }
        //This is the constructor that lets you enter the information
    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
        //These lines get and set the course ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
        //These lines get and set the course name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        //These lines get and set the course code
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
