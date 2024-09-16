
import java.util.*;
class Point  { int x, y;
Point ( int x, int y ) {
this.x = x ;
this.y = y;}

void printPoint() {
System.out.println("X = "+ this.x + " Y= " + this.y); }
}

 class pointCreate3 extends Point{
pointCreate3(int a,int b)
{super(a,b);
}
int area(){
return super.x*super.y;
}
int perimeter(){
    return 2*(super.x+super.y);
}
 }
public class AreaPer {
public static void main ( String args [ ] ) {
     pointCreate3 p = new pointCreate3 (10, 20 ); 
     System.out.println("perimeter of 10 and 20 is:\n"+p.perimeter()+"\narea is:"+p.area());
}

}
