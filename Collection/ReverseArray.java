package Collection;

import java.util.*;

public class ReverseArray {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list= new ArrayList<>();


        list.add(1);                        //Add operation    O(1)
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(5);

        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }

        int Max= Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if(Max<list.get(i)){
                Max=list.get(i);
            }
        }
        System.out.println("Max Value : "+Max);


    }
}
