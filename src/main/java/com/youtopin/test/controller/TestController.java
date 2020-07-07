package com.youtopin.test.controller;

import com.youtopin.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(Model model){
        testService.runTest(model.getInput());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public static class Model {
        private String input;

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }
    }

}
