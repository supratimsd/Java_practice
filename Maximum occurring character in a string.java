import java.util.Arrays;
class Main {
    public static void main(String[] args) {
         String str = "takeuforward";
         char[] arr=str.toCharArray();
         Arrays.sort(arr);
         for(int i=0;i<str.length()-1;i++){
             int flag=0;
             if(arr[i]==arr[i+1]){
                 flag=1;
             }
             if(flag!=0){
                 System.out.println(arr[i]);
             }
         }
        
    }
}
