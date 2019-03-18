package com.pattern.decorator.battercake.v1;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:35
 * @Version 1.0
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg() {
        return "加鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

}
