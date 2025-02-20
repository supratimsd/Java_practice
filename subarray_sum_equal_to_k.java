import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arr=new int[m];
        for(int d=0;d<m;d++){
            arr[d]=sc.nextInt();
        }
        
        int s = sc.nextInt();
        // int n=arr.length;
        int cnt=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=i;j<m;j++){
                
                
                    sum+=arr[j];
                
                if(sum==s){
                    cnt++;
                }
            }
        }
        System.out.println("The pairs are ===>>>> "+cnt);
    }
}
