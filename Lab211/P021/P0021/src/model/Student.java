/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author d
 */
public class Student {

    private String id;
    private String name;
    private String semester;
    private String course;

    public Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {
        System.out.printf("%-7s | %-15s | %-10s | %-7s\n", id, name, semester, course);
    }
}
