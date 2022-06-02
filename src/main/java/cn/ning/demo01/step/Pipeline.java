package cn.ning.demo01.step;

import java.util.ArrayList;
import java.util.List;

public  class Pipeline<I> {

  private I input;

  public Pipeline(I input) {
    this.input = input;
  }

  private List<Step<I>> stepList=new ArrayList<>();

  public void addStep(Step<I> step){
    stepList.add(step);
  }

  public I execute(){
    for (Step<I> step : stepList) {
      input = step.process(input);
    }
    return  input;
  }


}
