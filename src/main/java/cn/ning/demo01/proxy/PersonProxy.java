package cn.ning.demo01.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonProxy implements InvocationHandler {

  private Object subject;

  public PersonProxy(Object subject) {
    this.subject = subject;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("吃饭前洗手");
    Object invoke = method.invoke(subject, args);
    System.out.println("吃完饭也要洗手");
    return invoke;
  }
}
