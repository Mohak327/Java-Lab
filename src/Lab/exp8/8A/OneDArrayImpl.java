package MyPackage;

import java.util.Scanner;

interface OneDArray{
    public void getArray();
    public void printArray();
    public int sumArray();
}

public class OneDArrayImpl implements OneDArray{
    Scanner scanner = new Scanner(System.in);
    int [] arr;
    @Override
    public void getArray() {
        System.out.print("Enter size of array:");
        int n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
    }

    @Override
    public void printArray() {
        System.out.println("Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public int sumArray() {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}