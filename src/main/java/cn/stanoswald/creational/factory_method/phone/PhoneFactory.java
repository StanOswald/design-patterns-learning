package cn.stanoswald.creational.factory_method.phone;

import cn.stanoswald.creational.factory_method.phone.Phone;
import cn.stanoswald.creational.factory_method.phone.impl.ApplePhone;
import cn.stanoswald.creational.factory_method.phone.impl.HuaweiPhone;

import java.lang.reflect.InvocationTargetException;

public class PhoneFactory {
    public static Phone createPhone(String brand) {
        Phone phone = null;
        switch (brand) {
            case "Apple":
                phone = new ApplePhone();
                break;
            case "Huawei":
                phone = new HuaweiPhone();
            default:
                break;
        }
        return phone;
    }

    public static <T extends Phone> T createPhone(Class<T> clazz) {
        Phone phone = null;
        try {
            phone = clazz.getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return (T) phone;
    }
}
