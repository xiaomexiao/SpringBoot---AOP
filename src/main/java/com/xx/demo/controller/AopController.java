package com.xx.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "aopController")
public class AopController {

        @RequestMapping(value = "sayHello",method = RequestMethod.GET)
        public String sayHello(String name){
            return "Hello" + name;
        }
}
