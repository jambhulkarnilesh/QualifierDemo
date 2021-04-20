package com.qualifierdemo.service.serviceImpl;

import com.qualifierdemo.service.Test;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements Test {
    @Override
    public String displayName(String name) {
        return "Employee Name : "+name;
    }
}
