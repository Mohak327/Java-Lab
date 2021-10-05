
import java.util.*;

public class StringSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q2");
		System.out.println("Enter 5 strings: \n");
		String arr[] = new String[5] ;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.print("\nUnsorted array: ");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.print("Sorted array: ");
		System.out.println(Arrays.toString(arr));

		sc.close();
	}
}