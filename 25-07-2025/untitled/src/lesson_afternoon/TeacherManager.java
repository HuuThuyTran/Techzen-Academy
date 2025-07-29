package lesson_afternoon;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Teacher> teachers = new ArrayList<>();

    // Method to add a teacher
    public static void addTeacher(String fullName, int age, String subject, int hourInMonth) {
        teachers.add(new Teacher(fullName, age, subject, hourInMonth));
    }

    // Method to input teacher information
    public static void inputTeacherInfo() {
        System.out.println("======= Input Teacher Information =======");
        sc.nextLine();
        System.out.print("Enter teacher's full name: ");
        String fullName = sc.nextLine().trim();

        System.out.print("Enter teacher's age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter teacher's subject: ");
        String subject = sc.nextLine().trim();


        System.out.print("Enter hours in month: ");
        int hourInMonth = sc.nextInt();

        addTeacher(fullName, age, subject, hourInMonth);
    }

    // Method to display list teacher
    public static void displayTeacherList()  {
        if (teachers.isEmpty()) {
            System.out.println("Teacher list not available yet !");
            return;
        }
        System.out.println("======= List of Teachers =======");
        for (Teacher teacher : teachers) {
            teacher.showInfo();
            System.out.println("---------------------");
        }
        // Teacher.showTotalNumberOfTeachers();
    }

    // Method to search teacher by name
    public static void searchTeacherByName() {
        System.out.println("======= Search Teacher by Name =======");
        sc.nextLine();
        System.out.print("Enter teacher's name to search: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Teacher Found:");
                teacher.showInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No teacher found with the name: " + name);
        }
    }

    // Method to find the teacher with the most hours
    public static void findTeacherWithMostHours() {
        System.out.println("======= Find Teacher with Most Hours =======");
        if (teachers.isEmpty()) {
            System.out.println("No teachers available to find the one with the most hours.");
            return;
        }

        Teacher maxTeacher = teachers.get(0);
        for (Teacher teacher : teachers) {
            if (teacher.getHourInMonth() > maxTeacher.getHourInMonth()) {
                maxTeacher = teacher;
            }
        }

        System.out.println("Teacher with the most hours:");
        maxTeacher.showInfo();
    }

    // Method to list teachers with less than 20 hours/month
    public static void listTeacherLessThan20Hours() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available to list those with less than 20 hours/month.");
        } else {
            System.out.println("Teachers with less than 20 hours/month:");
            boolean found = false;
            for (Teacher teacher : teachers) {
                if (teacher.getHourInMonth() < 20) {
                    teacher.showInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No teachers found with less than 20 hours/month.");
            }
        }
    }

    public static void main(String[] args) {
        int select;
        do {
            System.out.println("======= MENU =======");
            System.out.println("1. Add Teacher");
            System.out.println("2. Display List Teacher");
            System.out.println("3. Search Teacher by Name");
            System.out.println("4. Total Number of Teachers");
            System.out.println("5. Find the person who teaches the most hours");
            System.out.println("6. List lecturers with teaching hours less than 20 hours/month");
            System.out.println("7. Exit");

            System.out.print("Please select an option: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    inputTeacherInfo();
                    break;
                case 2:
                    displayTeacherList();
                    break;
                case 3:
                    searchTeacherByName();
                    break;
                case 4:
                    Teacher.showTotalNumberOfTeachers();
                    break;
                case 5:
                    findTeacherWithMostHours();
                    break;
                case 6:
                    listTeacherLessThan20Hours();
                    break;
                case 7:
                    System.out.println("Finish Program !");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        } while (true);
    }

}
