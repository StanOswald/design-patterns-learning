package cn.stanoswald.creational.factory_method.button.impl;

import cn.stanoswald.creational.factory_method.button.Button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
