import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int s=0;s<r;s++){
            for(int t=0;t<c;t++){
                arr[s][t]=sc.nextInt();
            }
        }
        int cntRows=-9999;
        int cntIndex=-9999;
        for(int i=0;i<r;i++){
            int cnt=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>cntRows){
                cntRows=cnt;
                cntIndex=i;
                
            }
            
            
        }
        System.out.println("  "+(cntIndex+1));
        
    }
}
