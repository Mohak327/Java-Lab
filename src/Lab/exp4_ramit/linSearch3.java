
import java.io.*;

public class linSearch3 {

    public static void main(String[] args){
int arr[]=new int[10];
		int n=10;
		System.out.println("Enter Array\n");
		for(int i=0;i<n;i++){
		arr[i]=Integer.parseInt(args[i]);
        
    }

        
		int elt=Integer.parseInt(args[10]);
       

        boolean bool=linear(elt,arr,n);
		if (bool==true)
		System.out.println("Element Found\n");


    }


    public static boolean linear(int elt,int arr[],int n){
            for(int i=0;i<n;i++)
            {
                if(arr[i]==elt)
              return true;
                
            }
            return false;
        }

}
