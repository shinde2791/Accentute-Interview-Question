import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={22,23,25,33,37,48,56,78,98};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int target=sc.nextInt();

        boolean found=false;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                System.out.println("Element found at " + mid);
                found=true;
                break;
            }
            if(target<arr[mid]){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        if(found=false){
            System.out.println("your element not found");
        }
    }
    
}
