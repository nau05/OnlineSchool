package models;

public class Lecture {
    private Homework homework;
    private AddMaterial addMaterial;
    private String NameLecture;
    private static long id;
    public static long counter;

    public Lecture(){
        counter++;
    }
}
