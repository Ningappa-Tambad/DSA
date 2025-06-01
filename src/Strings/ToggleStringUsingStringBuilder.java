package Strings;

public class ToggleStringUsingStringBuilder {

    static void toolgeString(String str)
    {
        StringBuilder sb=new StringBuilder(str);

        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch>='A' && ch<='Z')
            {
               char nch=(char)(ch+32);
               sb.setCharAt(i,nch);

            }
            else
            {
                char nch=(char)(ch-32);
                sb.setCharAt(i,nch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {

        String str="aPPlE";

        toolgeString(str);
    }
}
