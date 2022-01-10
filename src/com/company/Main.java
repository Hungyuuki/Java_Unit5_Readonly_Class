package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setClasses("C03");
        s1.setName("Nhung");
        System.out.println("Học sinh "+s1.getName()+" "+s1.getClasses());
//        Static, Protected, default chạy bt, private chạy lỗi.
    }
}
