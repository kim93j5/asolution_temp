package jypark;

import com.sun.org.apache.xml.internal.serializer.OutputPropertyUtils;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step3 {

    public static void main(String[] args) throws Exception {

//     Q1();
//     Q2();
//     Q3();
//     Q4();
//     Q5();
//     Q6();
//     Q7();
//     Q8();
//     Q9();
     Q10();
//     Q11();
    }

    // 01 N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
    public static void Q1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }

    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    public static void Q2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();

    }

    // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
    public static void Q3() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i=0; i <=n; i++){
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }

    // 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    public static void Q4() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n ; i++) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
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
    public static void Q7() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //별 찍기 (오른쪽 정렬)
    public static void Q8() throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

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


    // 별찍기 (오른쪽 정렬)
    public static void Q9() throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());

        for (int x = n; x >= 0; x--) {
            for (int y = 0; y <= n;  y++) {
                if (y <=((-1)* x + n)) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // x보다 작은 수 :  정수 n개로 이루어진 수열 a와 정수 x
    // 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

    public static void Q10() throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
        int value = Integer.parseInt(st.nextToken());

        if (value < x)
            sb.append(value).append(' ');
    }

    System.out.println(sb);

    }
}
