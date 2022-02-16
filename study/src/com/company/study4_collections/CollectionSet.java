package com.company.study4_collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        // 순서를 유지하지 않는 데이터의 집합, 중복 허용하지 않용
        Set<String> set = new HashSet<String>();
        set.isEmpty(); // set 이 빈 객체인지 확인
        System.out.println("set.isEmpty():"+set.isEmpty());
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("set.isEmpty():"+set.isEmpty());
        System.out.println("set:"+set);
        set.add("A"); // 중복값 추가
        System.out.println("중복값 추가 후 set:"+set);
        System.out.println("set.contains(\"A\"):"+set.contains("A")); // set 안에 값이 들었나?
    }
}
