//write a code to implement stack using array

import java.util.*;

public class implementstack {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        Stack <Integer> st1=new Stack<>();

        for(int i=0;i<arr.length;i++){
            st1.push(arr[i]);
        }
      while(!st1.isEmpty()){
        System.out.println(st1.pop());
      }
    }
}
