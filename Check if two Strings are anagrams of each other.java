import java.util.Arrays;
class Main {
    public static void main(String[] args) {
         String str1 = "RULES";
         String str2 = "LESRU";
         char[] arr1=str1.toCharArray();
         Arrays.sort(arr1);
         char[] arr2=str2.toCharArray();
         Arrays.sort(arr2);
         boolean isAnagram=true;
        
         for(int i=0;i<str1.length();i++){
             if(arr1[i]!=arr2[i]){
                isAnagram=false; 
                
             }
         }
         System.out.println(isAnagram);
        
    }
}
