package cn.ning.demo01.step.impl;

import cn.ning.demo01.step.PipelineInput;
import cn.ning.demo01.step.Step;

public class StepOne implements Step<PipelineInput> {

  @Override
  public PipelineInput process(PipelineInput input) {
    System.out.println("step one process!");
    int num = input.getNum();
    input.setNum(++num);
    return input;
  }
}
