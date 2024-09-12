//write a code to implement queue using array

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class implementQueue {
     public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        Queue <Integer> st1=new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            st1.add(arr[i]);
        }
      while(!st1.isEmpty()){
        System.out.println(st1.poll());
      }
    }
}
