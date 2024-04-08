package HashMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class BasicsHashMap {

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();

        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        //Traversing through map using for each loop

        for(Map.Entry<String,Integer> hm :map.entrySet())
        {
            //printigkeys

            System.out.print(hm.getKey()+": ");
            System.out.println(hm.getValue());
        }
    }
}
