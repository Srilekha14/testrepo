package com.springboot.helloworld.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomecontroller {
@RequestMapping("/get")
public String Welcome()
{
return "go and have party";

}
}
