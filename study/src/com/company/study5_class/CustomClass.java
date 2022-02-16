package com.company.study5_class;

public class CustomClass {
    public static void main(String[] args) {
        Parent test1 = new Parent();
        System.out.println(test1.toString());
        test1.publicGetString("TEST1-publicGetString");
        test1.protectedGetString("TEST1-protectedGetString");
        test1.publicFinalGetString("TEST1-publicFinalGetString");
        test1.testPrivate("TEST1-testPrivate"); // private 메서드 호출을 위한 테스트 메서드

        Parent test2 = new Parent("A", "B","C","D");
        System.out.println(test2.toString());
        test2.publicGetString("TEST2-publicGetString");
        test2.protectedGetString("TEST2-protectedGetString");
        test2.publicFinalGetString("TEST2-publicFinalGetString");

        // 자식은 부모가 될 수 없지만 부모는 자식이 될 수 있습니다.
//        Children test3 = new Parent(); // 여기는 에러
        Parent test3 = new Children(); // 여기는 정상
        System.out.println(test3);
        test3.publicGetString("TEST3-publicGetString");
        test3.protectedGetString("TEST3-protectedGetString");
        test3.publicFinalGetString("TEST3-publicFinalGetString");

        Children test4 = new Children("TEST4_A", "TEST4_B", "TEST4_C");
        System.out.println(test4);
        test4.publicGetString("test4-publicGetString");
        test4.protectedGetString("test4-protectedGetString");
        test4.publicFinalGetString("test4-publicFinalGetString");
    }
}
