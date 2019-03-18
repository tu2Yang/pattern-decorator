package com.pattern.decorator.battercake.v2;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:50
 * @Version 1.0
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

}
