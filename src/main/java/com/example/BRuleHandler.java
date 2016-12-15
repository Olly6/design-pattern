package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by akarui on 2016/12/14.
 */
@Component
public class BRuleHandler extends Handler {

    @Override
    public void check(List<String> targetList) {
        System.out.println("BRuleHandler==========>>>>>come in<<<<<<<==================");
    }
}
