package com.isa.springdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdemoApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertEquals(0, 10 % 2);
    }

    @Test
    void failing() {
        Assertions.assertEquals(1, 1);
    }

}
