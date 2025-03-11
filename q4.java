import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        char[] b=new char[n];
        
        for(int s=0;s<n;s++){
            b[s]=sc.nextLine().charAt(0);
        }
        
        int xor=0;
        
        for(int t=0;t<n;t++){
            xor^=b[t];
        }
        if(xor!=0){
            System.out.println((char)xor);
        }else{
            System.out.println("All are even");
        }
        
        
    }
}
