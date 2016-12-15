package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by akarui on 2016/12/15.
 */
public class RuleInner {


static class CRuleHandler extends Handler{
        @Autowired
        DRuleHandler dRuleHandler;
        @Override
        public void check(List<String> targetList) {
            System.out.println("CRuleHandler==========>>>>>come in<<<<<<<==================");
            next = dRuleHandler;
            isNeedNext = true;
        }
    }
static class DRuleHandler extends Handler{

        @Override
        public void check(List<String> targetList) {
            System.out.println("DRuleHandler==========>>>>>come in<<<<<<<==================");

        }
    }

    public void doCheck(){
        new CRuleHandler().check(null);
    }
}
