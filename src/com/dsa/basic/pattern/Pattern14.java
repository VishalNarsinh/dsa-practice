package com.dsa.basic.pattern;

public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
//        for (int i = 0; i < n; i++) {
//            char c = 'A';
//            for (int j = 0; j <= i; j++) {
//                System.out.print(c++ +" ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            for(char ch='A';ch<= 'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
