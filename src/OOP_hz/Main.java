package OOP_hz;


import OOP_hz.service.Service;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Student student_1 = new Student(1, "Паша", 18);
//        Student student_2 = new Student(2, "Даша", 19);
//
//        StudentGroup studentGroup = new StudentGroup();
//        studentGroup.addStudent(student_1);
//        studentGroup.addStudent(student_2);
//
//        Student student_3 = new Student(2, "Витя", 20);


        Service service = new Service();
        service.addStudent("Паша", 19);
        service.addStudent("Даша", 18);
        service.addStudent("Витя", 19);
        service.addStudent("Юля", 20);
        System.out.println(service.studentGroupInfo());

        service.sortByName();
        System.out.println(service.studentGroupInfo());

        service.sortByAge();
        System.out.println(service.studentGroupInfo());

        int sum = 0;
        while (true){
            System.out.println("Введите число : ");
            int num = new Scanner(System.in).nextInt();
            if (num == 0){
                sum = 0;
            }
            else {
                sum += num;
            }
            System.out.println("sum is : " + sum);
        }

    }
}