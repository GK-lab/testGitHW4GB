package lessonA3;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main (String [] args){

        String [] words = {
                "cat",
                "map",
                "run",
                "top",
                "eleven",
                "cat",
                "man",
                "map",
                "boll",
                "step",
                "duck"};
        Set<String> hashSet = new HashSet <> (Arrays.asList(words));
                System.out.println(hashSet);
                System.out.println();
                System.out.println(repeatReader(words));




    }
        public static Map<String, Integer> repeatReader(String[] args)
        {

            Map<String, Integer> timeRepeat = new HashMap<>();
            for (String s : args) {
                if (!timeRepeat.containsKey(s)) {
                    timeRepeat.put(s, 1);
                } else {
                    timeRepeat.put(s, timeRepeat.get(s) + 1);
                }
            }
            return timeRepeat;
        }

}
