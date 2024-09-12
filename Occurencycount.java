//write a program to count the occurency for each element in the array
import java.util.*;
public class Occurencycount {
    public static void main(String[] args) {
        int arr []={1,2,2,3,3,4,4,4};
        Map<Integer,Integer>elementCountMap=new HashMap<>();

        for(int num:arr){
            if(elementCountMap.containsKey(num)){
                elementCountMap.put(num,elementCountMap.get(num)+1);
            }else{
                elementCountMap.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()){
            System.out.println("Element " + entry.getKey() + " count " +  entry.getValue()  );
        }
    }
    
}
