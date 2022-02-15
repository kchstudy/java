package com.company.study1_basic;

public class Operator {

    public static void main(String[] args) {
// 연산자
        // 산술 연산자(arithmetic operator)
        int i = 0 ; 
        System.out.println( "i : "+i ); // 0
        i = i + 30 ; 
        System.out.println( "i : "+i ); // 30
        i = i - 20 ; 
        System.out.println( "i : "+i ); // 10
        i = i * 20 ; 
        System.out.println( "i : "+i ); // 200
        System.out.println( "i / 3 : "+ (i / 3) ); // 66
        System.out.println( "i % 3 : "+ (i % 3) ); // 2

        // 대입 연산자(assignment operator)
        int val = 10; // val는 10
        System.out.println( "val : "+ val ); // 10
        val += 10; // val = val + 10; 
        System.out.println( "val : "+ val ); // 20
        val *= 10; // val = val * 10; 
        System.out.println( "val : "+ val ); // 200
        val /= 10; // val = val / 10; 
        System.out.println( "val : "+ val ); // 20
        val %= 10; // val = val % 10; 
        System.out.println( "val : "+ val ); // 0

        // 증감 연산자(increment and decrement operators)
        int prePlus = 0;
        System.out.println( "prePlus : "+ prePlus ); // 0
        System.out.println( "++prePlus : "+ ++prePlus ); // 1
        System.out.println( "prePlus : "+ prePlus ); // 1

        int afterPlus = 0;
        System.out.println( "afterPlus : "+ afterPlus ); // 0
        System.out.println( "afterPlus++ : "+ afterPlus++ ); // 0
        System.out.println( "afterPlus : "+ afterPlus ); // 1

        int preMinus = 0;
        System.out.println( "preMinus : "+ preMinus ); // 0
        System.out.println( "--preMinus : "+ --preMinus ); // -1
        System.out.println( "preMinus : "+ preMinus ); // -1

        int afterMinus = 0;
        System.out.println( "afterMinus : "+ afterMinus ); // 0
        System.out.println( "afterMinus-- : "+ afterMinus-- ); // 0
        System.out.println( "afterMinus : "+ afterMinus ); // -1
        
        // 비교 연산자(comparison operator)
        System.out.println( "3 < 5 : "+ (3<5) ); // true
        System.out.println( "3 <= 5 : "+ (3<=5) ); // true
        System.out.println( "3 > 5 : "+ (3>5) ); // false
        System.out.println( "3 >= 5 : "+ (3>=5) ); // false
        System.out.println( "3 == 5 : "+ (3==5) ); // false
        System.out.println( "3 != 5 : "+ (3!=5) ); // true
        
        // 논리 연산자(logical operator)
        System.out.println( "[false&true   : "+ (getBoolean("false&true"  , false) &  getBoolean("false&true"  , true )) + "]" ); // false
        System.out.println( "[false&false  : "+ (getBoolean("false&false" , false) &  getBoolean("false&false" , false)) + "]" ); // false
        System.out.println( "[true&false   : "+ (getBoolean("true&false"  , true ) &  getBoolean("true&false"  , false)) + "]" ); // false
        System.out.println( "[true&true    : "+ (getBoolean("true&true"   , true ) &  getBoolean("true&true"   , true )) + "]" ); // true
        System.out.println( "[false&&true  : "+ (getBoolean("false&&true" , false) && getBoolean("false&&true" , true )) + "]" ); // false
        System.out.println( "[false&&false : "+ (getBoolean("false&&false", false) && getBoolean("false&&false", false)) + "]" ); // false
        System.out.println( "[true&&false  : "+ (getBoolean("true&&false" , true ) && getBoolean("true&&false" , false)) + "]" ); // false
        System.out.println( "[true&&true   : "+ (getBoolean("true&&false" , true ) && getBoolean("true&&false" , true )) + "]" ); // true
        System.out.println( "[false|true   : "+ (getBoolean("false|true"  , false) |  getBoolean("false|true"  , true )) + "]" ); // true
        System.out.println( "[false|false  : "+ (getBoolean("false|false" , false) |  getBoolean("false|false" , false)) + "]" ); // false
        System.out.println( "[true|false   : "+ (getBoolean("true|false"  , true ) |  getBoolean("true|false"  , false)) + "]" ); // true
        System.out.println( "[true|true    : "+ (getBoolean("true|true"   , true ) |  getBoolean("true|true"   , true )) + "]" ); // true
        System.out.println( "[false||true  : "+ (getBoolean("false||true" , false) || getBoolean("false||true" , true )) + "]" ); // true
        System.out.println( "[false||false : "+ (getBoolean("false||false", false) || getBoolean("false||false", false)) + "]" ); // false
        System.out.println( "[true||false  : "+ (getBoolean("true||false" , true)  || getBoolean("true||false" , false)) + "]" ); // true
        System.out.println( "[true||true   : "+ (getBoolean("true||true"  , true)  || getBoolean("true||false" , true )) + "]" ); // true

        // 삼항 연산자(ternary operator)
        System.out.println( ( ( 3 > 5 ) ? "OK" : "NO" ) );
        System.out.println( ( ( 3 < 5 ) ? "OK" : "NO" ) );
 
    }
    
    public static boolean getBoolean(String name, boolean tf) {
        System.out.println(name+":"+tf);
        return tf;
    }
}
