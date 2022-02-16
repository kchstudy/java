package com.company.study4_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
        // 키(key), 값(value) 쌍으로 이루어진 데이터의 집합, 순서 유지되지 않음
        // 키(key) 중복 허용하지 않음
        // 값(value) 중복 허용
        Map<String, Object> map = new HashMap<String, Object>();
        // map 에 key 는 "keyA" 값은 "valueA" 로 저장하겠다.
        map.put("keyA", "valueA");
        map.put("keyB", "valueB");
        map.put("keyC", "valueC");
        map.put("keyD", "valueD");
        map.put("keyE", "valueE");
        System.out.println("map:"+map);

        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("keyA", "valueA1");
        map2.put("keyA", "valueA2"); // key 중복
        map2.put("keyB", "valueB");
        map2.put("keyC", "valueC");
        map2.put("keyD", "valueD");
        map2.put("keyE", "valueE");
        System.out.println("map2:"+map2); // 마지막에 put한 key와 value만 저장됨

        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("keyA", "valueA");
        map3.put("keyB", "valueB");
        map3.put("keyC", "valueC");
        map3.put("keyD", "valueD");
        map3.put("keyE", "valueD"); // 값 중복
        System.out.println("map3:"+map3);

        String keyA = (String) map.get("keyA"); // map 안에 있는 값 가져오기
        System.out.println("keyA:"+keyA);

        // map 이 가지고 있는 key 목록을 Set 형태로 가져온다
        Set<String> keys = map.keySet();
    }
}
