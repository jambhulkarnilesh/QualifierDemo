package com.qualifierdemo.controller;

import com.qualifierdemo.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Qualifier("studentServiceImpl")
    @Autowired
    private Test test;

    @GetMapping("/showStudent/{name}")
    public String showStudent(@PathVariable  String name)
    {
       return  test.displayName(name);
    }
}
