package cn.ning.demo01.step;

public interface Step<I> {

  I process(I input);

}
