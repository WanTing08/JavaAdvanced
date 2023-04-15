package com.itheima.mystatic;

public class staticDemo1 {
    public static void main(String[] args) {
        Student.university = "George Washington University";

        Student stu1 = new Student();
        stu1.name = "wanting wang";
        stu1.age = 23;
        System.out.println(stu1.name + "---" + stu1.age);
    }
}

