package My_Factory_Pattern.UIFactory;


import My_Factory_Pattern.Components.Button.Button;
import My_Factory_Pattern.Components.Button.WindowsButton;
import My_Factory_Pattern.Components.Dropdown.Dropdown;
import My_Factory_Pattern.Components.Dropdown.WindownDropdown;
import My_Factory_Pattern.Components.Menu.Menu;
import My_Factory_Pattern.Components.Menu.WindowsMenu;


public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindownDropdown();
    }
}
