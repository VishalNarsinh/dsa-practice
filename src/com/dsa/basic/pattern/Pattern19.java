package com.dsa.basic.pattern;

public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >=1; i--) {
            for (char ch=(char) ('A'+i-1);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
