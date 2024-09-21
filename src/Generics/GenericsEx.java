package Generics;

public class GenericsEx
{
    public static void main(String[] args) {


        //Object o=new Exception();

   TestGenerics<Integer> int1=new TestGenerics<>();
   int1.setContent(43);
   System.out.println("Get contenet is " + int1.getContent());


   TestGenerics<String> string1=new TestGenerics<>();
   string1.setContent("Hello");
   System.out.println("Get contenet is " + string1.getContent());



    }
}
