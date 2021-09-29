package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.demo.service.OtherService;
import com.test.demo.service.TestService;

@SpringBootTest
class AopTestApplicationTests {

    @Autowired
    private TestService testService;

    @Autowired
    private OtherService otherService;

    @Test
    public void testDirectSave() {
        testService.testSave();
    }

    @Test
    public void testIndirectSave() {
        testService.indirectSave();
    }

    @Test
    public void testRightSave() {
        otherService.testSave();
    }

}
