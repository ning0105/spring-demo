package cn.ning.demo01.proxy.impl;

import cn.ning.demo01.proxy.Person;

public class Student implements Person {

  @Override
  public void eat() {
    System.out.println("吃学生餐");
  }
}
