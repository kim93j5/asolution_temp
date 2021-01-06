package jypark;
import java.util.Scanner;
import com.sun.org.apache.xml.internal.serializer.OutputPropertyUtils;
import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Step4 {

    public static void main(String[] args) throws IOException {
    // Q1();
    // Q2();
    // Q3();
    // Q4();

    }

    // A+B
    public static void Q1() {

        Scanner sc=new Scanner(System.in);

        while(true){

            int A=sc.nextInt();
            int B=sc.nextInt();

            if(A==0 && B==0){
                sc.close();
                break;
            }
            System.out.println(A+B);
        }
    }

    // A + B (값이 없을 때까지 하는 덧셈)
    public static void Q11() {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){

            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);

        }
        sc.close();
    }






    public static void Q3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int N2 = N;
        int count = 0;

        do {
            N = ((N % 10)*10 + (((N/10) + (N & 10)) % 10));

            count ++;

        } while (N2 != N);
            System.out.println(count);

    }
}
