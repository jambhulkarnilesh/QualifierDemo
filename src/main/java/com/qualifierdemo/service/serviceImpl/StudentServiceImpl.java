package com.qualifierdemo.service.serviceImpl;

import com.qualifierdemo.service.Test;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements Test {
    @Override
    public String displayName(String name) {
        return "Student Name : "+name;
    }
}
