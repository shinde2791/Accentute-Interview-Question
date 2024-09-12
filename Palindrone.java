public class Palindrone {
    public static void main(String[] args) {
        String st1="shinde";
        String st2="";

        for(int i=st1.length()-1;i>=0;i--){
            st2=st2+st1.charAt(i);
        }
        if(st1.equals(st2)){
            System.out.println("String is palindrone");
        }else{
            System.out.println("string is not palindrone");
        }
    }
    
}
