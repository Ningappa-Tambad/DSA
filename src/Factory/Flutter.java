package Factory;

public class Flutter
{

    private SupporrtedPlatform supportedPlatform;

    public Flutter(SupporrtedPlatform supportedPlatform) {

        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Set theme");
    }

    public void setRefreshRate() {
        System.out.println("Set refresh rate");
    }

    public UIFactory createUIFactory() {

        return UiFactoryFactory.getUIFactory(supportedPlatform);

    }
      /*  if(supportedPlatform.equals(SupporrtedPlatform.IOS))
        {
            return new IOSFactory();
        }
        else {
            return new AndroidFactory();
        }*/


}

