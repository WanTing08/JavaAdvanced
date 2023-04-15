package com.itheima.myExtends;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.setName("wwt");
        coder.setAge(23);
        coder.setSalary(120000);

        System.out.println(coder.getName() + coder.getAge() + coder.getSalary());
    }
}

class employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
}

class Coder extends employee{
}

class Manager extends employee{
}
