package com.pattern.decorator.battercake.v2;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:51
 * @Version 1.0
 */
public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
