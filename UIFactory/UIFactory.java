package My_Factory_Pattern.UIFactory;

import My_Factory_Pattern.Components.Button.Button;
import My_Factory_Pattern.Components.Dropdown.Dropdown;
import My_Factory_Pattern.Components.Menu.Menu;

public interface UIFactory {
    //Factory methods

    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();

}
