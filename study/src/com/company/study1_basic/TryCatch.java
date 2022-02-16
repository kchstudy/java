package com.company.study1_basic;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // 일단 실행해보고
        } catch (Exception e) {
            // 오류나면 여기로 와요!
        } finally {
            // 마지막에 무조건 실행하는 라인
        }

        try {
            System.out.println("일단 실행을 하고");
            String[] arr = {"A","B","C"};

            System.out.println("에러가 발생하면");
            String error = arr[4];

            System.out.println("이 라인은 실행하지 않고");
        } catch (Exception e) {
            System.out.println("이 라인이 실행됩니다");
            System.out.println("e.getCause():"+e.getCause()+", e.getMessage():"+e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("마지막에 무조건 여기를 실행하구요");
        }
    }
}
