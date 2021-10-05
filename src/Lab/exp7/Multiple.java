import java.io.*;

class A{
    A(){
        System.out.println("Constuctor of Class A");
    }
}

interface B{
    void print();
}

class C  extends A implements B{
    C(){
       super();
        System.out.println("Constructor of class C");
    }

    @Override
    public void print() {
        System.out.println("Inside Interface B");
    }
}

public class Multiple {
    public static void main(String[] args) {

    C ob1=new C();
    ob1.print();
    }
}