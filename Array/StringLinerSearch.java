package Array;

public class StringLinerSearch {

    public static void linearSearch(String menu[], String key){

        for (int i = 0; i < menu.length; i++) {
            
            if(key.equals(menu[i])){

                System.out.println(key+" Found at Index "+i);
                return;
            }
        }

    }
    

    public static void main(String[] args) {
        
        String menu[]={"Apple","Banana", "Orange"};
        String  key="Orange";

        linearSearch(menu, key);
    }
}
