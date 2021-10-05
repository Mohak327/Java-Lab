import java.io.*;

class A{
    A(){
        System.out.println("Constuctor of Class A");
    }

}

class B extends A{
    B(){
       super();
        System.out.println("Constructor of class B");
    }
}

public class Single {

    public static void main(String[] args) {
    B ob1=new B();
    }
}