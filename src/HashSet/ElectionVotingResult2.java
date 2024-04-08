package HashSet;

import java.util.HashMap;
import java.util.Map;

public class ElectionVotingResult2 {

    static void findWinner(String[] votes)
    {
        Map<String,Integer> map=new HashMap<>();

        for(String str: votes)
        {
            if (map.keySet().contains(str)==true)
            {
                int freq = map.get(str);
                freq++;
                map.put(str, freq);

            } else {
                map.put(str, 1);

            }
        }

            // Traverse through map to find the candidate with maximum votes.

            int maxValueInMap=0;
            String winner=" ";

            for(Map.Entry<String,Integer> entry : map.entrySet())
            {
                String key=entry.getKey();
                Integer val=entry.getValue();

                if(val>maxValueInMap)
                {
                    maxValueInMap=val;
                    winner=key;
                }
            }

        System.out.println(winner);
    }

    public static void main(String[] args) {

        String[] votes={"john","johny","jockey", "john", "jackie", "jamie",  "jamie",
                "john", "johnny", "jamie",  "johnny",
                "john"};

        findWinner(votes);
    }
}
