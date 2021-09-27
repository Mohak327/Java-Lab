public class arrayOfObjects {
    public static void main(String a[]) {
        // Scanner scn = new Scanner(System.in);
        Cars c = new Cars("alto");
        c.print();
        // scn.close();
    }
}

class Tyre {
    String name;
    int count;

    Tyre(String ob, int n) {
        name = ob;
        count = n;
    }

    void print() {
        System.out.println("Tyre name: " + name + "\n\tcount = " + count + "\n");
    }
}

class Cars {
    String CName;
    Tyre ob[] = new Tyre[4];

    Cars(String n) {
        CName = n;
        ob[0] = new Tyre("JK Tyres", 4);
        ob[1] = new Tyre("MRF Tyres", 5);
        ob[2] = new Tyre("Ceat", 2);
        ob[3] = new Tyre("JK Tyres", 8);
    }

    void print() {
        System.out.println("car name " + CName);
        for (int i = 0; i < ob.length; i++)
            ob[i].print();
    }
}

// class CarTyre {
//     public static void main(String Args[]) {
//         Cars c = new Cars("alto");
//         c.print();
//     }
// }

