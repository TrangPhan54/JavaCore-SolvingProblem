package org.example.abstractfactory.guruex;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        GUIFactory macFactory = new MacFactory();
        GUIFactory winFactory = new WinFactory();
        Button macButton = macFactory.createButton();
        macButton.paint();
        Button winButton = winFactory.createButton();
        winButton.paint();
        Checkbox macCheckBox = macFactory.createCheckbox();
        macCheckBox.paint();
        Checkbox winCheckbox = winFactory.createCheckbox();
        winCheckbox.paint();

    }
}
