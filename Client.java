package My_Factory_Pattern;


import My_Factory_Pattern.Components.Button.Button;
import My_Factory_Pattern.Components.Dropdown.Dropdown;
import My_Factory_Pattern.Components.Menu.Menu;
import My_Factory_Pattern.UIFactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.WINDOWS);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();





    }
}
