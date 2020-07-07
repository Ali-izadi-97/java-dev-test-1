package com.youtopin.test.service;

import com.youtopin.test.service.generators.TestGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestGenerator testGenerator;

    @Autowired
    public TestService(TestGenerator testGenerator) {
        this.testGenerator = testGenerator;
    }

    public void runTest(String input){
        System.out.println(testGenerator.generate(input));
    }

}
