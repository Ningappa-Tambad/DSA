package BuilderDesignPattern;
import BuilderDesignPattern.Student.*;

import java.sql.SQLOutput;

import static BuilderDesignPattern.Student.*;


public class Client
{
    public static void main(String[] args) {

        Student s=Student.builder()


                .age(23)
                .phonenumber("7411275912")
                .gradyear(2012)
                .psp(100)
                .id(1)
                .universityname("vtu")
                .name("Ningaraj")
                .build();

        System.out.println(s);

    }
}
