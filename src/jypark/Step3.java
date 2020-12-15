package jypark;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step3 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
//     Q1(2);
//     Q2();
//     Q3(3);
//     Q4(5);
//     Q5();
//     Q6();
//     Q7(5);
//     Q8(5);
     Q9(arr,5);
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

    // 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    public static void Q4(int N) {
        // scanner보다 bufferedReader 쓰면 출력결과가 더 빠름
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }

    // 자연수 N이 주어졌을 때, n부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    public static void Q5(int N) {
        for (int i = N; i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void Q6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write("Case #" + (i+1) + ": " + (A+B));
            bw.newLine();
        }

        bw.flush();
    }

    // 별 찍기
    public static void Q7(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //별 찍기 (오른쪽 정렬)
    public static void Q8(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else  {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // x보다 작은 수 :  정수 n개로 이루어진 수열 a와 정수 x
    // 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

    public static void Q9(int[] arr, int x) {
        int n = arr.length;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(i +" ");
            }
    }
}
