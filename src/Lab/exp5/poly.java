package Lab.exp5;

public class poly {

    public static void main(String[] args) {
        A ob;
        B ob1 = new B(22, 33, 55);
        ob = ob1;
        ob1.print();

    }
}

class A {

    int a, b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    A() {
    }

    int greater() {
        int c = a > b ? a : b;
        return c;
    }

    void print() {
        System.out.println("a :" + this.a);
        System.out.println("b :" + this.b);
    }

}

class B extends A {

    int c;

    B(int a, int b, int c){
        super.a = a;
        super.b = b;
        this.c = c;
    }

    B(){
    }

    int greater() {
        int c = a > b ? a : b;
        return c;
    }

    void print() {
        // System.out.println("a :" + super.a);
        // System.out.println("b :" + super.b);
        // System.out.println("c :" + this.c);

        super.print();
        System.out.println(greater() + " is greater.");
    }

}
