package Factory;

import Factory.Button.IOSButton;
import Factory.Components.Button;
import Factory.Components.DropDown;
import Factory.Components.Menu;
import Factory.DropDown.IOSDropDown;
import Factory.Menu.IOSMenu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
