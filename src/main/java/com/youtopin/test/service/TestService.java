package com.youtopin.test.service;

import com.youtopin.test.service.generators.ExampleGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final ExampleGenerator exampleGenerator;

    @Autowired
    public TestService(ExampleGenerator exampleGenerator) {
        this.exampleGenerator = exampleGenerator;
    }

    public void runTest(String input){
        System.out.println(exampleGenerator.generate(input));
    }

}
