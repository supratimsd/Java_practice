class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 30, 40, 40, 40, 50, 50};
        int n=arr.length;

        for(int i=1;i<n;i++){
            // int cnt=1;
            if(arr[i]==arr[i-1]){
                if(i==0 ||  arr[i]!=arr[i-2]){
                    System.out.println("duplicates are : "+arr[i]);
                }
            }
        }
        
    }
}

// o/p==>> duplicates are : 20
//         duplicates are : 40
//         duplicates are : 50
