package Collection;

import java.util.ArrayList;




public class ArrayLists {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list= new ArrayList<>();


        list.add(1);                        //Add operation    O(1)
        list.add(2);
        list.add(3);
        list.add(4);
 
        System.out.println(list);

        System.out.println(list.get(2));    //Get Opertaton     O(1)

        System.out.println(list.remove(2)); // remove operation   O(n)

        list.set(2, 10);        // set Opetion           O(n)

        System.out.println(list);

        //contain element -- True/false  ----- O(n)
        System.out.println(list.contains(11));
        System.out.println(list.contains(1));

        list.add(3, 20);            // O(n)--linear Search

        System.out.println(list.size());        //O(n)

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
