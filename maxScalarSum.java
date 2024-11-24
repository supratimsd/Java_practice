import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 6, 3, 7};
           int arr2[] = {10, 7, 45, 3, 7};
        int scalarSum=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // for(int s=0;s<arr2.length/2;s++){
        //     int sd=arr2[s];
        //     arr2[s]=arr2[arr2.length-s-1];
        //     arr2[arr2.length-s-1]=sd;
        // }
        for(int p=0;p<arr1.length;p++){
                int u=arr1[p]*arr2[p];
                scalarSum+=u;
            }
        System.out.println("Max Scalar Sum"+scalarSum);
    }
}
