import MyPackage.OneDArrayImpl;

public class A {
    public static void main(String[] args) {
        OneDArrayImpl arr = new OneDArrayImpl();
        arr.getArray();
        arr.printArray();
        int sum = arr.sumArray();
        System.out.println("\nSum of array is: " + sum);

    }
}