import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<ip;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        int app=(ip*(ip+1))/2;
        int p=arr.length;
        for(int d=0;d<p;d++){
           ans+=arr[d]; 
        }
        int sp=ans-app;
        System.out.println(sp);
    }
}
