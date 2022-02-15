package com.company.study1_basic;

public class UsefulMethods {
    public static void main(String[] args) {
        // 유용한 메소드들 ...

        // 문자를 숫자로
        String number = "10";
        int i =Integer.parseInt(number);
        System.out.println( "String인 number=["+number+"] int인 i=["+i+"]" );
        long l = Long.parseLong(number);
        System.out.println( "String인 number=["+number+"] long인 l=["+l+"]" );

        // 문자 자르기
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String str = "A B C D E F G H I J K  L  ... °Z";
        //       index   0 1 2 3 4 5 6 7 8 9 10 11 ... °25
        // java 는 0부터 시작해요!
        System.out.println(str.substring(0)); // 0번째부터 끝까지
        System.out.println(str.substring(3)); // 3번째부터 끝까지
        System.out.println(str.substring(0, 1)); // 0번째부터 1번째 전까지
//        System.out.println(str.substring(3, 1)); // 3번째부터 1번째 전까지 (에러)
        System.out.println(str.substring(3, 4)); // 3번째부터 4번째 전까지
        System.out.println(str.substring(5, 10)); // 5번째부터 10번째 전까지

        // 문자열 비교
        String compareA1 = new String("ABCDEFG");
        String compareA2 = new String("ABCDEFG");
        String compareB1 = new String("BCDEFGH");

        // 비교 연산자(주소값을 비교하기 때문에 같은 내용이라도 주소값이 다르면 false)
        System.out.println( "(compareA1 == compareB1) : "+(compareA1 == compareB1) );
        System.out.println( "(compareA1 == compareA2) : "+(compareA1 == compareA2) );

        // String 객체끼리 내용을 비교
        System.out.println( "compareA1.equals(compareB1) : "+compareA1.equals(compareB1) );
        System.out.println( "compareA1.equals(compareA2) : "+compareA1.equals(compareA2) );

        // 문자열 길이
        System.out.println(str+"의 길이는 "+str.length());

        int intA = 10;
        int intB = 20;
        String strA = "10";
        String strB = "20";

        // +
        System.out.println( "(intA + intB) : "+(intA + intB) ); // 30 : 숫자는 더하기를 하면 값이 더해지지만
        System.out.println( "(strA + strB) : "+(strA + strB) ); // 1020 : 문자는 더하기를 하면 연결이 됩니다.

        // *
        System.out.println( "(intA * intB) : "+(intA * intB) ); // 200 : 숫자는 곱하기를 하면 값이 곱해지지만
//        System.out.println( "(strA * strB) : "+(strA * strB) ); // 문자는 곱하기가 안됩니다.

        System.out.println( "=================================================" );
        System.out.println( "줄바꿈이 기본적으로 있어요1" );
        System.out.print( "줄바꿈이 없어요1" );
        System.out.print( "줄바꿈이 없어요2" );
        System.out.print( "줄바꿈\n 탭문자\t" );
        System.out.println( "줄바꿈이 기본적으로 있어요2" );
        System.out.println( "=================================================" );

    }
}
