package com.company.study2_loop;

public class For1 {

    public static void main(String[] args) {

//        기본 for 문
        for ( int i = 0 ; i < 5 ; i++ ) {
            System.out.println("반복");
        }

//        for ( int i = 0 ; i < 5 ; i++ )
//              i 는 0 으로 시작해서 ; 5보다 작을 때가지 반복 ; i는 1씩증가

//        for ( int i = 0 ; i < 5 ; i++ ) {
//            System.out.println("반복"); // 여기 부분이 반복
//        }

        for ( int i = 0 ; i < 5 ; i++ ) {
            System.out.println("i="+i);
        }

        for ( int i = 1 ; i <= 5 ; i++ ) {
            System.out.println("i="+i);
        }

        for ( int i = 5 ; i > 0 ; i-- ) {
            System.out.println("i="+i);
        }

        int sum = 0; // 총합을 기록할 int 변수 생성
        for ( int i = 1 ; i <= 5 ; i++ ) {
            System.out.println("더하기 전 sum="+sum+", i="+i);
            sum = sum + i;
            System.out.println("더하기 후 sum="+sum+", i="+i);
        }

        sum = 0; // 총합을 기록할 int 변수 생성
        for ( int i = 1 ; i <= 5 ; i++ ) {
            System.out.println("더하기 전 sum="+sum+", i="+i);
            sum += i;
//            sum = sum + i; 와 같은 의미
            System.out.println("더하기 후 sum="+sum+", i="+i);
        }

//        for ( int i = 5 ; i > 0 ; i-- ) {
//              i 는 5 로 시작해서 ; 0보다 클 때가지 반복 ; i는 1씩감소


/*
 * 과제
 * 기본 과제
 * 1. 1부터 10까지 10번 반복하는 반복문을 생성하여 1부터 10까지 더하기 총합을 구하시오.
 *     1 + 2 + 3 + ... + 10 = ?
 * 2. 1부터 10까지 10번 반복하는 반복문을 생성하여 1부터 10까지 곱하기 총합을 구하시오.
 *     1 * 2 * 3 * ... * 10 = ?
 * 심화 과제
 * 1. 3번 반복하는 반복문을 생성하여 아래 * 을 출력하시오.
   *
   **
   ***
 * 2. 3번 반복하는 반복문을 생성하여 아래 * 을 출력하시오.(힌트:String substring)
   ***
   **
   *
 */
    }
}
