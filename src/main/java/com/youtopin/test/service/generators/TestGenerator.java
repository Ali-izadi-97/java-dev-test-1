package com.youtopin.test.service.generators;

import com.youtopin.test.lib.annorations.*;

@Generator(prefix = "This is prefix - ")
public interface TestGenerator {
    String generate(String s);
}
