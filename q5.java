import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int[] f=new int[p];
        for(int s=0;s<p;s++){
            f[s]=sc.nextInt();
        }
        int n=sc.nextInt();
        boolean flowerChecker=false;
        int cnt=0;
        for(int u=0;u<f.length;u++){
            if(f[u]==0 && (u==0 || f[u]==0) && (u==p-1 || f[u]==0)){
                cnt++;
                u++;
            }
        }
        if(cnt>n){
            flowerChecker=true;
        }
        System.out.println(flowerChecker);
    }
}
