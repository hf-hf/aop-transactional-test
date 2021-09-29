package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.demo.mapper.TestMapper;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Transactional
    public void testSave(){
        testMapper.save(111);
    }

    /**
     * 间接调用
     */
    public void indirectSave() {
        this.testSave();
    }

}
