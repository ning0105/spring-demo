package cn.ning.demo01;

import cn.ning.demo01.proxy.Person;
import cn.ning.demo01.proxy.PersonProxy;
import cn.ning.demo01.proxy.impl.Student;
import java.lang.reflect.Proxy;
import org.junit.Test;

public class PersonTest {
  @Test
  public void test01(){
    Student student = new Student();
    PersonProxy personProxy = new PersonProxy(student);

    Person person = (Person) Proxy
        .newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(),
            personProxy);

    person.eat();
  }

}
