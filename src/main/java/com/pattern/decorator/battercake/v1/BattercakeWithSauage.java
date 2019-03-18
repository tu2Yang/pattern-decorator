package com.pattern.decorator.battercake.v1;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:37
 * @Version 1.0
 */
public class BattercakeWithSauage extends Battercake {

    @Override
    protected String getMsg() {
        return "加香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }

}
