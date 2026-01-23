package com.Numbers;

public class ArmstrongNumber {
    static void main(String[] args) {
        checkArmstrong(407);
    }

    static int cubes(int n, int cubeNo) {
        int sum = 1;
        for (int i = 0; i < cubeNo; i++) {
            sum = sum * n;
        }
        return sum;
    }
    static int count(int n) {
        int r = 0, sum = 0;
        int count = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            count++;
            n = n / 10;
        }
        return count;
    }
    static void checkArmstrong(int n) {
        int r = 0, sum = 0, temp = 0;
        temp = n;
        int power = count(n);
        System.out.println(power);
        while (n > 0) {
            r = n % 10;
            sum = sum + cubes(r, power);
            n = n / 10;
        }
        System.out.println(temp == sum ? "armstrong number" : "not a armstrong");
    }
}
