import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] b=new String[n];
        
        for(int s=0;s<n;s++){
            b[s]=sc.nextLine();
        }
        boolean foundOdd=false;
        
        
        for(int t=0;t<n;t++){
            int cnt=0;
            for(int u=0;u<n;u++){
                if(b[t].equals(b[u])){
                    cnt++;
                }
            }
            if(cnt%2!=0){
                System.out.println(b[t]);
                foundOdd=true;
                break;
            }
            
        }
        if(!foundOdd) {
            System.out.println("All are even");
        }
        
    }
}
