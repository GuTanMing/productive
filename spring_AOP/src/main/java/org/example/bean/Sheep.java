package org.example.bean;

/**
 * @ClassName Sheep
 * @Description TODO
 * @Author YinLiangTao Email:1517535831@qq.com
 * @Date 2022/9/6 9:34
 * @Version 1.0
 */
public class Sheep {
    private String name;
    private Integer age;

    public Sheep() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void eat(){
        System.out.println("羊吃草");
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
