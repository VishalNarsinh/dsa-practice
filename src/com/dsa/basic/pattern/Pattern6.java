package com.dsa.basic.pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int i=5;i>=1;i--){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
