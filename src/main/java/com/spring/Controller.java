package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/one")
    public ResponseBody getNumberOne() {
        return new ResponseBody(1);
    }

    @GetMapping(path = "/two")
    public ResponseBody getNumberTwo() {
        return new ResponseBody(2);
    }

    @GetMapping(path = "/three")
    public ResponseBody getNumberThree() {
        return new ResponseBody(3);
    }
}
