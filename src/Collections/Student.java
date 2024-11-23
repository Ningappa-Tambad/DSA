package Collections;

public class Student implements Comparable<Student>
{
   public String name;
    public int age;
    public int rollno;
    public String batch;


    public Student(String name, int age, int rollno, String batch) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.batch = batch;
    }



    @Override
    public int compareTo(Student other) {

        return  this.age - other.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", rollno=" + this.rollno +
                ", batch='" + this.batch + '\'' +
                '}';
    }
}
