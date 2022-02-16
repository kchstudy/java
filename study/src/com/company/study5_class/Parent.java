package com.company.study5_class;

public class Parent {
    /* 접근 제한자
     * default   : 같은 패키지(폴더)에 있는 객체들만 허용
     * public    : 모두 접근 가능
     * protected : 같은 패키지 내와 상속관계만 허용
     * private   : 오직 나만
     */

    /* 멤버변수 */
    String defaultStr;
    public String publicStr;
    protected String protectedStr;
    private String privateStr;

    private static final int MY_INT = 0; // 상수(static final) 값이 변경되지 않으며 선언과 동시에 값을 세팅해주어야함

    /* 생성자 */
    /* new 연산자를 통해서 인스턴스를 생성할 때 반드시 호출이 되고 제일 먼저 실행되는 일종의 메소드(하지만 메소드와는 다르다) 생성자는 인스턴스 변수(필드 값 등)를 초기화 시키는 역할을 한다. */

//    public 클래스명()
    public Parent() {}
//    public 클래스명(파라미터) {}

    public Parent(String defaultStr, String publicStr, String protectedStr, String privateStr) {
        this.defaultStr = defaultStr;
        this.publicStr = publicStr;
        this.protectedStr = protectedStr;
        this.privateStr = privateStr;
    }

    /* 메소드 */
//  접근제한자 리턴타입 메소드명(파라미터타입 파라미터명) { 할일 }
    public String publicGetString(String parameter) {
        final String finalStr; // 변수에 final 을 붙이면 상수가 됨
        finalStr = "A"; // final 을 붙이면 한번만 저장할 수 있다
//        finalStr = "B"; // 여긴 에러
        System.out.println("Parent-publicGetString["+"parameter:"+parameter+", finalStr:"+finalStr+"]");
        return "parameter:"+parameter+", finalStr:"+finalStr;
    }

    protected String protectedGetString(String parameter) {
        String str = "B";
        System.out.println("Parent-protectedGetString["+"parameter:"+parameter+", finalStr:"+str+"]");
        return "parameter : "+parameter+", str : "+str;
    }

    // 접근제한자 private의 경우 오직 나만 사용할 수 있기 때문에 외부에서 사용할 수 없고 현재 클래스에서만 사용가능합니다.
    private String privateGetString(String parameter) {
        String str = "C";
        System.out.println("Parent-privateGetString["+"parameter:"+parameter+", finalStr:"+str+"]");
        return "parameter : "+parameter+", str : "+str;
    }

    public String testPrivate(String privateStr) {
        this.privateStr = privateStr;
        System.out.println("Parent-testPrivate["+"privateStr:"+privateStr+", this.privateStr:"+this.privateStr+"]");
        return privateGetString(privateStr);
    }

    public final String publicFinalGetString(String parameter) {
        String str = "D";
        System.out.println("Parent-publicFinalGetString["+"parameter:"+parameter+", finalStr:"+str+"]");
        return "parameter : "+parameter+", str : "+str;
    }

    // toString() 을 @Override 하지않을 경우 주소값이 튀어나온것
    @Override
    public String toString() {
        return "Parent{" +
                "defaultStr='" + defaultStr + '\'' +
                ", publicStr='" + publicStr + '\'' +
                ", protectedStr='" + protectedStr + '\'' +
                ", privateStr='" + privateStr + '\'' +
                '}';
    }
}
