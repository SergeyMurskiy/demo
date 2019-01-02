package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sergey Murskiy on 02.01.2019.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/")
    public String test() {
        return "index";
    }
}
