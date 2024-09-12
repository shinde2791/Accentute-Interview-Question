public class SecondLargest {
    public static void main(String[] args) {
        int arr []={10,22,32,14,56,75};

        if(arr.length<2){
            System.out.println("Array should contain atleat 2 element");
        }
        int Largest = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>Largest){
                Second=Largest;
                Largest=num;
            }else if(num>Second && num<Largest){
                Second=num;
            }
        }
        if(Second==Integer.MIN_VALUE){
            System.out.println("Array Contain all the duplicate element");
        }else{
            System.out.println("the second largest element is " + Second);
        }

    }
}
