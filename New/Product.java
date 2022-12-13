package New;

import java.util.Scanner;

public class Product {


public static void main(String[] args) {
    


    int milk=60;
    int cream=75;
    int Latte=100;
    int Add;

    int i;

    Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Add on in Espresso press 1 fro Milk , press 2 for cream and press 3 for Latte");
            Add=sc.nextInt();
            switch(Add){

                case 1:
                    milk=60;
                break;

                case 2:
                cream=60;
                 break;

                 case 3:
                    Latte=60;
                break;
            }
            System.out.println("Enter 0 for Exit");
                 i=sc.nextInt();
        }while(i==0);
                System.out.println("Exit");
        

    }
    
}
