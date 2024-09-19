import java.util.*;
import java.io.*;
import java.lang.*;

public class Tests {
    public static void main(String[] args) {

        Student kid1 = new Student("Adam", "Markowski", 15);
        Student kid2 = new Student("Anita", "Kotowska", 16);
        Student kid3 = new Student("Mateusz", "Murawski", 17);
        Student kid4 = new Student("Adam", "Szadkowski", 18);

        // Grades rate1 = new Grades(2,3,4,5);
        // Grades rate2 = new Grades(4,5,5,4);
        // Grades rate3 = new Grades(2,3,1,1);
        // Grades rate4 = new Grades(3,4,2,4);

        Map<Student, List<Integer>> studentsGrades = new HashMap<Student, List<Integer>>();
        studentsGrades.put(kid1, Arrays.asList(3, 4, 1, 2, 4));
        studentsGrades.put(kid2, Arrays.asList(1, 2, 4, 4, 4, 6, 2));
        studentsGrades.put(kid3, Arrays.asList(1, 2, 3));
        studentsGrades.put(kid4, Arrays.asList(5, 5, 2, 3));

        for (Map.Entry<Student, List<Integer>> entry : studentsGrades.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + avarage(entry.getValue()));

        }

    }

    private static double avarage(List<Integer> grades) {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        double avgGrades = sum / grades.size();
        return avgGrades;
    }
}

class Student {
    String name;
    String surname;
    Integer numberInClass;

    public Student(String name, String surname, Integer numberInClass) {
        this.name = name;
        this.surname = surname;
        this.numberInClass = numberInClass;

    }

    @Override
    public boolean equals(Object o) {
        Student e = (Student) o;
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
    private Map<String, List<Integer>> gradesMap = new HashMap<String, List<Integer>>();

    private double avarage(List<Integer> grades) {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        double avgGrades = sum / grades.size();
        return avgGrades;
    }

    public void addGrade(String subjectName, List<Integer> listGrades) {
        gradesMap.put(subjectName, listGrades);
    }

    public void showGrades() {
        for (Map.Entry<String, List<Integer>> entry : gradesMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + avarage(entry.getValue()));
        }
    }
}