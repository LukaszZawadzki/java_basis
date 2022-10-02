package pl.edu.wszib.spring;

public class MyClass {
    //modyfikatory dostępu
    // private
    //
    // protected - w obrębie klas dziedziczących oraz w obrębie pakietu
    // public
    private String field1;

    String field2;

    protected String field3;

    public String field4;

    private void run1(){
        System.out.println("Field1 = " + field1);
    }

    void run2(){
        System.out.println("Field2 = " + field2);
    }

    protected void run3(){
        System.out.println("Field3 = " + field3);
    }

    public void run4(){
        System.out.println("Field4 = " + field4);
        run1();
    }

}

