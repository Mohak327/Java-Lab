// package Lab.exp4;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.IOException;


public class linSearch2 {

    public static int linearSearch(int[] arr, int key){
        for(int i : arr){
            if(arr[i] == key){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // System.out.print("Enter array size: ");
        // int size = Integer.parseInt(reader.readLine());
        // int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        // for(int i=0; i < size; i++)
        //     arr[i] = Integer.parseInt(reader.readLine());

        // Since BufferedReader takes a single input per line, we input a string in single line and convert it into an integer array.
        String[] str = reader.readLine().split(" ");
        int arr[] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        System.out.print("Enter key element: ");
        int key = Integer.parseInt(reader.readLine());
        boolean isFound = false;

        if (linearSearch(arr, key) != -1) {
            System.out.println(key + " is found at position " + linearSearch(arr, key));
            isFound = true;
        }
        else
            System.out.println("Element not found.");
    }
}
