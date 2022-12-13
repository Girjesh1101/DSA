package OOPS;

class Student {

    String name;
    int age;

    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    
    }

    public void info(String name, int age){
        System.out.println(name+" " +age);
    }
}

public class OverLoading {
    
    public static void main(String[] args) {
        
        Student s1= new Student();
        s1.name="Girjesh";
        s1.age=22;

        s1.info(s1.name);
    }
}
