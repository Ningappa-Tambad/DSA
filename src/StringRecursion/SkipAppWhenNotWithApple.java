package StringRecursion;

public class SkipAppWhenNotWithApple {

    public static void main(String[] args) {
        System.out.println(skipAppWhenNotWithApple("effapplfd"));
    }

    static String skipAppWhenNotWithApple(String ch)
    {
        if(ch.isEmpty())
        {
            return "";
        }

        if(ch.startsWith("app") && !ch.startsWith("apple"))
        {
            return skipAppWhenNotWithApple(ch.substring(3));
        }
        else
        {
            return ch.charAt(0)+skipAppWhenNotWithApple(ch.substring(1));
        }
    }
}
