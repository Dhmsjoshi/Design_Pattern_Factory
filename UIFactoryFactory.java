package My_Factory_Pattern;

import My_Factory_Pattern.UIFactory.AnroidUIFactory;
import My_Factory_Pattern.UIFactory.IOSUIFactory;
import My_Factory_Pattern.UIFactory.UIFactory;
import My_Factory_Pattern.UIFactory.WindowsUIFactory;

public class UIFactoryFactory {
    public static UIFactory setUIFactory(SupportedPlatform platform){

        return switch (platform){
            case IOS-> new IOSUIFactory();
            case ANDROID -> new AnroidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
