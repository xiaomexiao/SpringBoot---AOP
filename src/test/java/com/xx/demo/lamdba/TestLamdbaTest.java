package com.xx.demo.lamdba;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TestLamdbaTest {

    @Test
    public void test(){
       TestLamdba t1 = new TestLamdba();
       t1.testlamdba();
    }
}