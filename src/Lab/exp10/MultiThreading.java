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
        System.out.println("Sum: " + (a + b));
    }
}

class Thread2 extends Thread {
    int a, b;
    Thread2(int x,int y) {
        a = x;
        b = y;
    }
    public void run() {
        System.out.println("Difference: " + (a - b));
    }
}

class Thread3 extends Thread {
    int a, b;
    Thread3(int x,int y) {
        a = x;
        b = y;
    }
    public void run() {
        System.out.println("Product: " + (a*b));
    }
}

class Thread4 implements Runnable {
    int a , b ;
    Thread4(int x,int y) {
        a = x;
        b = y;
    }
   @Override public void run() {
        System.out.println("Quotient: " + (a / b));
    }
}

class Thread5 implements Runnable {
    int a , b ;
    Thread5(int x,int y) {
        a = x;
        b = y;
    }
    @Override public void run() {
        System.out.println("Remainder: " + (a % b));
    }
}

class Thread6 implements Runnable {
    int a , b ;
    Thread6(int x,int y) {
        a = x;
        b = y;
    }
    @Override public void run() {
        System.out.println((Math.pow(a, b))+" is "+ a +" to the power of "+ b);
    }
}





public class MultiThreading {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a=scn.nextInt();
        int b=scn.nextInt();

        Thread1 ob1 = new Thread1(a,b);
        ob1.start();
        Thread2 ob2 = new Thread2(a,b);
        ob2.start();
        Thread3 ob3 = new Thread3(a,b);
        ob3.start();
        Thread4 ob4 = new Thread4(a,b);
        Thread t1 = new Thread(ob4, "thread4");
        t1.start();


        Thread5 ob5 = new Thread5(a,b);

        Thread t2 = new Thread(ob5, "thread5");
        t2.start();

        Thread6 ob6 = new Thread6(a,b);
        Thread t3 = new Thread(ob6, "thread6");
        t3.start();

        scn.close();

    }
}