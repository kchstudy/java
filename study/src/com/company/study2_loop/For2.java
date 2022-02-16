package com.company.study2_loop;

public class For2 {

    public static void main(String[] args) {

//        중첩 for문
        for ( int i = 0 ; i < 5 ; i++ ) {
            // 여기가 반복
            for ( int j = 0 ; j < 5 ; j++ ) {
                // 여기가 반복
                System.out.println( "i="+i+", j="+j );
            }
        }
        // i가 1회 반복할 때 j는 5회 반복

        // 별찍기
        System.out.println( "별찍기" );
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                System.out.print( "*" );
            }
            System.out.println("");
        }

        System.out.println( "별찍기2" );
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                if ( i >= j ) {
                    System.out.print( "*" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println("");
        }

        System.out.println( "별찍기3" );
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                if ( j >= i ) {
                    System.out.print( "*" );
                }
            }
            System.out.println("");
        }

        System.out.println( "별찍기4" );
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                if ( j >= i ) {
                    System.out.print( "*" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println("");
        }

        System.out.println( "별찍기5" );
        for ( int i = 0 ; i < 3 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                if ( Math.abs(i - j) == 2 ) {
                    System.out.print( "*" );
                } else if ( i > 0 && Math.abs(i - j) == 0 ) {
                    System.out.print( "*" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println("");
        }

/*
 * 과제
 * 기본 과제
 * 1. 별찍기1
   *
   **
   ***
   ****
   *****
 * 2. 별찍기2
   *****
   ****
   ***
   **
   *
 * 3. 별찍기3
       *
      **
     ***
    ****
   *****
 * 4. 별찍기4
   *****
    ****
     ***
      **
       *

 * 심화 과제
 * 1. 심화 별찍기
     *
    ***
   *****
    ***
     *
 */
    }
}
