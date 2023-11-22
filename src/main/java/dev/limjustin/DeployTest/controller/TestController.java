package dev.limjustin.DeployTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String homeTest() {
        return "Hello world!";
    }

    @GetMapping("/main")
    public String homeMain() {
        return "This is Main page";
    }
}
