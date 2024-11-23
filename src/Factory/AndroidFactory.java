package Factory;

import Factory.Button.AndroidButton;
import Factory.Components.Button;
import Factory.Components.DropDown;
import Factory.Components.Menu;
import Factory.DropDown.AndroidDropDown;
import Factory.Menu.AndroidMenu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
