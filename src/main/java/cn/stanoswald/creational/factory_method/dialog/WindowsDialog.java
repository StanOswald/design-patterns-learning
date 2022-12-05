package cn.stanoswald.creational.factory_method.dialog;

import cn.stanoswald.creational.factory_method.button.Button;
import cn.stanoswald.creational.factory_method.button.impl.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
