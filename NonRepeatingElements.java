import java.util.Scanner;
import java.util.Arrays;

class NonRepeatingElements{


    public static void main(String[] args) {
        int[] arr={10, 20, 40, 30, 50, 20, 10, 20};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int cnt=1;
            if(i<n-1 && arr[i]==arr[i+1]){
                cnt++;
            }if(i>0 && arr[i]==arr[i-1]){
                cnt++;
            }
            
            if(cnt==1){
                System.out.println("unique elements are: "+arr[i]);
            }
        }
        
    }


}

//o/p==>>unique elements are: 30
//       unique elements are: 40
