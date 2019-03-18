package com.pattern.decorator.battercake.v2;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:47
 * @Version 1.0
 */
public class BattercakeDecorator extends Battercake {

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
