package cn.ning.demo01;

import cn.ning.demo01.step.Pipeline;
import cn.ning.demo01.step.PipelineInput;
import cn.ning.demo01.step.impl.StepOne;
import cn.ning.demo01.step.impl.StepTwo;
import org.junit.Test;

public class StepTest {

  @Test
  public void test01(){
    Pipeline<PipelineInput> pipeline = new Pipeline<>(new PipelineInput());
    pipeline.addStep(new StepOne());
    pipeline.addStep(new StepTwo());
    PipelineInput execute = pipeline.execute();
    System.out.println(execute.getNum());
  }
}
