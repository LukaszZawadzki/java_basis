package pl.edu.wszib.spring;

//importy

public class Application {

    private static MyClass myClass;

    public static void main(String[] args) {
        System.out.println("hello world");
    
        //alt + enter
        MyClass myClass = new MyClass();
        myClass.field2 = "filed2";
        myClass.field3 = "filed3";
        myClass.field4 = "filed4";
        myClass.run2();
        myClass.run3();
        myClass.run4();

        //myClass.run();


        
    }

}
