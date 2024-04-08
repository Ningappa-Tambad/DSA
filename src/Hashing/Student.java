package Hashing;

import java.util.HashSet;

public class Student {

    int id;
    String name;

    public Student(int a,String b)
    {
        id=a;
        name=b;
    }


    @Override
    public int hashCode()
    {
        return id;
    }

    public boolean equals(Object obj)
    {
        Student s=(Student)(obj);

        if(this.id==s.id && this.name.equals(s.name) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Student s1=new Student(1,"RAj");
        Student s2=new Student(2,"aji");
        Student s3=new Student(1,"RAj");
        Student s4=new Student(3,"raj");
        Student s5=new Student(4,"Ram");
        Student s6=new Student(5,"jai");

        Student[] A={s1,s2,s3,s4,s5,s6};

        HashSet<Student> hs=new HashSet<>();

        for(int i=0;i<A.length;i++)
        {
              hs.add(A[i]);
        }

        for(Student ele:hs)
        {
            System.out.println(ele.id+" "+ele.name);
        }

    }
}
