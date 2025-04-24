package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "<html><head><style>" +
               "body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f5f5f5; }" +
               ".container { text-align: center; }" +
               ".typing { font-size: 2em; color: #333; border-right: 2px solid #333; white-space: nowrap; overflow: hidden; animation: typing 3.5s steps(40, end), blink-caret .75s step-end infinite; }" +
               "@keyframes typing { from { width: 0 } to { width: 100% } }" +
               "@keyframes blink-caret { from, to { border-color: transparent } 50% { border-color: #333; } }" +
               "</style></head><body><div class='container'><div class='typing'>Hello World</div></div></body></html>";
    }
} 