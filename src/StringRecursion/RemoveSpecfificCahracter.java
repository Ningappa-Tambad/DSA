package StringRecursion;

public class RemoveSpecfificCahracter {



    //1st approach

   /* public static String removeCharacter(String str, char ch) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == ch) {
            return removeCharacter(str.substring(1), ch);
        } else {
            return str.charAt(0) + removeCharacter(str.substring(1), ch);
        }
    }

    public static void main(String[] args) {
        String str = "abac";
        char ch = 'a';
        System.out.println(removeCharacter(str, ch));
    }*/

    //2nd approach

    public static void main(String[] args) {

       skip("","bccdah");
    }
    static void skip(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        if(ch!='a')
        {
            skip(processed+ch,unprocessed.substring(1));
        }
        else
        {
            skip(processed,unprocessed.substring(1));
        }
    }
}
