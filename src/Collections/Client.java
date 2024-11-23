package Collections;

import java.util.*;

public class Client {

    public static void main(String[] args) {

        List<Student> student=new ArrayList<>();

        student.add((new Student("raj",23,1,"dsa")));
        student.add((new Student("a",20,2,"dsa")));
        student.add((new Student("raj2",87,3,"dsa")));
        student.add((new Student("raj3",34,4,"dsa")));
        student.add((new Student("raj4",21,5,"dsa")));


        Collections.sort(student,new StudentAgeComparator());

        for(Student students:student)
        {
            System.out.println(students.toString());
        }
    }





}
