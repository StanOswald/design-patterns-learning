package cn.stanoswald.creational.factory_method.phone.impl;

import cn.stanoswald.creational.factory_method.phone.Phone;

public class HuaweiPhone implements Phone {
    @Override
    public void show() {
        System.out.println("Huawei!");
    }
}
