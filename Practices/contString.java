package Practices;

import java.util.HashMap;
import java.util.Map;

public class contString {
    
    public static void main(String[] args) {
        
        String str1="welcome to capgemini";

            Map<Character, Integer> map=new HashMap<>();

            for (int i = 0; i <str1.length()-1; i++) {
                
                char ch= str1.charAt(i);
                if(map.containsKey(ch)){
                     int cnt=map.get(ch);
                     map.put(ch, ++cnt);

                }
                else{
                    map.put(ch, 1);
                }
            }
            System.out.println(map);
    }
}
