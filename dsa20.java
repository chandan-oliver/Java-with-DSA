package java_with_dsa;
// call by value
// any change in function it will remain in function only not in the main function
public class dsa20 {
    public static void change(int a){
        a=3;
        //System.out.println(a);
    }
    public static void main(String args[]){
        int a=34;
    change(a);
    System.out.println(a);
    }
    
}
