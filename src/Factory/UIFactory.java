package Factory;

import Factory.Components.Button;
import Factory.Components.DropDown;
import Factory.Components.Menu;

public interface UIFactory {

    Menu createMenu();
    Button createButton();
    DropDown createDropDown();


}
