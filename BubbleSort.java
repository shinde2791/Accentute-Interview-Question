public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,6,3,2,1};
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
