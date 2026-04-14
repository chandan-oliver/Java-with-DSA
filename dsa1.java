package java_with_dsa;

import java.util.*;
public class dsa1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age <=18){
            System.out.println("teanager");
        }
        else{
            System.out.println("children");
        }
    }
    
}

