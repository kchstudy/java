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

    }
}
