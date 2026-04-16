package java_with_dsa;
import java.util.*;
// prime or not prime number
public class dsa14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
       
        boolean isprime=true;
        for(int i=2 ;i<number-1;i++){
            if(number%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println( number + " is a prime number");
        }
        else{
            System.out.println( number + " is not a prime number");
        }
    }
    
}
