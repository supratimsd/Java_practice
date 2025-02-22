// binary ==>> reverse ==>> decimal


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int r=0;
        while(n>0){
            r=n%10;
            rem=(rem*10)+r;
             n =n/10;
        }
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = rem;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }
        System.out.println(" "+dec_value);
    }
}
