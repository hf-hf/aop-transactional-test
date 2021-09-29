package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherService {

    @Autowired
    private TestService testService;

    public void testSave(){
        testService.testSave();
    }

}
