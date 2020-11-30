package jypark;

import java.util.Scanner;

public class Step2 {

    public static void main(String[] args) {
//     Q1();
//     Q2();
//     Q3();
     Q4();
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

      if (leapYear % 4 == 0 && leapYear % 400 == 0) {
            System.out.print("1");
      } else if (leapYear % 4 == 0 && leapYear % 100 != 0) {
          System.out.print("1");
      } else {
          System.out.print("0");
      }
  }

    // 04  점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
    /**
     * ++ > Quadrant 1
     * -+ > Quadrant 2
     * -- > Quadrant 3
     * +- > Quadrant 4
     */
    public static void Q4() {
        int a, b ;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();;
        b = sc.nextInt();;

        if (a > 0 && b > 0) {
            System.out.print("1");
        }
        if (a < 0 && b > 0) {
            System.out.print("2");
        }
        if (a < 0 && b < 0) {
            System.out.print("3");
        }
        if (a > 0 && b < 0) {
            System.out.print("4");
        }
    }

    //05 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
    /**
     상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
     상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
     이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
     바로 "45분 일찍 알람 설정하기"이다.
     이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
     현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
      */
    public static void Q5() {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min - 45));
        }
    }

}
