package com.company.study2_loop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class For3 {
    public static void main(String[] args) {
        // study4_collections 를 보고 오세요
        List<String> list = new ArrayList<String>();
        list.add("listA");
        list.add("listB");
        list.add("listC");
        list.add("listD");
        list.add("listE");

        // 확장 for
        for ( String str : list ) {
            System.out.println(str);
        }

        String[] arr = { "arrA", "arrB", "arrC", "arrD", "arrE" };
        for ( String str : arr ) {
            System.out.println(str);
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("keyA", "valueA");
        map.put("keyB", "valueB");
        map.put("keyC", "valueC");
        map.put("keyD", "valueD");
        map.put("keyE", "valueE");
        for ( String key : map.keySet() ) {
            System.out.println(key);
        }
    }
}
