//write a code to find maximum element in the array
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr []=new int[5];
       for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
       }
      int max=arr[0];
       for(int i=0;i<arr.length;i++){
       
              if(arr[i]>max){
                max=arr[i];
              }
              
        }
        System.out.println("the maximum element in the array is " + max); 
       }

    }
    

