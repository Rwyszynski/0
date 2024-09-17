import java.util.*;
import java.io.*;
import java.lang.*;

public class Tests {
    public static void main(String[] args) {

        Students kid1 = new Students("Adam", "Markowski", 15);
        Students kid2 = new Students("Anita", "Kotowska", 16);
        Students kid3 = new Students("Mateusz", "Murawski", 17);
        Students kid4 = new Students("Adam", "Szadkowski", 18);

        Grades rate1 = new Grades(2, 3, 4, 5);
        Grades rate2 = new Grades(4, 5, 5, 4);
        Grades rate3 = new Grades(2, 3, 1, 1);
        Grades rate4 = new Grades(3, 4, 2, 4);

        HashMap<Students, Grades> studentsGrades = new HashMap<Students, Grades>();
        studentsGrades.put(kid1, rate1);
        studentsGrades.put(kid2, rate2);
        studentsGrades.put(kid3, rate3);
        studentsGrades.put(kid4, rate4);

        for (Map.Entry<Students, Grades> entry : studentsGrades.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}

class Students {
    String name;
    String surname;
    Integer numberInClass;

    public Students(String name, String surname, Integer numberInClass) {
        this.name = name;
        this.surname = surname;
        this.numberInClass = numberInClass;

    }

    @Override
    public boolean equals(Object o) {
        Students e = (Students) o;
        return this.name.equals(e.name) && this.surname.equals(e.surname) && this.numberInClass.equals(e.numberInClass);
    }

    @Override
    public int hashCode() {
        return numberInClass;
    }

    @Override
    public String toString() {
        return name + " " + surname + " - " + "Numer w dzienniku - " + numberInClass;
    }
}

class Grades {
    Integer quiz;
    Integer halfTest;
    Integer quiz2;
    Integer finalTest;

    public Grades(Integer quiz, Integer halfTest, Integer quiz2, Integer finalTest) {
        this.quiz = quiz;
        this.halfTest = halfTest;
        this.quiz2 = quiz2;
        this.finalTest = finalTest;
    }

    @Override
    public String toString() {
        double sum = (quiz + halfTest + quiz2 + finalTest) / 4.0; // howMany
        return "Średnia ocen: " + sum;

    }

}