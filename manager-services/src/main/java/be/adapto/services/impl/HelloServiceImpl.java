package be.adapto.services.impl;

import be.adapto.services.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello() {
    return "Hallo";
  }
}
