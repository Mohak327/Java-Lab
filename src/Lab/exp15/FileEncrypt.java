// import javax.lang.model.util.ElementScanner6;
import java.io.*;
import java.util.Scanner;


public class FileEncrypt {
    public static void main(String[] args) throws IOException {
        System.out.print("\n Enter file name: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        File file = new File(input);
        BufferedReader br = new BufferedReader(new FileReader(file));


        String orig = "";

        String st;
        while ((st = br.readLine()) != null)

        {

            orig = orig + st;
        }

        System.out.println("\n Orignal Data: " + orig);
        String enc = Encrypt(orig);

        FileWriter myWriter = new FileWriter(input);
        myWriter.write(enc);
        myWriter.close();

        System.out.println("\n Encrypted Data: " + enc);
        String dec = Decrypt(enc);
        System.out.println("\n Decrypted Data: "+dec);

    }


    public static String Encrypt(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (sb.length() > 0) {

            char ch = sb.charAt(0);

            int ch1 = (ch + 2) * 2;

            ans = ans + (char) ch1;
            sb.deleteCharAt(0);
        }
        return ans;
    }


    public static String Decrypt(String str) {

        String ans = "";
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (sb.length() > 0) {

            char ch = sb.charAt(0);

            int ch1 = (ch / 2) - 2;

            ans = ans + (char) ch1;
            sb.deleteCharAt(0);
        }
        return ans;
    }

}























// import java.io.FileReader;

// public class FileEncrypt {
//     public static void main(String args[]) throws Exception {
//         String fileName = "./data.txt";
//         FileReader inputFile = new FileReader(fileName);
//         int i;
//         System.out.println("The decrypted text is: ");
//         while ((i = inputFile.read()) != -1)
//             System.out.print((char) i);

//         System.out.println("The encrypted text is: ");
//         while ((i = inputFile.read()) != -1)

//         fr.close();
//     }
// }