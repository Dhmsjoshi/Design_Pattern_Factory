package My_Factory_Pattern;

import My_Factory_Pattern.UIFactory.UIFactory;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform){
        this.platform = platform;

    }

    public void setTheme(){
        System.out.println("Setting the Theme...");
    }
    public void setRefreshRate(){
        System.out.println("Setting the refresh rate..");
    }

    public UIFactory createUIFactory(){
        //Based on choosen option, we can set the UI factory here
        return UIFactoryFactory.setUIFactory(this.platform);
    }
}
