import java.util.*;
public class Complex {
    public static void main(String[] args) {
         System.out.println("Choose any Operation");
         System.out.println("1. Add 2 complex Nos");
         System.out.println("2. Subtract 2 complex Nos");
         System.out.println("3. Multiply 2 complex Nos");
         System.out.println("4. Get Modulus/Magnitude of Complex No");
         System.out.println("5. Get Conjugate of Complex No");
         System.out.println("6. Exit\n");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
while(ch!=6){

    switch (ch) {

        case 1:
            Add();
            break;

        case 2:
            Sub();
            break;

        case 3:
            Mul();
            break;

        case 4:
            Mod();
            break;

        case 5:
            Conjugate();
            break;

        default:
            System.out.println("You entered wrong");
            break;
    }
         System.out.print("\n\nEnter operation choice");
         ch=sc.nextInt();
}
    }



    static void Add(){
        System.out.println("Enter the 2 nos");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of no 1");
        int X1=s.nextInt();
        int Y1=s.nextInt();
        System.out.println("Enter the real and imaginary part of no 2");
        int X2=s.nextInt();
        int Y2=s.nextInt();

        System.out.println("the complex eqs are:\n1."+X1+"+"+Y1+"i.\n2."+X2+"+"+Y2+"i.");
        int sumX=X1+X2;
        int sumY = Y1 + Y2;

        System.out.println("Sum is"+sumX+"+"+sumY+"i.");
    }

    static void Sub() {
        System.out.println("Enter the 2 nos");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of no 1");
        int X1 = s.nextInt();
        int Y1 = s.nextInt();
        System.out.println("Enter the real and imaginary part of no 2");
        int X2 = s.nextInt();
        int Y2 = s.nextInt();

        System.out.println("the complex eqs are:\n1." + X1 + "+" + Y1 + "i.\n2." + X2 + "+" + Y2 + "i.");
        int sumX = X1 - X2;
        int sumY = Y1 - Y2;

        System.out.println("Difference is" + sumX + "+" + sumY + "i.");
    }

    static void Mul(){
        System.out.println("Enter the 2 nos");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of no 1");
        int X1=s.nextInt();
        int Y1=s.nextInt();
        System.out.println("Enter the real and imaginary part of no 2");
        int X2=s.nextInt();
        int Y2=s.nextInt();

        System.out.println("the complex eqs are:\n1."+X1+"+"+Y1+"i.\n2."+X2+"+"+Y2+"i.");
        int sumX=X1*X2+(-1*Y1*Y2);
        int sumY = X1 * Y2 + X2 * Y1;

        System.out.println("Product is"+sumX+"+"+sumY+"i.");
    }

    static void Mod() {
        System.out.println("Enter the no");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of no 1");
        Double X1 = s.nextDouble();
        Double Y1 = s.nextDouble();

        System.out.println("the complex eq is:\n1." + X1 + "+" + Y1 + "i.");
        Double sumX = Math.sqrt((Math.pow(X1, 2) + Math.pow(Y1, 2)));

        System.out.println("Magnitude is" + sumX);
    }

    static void Conjugate(){
        System.out.println("Enter the no");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of no 1");
        int X1=s.nextInt();
        int Y1=s.nextInt();

        System.out.println("the complex eq is:\n1."+X1+Y1+"i.");

        System.out.println("Conjugate is:\n"+X1+"+"+(-1*Y1)+"i.");
    }
}
