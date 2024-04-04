package HashMap;

import java.util.HashMap;

public class HashMapBasics {

    public static void main(String[] args) {


        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(12,76);
        map.put(13,78);
        map.put(15,99);
        map.put(16,76);
        map.put(17,76);


        System.out.println(map.get(15));
        System.out.println(map.get(22));

        System.out.println(map.containsKey(13));
        System.out.println(map.containsKey(55));

        System.out.println(map.size());

        map.remove(17);

        System.out.println(map.size());

//5 functions in map
        //put(),get(),remove(),containsKey(),size() -All working on O(1) TC

        //Keys can not be duplicate
        //order of insertion is not maintained



    }
}
