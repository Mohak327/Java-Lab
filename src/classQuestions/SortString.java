import java.util.*;

public class SortString {
   

       public static void main(String[] args) {
        System.out.println("\n\nEnter names of students\n");
        int i;
        Scanner scn=new Scanner(System.in);
        String[] arr=new String[10];
        for(i=0;i<10;i++)
        {
            arr[i]=scn.nextLine();
        }
        
        System.out.println("\nThe names of students are:\n");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }      
}