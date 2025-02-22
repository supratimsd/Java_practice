import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int s=0;s<n;s++){
            arr[s]=sc.nextInt();
        }
        int m=0;
        for(int e=0;e<n;e++){
            if(arr[e]!=0){
                if(e!=m){
                    int temp=arr[e];
                    arr[e]=arr[m];
                    arr[m]=temp;
                }
                m++;
            }
        }
        for(int u:arr){
            System.out.print(" "+u);
        }
    }
}
