package com.youtopin.test.service.generators;

import com.youtopin.test.lib.annoration.*;

@Generator(prefix = "Example1 - ")
public interface ExampleGenerator {
    String generate(String s);
}
