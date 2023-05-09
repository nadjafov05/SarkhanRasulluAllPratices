package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean boo = foo(1,2, 3,4);
        System.out.println(boo);
    }
    public static boolean foo(int a,int b,int c,int d){
        if (a <= b && b <= c && c <= d){
            return true;
        }
        return false;
    }



}