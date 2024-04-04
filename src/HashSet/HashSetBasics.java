package HashSet;

import jdk.jshell.spi.ExecutionControl;

import java.util.HashSet;

public class HashSetBasics {

    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();

        hs.add(10);

        hs.add(5);

        hs.add(25);

        hs.add(30);
        hs.add(5);

        hs.add(45);

        System.out.println(hs);

        System.out.println(hs.contains(30));

        hs.remove(5);

        System.out.println(hs);

        System.out.println(hs.size());
    }
}
