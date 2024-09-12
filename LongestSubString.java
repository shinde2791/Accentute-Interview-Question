//write a program to find the longest substring in java 
import java.util.*;
public class LongestSubString {
    public static void main(String[] args) {
        LengthofLongestSubString("abbca");
    }

    public static void LengthofLongestSubString(String s){
        String LongestSubString =null;
        int longestSubStringLength = 0;

        Map <Character,Integer> map= new LinkedHashMap<Character,Integer>();
        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i=map.get(ch);
                map.clear();
            }
            if(map.size()>longestSubStringLength){
                longestSubStringLength=map.size();
                LongestSubString=map.keySet().toString();
            }
        }
        System.out.println("the longest substring : " + LongestSubString);
        System.out.println("the longest substring length " + longestSubStringLength);
    }
}
