package com.company.study5_class;

public class Children extends Parent {

    // 부모의 모든 메소드를 상속 받을 수 없고 final이 없는 public, protected 접근제한자 메소드만 상속받을 수 있다.


    public Children() {
    }

    public Children(String defaultStr, String publicStr, String protectedStr) {
        this.defaultStr = defaultStr;
        this.protectedStr = protectedStr;
        this.publicStr = publicStr;
    }

    public Children(String defaultStr, String publicStr, String protectedStr, String privateStr) {
//        super(defaultStr, publicStr, protectedStr, privateStr);
        this.defaultStr = defaultStr;
        this.protectedStr = protectedStr;
        this.publicStr = publicStr;
//        this.privateStr = privateStr;
    }

    public String printParent() {
        System.out.println("super.defaultStr:"+super.defaultStr); // super 는 상위를 의미함
        System.out.println("defaultStr:"+defaultStr); // 부모의 멤버변수를 상속 받을 수 있으면 super 없이 사용가능
        System.out.println("defaultStr:" + defaultStr + ", protectedStr:" + protectedStr + ", publicStr:" + publicStr);
//        privateStr; // 호출조차 안됨
        return "defaultStr:" + defaultStr + ", protectedStr:" + protectedStr + ", publicStr:" + publicStr;
    }

    @Override // 자식이 부모의 메소드를 상속받아 구현하는 것을 오버라이딩(overriding)이라고 합니다
    public String publicGetString(String parameter) {
        System.out.println("Children-publicGetString["+"parameter:"+parameter+"]");
        return "parameter:"+parameter;
    }

    @Override
    protected String protectedGetString(String parameter) {
        System.out.println("Children-protectedGetString["+"parameter:"+parameter+"]");
        return "parameter:"+parameter;
    }

    @Override
    public String toString() {
        return "Children{" +
                "defaultStr='" + defaultStr + '\'' +
                ", publicStr='" + publicStr + '\'' +
                ", protectedStr='" + protectedStr + '\'' +
                '}';
    }

    // 아래 메소드는 서로 이름이 동일하지만 파라미터의 갯수나 파라미터의 타입이 다르다
    // 이를 오버로딩(overloading)이라고 합니다.
    public void sameNameMethod(int one) {
        System.out.println("sameNameMethod parameter int one["+one+"]");
    }

    public void sameNameMethod(String one) {
        System.out.println("sameNameMethod parameter String one["+one+"]");
    }

    public void sameNameMethod(String one, String two) {
        System.out.println("sameNameMethod parameter String one["+one+"], String two["+two+"]");
    }

}
