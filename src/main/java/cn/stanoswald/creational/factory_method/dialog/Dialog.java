package cn.stanoswald.creational.factory_method.dialog;

import cn.stanoswald.creational.factory_method.button.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}
