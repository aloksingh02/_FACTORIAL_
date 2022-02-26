package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of" + " "+num +" = "+ fact);
    }
}
