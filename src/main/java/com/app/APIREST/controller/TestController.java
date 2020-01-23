package com.app.APIREST.controller;

import com.app.APIREST.model.Member;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
// @RequestMapping(path = "/")
public class TestController {

    @GetMapping("/hola")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name,  Model model) {
        model.addAttribute("name", name);
        return "Hello world";
    }

    @GetMapping("/bye")
    public String bye(@RequestParam(name="name", required = false, defaultValue = "World") String name,  Model model) {
        model.addAttribute("name", name);
        return "See you";
    }

    @PostMapping(path = "/member")
    public Member addMemberV1(@RequestBody Member member) {
        return member;
    }
}
