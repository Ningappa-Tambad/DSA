import Factory.Components.Button;
import Factory.Components.DropDown;
import Factory.Components.Menu;
import Factory.Flutter;
import Factory.SupporrtedPlatform;
import Factory.UIFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       /*
        Singleton design pattern
        Student s= Student.builder()
                .id(1)
                .name("Ningaraj")
                .age(23)
                .phonenumber("7411275912")
                .gradyear(2012)
                .psp(100)
                .universityname("vtu")
                .build();*/


        //Factory design pattern

        Flutter flutter=new Flutter(SupporrtedPlatform.ANDROID);
        UIFactory factory=flutter.createUIFactory();
         Menu menu=factory.createMenu();
        Button button=factory.createButton();
        DropDown dropDown=factory.createDropDown();


    }
}