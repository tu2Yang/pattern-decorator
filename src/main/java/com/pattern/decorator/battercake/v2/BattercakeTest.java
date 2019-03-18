package com.pattern.decorator.battercake.v2;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 8:51
 * @Version 1.0
 */
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg() + ",价格：" + battercake.getPrice());
    }

}
