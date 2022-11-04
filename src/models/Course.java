package models;

public class Course {
    private Teacher teacher;
    private Student student;
    private Lecture lecture;
    private String NameCourse;
    private static long id;
    public static long counter;

    public Course(){
        counter++;
    }
}
