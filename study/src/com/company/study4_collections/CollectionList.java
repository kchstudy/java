package com.company.study4_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionList {
    public static void main(String[] args) {
        // 순서를 유지하는 데이터의 집합, 중복 허용
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("list:"+list);
        System.out.println(list.get(0)); // java 는 0부터 시작
        System.out.println(list.size()); // 현재 list 의 사이즈
        System.out.println(list.indexOf("A")); // 0 list 에 A라는 값이 들어있으면 해당 위치 인덱스 반환(java 는 0부터 시작합니다)
        System.out.println(list.indexOf("F")); // -1 list 에 F라는 값이 없으면 -1 반환
        list.add("A"); // 중복값 추가
        System.out.println("중복값 추가 후 list:"+list);

        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(1);

        List<Boolean> listBoolean = new ArrayList<Boolean>();
        listBoolean.add(true);

        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", "value");
        listMap.add(map);


    }
}
