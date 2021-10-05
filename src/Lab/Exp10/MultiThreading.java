import java.lang.*;
import java.util.*;
import java.io.*;

class Thread1 extends Thread {
    
    int a , b ;

    Thread1(int x,int y) {
        a = x;
        b = y;
    }
    public void run() {
        System.out.println((a + b) + " is the sum");
    }
}

class Thread2 extends Thread {
    int a, b;
    Thread2(int x,int y) {
        a = x;
        b = y;
    }
    public void run() {
        System.out.println((a - b) + " is the diff");
    }
}

class Thread3 extends Thread {
    int a, b;
    Thread3(int x,int y) {
        a = x;
        b = y;
    }
    public void run() {
        System.out.println((a*b)+" is the product");
    }
}

class Thread4 implements Runnable {
    int a , b ;
    Thread4(int x,int y) {
        a = x;
        b = y;
    }
   @Override public void run() {
        System.out.println((a / b) + " is the quotient");
    }
}

class Thread5 implements Runnable {
    int a , b ;
    Thread5(int x,int y) {
        a = x;
        b = y;
    }
    @Override public void run() {
        System.out.println((a % b) + " is the remainder");
    }
}

class Thread6 implements Runnable {
    int a , b ;
    Thread6(int x,int y) {
        a = x;
        b = y;
    }
    @Override public void run() {
        System.out.println((Math.pow(a, b))+" is "+a+" to the power of "+ b);
    }
}





public class MultiThreading {
    public static void main(String[] args) {
        
        Thread1 ob1 = new Thread1(4,2);
        ob1.start();
        Thread2 ob2 = new Thread2(5,2);
        ob2.start();
        Thread3 ob3 = new Thread3(3,1);
        ob3.start();
        Thread4 ob4 = new Thread4(5,2);
        Thread t1 = new Thread(ob4, "thread4");
        t1.start();


        Thread5 ob5 = new Thread5(5, 2);
        
        Thread t2 = new Thread(ob5, "thread5");
        t2.start();

        Thread6 ob6 = new Thread6(5,2);
        Thread t3 = new Thread(ob6, "thread6");
        t3.start();

    }
}
