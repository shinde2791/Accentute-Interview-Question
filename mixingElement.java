//write a program to find missing element in an array
public class mixingElement {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,6,7,8,9,10};

        int sumwithoutMissing = 0;

        for(int i=1;i<=10 ;i++){
            sumwithoutMissing=sumwithoutMissing+i;
        }

        int sumwithMissing=0;

        for(int i = 0 ; i<arr.length ;i++){
            sumwithMissing=sumwithMissing+arr[i];
        }

        int missing = sumwithoutMissing - sumwithMissing ;

        System.out.println("the missing element in array " + missing);
    }
    
}
