package com.dsa.basic.pattern;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("_");
            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = i-1; j >=1 ; j--) {
//                System.out.print(j);
//            }
            int breakpoint=(2*i+1)/2;
            int val=1;
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(val);
                if(j<breakpoint)
                    val++;
                else
                    val--;
            }
            for (int j = i; j < n; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
