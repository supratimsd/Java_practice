import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        
        int n=ip.length();
        int vowels=0;
        int consonant=0;
        char[] ch=ip.toCharArray();
        for(char ch1:ch){
            if(Character.isLetter(ch1)){
            if(ch1=='a' || ch1=='e' || ch1=='i'
            || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I'
            || ch1=='O' || ch1=='U'){
                vowels++;
            } else{
            consonant++;
            }
        }
        }
        System.out.println(vowels+" are vowels and consonants are "+consonant);
    }
}
