package My_Factory_Pattern.UIFactory;






import My_Factory_Pattern.Components.Button.AndroidButton;
import My_Factory_Pattern.Components.Button.Button;
import My_Factory_Pattern.Components.Dropdown.AndroidDropdown;
import My_Factory_Pattern.Components.Dropdown.Dropdown;
import My_Factory_Pattern.Components.Menu.AndroidMenu;
import My_Factory_Pattern.Components.Menu.Menu;

public class AnroidUIFactory implements UIFactory {

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
