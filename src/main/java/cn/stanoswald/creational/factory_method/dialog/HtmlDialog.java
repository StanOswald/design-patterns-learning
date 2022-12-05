package cn.stanoswald.creational.factory_method.dialog;

import cn.stanoswald.creational.factory_method.button.Button;
import cn.stanoswald.creational.factory_method.button.impl.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
