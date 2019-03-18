package com.pattern.decorator.battercake.v2;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:45
 * @Version 1.0
 */
public class BaseBattercake extends Battercake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }

}
