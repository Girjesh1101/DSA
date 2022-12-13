package OOPS;

class Student{

    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("calling Constuctor");
    }
}

public class Constructor {

    public static void main(String[] args) {

    Student s1= new Student();
    s1.name= "hello";
    s1.age =20;
    s1.info();
    }
}
