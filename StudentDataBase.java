import java.util.Scanner;
import java.util.HashMap;

class Student {
    public String name;
    public int rollno;
    public int age;
    public int marks;

    

    public  Student(String name, int rollno, int age, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;

    }

    public void viewStudent() {
        System.out.println("Name " + name);
        System.out.println("Roll no. " + rollno);
        System.out.println("Age " + age);
        System.out.println("Marks " + marks);
    }

}

public class StudentDataBase {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            HashMap<Integer, Student> map = new HashMap<>();
            System.out.println("1. Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Search Student");
            System.out.println("4.Calculate Avarage marks: ");
            System.out.println("5.Exit ");
            int choice = sc.nextInt();
            System.out.println("Enter your choice ");

          //  Student Student;
            switch (choice) {
                case 1:
                    System.out.println("Enter student name ");
                    String name = sc.next();
                    System.out.println("Enter your Roll no ");
                    int rollno = sc.nextInt();
                    System.out.println("Enter your age ");
                    int age = sc.nextInt();
                    System.out.println("Enter marks ");
                    int marks = sc.nextInt();

                    Student std = new Student(name, rollno, age, marks);
                    map.put(rollno, std);
                    break;

                case 2:
                    System.out.println("List of student");
                    for (Student i : map.values()) {
                          i.viewStudent();
                    }
                    break;
                case 3:
                    System.out.println("Enter a rollno.");
                    int rollno1 = sc.nextInt();
                    if (map.containsKey(rollno1)) {
                        map.get(rollno1).viewStudent();

                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    int sum = 0;

                    for (Student i : map.values()) {
                        sum += i.marks;

                    }
                    int averagemarks = sum / map.size();
                    System.out.println("Average marks " + averagemarks);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}