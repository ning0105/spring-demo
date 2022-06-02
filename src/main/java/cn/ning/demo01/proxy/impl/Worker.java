package cn.ning.demo01.proxy.impl;

import cn.ning.demo01.proxy.Person;

public class Worker implements Person {

  @Override
  public void eat() {
    System.out.println("吃工人餐");
  }
}
