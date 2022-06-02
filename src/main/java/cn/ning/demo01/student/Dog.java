package cn.ning.demo01.student;

class Dog{
  private static int a=100;

  public static void main(String[] args) {
    Dog dog = new Dog();
    Dog.a++;
    System.out.println(a);
  }
}



