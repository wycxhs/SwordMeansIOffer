package com.wyc.sword.other;

/**
 * 三角数字
 */
public class Triangle {
    int triangle(int n) {
        int total = 0;
        while (n > 0) {
            total = total + n;
            --n;
        }
        return total;
    }

    int triangleTwo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangleTwo(n - 1);
        }
    }

    /**
     * 阶乘
     */
    int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }


    static class Human{
    }

    static class Man extends Human{
    }

   static class Woman extends Human{
    }

    void sayHello(Human human){
        System.out.println("human");
    }

    void sayHello(Man human){
        System.out.println("man");
    }

    void sayHello(Woman human){
        System.out.println("woman");
    }

    public static void main(String[] args) {
        Human man = new Man();

    }
}
