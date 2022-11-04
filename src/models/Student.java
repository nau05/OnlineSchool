package models;

public class Student {
    private String NameStudent;
    private static long id;
    public static long counter;

    public Student(){
        counter++;
    }
}
