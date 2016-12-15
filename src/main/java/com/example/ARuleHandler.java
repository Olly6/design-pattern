package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by akarui on 2016/12/14.
 */
@Component
public class ARuleHandler extends Handler {

    @Autowired
    BRuleHandler bRuleHandler;
    @Override
    public void check(List<String> targetList) {
        System.out.println("ARuleHandler==========>>>>>come in<<<<<<<==================");
        next = bRuleHandler;
        isNeedNext = true;
    }
}
