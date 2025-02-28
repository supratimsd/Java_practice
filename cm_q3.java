import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] e=new int[t];
        int[] l=new int[t];
        int[] result=new int[t];
        for(int s=0;s<t;s++){
            e[s]=sc.nextInt();
        }
        for(int s=0;s<t;s++){
            l[s]=sc.nextInt();
        }
        int cnt=0;
        for(int u=0;u<t;u++){
            
                int temp=e[u]-l[u];
                cnt+=temp;
                result[u]=cnt;
            
        }
        Arrays.sort(result);
        System.out.println(" "+result[t-1]);
    }
}
