package cn.ning.demo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


  @GetMapping("/test/{name}")
  public String printHello(@PathVariable("name") String name) {
    return "Hello " + name + ",认识你很高兴！";
  }

}
