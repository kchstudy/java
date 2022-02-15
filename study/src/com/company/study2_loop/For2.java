package com.company.study2_loop;

public class For2 {

    public static void main(String[] args) {

//        중첩 for문
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                System.out.println( "i="+i+", j="+j );
            }
        }

    }
}
