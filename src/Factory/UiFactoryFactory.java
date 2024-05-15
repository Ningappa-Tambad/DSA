package Factory;

public class UiFactoryFactory
{
    public static UIFactory getUIFactory(SupporrtedPlatform supporrtedPlatform)
    {
        switch (supporrtedPlatform)
        {
            case IOS:return new IOSFactory();
            case ANDROID: return new AndroidFactory();
        }
        return null;
    }
}
