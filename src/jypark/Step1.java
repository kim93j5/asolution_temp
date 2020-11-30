package jypark;

import java.util.Scanner;
import java.util.*;

public class Step1 {

    public static void main(String[] args) {
//     Q1();
//     Q2();
//     Q3();
//     Q4();
//     Q5();
//     Q6();
//     Q7();
//     Q8();
//     Q9();
//     Q10();
//     Q11();
    }

    // 01 Hello world
    public static void Q1() {
        System.out.print("Hello World");
    }

    // 02 We love kriii
    public static void Q2() {
        System.out.print("강한친구 대한육군");
        System.out.print("강한친구 대한육군");
    }

    // 03 고양이
    public static void Q3() {
        System.out.print("\\    /\\\n");
        System.out.print(" )  ( ')\n");
        System.out.print("(  /  )\n");
        System.out.print(" \\(__)|");
    }

    // 04 개
    public static void Q4() {
        System.out.println("|\\_/|     ");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\ ");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

    }

    // 05 A+B
    public static void Q5(int a, int b  ) {

        System.out.print(a+b);
    }

    // 06 A-B
    public static void Q6(int a, int b) {

        System.out.print(a-b);
    }

    // 07 A*B
    public static void Q7(int a, int b) {

        System.out.print(a*b);
    }

    // 08 A/B
    public static void Q8(double a, double b) {

        System.out.print(a*b);
    }

    // 09 사칙연산 ( A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램)
    public static void Q9(int a, int b){

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }

    //10
    public static void Q10(int a, int b, int c){

        System.out.println((a+b)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a%c * b%c)%c);

    }

    //11
    public static void Q11(int a, int b) {

        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }

}
