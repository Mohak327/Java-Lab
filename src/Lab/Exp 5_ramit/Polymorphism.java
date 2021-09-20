import java.io.*;

class A{
    int  a,b;
void print(){

System.out.println(a+"\t"+b);
}
A(){
    a=b=-1;
}
A(int a,int b){
    this.a=a;
    this.b=b;
}
A(int a){
    this.a=this.b=a;
}
int greater(){
    return a>b?a:b;
}
}
class B extends A{
int c;
void print(){
    System.out.print(c+"\t");
    super.print();
}
B(){
    c=super.a=super.b=-1;
}
B(int c){
    super.a=super.b=this.c=c;
}
B(int a,int b,int c){
    this.c=c;
    super.a=a;
    super.b=b;
}
}
class Polymorphism{


    
public static void main(String[] args) {
    
A ob1=new A();
A ob2=new A(2);
A ob3=new A(3,4);

B ob4=new B();
B ob5=new B(5);
B ob6=new B(6,7,8);

ob1.print();
// System.out.println(ob3.greater());
// ob2.print();

// ob4.print();
// ob5.print();
ob6.print();
 
System.out.println("After overwtiting");
ob1=ob6;
ob1.print();


}
}