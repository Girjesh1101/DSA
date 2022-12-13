package Practices;
import java.util.*;

public class countString {
    

    public static void main(String[] args) {
        
        String str = "My name is Home and my state is Mumbai and my county is india";

        Map<Character, Integer>  map= new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c= str.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c, ++count);
            }
            else{
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
