//write a program to reverse a string taking input from user
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String original = sc.next();
        String Reverse="";

        for(int i=original.length()-1;i>=0;i--){
            Reverse+=original.charAt(i);
        }
        System.out.println("original " + original);
        System.out.println("Reverse " + Reverse);
    }
    
}
