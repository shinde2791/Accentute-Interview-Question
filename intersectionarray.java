import java.util.ArrayList;
import java.util.List;

public class intersectionarray {
    public static void main(String[] args) {
        int arr1 []={4,8,12,16,24,28,32,36,40};
        int arr2 []={3,8,15,24,36,45};

        List<Integer>intersection=new ArrayList<>();


        // find the intersection

      for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){ 
                intersection.add(arr1[i]);
                break;
            }
        }
      }
      System.out.println("the intersection between 2 array are " + intersection);


    }
    
}
