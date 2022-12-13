package CoreJava;

interface learn{

    final int a=10;

    void Display();
}

public class InterfaceLearn  implements learn {

    public void Display(){
        System.out.println("Geeks for Geeks");
    }

    public static void main(String[] args) {
        
        InterfaceLearn il= new InterfaceLearn();
        il.Display();
        System.out.println(a);
    }
    
}
