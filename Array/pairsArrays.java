package Array;

public class pairsArrays {
    
    public static void printPair(int num[]){

        int tp=0;

        for (int i = 0; i < num.length; i++) {
            
            int current=num[i];
            for (int j = i+1; j < num.length; j++) {
                
                System.out.print("( "+current+ ", "+num[j]+" ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+tp);
    }

    public static void main(String[] args) {
        
        //pairs in an arrays

        int num[]={5,2,3,6,9};

        printPair(num);
    }
}
