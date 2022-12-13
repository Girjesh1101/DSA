package OOPS;

class  Pen{

    String color;
    String type; // gel / ballpen

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{

    String name;
    int age;

    public void  printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {

    public static void main(String arg[]){

        Pen p= new Pen();
        p.color ="blue";
        p.type="ballpen";

        //p.write();

        Pen p2 = new Pen();
        p2.color ="black";
        p2.type ="gelpen";

        p.printColor();
        p2.printColor();

        Student s= new Student();
        s.name= "Tony";
        s.age = 20;
        s.printInfo(); 

    }
    
}
