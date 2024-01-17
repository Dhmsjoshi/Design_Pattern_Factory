package My_Factory_Pattern.UIFactory;


import My_Factory_Pattern.Components.Button.Button;
import My_Factory_Pattern.Components.Button.IOSButton;
import My_Factory_Pattern.Components.Dropdown.Dropdown;
import My_Factory_Pattern.Components.Dropdown.IOSDropdown;
import My_Factory_Pattern.Components.Menu.IOSMenu;
import My_Factory_Pattern.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
