//write a code to merge two sorted array
public class mergetwosortedarray {
    public static void main(String[] args) {
        int arr1 []={1,3,5,7};
        int arr2 []={2,4,6,8,10};

        //merging two sorted array

        int [] mergedArray = mergeArrays(arr1,arr2);

        // print the merged sorted Array

        System.out.println("merged sorted arrays");

        for(int num : mergedArray){
            System.out.print(num + " ");
        }
    }

    public static int [] mergeArrays (int [] arr1, int [] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1 + n2];

        int i=0,j=0,k=0;

        // traverse both arrays and insert smaller element into merged aerray

        while(i<n1  && j<n2){
            if(arr1[i] <= arr2 [j]){
                mergedArray[k] = arr1[i];
                i++;
            }else{
                mergedArray[k]=arr2[j];
                j++;
            }
            k++;
        }
        // Store remaining elements of arr1
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Store remaining elements of arr2
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
    
}
