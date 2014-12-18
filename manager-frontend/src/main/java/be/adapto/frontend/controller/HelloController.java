package be.adapto.frontend.controller;

import be.adapto.services.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
@RequestMapping("/")
public class HelloController {

  @Inject
  private HelloService helloService;

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    model.addAttribute("message", helloService.hello());
    return "hello";
  }
}