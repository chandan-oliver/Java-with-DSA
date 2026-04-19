package java_with_dsa;
// Decimal to binary
public class dsa29 {
    public static void dectobin(int n){
        int mynum=n;
        int binnum=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
        binnum=binnum+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
        }
        System.out.println(mynum + " ----> "  + binnum);
    }
    public static void main(String args[]){
        dectobin(5);

    }
    
}
