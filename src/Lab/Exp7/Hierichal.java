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

class C extends A{
    C(){
       super();
        System.out.println("Constructor of class C");
         
    }
}

public class Hierichal {

    public static void main(String[] args) {
    
    C ob1=new C();

    B ob2=new B();
    
    
    
    }
    
}
