package jypark;

import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {
//     Q1(2);
//     Q2();
     Q3(3);
//     Q4();
//     Q5();
//     Q6();
//     Q7();
//     Q8();
//     Q9();
//     Q10();
//     Q11();
    }

    // 01 N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
    public static void Q1(int n) {

        for (int i = 1; i <=9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }

    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    public static void Q2() {

    }

    // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
    public static void Q3(int n) {

        int sum = 0;

        for (int i=0; i <=n; i++){
            sum += i;
        }

        System.out.print(sum);
    }



}
