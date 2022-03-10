
package com.company.study3_if;

public class If {

    public static void main(String[] args) {
//        조건문
/*
        // 기본 조건문
        if ( 조건1 ) { // 만약에 조건1 이 참이라면
            // 여기를 실행한다
        } else if ( 조건2 ) { // 그게 아니라 조건2 가 참이라면
            // 여기를 실행한다
        } else { // 그것도 아니라면
            // 여기를 실행한다
        }
        // 중첩 조건문
        if ( 조건1 ) { // 만약에 조건1 이 참이라면
            // 여기를 실행한다
            if ( 조건1-1 ) { // 만약에 조건1-1 이 참이라면
                // 여기를 실행한다
            }
        } else if ( 조건2 ) { // 그게 아니라 조건2 가 참이라면
            // 여기를 실행한다
        } else { // 그것도 아니라면
            // 여기를 실행한다
        }

 */
        if ( 1 == 2 ) {
            System.out.println( "if조건이 참이면" );
        } else if ( 1 == 3 ) {
            System.out.println( "if조건이 참이 아니고 else if조건이 참이면" );
        } else {
            System.out.println( "if조건이 참이 아니고 else if조건이 참이 아니면" );
        }

        int i = 0;
        if ( i != 0 ) {
            System.out.println( "i != 0" );
        } else if ( i == 0 ) {
            System.out.println( "i == 0" );
        } else if ( i > 0 ) {
            System.out.println( "i > 0" );
        } else if ( i > -1 ) {
            System.out.println( "i > -1" );
        } else {
            System.out.println( "else" );
        }
    }
}
