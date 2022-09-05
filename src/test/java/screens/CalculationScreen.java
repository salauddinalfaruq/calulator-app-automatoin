package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationScreen {

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    AndroidElement digit_5;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    AndroidElement digit_7;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/eq")
    AndroidElement btnEquals;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    AndroidElement lblResults;

    public CalculationScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum(){
        digit_5.click();
        btnPlus.click();
        digit_7.click();
        btnEquals.click();
        return lblResults.getText();
    }
}
