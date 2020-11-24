package jypark;

import java.util.Scanner;

public class Step2 {

    public static void main(String[] args) {
     Q1();
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

    // 01 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
    public static void Q1() {
        int a,b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.print(">");
        }
        if (a < b) {
            System.out.print("<");
        }
        if (a == b) {
            System.out.print("==");
        }

    }

    // 02 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
    // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

    public static void Q2() {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (90 <= score && score<= 100) {
            System.out.print("A");
        }
        if (80 <= score && score<= 89) {
            System.out.print("B");
        }
        if (70 <= score && score<= 79) {
            System.out.print("C");
        }
        if (60 <= score && score<= 69) {
            System.out.print("D");
        }
        if (score<= 59) {
            System.out.print("F");
        }
    }

    // 03  연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오
  /**
    윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
    예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
   */

  public static void Q3() {

      Scanner sc = new Scanner(System.in);
      int leapYear =  sc.nextInt();

  }
}
