package CoreJava;



interface Vahical{

    public void changeGear(int a);
    public void speedUp(int b);
    public void applyBreak(int c);
}

public class DemoInterface implements Vahical{

    int speed;
    int gear;

    public void changeGear(int newGear){
        gear = newGear;

    }

    public void speedUp(int increass){
        speed = speed + increass;
    }

    public void applyBreak(int decreass){
        speed = speed -decreass;
    }

    public void display(){
        System.out.println("Gear "+gear+"  and Speed "+speed);
    }
    
}
 class Bike implements Vahical{

    int speed;
    int gear;

    public void changeGear(int newGear){
        gear = newGear;

    }

    public void speedUp(int increass){
        speed = speed + increass;
    }

    public void applyBreak(int decreass){
        speed = speed -decreass;
    }

    public void display(){
        System.out.println("Gear "+gear+"  and Speed "+speed);
    }

}

class Test{
    public static void main(String[] args) {
        
        Bike b= new Bike();
        b.changeGear(2);
        b.applyBreak(2);
        b.speedUp(3);
        b.display();


        DemoInterface b1= new DemoInterface();
        b1.changeGear(3);
        b1.applyBreak(2);
        b1.speedUp(3);
        b1.display();
    }
}
