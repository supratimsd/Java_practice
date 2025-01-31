import java.util.Arrays;
class Main {
    public static void main(String[] args) {
         String str1 = "google";
         
         char[] arr1=str1.toCharArray();
         Arrays.sort(arr1);
         
         if (arr1[0] != arr1[1]) {
             System.out.println(arr1[0]);
         }
         
         for(int i=1;i<arr1.length-1;i++){
             if(arr1[i]!=arr1[i+1] && arr1[i]!=arr1[i-1]){
                System.out.println(arr1[i]);
             }
         }
         if(arr1[arr1.length-1]!=arr1[arr1.length-2]){
             System.out.println(arr1[arr1.length-1]);
         }
        
    }
}
