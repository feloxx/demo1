package org.cdp.demo1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cdp.demo1.entity.People;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/api/v1", description = "Demo1")
@RequestMapping("/api/v1")
public class Demo1Controller {
    @ApiOperation(value = "hello", httpMethod = "GET", notes = "hello")
    @RequestMapping(name = "/hello", method = {RequestMethod.GET})
    public String hello() {
        return "Hello World!";
    }

    @ApiOperation(value = "people", httpMethod = "POST", notes = "make people")
    @RequestMapping(name = "/makePeople", method = {RequestMethod.POST})
    public People makePeople(@RequestBody People request) {
        if (request.getName().equals("zhangsan") && request.getAge() == 19) {
            return new People("lisi", 20);
        }
        return new People("no",0);
    }
}
