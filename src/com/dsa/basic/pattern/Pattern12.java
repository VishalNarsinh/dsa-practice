package com.dsa.basic.pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
//  both conditions j <= 2 * (n - i) and j <= (2 * n) - (2 * i)
//  are mathematically equivalent.
//  The simplification : 2×(n−i)=(2×n)−(2×i)
            for (int j = 1; j <= 2 * (n-i) ; j++) {
                System.out.print("_");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
