package com.test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

public class TestApplication {
    public static void main(String[] args) {

        Results results = Runner.path("file:E:\\Simbu\\POC\\features\\NewdemoAPI.feature")
//        Results results = Runner.path("classpath:features")
                .tags("@Integration")
                .parallel(2);
        System.exit(results.getFailCount());
    }

}
