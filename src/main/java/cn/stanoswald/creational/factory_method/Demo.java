package cn.stanoswald.creational.factory_method;

import cn.stanoswald.creational.factory_method.dialog.Dialog;
import cn.stanoswald.creational.factory_method.dialog.HtmlDialog;
import cn.stanoswald.creational.factory_method.dialog.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 100")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
